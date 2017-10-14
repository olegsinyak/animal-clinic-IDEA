package com.lessons.clinic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    private Client client;

    @Before
    public void setUp() throws Exception {
        client = new Client("John", "Barsik");
    }

    @Test
    public void getPetName() throws Exception {
        String expected = "Barsik";
        String actual = client.getPetName();
        assertEquals(expected, actual);
    }

    @Test
    public void getId() throws Exception {
        String expected = "John";
        String actual = client.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void equals() throws Exception {
        assertEquals(client, new Client("John", "Barsik"));
        assertEquals(false, client.equals(new Client("Jonn", "Barsik")));
    }

    @Test
    public void toStringTest() throws Exception {
        String expected = "John, pet: Barsik";
        String actual = client.toString();
        assertEquals(expected, actual);
    }

}