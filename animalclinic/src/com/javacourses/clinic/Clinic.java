package com.javacourses.clinic;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents animal clinic.
 * @author oleg
 */
public class Clinic {

    public Client[] getClients() {
        return this.clients;
    }
    private final Client[] clients;
    private int clientsCount;

    public Clinic(final int size) {
        this.clients = new Client[size];
        this.clientsCount = size;
    }


    /**
     * Adds client.
     * @param position place were adds.
     * @param client for adding.
     */
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }


    /**
     * Adds client in clinic db. Overrides addClient(pos, client).
     * @param client for adding.
     */
    public void addClient(final Client client) {
        for (int i = 0; i < this.clients.length; i++) {
            if (clients[i] == null) {
                addClient(i, client);
                break;
            }
        }
    }


    /**
     * Finds owners of pet with specified petName.
     * @param petName pet name.
     * @return array of clients owners of pet with specified petName.
     */
    public List<Client> findClientsByPetName(final String petName) {
        List<Client> result = new ArrayList<>();
        for (Client c : this.clients) {
            if (petName.equals(c.getPetName())) {
                result.add(c);
            }
        }
        return result;
    }


    /**
     * Finds pet names by client Id.
     * @param clientId owner of seeking pet.
     * @return list of pet names.
     */
    public List<String> findPetsByClientId(String clientId) {
        List<String> result = new ArrayList<>();
        for (Client client : this.clients) {
            if (client.getId().equals(clientId)) {
                result.add(client.getPetName());
            }
        }
        return result;
    }


    /**
     * Prints client's number, Id and pet.
     */
    public void printClients() {
        System.out.println(">> Clients list:");
        for (int i = 0; i < clients.length; i++) {
            System.out.printf("No.%d  Owner: %s, Pet: %s\n", i, clients[i].getId(), clients[i].getPetName());
        }
    }
}
