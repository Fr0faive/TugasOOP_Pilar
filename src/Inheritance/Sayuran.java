package Inheritance;

public class Sayuran extends Food {
    public Sayuran(String name, double price) {
        super(name, price);
    }

    public String getColor() {
        return "Vegetables come in a wide range of colors, each with their own unique set of health benefits.";
    }
}
