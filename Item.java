//author Massimo boffa
package finalproject;

//Item
public enum Item{ 
	COKE("COKE", 100), GUSHERS("GUSHERS", 65), DORITOS("DORITOS", 50), FRITOS("FRITOS", 50), SPRITE("SPRITE", 100), DR_PEPPER("DR_PEPPER", 100), FANTA("FANTA",100), PIBB("PIBB",100), LEMONADE("LEMONADE",100), ROOTBEER("ROOTBEER",100), CRUSH("CRUSH",50), LAYS("LAYS",50), TRISCUIT("TRISCUIT",50), SNICKERS("SNICKERS",65), SKITTLES("SKITTLES",65), LIFESAVERS("LIFESAVERS",65), SUNCHIPS("SUNCHIPS",50), RICEKRISPIES("RICEKRISPIES",50), SNYDERS("SNYDERS",50), CHEETOS("CHEETOS",50), CHEEZ_IT("CHEEZ_IT",50), MNM("MNM",65);
	private String name; 
	private int price; 
	private Item(String name, int price){ 
		this.name = name; this.price = price; 
	} 
	public String getName(){ 
		return name; 
	} 
	public int getPrice(){ 
		return price; 
	} 	
}
