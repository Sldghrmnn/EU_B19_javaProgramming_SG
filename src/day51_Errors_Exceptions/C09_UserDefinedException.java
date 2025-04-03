package day51_Errors_Exceptions;

import day51_Errors_Exceptions.Exceptions.NameException;

public class C09_UserDefinedException {
    public static void main(String[] args) {

        String name = "1";

        try {
            nameValidation(name);
        } catch (NameException e) {
            System.out.println(e);
        }
        System.out.println("Program sona erdi.");

    }


    public static void nameValidation(String str) throws NameException{
        if (str.length() < 3){
            throw new NameException("Name 3 harften kücük olamaz");
        }
    }
}
