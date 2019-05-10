//author Massimo Boffa and Nigel Maloney
package finalproject;

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
            	System.out.println("There were " + cokeAmount + " of Cokes before your purchases");
                total = total - Item.COKE.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                cokeAmount-=1;
                System.out.println("There are " + cokeAmount + " of Cokes in the machine.");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
            
        } else if (sample.equals("SPRITE")) {
            System.out.println("You have selected " + Item.SPRITE.getName());
            if (total >= Item.SPRITE.getPrice()) {
            	System.out.println("There were " + spriteAmount + " of Cokes before your purchases");
                total = total - Item.SPRITE.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                spriteAmount-=1;
                System.out.println("There are " + spriteAmount + " of Sprites in the machine.");
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
                DrPepperAmount-=1;
                System.out.println("There are " + DrPepperAmount + " of Dr Peppers in the machine.");
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
                fantaAmount-=1;
                System.out.println("There are " + fantaAmount + " of Fantas in the machine.");
            } else {
                System.out.println("Insert more coins ");
                return 2;
            }
         } else if (sample.equals("PIBB")) {
            System.out.println("You have selected " + Item.PIBB.getName());
            if (total >= Item.PIBB.getPrice()) {
            	System.out.println("There were " + pibbAmount + " of pibbs before your purchases");
                total = total - Item.PIBB.getPrice();
                System.out.println("Thank you for your purchase!! ");
                System.out.println("Your balance is " + total+ " CENTS");
                pibbAmount-=1;
                System.out.println("There are " + pibbAmount + " of Pibbs in the machine.");
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
                lemonadeAmount-=1;
                System.out.println("There are " + lemonadeAmount + " of lemonades in the machine.");
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
                rootbeerAmount-=1;
                System.out.println("There are " + rootbeerAmount + " of lemonades in the machine.");
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
                crushAmount-=1;
                System.out.println("There are " + crushAmount + " of crushes in the machine.");
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
                laysAmount-=1;
                System.out.println("There are " + laysAmount + " of lays in the machine.");
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
                triscuitAmount-=1;
                System.out.println("There are " + triscuitAmount + " of triscuits in the machine.");
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
                 cheetosAmount-=1;
                 System.out.println("There are " + cheetosAmount + " of cheetos in the machine.");
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
                 cheezitAmount-=1;
                 System.out.println("There are " + cheezitAmount + " of Cheez its in the machine.");
             } else {
                 System.out.println("Insert more coins ");
                 return 2;
             }
         } else if (sample.equals("MNM")) {
             System.out.println("You have selected " + Item.MNM.getName());
             if (total >= Item.MNM.getPrice()) {
            	 System.out.println("There were " + mnmAmount + " of M & M before your purchases");
                 total = total - Item.MNM.getPrice();
                 System.out.println("Thank you for your purchase!! ");
                 System.out.println("Your balance is " + total+ " CENTS");
                 mnmAmount-=1;
                 System.out.println("There are " + mnmAmount + " of M & Ms in the machine.");
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
                snyderAmount-=1;
                System.out.println("There are " + snyderAmount + " of Snyders in the machine.");
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
                snickerAmount-=1;
                System.out.println("There are " + snickerAmount + " of Snickers in the machine.");
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
                skittlesAmount-=1;
                System.out.println("There are " + skittlesAmount + " of Skittles in the machine.");
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
                lifesaversAmount-=1;
                System.out.println("There are " + lifesaversAmount + " of Lifesavers in the machine.");
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
                fritosAmount-=1;
                System.out.println("There are " + fritosAmount + " of Skittles in the machine.");
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
                doritosAmount-=1;
                System.out.println("There are " + doritosAmount + " of doritos in the machine.");
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
                sunchipsAmount-=1;
                System.out.println("There are " + sunchipsAmount + " of sunchips in the machine.");
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
                ricekrispiesAmount-=1;
                System.out.println("There are " + ricekrispiesAmount + " of ricekrispies in the machine.");
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
