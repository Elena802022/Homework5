import View.CatView;

public class Main {
    public static void main(String[] args) {
        CatView catView = new CatView();
        catView.saveACat("Murzik","prince", 3, 5);
        catView.getACat("Murzik");

    }
}