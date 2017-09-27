package com.javacourses.clinic.runner;

import com.javacourses.clinic.Clinic;

/**
 * Runner class of animal clinic for manual tests.
 * Just run main.
 */
public class ClinicRunner {
    private Clinic clinic;

    public ClinicRunner(Clinic clinic) {
        this.clinic = clinic;
    }

    public static void main(String[] args) {
        Clinic clinic = new Clinic(5);
        clinic.addClient(ClientFabric.next());
    }
}
