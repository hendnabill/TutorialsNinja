package util;

import java.util.Random;

public class Utility {

    //first name

    public static String generateRandomFirstName() {
        int nameLength = 10;
        Random random = new Random();
        StringBuilder firstName = new StringBuilder(nameLength);

        for (int i = 0; i < nameLength; i++) {

            char randomChar = (char) (random.nextBoolean()
                    ? 'A' + random.nextInt(26)
                    : 'a' + random.nextInt(26));
            firstName.append(randomChar);
        }

        return firstName.toString();
    }

    //last name

    public static String generateRandomLastName() {
        int nameLength = 10;
        Random random = new Random();
        StringBuilder lastName = new StringBuilder(nameLength);

        for (int i = 0; i < nameLength; i++) {

            char randomChar = (char) (random.nextBoolean()
                    ? 'A' + random.nextInt(26)
                    : 'a' + random.nextInt(26));
            lastName.append(randomChar);
        }

        return lastName.toString();
    }

    // email
    public static String generateRandomEmail() {
        int nameLength = 10;
        String domain = "@example.com";
        Random random = new Random();
        StringBuilder email = new StringBuilder(nameLength + domain.length());

        for (int i = 0; i < nameLength; i++) {

            char randomChar = (char) (random.nextBoolean()
                    ? 'A' + random.nextInt(26)
                    : 'a' + random.nextInt(26));
            email.append(randomChar);
        }


        email.append(domain);

        return email.toString();
    }


  // phonenumber

    public static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("+20");


        for (int i = 0; i < 9; i++) {
            int digit = random.nextInt(10);
            phoneNumber.append(digit);
        }

        return phoneNumber.toString();
    }

    //password

    public static String generateRandomPassword(int length) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+<>?";

        String allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;

        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }

    //generate random int
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }

    public static void main(String[] args) {
        // Test the method
        int randomNumber = generateRandomNumber();
        System.out.println("Random Number (1 to 8): " + randomNumber);
    }

    public static String generateAddress() {
        String[] streetNames = {"Main St", "Highland Ave", "Oak Rd", "Pine Blvd", "Elm Dr"};
        Random rand = new Random();
        int streetNumber = rand.nextInt(900) + 100; // Random number between 100 and 999
        String streetName = streetNames[rand.nextInt(streetNames.length)];
        return streetNumber + " " + streetName;
    }

    // Method to generate a random city
    public static String generateCity() {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
        Random rand = new Random();
        return cities[rand.nextInt(cities.length)];
    }

    // Method to generate a random postal code
    public static String generatePostalCode() {
        Random rand = new Random();
        int postalCode = rand.nextInt(90000) + 10000; // Random 5-digit postal code
        return String.valueOf(postalCode);
    }

    // Method to generate a full address
    public static String generateFullAddress() {
        String address = generateAddress();
        String city = generateCity();
        String postalCode = generatePostalCode();
        return address + ", " + city + ", " + postalCode;
    }






}
