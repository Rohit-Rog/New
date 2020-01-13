package com.demoproj;
import com.demoproj.demoProj;
public class execution {
    public static void main(String[] args) {
        demoProj user_1 = new demoProj(1, "Rohit", 22);
        demoProj user_2 = new demoProj(2, "Rohan", 20);
        demoProj user_3 = new demoProj(3, "Sayan", 16);
        demoProj[] list = {user_1, user_2, user_3};
        enlist(list);
    }

    public static void enlist(demoProj[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].isAdult());
        }
    }
}
