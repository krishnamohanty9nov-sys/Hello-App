public class HelloApp {
    public static void main(String[] args) {
        String output;

        if (args.length > 0) {
            output = String.join(", ", args);
        } else {
            output = "World";
        }

        System.out.println("Hello, " + output + "!");
    }
}