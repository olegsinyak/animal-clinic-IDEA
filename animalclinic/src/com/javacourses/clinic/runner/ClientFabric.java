package com.javacourses.clinic.runner;

import com.javacourses.clinic.Client;

import java.util.Random;

/**
 * Fabric creates random clients.
 */
public class ClientFabric {
    private static final String[] CLIEND_IDS = {"Abrham", "Polly", "John", "Arnold", "Bill", "Smith", "Greg"};
    private static final String[] PET_NAMES = {"Fill", "Varick", "Bob", "Buks", "Flops", "Admiral", "General", "Swift"};


    /**
     * Creates new client with random id and pet.
     * @return random client.
     */
    public static Client next() {
        Random r = new Random(47);
        String id = CLIEND_IDS[r.nextInt(CLIEND_IDS.length)];
        String pet = PET_NAMES[r.nextInt(PET_NAMES.length)];
        return new Client(id, pet);
    }

}
