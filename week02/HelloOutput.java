public class HelloOutput {
    public static void main(String[] args) {
        // println prints text and moves to the next line
        System.out.println("Welcome to SE 217 Lab");

        // print prints text and stays on the same line
        System.out.print("Learning ");
        System.out.print("Java ");
        System.out.print("step by step");
        System.out.println();

        // printf prints formatted text
        String studentName = "Rafi";
        int labNumber = 2;
        double marks = 18.756;
        System.out.printf("Student: %s, Lab: %d, Marks: %.2f%n", studentName, labNumber, marks);
        System.out.printf("[%6d]%n", 45);   // width 6, right aligned
        System.out.printf("[%-6d]%n", 45);  // width 6, left aligned
        System.out.printf("[%06d]%n", 45);  // filled with zeros

        // escape characters
        System.out.println("Line one\nLine two");
        System.out.println("Name:\tRafi");
        System.out.println("She said \"Hello\"");
        System.out.println("Folder path: C:\\Users\\Lab");
        System.out.println("It\'s a single quote");
    }
}
