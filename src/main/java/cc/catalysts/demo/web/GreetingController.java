package cc.catalysts.demo.web;

import cc.catalysts.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by schmidtda on 09.02.2016.
 */
@Controller
public class GreetingController {

    private PersonService personService;

    @Autowired
    public GreetingController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/greeting")
    public ModelAndView greeting(@RequestParam(name = "n") String name, @RequestParam(name="o") String ort) {
        ModelAndView nav = new ModelAndView("greeting");
        nav.addObject("viewName", name);
        nav.addObject("hometown", ort);
        nav.addObject("personList", personService.findAll());
        return nav;
    }

}
