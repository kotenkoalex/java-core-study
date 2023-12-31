package com.kotenko.data.structure;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList();
        colors.add("blue");
        colors.add("white");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("pink"));

        System.out.println();
        for(String color: colors){
            System.out.println(color);
        }

        System.out.println();
        colors.forEach(System.out::println);

        System.out.println();
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
