package tietoEvry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tietoEvry.model.Inventory;
import tietoEvry.service.ChoiceService;


//using this because expected response should be given in JSON
@RestController
@RequestMapping("/api")
public class InventoryRestController {

    @Autowired
    private ChoiceService choiceService;

    // add mapping for GET /inventory
    @GetMapping("/inventory")
    public Inventory getInventory() {


        return choiceService.getInventory();

    }
}
