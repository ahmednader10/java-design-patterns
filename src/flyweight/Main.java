package flyweight;

public class Main {

    public static void main(String[]args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("a", 1);
        inventorySystem.takeOrder("b", 2);
        inventorySystem.takeOrder("c", 3);
        inventorySystem.takeOrder("d", 4);
        inventorySystem.takeOrder("a", 5);
        inventorySystem.takeOrder("a", 6);
        inventorySystem.takeOrder("a", 7);
        inventorySystem.takeOrder("b", 8);
        inventorySystem.takeOrder("a", 9);
        inventorySystem.takeOrder("c", 10);
        inventorySystem.takeOrder("d", 11);
        inventorySystem.takeOrder("d", 12);
        inventorySystem.takeOrder("d", 13);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
