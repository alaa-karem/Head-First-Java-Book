package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList<>
        ArrayList<String> myList = new ArrayList<String>();

        String a = new String("alaa");
        myList.add(a);

        String b = new String("mohamed");
        myList.add(b);

        String c = new String("shaimaa");
        myList.add(c);

        String d = new String("ali");
        myList.add(d);

        System.out.println(myList.size());
        System.out.println(myList.indexOf(b));
        myList.remove(a);                             // unlike regular array -> array[0]=null;
        System.out.println(myList.size());
        boolean isFound = myList.contains(a);
        System.out.println(isFound);


    }
}
