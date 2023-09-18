package stu01;

public class BuyFruits {
    public static void main(String[] args) {
//        System.out.println("我要买水果");
        Fruits apple = new Fruits("sweet","red");
        apple.setColor("green");


//        Fruits pear = new Fruits("sour","yellow");

//        System.out.println(apple.color);
        System.out.println(apple.getColor());

        System.out.println(apple.getSmell());

//        System.out.println(pear.color);
//        System.out.println(pear.getSmell());

//        String color = apple.getColor();
//        apple.getSmell();
        Apple apple1 = new Apple("sweet", "red");
        System.out.println("apple1‘s smell is " + apple1.getSmell());
        apple1.ripe();
    }
}
