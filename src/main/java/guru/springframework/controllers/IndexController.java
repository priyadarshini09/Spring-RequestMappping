package guru.springframework.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class IndexController {

    /*@RequestMapping at method level*/

    /*@RequestMapping("/")
    String get(){
        return "Hello from get";
    }
    @RequestMapping("/index")
    String index(){
        return "Hello from index";
    }
    @RequestMapping(value={"", "/page", "page*","view/*"})
    String indexMultipleMapping(){
       return "Hello from index multiple mapping.";
   }*/

    /*@RequestMapping using HTTP request methods*/
    /*@RequestMapping(method = RequestMethod.GET)
    String get(){
        return "Hello from get";
    }
    @RequestMapping(method = RequestMethod.DELETE)
    String delete(){
        return "Hello from delete";
    }
    @RequestMapping(method = RequestMethod.POST)
    String post(){
        return "Hello from post";
    }
    @RequestMapping(method = RequestMethod.PUT)
    String put(){
        return "Hello from put";
    }
    @RequestMapping(method = RequestMethod.PATCH)
    String patch(){
        return "Hello from patch";
    }*/

    /*@RequestMapping with headers*/

    @RequestMapping(value = "/head", headers = {"content-type=text/plain"})
    String get(){
        return "Mapping applied along with headers";
    }

    @RequestMapping(value = "/id")
    String getId(@RequestParam("id") String id){
        System.out.println("ID is "+id);
        return "Get ID";
    }
   
}
