package tietoEvry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tietoEvry.model.Choice;
import tietoEvry.service.ChoiceService;

@Controller
@RequestMapping("/choice")
public class ChoiceController {


    @Autowired
    private ChoiceService choiceService;


    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Choice theChoice = new Choice();

        theModel.addAttribute("choice", theChoice);

        return "hiking-guide";
    }

    @PostMapping("/saveChoice")
    public String saveChoice(@ModelAttribute("choice") Choice theChoice) {

        System.out.println(theChoice);

        // save the customer using our service
        choiceService.saveChoice(theChoice);

        return "redirect:/api/inventory";
    }
}
