package com.packageselenium.collectionexcercises;

import java.util.*;

public class ListTrim {
    static void listTrim(List<String> strings) {
    	//ListITerator is an interface which allows to traverse List during iteration of the list
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> mainList = Arrays.asList(" red ", " white ", " blue ");
        listTrim(mainList);
        for (String s : mainList) {
            //System.out.format("\"%s\"%n", s);
        	System.out.println(s);
        }
    }
}
