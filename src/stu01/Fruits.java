package stu01;

public class Fruits {
    //私有属性
    private String smell;
    //共有属性
    public String color;

    //构造方法
    public Fruits(String smell, String color) {
        this.smell = smell;
        this.color = color;
    }

    public String getSmell() {
        if (smell.equals("sweet")){
            return "good";
        }
        return "bed";
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void ripe(){
        System.out.println("is ripe");
    }

    public void setColor(String color) {
        if (color.equals("green")){
            this.color = "fresh";
        } else {
            this.color = color;
        }
    }
}
