import MVCAufgabe.Auto;
import MVCAufgabe.AutoController;
import MVCAufgabe.AutoView;

public class Main {
    public static void main(String[] args) {

        Auto auto2=retrieveAutoFromDataBase();

        AutoView view = new AutoView();

        AutoController controller = new AutoController(auto2, view);

        controller.updateView();

        //update auto data
        controller.setAutoName("Mercedes");
        System.out.println("\n");
        System.out.println("After updating, Auto Details are as follows");

        controller.updateView();
    }

    private static Auto retrieveAutoFromDataBase(){
        Auto auto2 = new Auto();
        auto2.setID("01");
        auto2.setName("BMW");
        auto2.setFarbe("negru");
        auto2.setMarke("Seria 7");
        return auto2;
    }
}