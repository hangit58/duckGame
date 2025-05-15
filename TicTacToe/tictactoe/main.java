import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Enter a name: ");

        String name = input.nextLine();

        System.out.println("Your name is " + name);

        Duck daisy = new Duck(name, "color");

        Scanner scanner = new Scanner(System.in);

        // Initialize world and characters
        World world = new World(10, 10);
        Human human = new Human("Tommy");

        int duckX = 5, duckY = 5;
        int humanX = 5, humanY = 6;

        // Set initial positions
        world.setEntity(duckX, duckY, 'x');  // Duck
        world.setEntity(humanX, humanY, 'o');  // Human

        String command = "";
        while (!command.equalsIgnoreCase("exit")) {
            world.clearGrid();
            world.setEntity(duckX, duckY, 'x');  // Update duck position
            world.setEntity(humanX, humanY, 'o');  // Update human position
            world.printGrid();

            System.out.println("\nCommands: move up/down/left/right, add human [name], inventory, exit");
            System.out.print("> ");
            command = scanner.nextLine().trim();

            if (command.startsWith("move")) {
                if (command.contains("up")) duckX--;
                else if (command.contains("down")) duckX++;
                else if (command.contains("left")) duckY--;
                else if (command.contains("right")) duckY++;
            } else if (command.startsWith("add human")) {
                String name1 = command.substring(11);  // Get human name from input
                Human newHuman = new Human(name);
                // Add new human (for simplicity, place it next to the duck)
                humanX = duckX + 1;
                humanY = duckY;
                System.out.println("Added human: " + name);
            } else if (command.equalsIgnoreCase("inventory")) {
                daisy.listInventory();
            } else if (!command.equalsIgnoreCase("exit")) {
                System.out.println("Unknown command.");

        System.out.println("Exiting the duck world!");
    }
        }
}

}