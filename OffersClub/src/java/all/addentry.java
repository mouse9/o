/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author om
 */
@Controller
@RequestMapping("/addentry")
public class addentry {
    @RequestMapping(value = "/pp" ,method = RequestMethod.POST)
    public @ResponseBody String reply(@RequestParam("name") String name,@RequestParam("pass") String pass){
        return "hello";
    }
    
    
}
