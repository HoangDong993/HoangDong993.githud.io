/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.Color_model;
import Mobile.Untity.Category;
import Mobile.Untity.Color;
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
@RequestMapping (value = "ColorController")
public class Color_Controller {
    private Color_model model;

    public Color_Controller() {
        model = new  Color_model();
    }
    
    
    
    @RequestMapping(value = "InitInsertColor")
     public ModelAndView initInsertColor(){
        Color co = new Color();
        ModelAndView mav = new ModelAndView("InsertColor");
        mav.addObject("color", co);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertColor")
     public String insertColor(Color co){
        boolean check = model.insertColor(co);
        
        if (check) {
            return  "redirect:GetAllCat.htm";
            
            
        }
        
        return "error";
    
    }
     
    
    
    
    
    
    
}
