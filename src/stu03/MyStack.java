package stu03;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(2);
        s.push(1);
        s.push(3);
        System.out.println(s.size());
        //出栈
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }



}
