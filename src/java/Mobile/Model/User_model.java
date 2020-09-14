/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Model;

import Mobile.Untity.Category;
import Mobile.Untity.Users;
import Mobile.lty.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author asus
 */
public class User_model {
    
    public List<Users> getall(){
    
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        ses.getTransaction().begin();
        
        Query query = ses.createQuery("from Users");
        List<Users> listUser = query.list();
        ses.getTransaction().commit();
        
        ses.close();
        
        return listUser;
    }
    
   public Users getByUserId(int userId){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       Users user = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran =ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Users where userId=:userId");
           query.setInteger("userId", userId);
           user =(Users)query.uniqueResult();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
           tran.rollback();
       }
       
       return  user;
   
   }
   
   public List<Users> getByUserName(String userName){
       Session ses = null;
       Transaction tran = null;
       Query query = null;
       List<Users> listUser = null;
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           query = ses.createQuery("from Users where userName=:userName");
           query.setString("userName", userName);
           listUser = query.list();
           ses.getTransaction().commit();
           
           ses.close();
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       
       return  listUser;
   
   }
   
    
    
    public boolean updateUserByName(Users user){
       Session ses = null;
       Transaction tran = null;
      
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           ses.merge(user);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
    public boolean updateUserById(Users user){
       Session ses = null;
       Transaction tran = null;
      
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           ses.merge(user);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
   
    }
    
     public boolean insertUser(Users user){
       Session ses = null;
       Transaction tran = null;
       
       try {
           ses = NewHibernateUtil.getSessionFactory().openSession();
           tran = ses.getTransaction();
           tran.begin();
           
           ses.save(user);
           ses.getTransaction().commit();
           
           ses.close();
           
           return  true;
       } catch (Exception e) {
           
           e.printStackTrace();
       }
       return  false;
     }
}
