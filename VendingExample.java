/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//author Massimo Boffa and Nigel Maloney
package vendingmachine;

import java.util.Scanner;

class VendingExample {
    int cokeAmount=10;
    int spriteAmount=10;
    int fantaAmount=10;
    int pibbAmount=10;
    int DrPepperAmount=10;
    int lemonadeAmount= 10;
    int rootbeerAmount=10;
    int crushAmount=10;
    int cheetosAmount=10;
    int laysAmount=10;
    int triscuitAmount=10;
    int cheezitAmount=10;
    int mnmAmount=10;
    int snickerAmount=10;
    int snyderAmount=10;
    int skittlesAmount=10;
    int lifesaversAmount=10;
    int fritosAmount=10;
    int doritosAmount=10;
    int sunchipsAmount=10;
    int ricekrispiesAmount=10;

    private static VendingExample VM = new VendingExample();

    public static void main(String[] args){
    
    }
    
    // add coins

    public int drop(String coins, int total) {

        if (coins.equals("NICKEL")) {
            total = total + Coin.NICKEL.getDenom();
        } else if (coins.equals("DIME")) {
            total = total + Coin.DIME.getDenom();
        } else if (coins.equals("QUARTER")) {
            total = total + Coin.QUARTER.getDenom();
        } else if (coins.equals("DOLLAR")) {
            total = total + Coin.DOLLAR.getDenom();
        } else {
            System.out.println("Wrong Input Coin");
        }

        return total;
    }

   Scanner choice = new Scanner(System.in);
  
    //select items
    public int choose(String sample, int total) {
    	
    	
    	
        if (sample.equals("COKE")) {
            System.out.println("You have selected " + Item.COKE.getName());
            if (total >= Item.COKE.getPrice()) {
            	System.out.println("There were " + cokeAmount + " of Cokes before your purchases");
                total = total - Item.COKE.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(cokeAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                cokeAmount-=1;
                
                System.out.println("There are " + cokeAmount + " of Cokes in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
            
        } else if (sample.equals("SPRITE")) {
            System.out.println("You have selected " + Item.SPRITE.getName());
            if (total >= Item.SPRITE.getPrice()) {
            	System.out.println("There were " + spriteAmount + " of Sprites before your purchases");
                total = total - Item.SPRITE.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(spriteAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                spriteAmount-=1;
                
                System.out.println("There are " + spriteAmount + " of Sprites in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
        } else if (sample.equals("DR.PEPPER")) {
            System.out.println("You have selected " + Item.DR_PEPPER.getName());
            if (total >= Item.DR_PEPPER.getPrice()) {
            	System.out.println("There were " + DrPepperAmount + " of Dr Peppers before your purchases");
                total = total - Item.DR_PEPPER.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(DrPepperAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                DrPepperAmount-=1;
                
                System.out.println("There are " + DrPepperAmount + " of Dr Peppers in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("FANTA")) {
            System.out.println("You have selected " + Item.FANTA.getName());
            if (total >= Item.FANTA.getPrice()) {
            	System.out.println("There were " + fantaAmount + " of Fantas before your purchases");
                total = total - Item.FANTA.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(fantaAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                fantaAmount-=1;
                
                System.out.println("There are " + fantaAmount + " of Fantas in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("PIBB")) {
            System.out.println("You have selected " + Item.PIBB.getName());
            if (total >= Item.PIBB.getPrice()) {
            	System.out.println("There were " + pibbAmount + " of Pibbs before your purchases");
                total = total - Item.PIBB.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(pibbAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                pibbAmount-=1;
                
                System.out.println("There are " + pibbAmount + " of Pibbs in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("LEMONADE")) {
            System.out.println("You have selected " + Item.LEMONADE.getName());
            if (total >= Item.LEMONADE.getPrice()) {
            	System.out.println("There were " + lemonadeAmount + " of lemonades before your purchases");
                total = total - Item.LEMONADE.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(lemonadeAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                lemonadeAmount-=1;
                
                System.out.println("There are " + lemonadeAmount + " of lemonades in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("ROOTBEER")) {
            System.out.println("You have selected " + Item.ROOTBEER.getName());
            if (total >= Item.ROOTBEER.getPrice()) {
                
                System.out.println("There were " + rootbeerAmount + " of rootbeers before your purchases");
                total = total - Item.ROOTBEER.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                
                if(rootbeerAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                rootbeerAmount-=1;
                
                System.out.println("There are " + rootbeerAmount + " of rootbeers in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("CRUSH")) {
            System.out.println("You have selected " + Item.CRUSH.getName());
            if (total >= Item.CRUSH.getPrice()) {
            	System.out.println("There were " + crushAmount + " of crushes before your purchases");
                total = total - Item.CRUSH.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(crushAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                crushAmount-=1;
                
                System.out.println("There are " + crushAmount + " of crushes in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("LAYS")) {
            System.out.println("You have selected " + Item.LAYS.getName());
            if (total >= Item.LAYS.getPrice()) {
            	System.out.println("There were " + laysAmount + " of lays before your purchases");
                total = total - Item.LAYS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(laysAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                laysAmount-=1;
                
                System.out.println("There are " + laysAmount + " of lays in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("TRISCUIT")) {
            System.out.println("You have selected " + Item.TRISCUIT.getName());
            if (total >= Item.TRISCUIT.getPrice()) {
            	System.out.println("There were " + triscuitAmount + " of triscuits before your purchases");
                total = total - Item.TRISCUIT.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(triscuitAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                triscuitAmount-=1;
                
                System.out.println("There are " + triscuitAmount + " of triscuits in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("CHEETOS")) {
             System.out.println("You have selected " + Item.CHEETOS.getName());
             if (total >= Item.CHEETOS.getPrice()) {
            	 System.out.println("There were " + cheetosAmount + " of cheetos before your purchases");
                 total = total - Item.CHEETOS.getPrice();
                 System.out.println("Thank you for your purchase!! ");
                 System.out.println("Your balance is " + total+ " CENTS");
                 
                  if(cheetosAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                cheetosAmount-=1;
                 
                 System.out.println("There are " + cheetosAmount + " of cheetos in the machine.");
                 System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
             } else {
                 System.out.println("Insert more coins ");
                 return 2;
             }
         } else if (sample.equals("CHEEZ_IT")) {
             System.out.println("You have selected " + Item.CHEEZ_IT.getName());
             if (total >= Item.CHEEZ_IT.getPrice()) {
            	 System.out.println("There were " + cheezitAmount + " of cheez its before your purchases");
                 total = total - Item.CHEEZ_IT.getPrice();
                 System.out.println("Thank you for your purchase!! ");
                 System.out.println("Your balance is " + total+ " CENTS");
                 
                  if(cheezitAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                cheezitAmount-=1;
                 
                 System.out.println("There are " + cheezitAmount + " of Cheez its in the machine.");
                 System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
             } else {
                 System.out.println("Insert more coins ");
                 return 2;
             }
         } else if (sample.equals("MNM")) {
             System.out.println("You have selected " + Item.MNM.getName());
             if (total >= Item.MNM.getPrice()) {
            	 System.out.println("There were " + mnmAmount + " of M & Ms before your purchases");
                 total = total - Item.MNM.getPrice();
                 System.out.println("Thank you for your purchase!! ");
                 System.out.println("Your balance is " + total+ " CENTS");
                 
                  if(mnmAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                mnmAmount-=1;
                 
                 System.out.println("There are " + mnmAmount + " of M & Ms in the machine.");
                 System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
             } else {
                 System.out.println("Insert more coins ");
                 return 2;
             }
         } else if (sample.equals("SNYDERS")) {
            System.out.println("You have selected " + Item.SNYDERS.getName());
            if (total >= Item.SNYDERS.getPrice()) {
            	 System.out.println("There were " + snyderAmount + " of Snyders before your purchases");
                total = total - Item.SNYDERS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(snyderAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                snyderAmount-=1;
                
                System.out.println("There are " + snyderAmount + " of Snyders in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("SNICKERS")) {
            System.out.println("You have selected " + Item.SNICKERS.getName());
            if (total >= Item.SNICKERS.getPrice()) {
            	 System.out.println("There were " + snickerAmount + " of snickers before your purchases");
                total = total - Item.SNICKERS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(snickerAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                snickerAmount-=1;
                
                System.out.println("There are " + snickerAmount + " of Snickers in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("SKITTLES")) {
            System.out.println("You have selected " + Item.SKITTLES.getName());
            if (total >= Item.SKITTLES.getPrice()) {
            	System.out.println("There were " + skittlesAmount + " of skittles before your purchases");
                total = total - Item.SKITTLES.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(skittlesAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                skittlesAmount-=1;
                
                System.out.println("There are " + skittlesAmount + " of Skittles in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("LIFESAVERS")) {
            System.out.println("You have selected " + Item.LIFESAVERS.getName());
            if (total >= Item.LIFESAVERS.getPrice()) {
            	 System.out.println("There were " + lifesaversAmount + " of lifesavers before your purchases");
                total = total - Item.LIFESAVERS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(lifesaversAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                lifesaversAmount-=1;
                
                System.out.println("There are " + lifesaversAmount + " of Lifesavers in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("FRITOS")) {
            System.out.println("You have selected " + Item.FRITOS.getName());
            if (total >= Item.FRITOS.getPrice()) {
            	System.out.println("There were " + fritosAmount + " of fritos before your purchases");
                total = total - Item.FRITOS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(fritosAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                fritosAmount-=1;
                
                System.out.println("There are " + fritosAmount + " of Skittles in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("DORITOS")) {
            System.out.println("You have selected " + Item.DORITOS.getName());
            if (total >= Item.DORITOS.getPrice()) {
            	System.out.println("There were " + doritosAmount + " of doritos before your purchases");
                total = total - Item.DORITOS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(doritosAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                doritosAmount-=1;
                
                System.out.println("There are " + doritosAmount + " of doritos in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("SUNCHIPS")) {
            System.out.println("You have selected " + Item.SUNCHIPS.getName());
            if (total >= Item.SUNCHIPS.getPrice()) {
            	System.out.println("There are " + sunchipsAmount + " of sunchips in the machine.");
                total = total - Item.SUNCHIPS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(sunchipsAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                sunchipsAmount-=1;
                
                System.out.println("There are " + sunchipsAmount + " of sunchips in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("RICEKRISPIES")) {
            System.out.println("You have selected " + Item.RICEKRISPIES.getName());
            if (total >= Item.RICEKRISPIES.getPrice()) {
            	System.out.println("There are " + ricekrispiesAmount + " of ricekrispies in the machine.");
                total = total - Item.RICEKRISPIES.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                
                 if(ricekrispiesAmount < 1){
                    System.out.println("--------------\nOut of stock, try something else.\n--------------");
                    String[] args={};
                    VendingMachine.main(args);
                }
                
                ricekrispiesAmount-=1;
                
                System.out.println("There are " + ricekrispiesAmount + " of ricekrispies in the machine.");
                System.out.print("Would you like to buy something else?(Y/N)");
                char select = choice.next().charAt(0);
                if(select == 'Y'){
                    System.out.print("Back to: 1.Soda Machine , 2.Snack Machine , 3.Combo Machine ");
                    int typeSelect = choice.nextInt();
                    if(typeSelect == 1){
                        String[] args = {};
                        SodaMachine.main(args);
                    }else if(typeSelect == 2){
                        String[] args = {};
                        SnackMachine.main(args);
                    }else if(typeSelect == 3){
                        String[] args = {};
                        ComboMachine.main(args);
                    }
                }
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
            
        } else if (sample.equals("RETURN")) {
            System.out.println("Your balance is " + total + " and is returned.");
            return 1;
        } else if (sample.equals("CANCEL")) {
            return -1;
        } else {
            System.out.println("Wrong choice: Your balance is " + total+ " CENTS");
            return 1;
        }

        return total;
    }
}