//author Massimo Boffa
package finalproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SodaMachine {

    private static int Balance = 0; //stores total balance
    private static Map<String, Integer> itemInventory = new HashMap<String, Integer>(); //hashmap for items and its numbers
    private static Map<String, Integer> coinInventory = new HashMap<String, Integer>(); //hashmap for coins and its numbers
    private static VendingExample VM = new VendingExample();

    

    public static void main(String args[]) {

        initiateInventory(); // initiate with items and coins storage in the vending machine

        Scanner user_input = new Scanner(System.in);

        while (Balance == 0) {
            inputCoins(user_input, VM); // input coins
        }

        String sample = selectItems(user_input, VM); // select items
        int checkVendCond = 0;
        if (!itemInventory.containsKey(sample)) { // for return and cancel case
            checkVendCond = VM.choose(sample, Balance);
        } else if (itemInventory.get(sample) == 0) { // Sold out items
            System.out.println("Sold Out, Please insert coins and buy another item");
            VendingMachine.main(null);
        } else {
            checkVendCond = VM.choose(sample, Balance);
            if (checkVendCond == 2) {
                System.out.println("Insert More Coins");
                inputCoins(user_input, VM);
                sample = selectItems(user_input, VM);
                if (itemInventory.get(sample) == 0) {
                    System.out.println("Sold Out, Please insert coins and buy the items");
                    VendingMachine.main(null);
                } else if (itemInventory.get(sample) == 1 || itemInventory.get(sample) == -1) {

                } else {
                    itemInventory.put(sample, itemInventory.get(sample) - 1);
                    Balance = checkVendCond;
                }
            } else {
                itemInventory.put(sample, itemInventory.get(sample) - 1);
                Balance = checkVendCond;
            }

        }

        user_input.close();
    }

    // insertion of coins
    public static void inputCoins(Scanner user_input, VendingExample VM) {
        System.out.println("\nInsert coins in the form of: NICKEL, DIME, QUARTER and DOLLAR");
        String coins = user_input.nextLine();
        Balance = VM.drop(coins, Balance);
    }

    //selection of items
    public static String selectItems(Scanner user_input, VendingExample VM) {
        System.out.println("Your balance is " + Balance);
        System.out.println("Select Item: \n");
        System.out.println("COKE: Cola(1 dollar)");
        System.out.println("SPRITE: Sprite(1 dollar)");
        System.out.println("DR.PEPPER: Dr.Pepper(1 dollar)");
        System.out.println("FANTA: Fanta(1 dollar)");
        System.out.println("PIBB: Pibb(1 dollar)");
        System.out.println("LEMONADE: Minute Maid(1 dollar)");
        System.out.println("ROOTBEER: A&W Root Beer(1 dollar)");
        System.out.println("CRUSH: Crush(1 dollar)");
        System.out.println("RETURN");
        System.out.println("CANCEL");
        return (user_input.nextLine());
    }

    //initiate coins and items storage in vending machine
    public static void initiateInventory() {
        for (Item i : Item.values()) {
            itemInventory.put(i.getName(), 5);
        }
        for (Coin i : Coin.values()) {
            coinInventory.put(i.getName(), 5);
        }
    }

    public static void changeBalance(int balance) {

    }
}
