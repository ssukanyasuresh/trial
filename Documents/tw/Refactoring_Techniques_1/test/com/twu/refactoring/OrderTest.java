package com.twu.refactoring;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderTest {
    @Test
    public void shouldDisplayNameAndAddress() {
        LineItem lineItem = mock(LineItem.class);
        List<LineItem> lineItemList = new ArrayList<>();
        lineItemList.add(lineItem);

        Order order = new Order("Suku", "Pune", lineItemList);

        assertEquals("Suku\nPune", order.printCustomerDetails());

    }

    @Test
    public void shouldPrintLineItemDetails() {
        LineItem lineItem = mock(LineItem.class);
        List<LineItem> lineItemList = new ArrayList<>();
        lineItemList.add(lineItem);
        String lineItemDetails = "Pencil\t4.0\t2\n";

        Order order = new Order("Rebecca", "Pune", lineItemList);
        when(lineItem.toString()).thenReturn(lineItemDetails);

        assertEquals(lineItemDetails, order.printLineItems());

    }
}