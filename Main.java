package com.metanit;

import java.util.*;

class Death {
    int x;
    int y;

    Death(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void death() {
        if (y + 1 != 0) {
            int a = (x + y) / (y + 1);
            System.out.println(a);
        } else {
            System.out.println("Знаменатель равен нулю");
        }
    }
}
    public class Main {

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число x:");
            int x = in.nextInt();
            System.out.println("Введите число y:");
            int y = in.nextInt();
            Death b = new Death(x, y);
            b.death();

    }
}