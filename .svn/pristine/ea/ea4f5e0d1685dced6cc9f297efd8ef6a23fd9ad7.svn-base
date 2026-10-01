/*    */ package com.activo.gateway.sockets;
/*    */ 
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class ClassCache
/*    */ {
/* 12 */   Class myclass = null;
/* 13 */   Vector instances = new Vector();
/*    */ 
/*    */   public ClassCache(String packagename, String classname)
/*    */     throws ClassNotFoundException
/*    */   {
/* 25 */     if (packagename == null)
/* 26 */       this.myclass = Class.forName(classname);
/*    */     else
/* 28 */       this.myclass = Class.forName(packagename + '.' + classname);
/*    */   }
/*    */ 
/*    */   public Object getInstance()
/*    */     throws IllegalAccessException, InstantiationException
/*    */   {
/* 42 */     Object instance = null;
/* 43 */     int lastelement = this.instances.size() - 1;
/*    */ 
/* 45 */     if (lastelement >= 0)
/*    */     {
/* 47 */       instance = this.instances.elementAt(lastelement);
/* 48 */       this.instances.removeElementAt(lastelement);
/*    */     }
/*    */     else
/*    */     {
/* 52 */       instance = this.myclass.newInstance();
/*    */     }
/*    */ 
/* 55 */     return instance;
/*    */   }
/*    */ 
/*    */   public void returnInstance(Object returned)
/*    */   {
/* 64 */     if (this.myclass.isInstance(returned))
/* 65 */       this.instances.addElement(returned);
/*    */   }
/*    */ }

/* Location:           C:\Users\Roberto Prado\Documents\banco activo\DIBS_ACT.ear\DIBS_ACTIVO.war\WEB-INF\classes\
 * Qualified Name:     com.activo.gateway.sockets.ClassCache
 * JD-Core Version:    0.6.0
 */