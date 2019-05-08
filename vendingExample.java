/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

class VendingExample {

    // add coins

    public int drop(String coins, int total) {

        if (coins.equals("NICKEL")) {
            total = total + Coin.NICKLE.getDenom();
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

    //select items
    public int choose(String sample, int total) {
        if (sample.equals("COKE")) {
            System.out.println("You have selected " + Item.COKE.getName());
            if (total >= Item.COKE.getPrice()) {
                total = total - Item.COKE.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
            
        } else if (sample.equals("SPRITE")) {
            System.out.println("You have selected " + Item.SPRITE.getName());
            if (total >= Item.SPRITE.getPrice()) {
                total = total - Item.SPRITE.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
        } else if (sample.equals("DR.PEPPER")) {
            System.out.println("You have selected " + Item.DR_PEPPER.getName());
            if (total >= Item.DR_PEPPER.getPrice()) {
                total = total - Item.DR_PEPPER.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("FANTA")) {
            System.out.println("You have selected " + Item.FANTA.getName());
            if (total >= Item.FANTA.getPrice()) {
                total = total - Item.FANTA.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("PIBB")) {
            System.out.println("You have selected " + Item.PIBB.getName());
            if (total >= Item.PIBB.getPrice()) {
                total = total - Item.PIBB.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("LEMONADE")) {
            System.out.println("You have selected " + Item.LEMONADE.getName());
            if (total >= Item.LEMONADE.getPrice()) {
                total = total - Item.LEMONADE.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("ROOTBEER")) {
            System.out.println("You have selected " + Item.ROOTBEER.getName());
            if (total >= Item.ROOTBEER.getPrice()) {
                total = total - Item.ROOTBEER.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("CRUSH")) {
            System.out.println("You have selected " + Item.CRUSH.getName());
            if (total >= Item.CRUSH.getPrice()) {
                total = total - Item.CRUSH.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("LAYS")) {
            System.out.println("You have selected " + Item.LAYS.getName());
            if (total >= Item.LAYS.getPrice()) {
                total = total - Item.LAYS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("TRISCUIT")) {
            System.out.println("You have selected " + Item.TRISCUIT.getName());
            if (total >= Item.TRISCUIT.getPrice()) {
                total = total - Item.TRISCUIT.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("CHEETOS")) {
             System.out.println("You have selected " + Item.CHEETOS.getName());
             if (total >= Item.CHEETOS.getPrice()) {
                 total = total - Item.CHEETOS.getPrice();
                 System.out.println("Thank you for your purchase!! ");
                 System.out.println("Your balance is " + total+ " CENTS");
             } else {
                 System.out.println("Insert more coins ");
                 return 2;
             }
         } else if (sample.equals("CHEEZ_IT")) {
             System.out.println("You have selected " + Item.CHEEZ_IT.getName());
             if (total >= Item.CHEEZ_IT.getPrice()) {
                 total = total - Item.CHEEZ_IT.getPrice();
                 System.out.println("Thank you for your purchase!! ");
                 System.out.println("Your balance is " + total+ " CENTS");
             } else {
                 System.out.println("Insert more coins ");
                 return 2;
             }
         } else if (sample.equals("MNM")) {
             System.out.println("You have selected " + Item.MNM.getName());
             if (total >= Item.MNM.getPrice()) {
                 total = total - Item.MNM.getPrice();
                 System.out.println("Thank you for your purchase!! ");
                 System.out.println("Your balance is " + total+ " CENTS");
             } else {
                 System.out.println("Insert more coins ");
                 return 2;
             }
         } else if (sample.equals("SNYDERS")) {
            System.out.println("You have selected " + Item.SNYDERS.getName());
            if (total >= Item.SNYDERS.getPrice()) {
                total = total - Item.SNYDERS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("SNICKERS")) {
            System.out.println("You have selected " + Item.SNICKERS.getName());
            if (total >= Item.SNICKERS.getPrice()) {
                total = total - Item.SNICKERS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("SKITTLES")) {
            System.out.println("You have selected " + Item.SKITTLES.getName());
            if (total >= Item.SKITTLES.getPrice()) {
                total = total - Item.SKITTLES.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("LIFESAVERS")) {
            System.out.println("You have selected " + Item.LIFESAVERS.getName());
            if (total >= Item.LIFESAVERS.getPrice()) {
                total = total - Item.LIFESAVERS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("FRITOS")) {
            System.out.println("You have selected " + Item.FRITOS.getName());
            if (total >= Item.FRITOS.getPrice()) {
                total = total - Item.FRITOS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("DORITOS")) {
            System.out.println("You have selected " + Item.DORITOS.getName());
            if (total >= Item.DORITOS.getPrice()) {
                total = total - Item.DORITOS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("SUNCHIPS")) {
            System.out.println("You have selected " + Item.SUNCHIPS.getName());
            if (total >= Item.SUNCHIPS.getPrice()) {
                total = total - Item.SUNCHIPS.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("RICEKRISPIES")) {
            System.out.println("You have selected " + Item.RICEKRISPIES.getName());
            if (total >= Item.RICEKRISPIES.getPrice()) {
                total = total - Item.RICEKRISPIES.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
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