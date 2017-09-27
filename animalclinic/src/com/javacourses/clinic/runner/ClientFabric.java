package com.javacourses.clinic.runner;

import com.javacourses.clinic.Client;

import java.util.Random;

/**
 * Fabric creates random clients.
 */
public class ClientFabric {
    private static final String[] CLIENT_IDS = {"Abrham", "Polly", "John", "Arnold", "Bill", "Smith", "Greg"};
    private static final String[] PET_NAMES = {"Fill", "Varick", "Bob", "Buks", "Flops", "Admiral", "General", "Swift"};
    private static Random random = new Random();

    /**
     * Creates new client with random id and pet.
     * @return random client.
     */
    public static Client next() {
        String id = CLIENT_IDS[random.nextInt(CLIENT_IDS.length)];
        String pet = PET_NAMES[random.nextInt(PET_NAMES.length)];
        return new Client(id, pet);
    }

}
