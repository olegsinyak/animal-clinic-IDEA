package com.javacourses.clinic;

/**
 * Represents animal clinic.
 * @author oleg
 */
public class Clinic {

    public Client[] getClients() {
        return this.clients;
    }

    private final Client[] clients;

    public Clinic(final int size) {
        this.clients = new Client[size];
    }


    /**
     * Adds client.
     * @param position place were adds.
     * @param client to be added.
     */
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }


    /**
     * Finds owners of pet with specified name.
     * @param name pet name.
     * @return array of clients owners of pet with specified name.
     */
    public Client[] findCLientsByPetName(final String name) {
        Client[] result;
        int size = 0;
        for (Client c : this.clients) {
            if (name.equals(c.getPetName())) {
                size++;
            }
        }
        result = new Client[size];
        int i = 0;
        for (Client c : this.clients) {
            if (name.equals(c.getPetName())) {
                result[i] = c;
                i++;
            }
        }
        return result;
    }


    /**
     * Prints client's number, Id and pet.
     */
    public void printClients() {
        for (int i = 0; i < clients.length; i++) {
            System.out.printf("No.%d  Owner: %s, Pet: %s\n", i, clients[i].getId(), clients[i].getPetName());
        }
    }
}
