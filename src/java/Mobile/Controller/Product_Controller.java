/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.Product_model;
import Mobile.Untity.Category;
import Mobile.Untity.Product;
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
@RequestMapping (value = "ProductController")
public class Product_Controller {
    private Product_model model;

    public Product_Controller() {
        model = new  Product_model();
    }
    
    @RequestMapping (value = "/GetAllPro")
    public ModelAndView getAll(){
         ModelAndView mav = new  ModelAndView("ShowProduct");
         List <Product> listPro = model.getall();
         mav.addObject("ListPro", listPro);
        
        return  mav;
    }
    
    @RequestMapping (value = "/GetProByCat")
    public ModelAndView getByCate(int catId ){
         ModelAndView mav = new  ModelAndView("ShowProduct");
         List <Product> listPro = model.getByCatId(catId);
         mav.addObject("ListPro", listPro);
        
        return  mav;
    }
    
    @RequestMapping(value = "DeleteProById")
    public String deleteProByID(int proId){
        
        boolean check = model.deleteproById(proId);
        if (check) {
           return "redirect:GetAllPro.htm"; 
        }else{
        return "errorCat";
        }
    }
    
    @RequestMapping(value = "InitUpdatePro")
    public ModelAndView initUpdatePro(int proId){
        
        ModelAndView mav = new  ModelAndView("UpdateCat");
        Product pro = model.getByProID(proId);
        mav.addObject("pro", pro);
        return  mav;
    }
    
    @RequestMapping(value = "UpdatePro")
    public String updateCat(Product pro){
        boolean check = model.updateProById(pro);
        
        if (check) {
            return  "redirect:GetAllPro.htm";
            
            
        }
        
        return "error";
    
    }
    
    @RequestMapping(value = "InitInsertPro")
     public ModelAndView initInsertPro(){
        Product pro = new Product();
        ModelAndView mav = new ModelAndView("InsertPro");
        mav.addObject("pro", pro);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertPro")
     public String insertPro(Product pro){
        boolean check = model.insertPro(pro);
        
        if (check) {
            return  "redirect:GetAllPro.htm";
            
            
        }
        
        return "error";
    
    }
     @RequestMapping(value = "GetProByName")
     public ModelAndView getCatByName(String proName){
     
         ModelAndView mav = new ModelAndView("GetCatByNameResult");
         List<Product> listPro = model.getByproName(proName);
         mav.addObject("ListPro", listPro);
         
         return  mav;
     }
    
    
    
    
    
    
}
