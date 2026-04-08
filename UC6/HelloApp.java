public class HelloApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Add names with comma
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove last ", "
            String result = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}