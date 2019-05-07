package finalproject;


class vendingExample
{
	// add coins
	public int drop(String coins, int total)
	{
	
		if(coins.equals("NICKLE")){
			total = total + Coin.NICKLE.getDenom();
		}else if(coins.equals("DIME")){
			total = total + Coin.DIME.getDenom();
		}else if(coins.equals("QUARTER")){
			total = total + Coin.QUARTER.getDenom();
		}else if(coins.equals("DOLLAR")){
			total = total + Coin.DOLLAR.getDenom();
		}else{
			System.out.println("Wrong Input Coin");
		}
	
		return total;
	}

	
	//select items
	public int choose(String sample, int total)
	{
		if(sample.equals("COKE")){
			System.out.println("You have selected "+Item.COKE.getName());
			if(total>=Item.COKE.getPrice()){
				total = total - Item.COKE.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is "+total);
			}else{
				System.out.println("Insert more coins ");
				return 2;
			}
			
		}else if(sample.equals("GUSHERS")){
			System.out.println("You have selected "+Item.GUSHERS.getName());
			if(total>=Item.GUSHERS.getPrice()){
				total = total - Item.GUSHERS.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is "+total);
			}else{
				System.out.println("Insert more coins ");
				return 2;
			}
		}else if(sample.equals("DORITOS")){
			System.out.println("You have selected "+Item.DORITOS.getName());
			if(total>=Item.DORITOS.getPrice()){
				total = total - Item.DORITOS.getPrice();
				System.out.println("Thank you for your purchase!! ");
				System.out.println("Your balance is "+total);
			}else{
				System.out.println("Insert more coins ");
				return 2;
			}
		}else if(sample.equals("RETURN")){
			System.out.println("Your balance is "+total+" and is returned.");
			return 1;
		}else if(sample.equals("CANCEL")){
			return -1;
		}else{
			System.out.println("Wrong choice: Your balance is "+total);
			return 1;
		}
	
		return total;
	}
}