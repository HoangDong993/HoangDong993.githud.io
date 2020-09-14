/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Banner_model;
import Mobile.Model.Category_model;
import Mobile.Model.Color_model;
import Mobile.Untity.Banner;
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
@RequestMapping (value = "BannerController")
public class Banner_Controller {
    private Banner_model model;

    public Banner_Controller() {
        model = new  Banner_model();
    }
    
    
    
    @RequestMapping(value = "InitInsertBanner")
     public ModelAndView initInsertBanner(){
        Banner ban = new Banner();
        ModelAndView mav = new ModelAndView("InsertBanner");
        mav.addObject("ban", ban);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertBanner")
     public String insertBanner(Banner ban){
        boolean check = model.insertBanner(ban);
        
        if (check) {
            return  "redirect:GetAllCat.htm";
            
            
        }
        
        return "error";
    
    }
     
    
    
    
    
    
    
}
