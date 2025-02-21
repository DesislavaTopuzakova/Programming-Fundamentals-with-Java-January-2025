package demo;

public class Car {
    //характеристики - конски сили, цвят, марка - полета (fields)
    //private - достъпваме само в рамките на ласа
    //public - достъваме навсякъде в класовете в проекта
    private int horsePower;
    private String color;
    private String brand;

    //конструктор - public методи, через които създаваме обекти от калса
    //1. default constructor -> създава празен обект от класа
    //2. custom constructor -> създава обект на който мога да задам стойности на полетата
    public Car(int horsePower, String color, String brand) {
        this.horsePower = horsePower;
        this.color = color;
        this.brand = brand;
    }

    //getters and setters - методи, които осигуряват достъп до полетата на един клас/обект
    public int getHorsePower() {
        return horsePower;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int calculateFuel(int road) {
        return road * 10;
    }

    public void startEngine() {
        System.out.println("Engin started!");
    }
    public void stopEngine() {
        System.out.println("Engine stop!");
    }

}
