package Inheritance;

public class Buah extends Food {
    public Buah(String name, double price) {
        super(name, price);
    }

    public String getVitamin() {
        return "Fruits contain various vitamins and minerals that are essential for the human body.";
    }
}

