package stu01;

public class Apple extends Fruits {
    private String smell;

    //继承会继承父类的非私有属性、同时继承父类的非私有方法
    //继承可以重写父类的方法
    public Apple(String smell, String color) {
        super(smell,color);
    }

    //重写
    @Override
    public void ripe() {
        System.out.println("apple is ripe");
    }
}
