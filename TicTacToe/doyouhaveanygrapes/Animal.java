import java.util.ArrayList;

public class Animal {

private String name;
private String color;
private ArrayList<String> inventory;

/**
 * Constructor 
 * @param name - this names the animal
 * @param color - this is the animals color 
 */
public Animal (String name, String color) {
    this.name = name;
    this.color = color;
}

public String getName() {
    return name;
}

public String getColor() {
    return color;
}

public static ArrayList<String> Inventory = new ArrayList<>(); 

public void addItem(String item) {
        inventory.add(item);
    }

public boolean removeItem(String item) {
        return inventory.remove(item);
    }

public void listInventory() {
        if (inventory.isEmpty()) {
            System.out.println(name + "'s inventory is empty.");
        } else {
            System.out.println(name + "'s Inventory:");
            for (String item : inventory) {
                System.out.println("- " + item);
            }
        }
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }
}