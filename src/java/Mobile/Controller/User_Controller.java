/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.User_model;
import Mobile.Untity.Category;
import Mobile.Untity.Users;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author asus
 */
@Controller
@RequestMapping (value = "UserController")
public class User_Controller {
    private User_model model;

    public User_Controller() {
        model = new  User_model();
    }
    
    @RequestMapping (value = "/GetAllUser")
    public ModelAndView getAll(){
         ModelAndView mav = new  ModelAndView("ShowUser");
         List <Users> listUser = model.getall();
         mav.addObject("ListUser", listUser);
        
        return  mav;
    }
    
    
    @RequestMapping(value = "InitUpdateUser")
    public ModelAndView initUpdateUser(int userId){
        
        ModelAndView mav = new  ModelAndView("UpdateUser");
        Users user = model.getByUserId(userId);
        mav.addObject("user", user);
        return  mav;
    }
    
    @RequestMapping(value = "UpdateUser")
    public String updateCat(Users user ){
        boolean check = model.updateUserById(user);
        
        if (check) {
            return  "redirect:GetAllUser.htm";
            
            
        }
        
        return "error";
    
    }
    
    @RequestMapping(value = "InitInsertUser")
     public ModelAndView initInsertUser(){
        Users user = new Users();
        ModelAndView mav = new ModelAndView("InsertUser");
        mav.addObject("user", user);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertUser")
     public String insertUser(Users user){
        boolean check = model.insertUser(user);
        
        if (check) {
            return  "redirect:GetAllUser.htm";
            
            
        }
        
        return "error";
    
    }
     @RequestMapping(value = "GetUserByName")
     public ModelAndView getUserByName(String userName){
     
         ModelAndView mav = new ModelAndView("GetCatByNameResult");
         List<Users> listUser = model.getByUserName(userName);
         mav.addObject("listUser", listUser);
         
         return  mav;
     }
    
    
    
    
    
    
}
