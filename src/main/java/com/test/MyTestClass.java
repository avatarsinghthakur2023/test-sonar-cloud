package com.test;

import java.util.List;

public class MyTestClass {

    List<String> myList;

    public String getMeSomething() {

        return myList.get(0);
    }

    public String getMeHardCoded() {

        return "avatar";
    }
}
