/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Untity.Category;
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
@RequestMapping (value = "CatController")
public class Category_Controller {
    private Category_model model;

    public Category_Controller() {
        model = new  Category_model();
    }
    
    @RequestMapping (value = "/GetAllCat")
    public ModelAndView getAll(){
         ModelAndView mav = new  ModelAndView("ShowAllCategory");
         List <Category> listCat = model.getall();
         mav.addObject("ListCat", listCat);
        
        return  mav;
    }
    @RequestMapping(value = "DeleteCatById")
    public String deleteCatByID(int catId){
        
        boolean check = model.deleteCatByCatId(catId);
        if (check) {
           return "redirect:GetAllCat.htm"; 
        }else{
        return "errorCat";
        }
    }
    
    @RequestMapping(value = "InitUpdateCat")
    public ModelAndView initUpdateCat(int catId){
        
        ModelAndView mav = new  ModelAndView("UpdateCat");
        Category cat = model.getByCatID(catId);
        mav.addObject("cat", cat);
        return  mav;
    }
    
    @RequestMapping(value = "UpdateCat")
    public String updateCat(Category cat){
        boolean check = model.updateCatByCatId(cat);
        
        if (check) {
            return  "redirect:GetAllCat.htm";
            
            
        }
        
        return "error";
    
    }
    
    @RequestMapping(value = "InitInsertCat")
     public ModelAndView initInsertCat(){
        Category cat = new Category();
        ModelAndView mav = new ModelAndView("InsertCat");
        mav.addObject("cat", cat);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertCat")
     public String insertCat(Category cat){
        boolean check = model.insertCat(cat);
        
        if (check) {
            return  "redirect:GetAllCat.htm";
            
            
        }
        
        return "error";
    
    }
     @RequestMapping(value = "GetCatByName")
     public ModelAndView getCatByName(String CatName){
     
         ModelAndView mav = new ModelAndView("GetCatByNameResult");
         List<Category> listCat = model.getByCatName(CatName);
         mav.addObject("ListCat", listCat);
         
         return  mav;
     }
    
    
    
    
    
    
}
