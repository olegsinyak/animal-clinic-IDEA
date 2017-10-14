package com.lessons.clinic;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClinicTest {
    private Clinic clinic;

    @Before
    public void setUp() throws Exception {
        clinic = new Clinic(5);
        clinic.addClient(0, new Client("John", "Whatson-cat"));
        clinic.addClient(1, new Client("Bill", "Murrey-cat"));
        clinic.addClient(2, new Client("Deinerys", "Drake1"));
        clinic.addClient(3, new Client("Oleg", "Varick"));
        clinic.addClient(4, new Client("Tom", "Jerry"));
    }

    @Test
    public void getClients() throws Exception {
        Client expected = new Client("John", "Whatson-cat");
        Client actual = clinic.getClients()[0];
        assertEquals(expected, actual);
    }

    @Test
    public void addClient() throws Exception {
        Client expected = new Client("John", "Wane");
        clinic.addClient(0, expected);
        assertEquals(expected, clinic.getClients()[0]);
    }

    @Test
    public void findClientsByPetName() throws Exception {
        List<Client> expected = new ArrayList<Client>();
        expected.add(new Client("Tom", "Jerry"));
        List<Client> actual = clinic.findClientsByPetName("Jerry");
        assertEquals(expected, actual);
    }

    @Test
    public void findPetsByClientId() throws Exception {
        List<String> expected = new ArrayList<String>();
        expected.add("No such client by name \"Oleg2\"");

        List<String> actual = clinic.findPetsByClientId("Oleg2");

        assertEquals(expected, actual);
    }

    @Test
    public void printClients() throws Exception {
        PrintStream defaultStream = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printer = new PrintStream(buffer);
        System.setOut(printer);
        clinic.printClients();
        byte[] bytes = buffer.toByteArray();
        assertEquals(true, bytes.length > 0);
        printer.close();
        System.setOut(defaultStream);
    }
}



