package com.morle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class countmatching {
    public static void main(String[] args) {
        List<List<String>> items =  new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String ruleKey = in.next();
        String ruleValue = in.next();
        List<String> innerList = new ArrayList<>();
        List<String> innerList2 = new ArrayList<>();
        List<String> innerList3 = new ArrayList<>();
        innerList.add("phone");
        innerList.add("blue");
        innerList.add("pixel");
        innerList2.add("computer");
        innerList2.add("silver");
        innerList2.add("phone");
        innerList3.add("phone");
        innerList3.add("gold");
        innerList3.add("iphone");
        items.add(innerList);
        items.add(innerList2);
        items.add(innerList3);
        int cp = 0;
        if (ruleKey.equals("type"))
        {
            for (int i = 0; i < 3; i++) {
                if (Objects.equals(items.get(i).get(0), ruleValue))
                {
                    cp++;
                }
            }
        }
        if (ruleKey.equals("color"))
        {
            for (int i = 0; i < 3; i++) {
                if (Objects.equals(items.get(i).get(1), ruleValue))
                {
                    cp++;
                }
            }
        }
        if (ruleKey.equals("name"))
        {
            for (int i = 0; i < 3; i++) {
                if (Objects.equals(items.get(i).get(2), ruleValue))
                {
                    cp++;
                }
            }
        }
        System.out.println(cp);
//        System.out.println(items.get(1).get(1));



    }
}
