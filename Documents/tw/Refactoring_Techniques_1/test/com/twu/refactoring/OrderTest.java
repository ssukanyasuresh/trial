package com.twu.refactoring;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class OrderTest {
    @Test
    public void shouldDisplayNameAndAddress() {
        LineItem lineItem = mock(LineItem.class);
        List<LineItem> lineItemList = new ArrayList<>();
        lineItemList.add(lineItem);

        Order order = new Order("Suku", "Pune", lineItemList);

        assertEquals("Suku\nPune", order.printCustomerDetails());

    }
}