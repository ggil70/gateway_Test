package com.activo.gateway.util;

import com.activo.gateway.beans.NIBPF3010Response;
import java.awt.Color;
import java.io.IOException;
import com.activo.gateway.repositories.ReferenciaBancariaRepo;
import com.activo.gateway.interfaces.IReferenciaBancaria;
import org.apache.commons.codec.binary.Base64;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.ExceptionConverter;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfGState;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfPageEventHelper;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfPageEvent;
import com.activo.gateway.beans.ReferenciaBancariaBean;
import com.activo.gateway.util.Parametros;
import java.text.DecimalFormat;
import com.activo.gateway.servicios.Core;
import com.activo.gateway.servicios.WSException;

@SuppressWarnings("unused")
public class ReferenciaBancariaPDF extends PdfPageEventHelper {  

	public ReferenciaBancariaPDF(){
	}

	public Image headerImage;
	public PdfPTable table;
	public PdfGState gstate;
	public PdfTemplate tpl;
	public BaseFont helv;

	static Font fuente = new Font(Font.HELVETICA, 11, Font.NORMAL, Color.black);
	static Font fuenteTitulo = new Font(Font.HELVETICA, 13, Font.BOLD, Color.black);
	static Font fuenteNegrita = new Font(Font.HELVETICA, 11, Font.BOLD, Color.black);
	static Font fuenteFirma = new Font(Font.HELVETICA, 11, Font.ITALIC, Color.black);
	static Font fuenteNota = new Font(Font.HELVETICA, 8, Font.NORMAL, Color.black);
	static Font fuenteNotaN = new Font(Font.HELVETICA, 8, Font.BOLD, Color.black);
	static Font fuenteMini = new Font(Font.HELVETICA, 6, Font.NORMAL, Color.black);
	
	/**
	 * Generates a document with a header containing Page x of y 
	 * @param args no arguments needed
	 */
	public void onOpenDocument(PdfWriter writer, Document document) {
		
		try {
			// initialization of the Graphic State
			gstate = new PdfGState();
			gstate.setFillOpacity(0.3f);
			gstate.setStrokeOpacity(0.3f);

			// initialization of the template
			tpl = writer.getDirectContent().createTemplate(20,20);
			tpl.setBoundingBox(new Rectangle(50,50,50,50));

			// initialization of the font
			helv = BaseFont.createFont("Helvetica", BaseFont.WINANSI, true);

		}catch(Exception e) {
			throw new ExceptionConverter(e);
		}
	}

	
	public void onEndPage(PdfWriter writer, Document document) {
		PdfContentByte cb = writer.getDirectContent();
		cb.saveState();
	}

	
	public void onCloseDocument(PdfWriter writer, Document document) {
		tpl.beginText();
		tpl.setFontAndSize(helv, 12);
		tpl.setTextMatrix(0, 0);
		tpl.showText(" " + (writer.getPageNumber() - 1));
		tpl.endText();
	}

	/**
	 * Genera el documento PDF del certificado electronico de declaracion electrónica
	 * @param doc documento en formato PDF al cual se le va a anexar la información
	 * @param certificado contribuyente al cual se le va a generar el documento
	 */
	public static int generarReferencia(Document doc, ReferenciaBancariaBean referencia ) throws IOException, Exception {

		try{
			Parametros params = new Parametros();
			float anchos [] = {600};
			PdfPTable tabla1 = new PdfPTable(1);
			Paragraph par = null;
			Image imagen = null;
                        DecimalFormat formateador = new DecimalFormat(",###");
                        NIBPF3010Response sta = new ReferenciaBancariaRepo().obtenerDatosClienteProducto(referencia);
			
			//IMAGEN
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_LEFT);
			imagen = Image.getInstance(ReferenciaBancariaPDF.class.getResource(params.getString("img.url") +"/logo.jpg"));
			imagen.scalePercent(20); 
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			tabla1.addCell(new Phrase(new Chunk(imagen, 4, 4)));
			
//			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			tabla1.addCell(new Phrase(new Chunk("\n", fuente)));
			
			//TITULO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			tabla1.addCell(new Phrase(new Chunk("REFERENCIA BANCARIA " + (referencia.getTipoProducto().equals("1")? "CUENTA" : "TARJETA DE CRÉDITO"),fuenteTitulo)));
			
			//CODIGO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(0);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
			tabla1.addCell(new Phrase(new Chunk("Cod. de Referencia: " + referencia.getCodigoConfirmacion(),fuenteNegrita)));
			
			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			tabla1.addCell(new Phrase(new Chunk("\n\n\n", fuente)));
			
			//DIRIGIDA A
                        tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_LEFT);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			tabla1.addCell(new Phrase(new Chunk("Señor(es):", fuenteNegrita)));
                        
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_LEFT);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
			tabla1.addCell(new Phrase(new Chunk(referencia.getDirigidaA(), fuenteNegrita)));

			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			tabla1.addCell(new Phrase(new Chunk("\n\n", fuenteTitulo)));
			
			//DATOS CLIENTE
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			par = new Paragraph(new Phrase("Hacemos constar que el (la) Sr(a). "));
			par.add(new Phrase(referencia.getNombreCliente(), fuenteNegrita));
			par.add(new Phrase(", documento de Identidad Nro. "));
                        
                        if(("V").equals(referencia.getTipoCliente())){
                            par.add(new Phrase(referencia.getTipoCliente() + "-" + formateador.format(Double.parseDouble(referencia.getNroIdentificacionCliente())), fuenteNegrita));
                        }else{
                            par.add(new Phrase(referencia.getTipoCliente() + "-" + referencia.getNroIdentificacionCliente(), fuenteNegrita));
                        }
                        
			par.add(new Phrase(", es cliente de nuestra institución financiera desde el "));  
			par.add(new Phrase(referencia.getFechaInicioCliente(), fuenteNegrita));  
			par.add(new Phrase(" y mantiene: "));
			tabla1.addCell(par);
			
			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk("\n\n", fuenteTitulo)));
			
			//PRODUCTO
			if(referencia.getTipoProducto().equals("1")){//Cuenta
                                imagen = Image.getInstance(ReferenciaBancariaPDF.class.getResource(params.getString("img.url") +"/vinact.png"));
                                imagen.scalePercent(10);
                                String prdt = referencia.getNumeroProducto();
                                prdt= prdt.substring(0,4)+"-"+prdt.substring(4,19)+"-"+prdt.substring(prdt.length()-1,prdt.length());
				tabla1.setWidthPercentage(anchos, doc.getPageSize());
				tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
				tabla1.getDefaultCell().setBorder(0);
				tabla1.getDefaultCell().setPadding(10);
				tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
				par = new Paragraph(new Phrase(new Chunk(imagen,1,1)));
				par.add(new Phrase("    " +referencia.getDescripcionProducto() + " Nro. " + prdt, fuenteNegrita));
				par.add(new Phrase(", con un saldo promedio " + referencia.getTipoReferencia() + " de "));
				par.add(new Phrase(referencia.getCantCifras() , fuenteNegrita));
				par.add(new Phrase( " Cifras "));
				par.add(new Phrase( referencia.getNivelCifras(), fuenteNegrita));
				par.add(new Phrase( " en "));
				par.add(new Phrase(referencia.getMoneda() + ".", fuenteNegrita)); 
				tabla1.addCell(par);
			}else{//Tarjeta
                                imagen = Image.getInstance(ReferenciaBancariaPDF.class.getResource(params.getString("img.url") +"/vinact.png"));
                                imagen.scalePercent(10);
				tabla1.setWidthPercentage(anchos, doc.getPageSize());
				tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
				tabla1.getDefaultCell().setBorder(0);
				tabla1.getDefaultCell().setPadding(10);
				tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
				par = new Paragraph(new Phrase(new Chunk(imagen,1,1)));
				par.add(new Phrase( "   "+referencia.getDescripcionProducto(), fuenteNegrita));
				par.add(new Phrase(", con una línea de crédito de "));
				par.add(new Phrase(referencia.getCantCifras() , fuenteNegrita));
				par.add(new Phrase(" Cifras "));
				par.add(new Phrase(referencia.getNivelCifras() , fuenteNegrita));
				par.add(new Phrase(" en  "));
				par.add(new Phrase(referencia.getMoneda() + ".", fuenteNegrita)); 
				tabla1.addCell(par);
			}
			
			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk("\n\n", fuenteTitulo)));
			
			//CONCLUSION
                        if((referencia.getTipoCliente().equals("2"))&&(sta.getNIBPF3010().getSTSTDC().equals("03"))){
                            tabla1.setWidthPercentage(anchos, doc.getPageSize());
                            tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
                            tabla1.getDefaultCell().setBorder(0);
                            tabla1.getDefaultCell().setPadding(2);
                            tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                            par = new Paragraph(new Phrase("La cual, hasta la fecha no ha tenido movimientos."));
                            tabla1.addCell(par);
                        }else{
                            tabla1.setWidthPercentage(anchos, doc.getPageSize());
                            tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
                            tabla1.getDefaultCell().setBorder(0);
                            tabla1.getDefaultCell().setPadding(2);
                            tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
                            par = new Paragraph(new Phrase("La cual, hasta la fecha ha venido manejando a nuestra entera y total satisfacción. "));
                            tabla1.addCell(par);
                        }
			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk("\n\n", fuenteTitulo)));
		
			//FECHA Y VIGENCIA
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			par = new Paragraph(new Phrase("Constancia que se expide a solicitud de la parte interesada a los "));
			par.add(new Phrase(referencia.getFechaGeneracion().substring(0,2) + " días del mes " + 
					obtenerMes(Integer.parseInt(referencia.getFechaGeneracion().substring(3,5))-1)+
					" del año " + referencia.getFechaGeneracion().substring(6,10), fuenteNegrita));
			par.add(new Phrase(" y tiene una vigencia de 30 días continuos a partir de su fecha de emisión."));
			tabla1.addCell(par);
			
			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk("\n\n\n", fuenteTitulo)));
                        
                        //ATENTAMENTE
                        tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			par = new Paragraph(new Phrase("Atentamente"));
			tabla1.addCell(par);
                        
                        //ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk("\n\n", fuenteTitulo)));
			
			//IMAGEN FIRMA
			byte[] imgBytes = Base64.decodeBase64(referencia.getImagenFirma());        
	 		tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			imagen = Image.getInstance(imgBytes);
			imagen.scaleAbsoluteHeight(70);
			imagen.scaleAbsoluteWidth(200);//150
			imagen.setBorder(1);
			//tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setBorderColorBottom(Color.BLACK);
			tabla1.getDefaultCell().setPadding(2);//2
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk(imagen, 4, 4)));
			
                        //Linea Hotizontal
                        tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase("_________________________", fuenteNegrita));
                        
			//NOMBRE FIRMA
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk(referencia.getNombreFirma(), fuenteFirma)));
			
			//CARGO FIRMA
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk(referencia.getCargoFirma(), fuenteFirma)));
			
			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk("\n\n", fuenteTitulo)));
			
			//CONFIRMACION
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
			par = new Paragraph(new Phrase("Para confirmar la emisión de esta referencia,"
                                                            + "ingrese a www.bancoactivo.com en la sección ?Validación de Referencia Bancaria?"
                                                            + " o comuníquese con el Sistema Automatizado del Centro de Atención Activa "
                                                            + "por el teléfono 0500-ACTIVAT (228.48.28).", fuenteNota));
			tabla1.addCell(par);
			
			//ESPACIO
			tabla1.setWidthPercentage(anchos, doc.getPageSize());
			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.getDefaultCell().setBorder(0);
			tabla1.getDefaultCell().setPadding(2);
			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			tabla1.addCell(new Phrase(new Chunk("\n", fuenteTitulo)));
			
//			//INFORMACIÓN CONFIDENCIAL
//			tabla1.setWidthPercentage(anchos, doc.getPageSize());
//			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
//			tabla1.getDefaultCell().setBorder(0);
//			tabla1.getDefaultCell().setPadding(2);
//			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
//			tabla1.addCell(new Phrase(new Chunk("Información Confidencial", fuenteNotaN)));
//			
//			//COD FORMATO
//			tabla1.setWidthPercentage(anchos, doc.getPageSize());
//			tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
//			tabla1.getDefaultCell().setBorder(0);
//			tabla1.getDefaultCell().setPadding(2);
//			tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
//			tabla1.addCell(new Phrase(new Chunk("MTE.0415-0003",fuenteMini)));
						
			doc.add(tabla1);

			return  0;
		}catch(Throwable e){
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	
	private static String obtenerMes(int mes){
		String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		return meses[mes];
	}
        
        
}