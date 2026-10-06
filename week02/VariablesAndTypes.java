public class VariablesAndTypes {
    public static void main(String[] args) {
        int age = 21;
        double height = 5.8;
        char initial = 'R';
        boolean student = true;
        String city = "Dhaka";
        final int DAYS = 7;

        System.out.println(city + " | age " + age + " | height " + height);
        System.out.println("Initial: " + initial + ", student: " + student);
        System.out.println("Days in a week: " + DAYS);

        int a = 5;
        double b = a;
        int c = (int) 7.89;
        System.out.println(b + " " + c);
    }
}
