package tietoEvry.service;


import tietoEvry.model.Choice;
import tietoEvry.model.Inventory;


public interface ChoiceService {

    void saveChoice(Choice theChoice);

    Inventory getInventory();
}
