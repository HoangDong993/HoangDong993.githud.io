/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.ProductDetail_model;
import Mobile.Untity.Category;
import Mobile.Untity.ProductDetail;
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
@RequestMapping (value = "ProdController")
public class ProductDetail_Controller {
    private ProductDetail_model model;

    public ProductDetail_Controller() {
        model = new  ProductDetail_model();
    }
    
    @RequestMapping (value = "/GetAllProd")
    public ModelAndView getAll(){
         ModelAndView mav = new  ModelAndView("ShowAllProd");
         List <ProductDetail> listProd = model.getall();
         mav.addObject("ListProd", listProd);
        
        return  mav;
    }
    @RequestMapping(value = "DeleteProdById")
    public String deleteProdByID(int ProdId){
        
        boolean check = model.deleteProdById(ProdId);
        if (check) {
           return "redirect:GetAllProd.htm"; 
        }else{
        return "errorCat";
        }
    }
    
    @RequestMapping(value = "InitUpdateProd")
    public ModelAndView initUpdateProd(int prodId){
        
        ModelAndView mav = new  ModelAndView("UpdateProd");
        ProductDetail prod = model.getByProdID(prodId);
        mav.addObject("prod", prod);
        return  mav;
    }
    
    @RequestMapping(value = "UpdateProd")
    public String updateProd(ProductDetail prod){
        boolean check = model.updatProdeById(prod);
        
        if (check) {
            return  "redirect:GetAllProd.htm";
            
            
        }
        
        return "error";
    
    }
    
    @RequestMapping(value = "InitInsertProd")
     public ModelAndView initInsertProd(){
        ProductDetail prod = new ProductDetail();
        ModelAndView mav = new ModelAndView("InsertProd");
        mav.addObject("prod", prod);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertProd")
     public String insertCat(ProductDetail prod){
        boolean check = model.insertProd(prod);
        
        if (check) {
            return  "redirect:GetAllProd.htm";
            
            
        }
        
        return "error";
    
    
    
    
    
    
    
     }
}
