package MVCAufgabe;

public class AutoController {

    private Auto auto1;
    private AutoView view;

    public AutoController(Auto auto1, AutoView view){
        this.auto1 = auto1;
        this.view = view;
    }

    public void setAutoName(String name){
        auto1.setName(name);
    }

    public String getAutoName(){
        return auto1.getAutoName();
    }

    public void setAutoId(String id){
        auto1.setID(id);
    }

    public String getAutoId(){
        return auto1.getAutoID();
    }

    public void setAutoFarbe(String farbe){
        auto1.setFarbe(farbe);
    }

    public String getAutoFarbe(){
        return auto1.getAutoFarbe();
    }

    public void setAutoMarke(String marke){
        auto1.setMarke(marke);
    }

    public String getAutoMarke(){
        return auto1.getAutoMarke();
    }
    public void updateView(){
        view.printAutoDetails(auto1.getAutoID(), auto1.getAutoName(), auto1.getAutoFarbe(),auto1.getAutoMarke());
    }
}
