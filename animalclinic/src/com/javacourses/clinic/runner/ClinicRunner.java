package com.javacourses.clinic.runner;

import com.javacourses.clinic.Clinic;

/**
 * Runner class of animal clinic for manual tests.
 * Just run main.
 */
public class ClinicRunner {

    public static void main(String[] args) {
        final int size = 5;
        Clinic clinic = new Clinic(size);
        for (int i = 0; i < size; i++) {
            clinic.addClient(ClientFabric.next());
        }
        clinic.printClients();

        System.out.println(clinic.findPetsByClientId("Bill"));
        System.out.println(clinic.findPetsByClientId("Greg"));
    }
}
