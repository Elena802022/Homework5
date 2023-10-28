package Controller;
import Model.Cat;

import java.util.ArrayList;
import java.util.List;
public class CatVetController {
    private List<Cat> cats;

    public CatVetController() {
        this.cats = new ArrayList<>();
    }
    public void addACat(String name, String breed, int age, int weight ){
        cats.add(new Cat(name, breed, age, weight));
        System.out.println("Cat has been added to controller");
    }
     public Cat getByName(String name){
        for (int i=0; i< cats.size(); i++){
            if (cats.get(i).getName().equals(name)){
                System.out.println("Cat was found");
                return cats.get(i);
            }
        }
         System.out.println("Cat not found!");
        return null;
     }


    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public String toString() {
        return "CatVetController{" +
                "cats=" + cats +
                '}';
    }
}
