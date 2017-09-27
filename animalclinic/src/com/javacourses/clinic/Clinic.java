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
            }
        }
    }


    /**
     * Finds owners of pet with specified name.
     * @param name pet name.
     * @return array of clients owners of pet with specified name.
     */
    public Client[] findClientsByPetName(final String name) {
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
     * Finds pet name by client Id.
     * @param clientId owner of seeking pet.
     * @return pet name.
     */
    public String findPetByClientId(String clientId) {
        String result = "";
        for (Client client : this.clients) {
            if (client.getId().equals(clientId)) {
                result = client.getPetName();
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
