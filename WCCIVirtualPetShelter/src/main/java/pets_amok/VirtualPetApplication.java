package pets_amok;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        // setup information
        String inputString1 = "";
        String inputString2 = "";
        String inputString3 = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Hello!, Welcome to virtualPet");
        System.out.println(
                "First you need to name your shelter. Please enter a name");
        inputString1 = in.nextLine();
        System.out.println("Next enter a description of your shelter");
        inputString2 = in.nextLine();
        System.out.println("");
        virtualPetShelter userShelter = new virtualPetShelter(inputString1, inputString2);
        // loop to interact with pet
        while (!inputString1.equals("exit")) {

            System.out.println("Thank you for volunteering at " + userShelter.getName());
            System.out.println(userShelter.getDescription());
            System.out.println("");
            System.out.println("This is the status of your pets");
            printHeader();
            for (VirtualPet pet : userShelter.getAnimals()) {
                printInfo(stringBuffer(animalText(pet)));
            }
            System.out.println("Litterbox:" +userShelter.getLitterbox());
            System.out.println("");
            System.out.println("What do you want to do?");

            System.out.println("1. Feed the animals");
            System.out.println("2. Give water to the animals");
            System.out.println("3. Play with an animal");
            System.out.println("4. Take an animal to the bathroom");
            System.out.println("5. Do nothing");
            System.out.println("6. Adopt a pet");
            System.out.println("7. Admit a pet");
            System.out.println("8. Walk all dogs");
            System.out.println("9. Clean Dog Cases");
            System.out.println("10. Clean the shelter litter");
            System.out.println("11. Oil all Robotics pets");
            System.out.println("12. Exit");
            inputString1 = in.nextLine();

            switch (Integer.parseInt(inputString1)) {
                case 1:
                    for (VirtualPet current : userShelter.getAnimals()) {
                        if (current instanceof OrganicAnimal) {
                            ((OrganicAnimal) current).feed();
                        }
                    }
                    System.out.println("You fed the animals");
                    break;
                case 2:
                    for (VirtualPet current : userShelter.getAnimals()) {
                        if (current instanceof OrganicAnimal) {
                            ((OrganicAnimal) current).water();
                        }
                    }
                    System.out.println("You watered the animals");
                    break;
                case 3:
                    System.out.println("Enter the name of the animal you want to play with");
                    inputString1 = in.nextLine();
                    userShelter.getPet(inputString1).exercise();
                    System.out.println("You Played with " + inputString1);
                    break;
                case 4:
                    for (VirtualPet current : userShelter.getAnimals()) {
                        current.bathroom();
                    }
                    System.out.println("You took the animals to the bathroom");
                    break;
                case 6:
                    System.out.println("Enter the name of the animal you want from the table above");
                    inputString1 = in.nextLine();
                    userShelter.remove(userShelter.getPet(inputString1));
                    break;
                case 7:
                    System.out.println(
                            "Would you like a robotic dog, robotic cat, an organic cat, or an organic dog ? Enter 'rdog','rcat','ocat', or 'odog' respectively");
                    inputString1 = in.nextLine();
                    System.out.println("What should it be named?");
                    inputString2 = in.nextLine();
                    System.out.println("What should its description be?(25 Char or less)");
                    inputString3 = in.nextLine();

                    if (inputString1.equals("ocat")) {
                        OrganicCat newAnimal = new OrganicCat(inputString2, inputString3);
                        userShelter.add(newAnimal);
                    } else if (inputString1.equals("odog")) {
                        OrganicDog newAnimal = new OrganicDog(inputString2, inputString3);
                        userShelter.add(newAnimal);
                    } else if (inputString1.equals("rdog")) {
                        RoboDog newAnimal = new RoboDog(inputString2, inputString3);
                        userShelter.add(newAnimal);
                    } else {
                        RoboCat newAnimal = new RoboCat(inputString2, inputString3);
                        userShelter.add(newAnimal);
                    }
                    break;
                case 8:
                    userShelter.walkDogs();
                    break;
                case 9:
                    userShelter.cleanCages();
                    break;
                case 10:
                    userShelter.cleanLitterbox();
                    break;
                case 11:
                    userShelter.oilRobots();
                    break;
                case 12:
                    inputString1 = "exit";
                    break;
                case 5:
                default:
                    System.out.println("You did nothing");
            }

            for (VirtualPet current : userShelter.getAnimals()) {
                if(current instanceof Cat){
                    userShelter.setLitterbox(userShelter.getLitterbox()-current.tick());
                }
                if(current instanceof Dog){
                    current.tick();
                }
            }
        }

        in.close();
    }

    public static void printInfo(String[] arrayInput) {
        String line = "";
        for (String current : arrayInput) {
            current = "|" + current;
            line = line + current;
        }
        System.out.println(line);
    }

    public static void printHeader() {
        String[] header = { "Name", "Species", "Description", "Bladder", "Exercise", "Hunger", "Thirst", "Oil",
                "Cage" };
        header = stringBuffer(header);
        String firstline = "";
        String secondline = "";
        for (String current : header) {
            current = "|" + current;
            firstline = firstline + current;
            for (int i = 0; i < 15; i++) {
                secondline = secondline + "-";
            }
        }
        System.out.println(firstline);
        System.out.println(secondline);
    }

    public static String[] stringBuffer(String[] original) {
        String[] output = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            String modifiedCurr = original[i];
            while (modifiedCurr.length() < 15) {
                modifiedCurr = modifiedCurr + " ";
            }
            output[i] = modifiedCurr;
        }
        return output;
    }

    public static String[] animalText(VirtualPet pet) {
        String[] output = new String[9];
        output[0] = pet.getName();
        if(pet instanceof Dog){
            if(pet instanceof RoboticAnimal){
                output[1]="RoboDog";
            }else{
                output[1]="OrganicDog";
            }
        }else{
            if(pet instanceof RoboticAnimal){
                output[1]="RoboCat";
            }else{
                output[1]="OrganicCat";
            }
        }
        output[2] = pet.getDescription();
        output[3] = Integer.toString(pet.getBladder());
        output[4] = Integer.toString(pet.getExercise());
        if (pet instanceof OrganicAnimal) {
            output[5] = Integer.toString(((OrganicAnimal) pet).getHunger());
            output[6] = Integer.toString(((OrganicAnimal) pet).getThirst());
            output[7] = "";
        } else {
            output[5] = "";
            output[6] = "";
            output[7] = Integer.toString(((RoboticAnimal) pet).getOil());
        }

        if(pet instanceof Dog){
            output[8]=Integer.toString(((Dog) pet).getCage());
        }else{
            output[8]="";
        }

        return output;
    }
}