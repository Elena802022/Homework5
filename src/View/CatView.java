package View;

import Controller.CatVetController;

public class CatView {
    CatVetController catVetController;

    public CatView() {
        this.catVetController = new CatVetController();
    }
    public void saveACat(String name, String breed, int age, int weight ){
        catVetController.addACat(name, breed, age, weight);
    }
    public void getACat(String name){
        System.out.println(catVetController.getByName(name));
    }
}
