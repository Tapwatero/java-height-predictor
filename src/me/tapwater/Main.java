package me.tapwater;

public class Main {

    public static void main(String[] args) {


        int heightM = 171; // This is your mother's height in centimetres
        int heightF = 172; // This is your father's height in centimetres
        int combined = heightF + heightM; // Combines your mother's and father's height
        float offset = 2.24; // This is the offset used to make the predicton more accurate as more people use it.
        int divided = (combined / 2) + offset; // Divides combined by 2

        String gender = "male"; // gender must equal male or female.
        if (gender.equalsIgnoreCase("male")) { // Checks without caring for case if gender is equal to male.
            int predicted = (int) (divided + 12.7); // The maths required to predict adult height for males.
            System.out.println(predicted); // Prints it out.
        } else if (gender.equalsIgnoreCase("female")) { // Checks without caring for case if gender is equal to female.
            int predicted = (int) (divided - 12.7); // The maths required to predict adult height for females.
            System.out.println(predicted); // Prints it out.

        }

    }
}
