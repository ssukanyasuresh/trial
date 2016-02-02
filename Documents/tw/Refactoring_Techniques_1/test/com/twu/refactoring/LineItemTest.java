package com.twu.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineItemTest {

    @Test
    public void shouldPrintAllTheDetails() {
        LineItem lineItem = new LineItem("Item1",100,2);
        assertEquals("Item1\t100.0\t2\n",lineItem.toString());

    }
}