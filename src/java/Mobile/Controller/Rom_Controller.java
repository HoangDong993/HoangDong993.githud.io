/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.Color_model;
import Mobile.Model.Rom_model;
import Mobile.Untity.Category;
import Mobile.Untity.Color;
import Mobile.Untity.Rom;
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
public class Rom_Controller {
    private Rom_model model;

    public Rom_Controller() {
        model = new  Rom_model();
    }
    
    
    
    @RequestMapping(value = "InitInsertRom")
     public ModelAndView initInsertRom(){
        Rom rom = new Rom();
        ModelAndView mav = new ModelAndView("InsertRom");
        mav.addObject("rom", rom);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertColor")
     public String insertRom(Rom rom){
        boolean check = model.insertRom(rom);
        
        if (check) {
            return  "redirect:GetAllCat.htm";
            
            
        }
        
        return "error";
    
    }
     
    
    
    
    
    
    
}
