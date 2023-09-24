package stu02;

import java.util.Scanner;

public class Date {
    public int year;
    public int month;
    public int day;

    //构造方法
    public Date(Integer year, Integer month, Integer day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //判断是否闰年方法
    public boolean leap(){
        if ((this.year%4==0 && this.year%100!=0) || this.year%400==0){
            return true;
        } else {
            return false;
        }
    }

    //计算天数方法
    public int calculate(){
        int cnt = 0; //该日是这年的第几天    10 i 1 2 3 4 5 6---10
        for (int i = 1; i < this.month; i++) {
            if((i<=7 && i%2!=0) || (i>=8 && i%2==0)){ //判断i是不是大月
                cnt += 31;
            } else if (i == 2){
                if (leap())
                    cnt += 29;
                else
                    cnt += 28;
            } else {
                cnt += 30;
            }
        }
        cnt += this.day;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        Date mydate = new Date(year, month, day);
//        System.out.println(mydate.leap());
        System.out.println(mydate.calculate());
//        System.out.println(mydate.year);
//        System.out.println(mydate.month);
//        System.out.println(mydate.day);
    }
}
