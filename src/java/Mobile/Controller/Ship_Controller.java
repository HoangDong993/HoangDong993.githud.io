/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.Ship_model;
import Mobile.Untity.Category;
import Mobile.Untity.ShipType;
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
@RequestMapping (value = "ShipController")
public class Ship_Controller {
    private Ship_model model;

    public Ship_Controller() {
        model = new  Ship_model();
    }
    
    
    
    
   
    
    @RequestMapping(value = "InitInsertship")
     public ModelAndView initInsertCat(){
        ShipType ship = new ShipType();
        ModelAndView mav = new ModelAndView("Insertship");
        mav.addObject("ship", ship);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "Insertship")
     public String insertship(ShipType ship){
        boolean check = model.insertShip(ship);
        
        if (check) {
            return  "redirect:GetAllCat.htm";
            
            
        }
        
        return "error";
    
    }
     @RequestMapping(value = "GetShipById")
     public ModelAndView getShipById(int shipId){
     
         ModelAndView mav = new ModelAndView("GetShipById");
         ShipType ship = model.getByShiptID(shipId);
         mav.addObject("ship", ship);
         
         return  mav;
     }
    
    
    
    
    
    
}
