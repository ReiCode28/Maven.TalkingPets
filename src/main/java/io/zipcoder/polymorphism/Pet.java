package io.zipcoder.polymorphism;

public class Pet {

    String name;

    public Pet(String name) {
        this.name = name;
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "PetSpeak";
    }

    public String toString() {
        return "\n" + name + " says " + speak();
    }
}
