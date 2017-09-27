package com.javacourses.clinic;

/**
 * Realize client in animal clinic.
 */
public class Client {
    private String id;
    private String petName;

    public Client(String id, String petName) {
        this.id = id;
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return this.getId() + ", pet: " + this.getPetName();
    }
}
