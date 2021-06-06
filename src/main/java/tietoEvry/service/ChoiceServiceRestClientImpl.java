package tietoEvry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tietoEvry.model.Choice;
import tietoEvry.model.Inventory;

import java.util.logging.Logger;

@Component
public class ChoiceServiceRestClientImpl implements ChoiceService {

    private RestTemplate restTemplate;

    private String crmRestUrl;

    private Logger logger = Logger.getLogger(getClass().getName());

    @Autowired
    public ChoiceServiceRestClientImpl(RestTemplate theRestTemplate,
                                         @Value("${crm.rest.url}") String theUrl) {
        restTemplate = theRestTemplate;
        crmRestUrl = theUrl;

        logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
    }


    @Override
    public void saveChoice(Choice theChoice) {

        logger.info("in saveChoice(): Calling REST API " + crmRestUrl);


        // make REST call
            // add choice
            restTemplate.postForEntity(crmRestUrl, theChoice, String.class);


        logger.info("in saveChoice(): success");

    }

    @Override
    public Inventory getInventory() {
        logger.info("in getInventory(): Calling REST API " + crmRestUrl);

        // make REST call
        Inventory theInventory =
                restTemplate.getForObject(crmRestUrl + "/inventory" ,
                        Inventory.class);

        logger.info("in getInventory(): theInventory=" + theInventory);

        return theInventory;
    }
}
