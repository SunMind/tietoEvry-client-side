package tietoEvry.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Inventory {

    private String shoes;
    private String socks;
    private String outfit;
    private String food;
    private String tent;
    private String sleepingBag;
    private String touristStove;
    private String rainProtection;
    private String searchlight;
    private String hygiene;
    private String huntingEquipment;
    private String medicine;
    private String days;
    private String extraInfo;

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getSocks() {
        return socks;
    }

    public void setSocks(String socks) {
        this.socks = socks;
    }

    public String getOutfit() {
        return outfit;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getTent() {
        return tent;
    }

    public void setTent(String tent) {
        this.tent = tent;
    }

    public String getSleepingBag() {
        return sleepingBag;
    }

    public void setSleepingBag(String sleepingBag) {
        this.sleepingBag = sleepingBag;
    }

    public String getTouristStove() {
        return touristStove;
    }

    public void setTouristStove(String touristStove) {
        this.touristStove = touristStove;
    }

    public String getRainProtection() {
        return rainProtection;
    }

    public void setRainProtection(String rainProtection) {
        this.rainProtection = rainProtection;
    }

    public String getSearchlight() {
        return searchlight;
    }

    public void setSearchlight(String searchlight) {
        this.searchlight = searchlight;
    }

    public String getHygiene() {
        return hygiene;
    }

    public void setHygiene(String hygiene) {
        this.hygiene = hygiene;
    }

    public String getHuntingEquipment() {
        return huntingEquipment;
    }

    public void setHuntingEquipment(String huntingEquipment) {
        this.huntingEquipment = huntingEquipment;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "shoes='" + shoes + '\'' +
                ", socks='" + socks + '\'' +
                ", outfit='" + outfit + '\'' +
                ", food='" + food + '\'' +
                ", tent='" + tent + '\'' +
                ", sleepingBag='" + sleepingBag + '\'' +
                ", touristStove='" + touristStove + '\'' +
                ", rainProtection='" + rainProtection + '\'' +
                ", searchlight='" + searchlight + '\'' +
                ", hygiene='" + hygiene + '\'' +
                ", huntingEquipment='" + huntingEquipment + '\'' +
                ", medicine='" + medicine + '\'' +
                ", days='" + days + '\'' +
                ", extraInfo='" + extraInfo + '\'' +
                '}';
    }
}
