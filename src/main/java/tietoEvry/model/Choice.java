package tietoEvry.model;






public class Choice {

    private int id;
    private int distance;
    private String season;
    private String relief;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getRelief() {
        return relief;
    }

    public void setRelief(String relief) {
        this.relief = relief;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "id=" + id +
                ", distance=" + distance +
                ", season='" + season + '\'' +
                ", relief='" + relief + '\'' +
                '}';
    }
}
