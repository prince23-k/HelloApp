public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}