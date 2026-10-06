public class VariablesAndTypes {
    public static void main(String[] args) {
        // variables of different types
        int age = 20;
        double height = 5.7;
        char initial = 'R';
        boolean isStudent = true;
        String city = "Dhaka";

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial: " + initial);
        System.out.println("Is student: " + isStudent);
        System.out.println("City: " + city);

        // final constant: its value can never change
        final double PI_VALUE = 3.14159;
        final int DAYS_IN_WEEK = 7;
        System.out.println("PI value: " + PI_VALUE);
        System.out.println("Days in week: " + DAYS_IN_WEEK);

        // implicit casting (small type to big type, automatic)
        int smallNumber = 25;
        double bigNumber = smallNumber;
        System.out.println("int to double: " + bigNumber);

        // explicit casting (big type to small type, we write it)
        double price = 99.99;
        int roundedDown = (int) price;
        System.out.println("double to int: " + roundedDown);

        // char and int casting
        char letter = 'A';
        int letterCode = letter;
        char nextLetter = (char) (letterCode + 1);
        System.out.println("Code of A: " + letterCode);
        System.out.println("Next letter: " + nextLetter);

        // integer division vs decimal division
        int total = 7;
        int parts = 2;
        System.out.println("7 / 2 = " + (total / parts));
        System.out.println("7 / 2 with cast = " + ((double) total / parts));
    }
}
