/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Model;

import Mobile.Untity.Category;
import Mobile.Untity.Color;
import Mobile.lty.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class Color_model {
    
    
    
   public Color geColortBytID(int colorId){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       Color co = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran =ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Color where colorId=:colorID");
           query.setInteger("colorID", colorId);
           co =(Color)query.uniqueResult();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
           tran.rollback();
       }
       
       return  co;
   
   }
   
   
   
    
    
    
    
     public boolean insertColor(Color co){
       Session ses = null;
       Transaction tran = null;
       
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           
           ses.save(co);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
     }
}
