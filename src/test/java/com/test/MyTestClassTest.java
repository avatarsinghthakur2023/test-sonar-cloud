package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyTestClassTest {

    @Test
    public void testHardcoded() {

        Assertions.assertEquals("avatar", new MyTestClass().getMeHardCoded());
    }
}