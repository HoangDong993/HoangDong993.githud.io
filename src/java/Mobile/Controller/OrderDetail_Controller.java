/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.OrderDatail_model;
import Mobile.Untity.Category;
import Mobile.Untity.OrderDetail;
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
@RequestMapping (value = "OrderdetailController")
public class OrderDetail_Controller {
    private OrderDatail_model model;

    public OrderDetail_Controller() {
        model = new  OrderDatail_model();
    }
    
    
    @RequestMapping(value = "DeleteOrdetailOrderId")
    public String DeleteOrdetailOrderId(int orderId){
        
        boolean check = model.deleteOrdetailByOrderId(orderId);
        if (check) {
           return "redirect:GetAllCat.htm"; 
        }else{
        return "errorCat";
        }
    }
    
    
    
    @RequestMapping(value = "InitInsertOrdetail")
     public ModelAndView initInsertCat(){
        Category cat = new Category();
        ModelAndView mav = new ModelAndView("InsertCat");
        mav.addObject("cat", cat);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertOrdetail")
     public String insertCat(OrderDetail ordetai){
        boolean check = model.insertOedetail(ordetai);
        
        if (check) {
            return  "redirect:GetAllCat.htm";
            
            
        }
        
        return "error";
    
    }
     @RequestMapping(value = "GetOrdetailByOrderId")
     public ModelAndView GetOrdetailByOrderId(int orderId){
     
         ModelAndView mav = new ModelAndView("GetOrdetailByOrderId");
         List<OrderDetail> listOrdetail = model.getOrdetailByOrderId(orderId);
         mav.addObject("listOrdetail", listOrdetail);
         
         return  mav;
     }
    
    
    
    
    
    
}
