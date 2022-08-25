package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        int numOfPets;

        System.out.println("How many pets do you have?");
        Scanner in = new Scanner(System.in);
        numOfPets = in.nextInt();
        Pet[] userPets = new Pet[numOfPets];

        for (int i = 0; i < numOfPets; i++) {
            System.out.println("What is pet #" + (i+1) +"'s type? (Bird, Cat, or Dog)");
            String petType = in.next().toLowerCase();
            String petName;

            switch (petType) {
                case "bird":
                    System.out.println("What is your bird's name?");
                    petName = in.next();
                    userPets[i] = new Bird(petName);
                    break;
                case "dog":
                    System.out.println("What is your dog's name?");
                    petName = in.next();
                    userPets[i] = new Dog(petName);
                    break;
                case "cat":
                    System.out.println("What is your cat's name?");
                    petName = in.next();
                    userPets[i] = new Cat(petName);
                    break;
                default:
                    i--;
                    break;
            }
        }

        for (Pet pet : userPets) System.out.print(pet);
    }
}
