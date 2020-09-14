/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.Order_model;
import Mobile.Untity.Category;
import Mobile.Untity.OrderPro;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.util.List;
import javax.persistence.criteria.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author asus
 */
@Controller
@RequestMapping (value = "OrderController")
public class Order_Controller {
    private Order_model model;

    public Order_Controller() {
        model = new  Order_model();
    }
    
    @RequestMapping (value = "/GetAllOrder")
    public ModelAndView getAll(){
         ModelAndView mav = new  ModelAndView("ShowOrder");
         List <OrderPro> listOrder = model.getall();
         mav.addObject("ListOrder", listOrder);
        
        return  mav;
    }
    @RequestMapping(value = "DeleteOrderById")
    public String deleteOrderByID(int orderId){
        
        boolean check = model.deleteOrById(orderId);
        if (check) {
           return "redirect:GetAllOrder.htm"; 
        }else{
        return "errorCat";
        }
    }
    
    @RequestMapping(value = "InitUpdateOrder")
    public ModelAndView initUpdateOrder(int orderId){
        
        ModelAndView mav = new  ModelAndView("UpdateOrder");
        OrderPro order = model.getByOrID(orderId);
        mav.addObject("order", order);
        return  mav;
    }
    
    @RequestMapping(value = "UpdateOrder")
    public String updateOrder(OrderPro orderId){
        boolean check = model.updateOrderById(orderId);
        
        if (check) {
            return  "redirect:GetAllOrder.htm";
            
            
        }
        
        return "error";
    
    }
    
    @RequestMapping(value = "InitInsertOrder")
     public ModelAndView initInsertOrder(){
        OrderPro order = new OrderPro();
        ModelAndView mav = new ModelAndView("InsertOrder");
        mav.addObject("order", order);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertOrder")
     public String insertOrder(OrderPro order){
        boolean check = model.insertOrder(order);
        
        if (check) {
            return  "redirect:GetAllOrder.htm";
            
            
        }
        
        return "error";
    
    }
     @RequestMapping(value = "GetOrderByUser")
     public ModelAndView getOrderByUser(String user){
     
         ModelAndView mav = new ModelAndView("GetOrderByUser");
         List<OrderPro> listOrder = model.getByUser(user);
         mav.addObject("ListOrder", listOrder);
         
         return  mav;
     }
    
    
    
    
    
    
}
