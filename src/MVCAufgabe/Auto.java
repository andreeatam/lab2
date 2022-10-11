package MVCAufgabe;

public class Auto {

    private String autoID;
    private String autoName;
    private String autoFarbe;
    private String autoMarke;

    public String getAutoID(){
        return autoID;
    }

    public void setID(String new_id) {
        this.autoID = new_id;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setName(String new_name) {
        this.autoName = new_name;
    }

    public String getAutoFarbe() {
        return autoFarbe;
    }

    public void setFarbe(String new_farbe) {
        this.autoFarbe = new_farbe;
    }

    public String getAutoMarke() {
        return autoMarke;
    }

    public void setMarke(String new_marke) {
        this.autoMarke = new_marke;
    }

}

