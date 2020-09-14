/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.Controller;

import Mobile.Model.Category_model;
import Mobile.Model.Color_model;
import Mobile.Model.Image_model;
import Mobile.Untity.Category;
import Mobile.Untity.Color;
import Mobile.Untity.Images;
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
@RequestMapping (value = "ImageController")
public class Image_Controller {
    private Image_model model;

    public Image_Controller() {
        model = new  Image_model();
    }
    
    
    
    @RequestMapping(value = "InitInsertImage")
     public ModelAndView initInsertImage(){
        Images img = new Images();
        ModelAndView mav = new ModelAndView("InsertImage");
        mav.addObject("image", img);
        
        return  mav;
           
    
    }
    
    @RequestMapping(value = "InsertImage")
     public String insertImage(Images image){
        boolean check = model.insertImage(image);
        
        if (check) {
            return  "redirect:GetAllCat.htm";
            
            
        }
        
        return "error";
    
    }
     
    
    
    
    
    
    
}
