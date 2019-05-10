//author Massimo Boffa and Nigel Maloney
package finalproject;

//Coin
public enum Coin { 
	NICKLE("NICKLE",5), DIME("DIME",10), QUARTER("QUARTER",25), DOLLAR("DOLLAR",100); 
	private int denom; 
	private String name;
	private Coin(String name, int denom){ 
		this.name = name; this.denom = denom; 
	} 
	public int getDenom(){ 
		return denom; 
		} 
	public String getName(){ 
		return name; 
	} 
}
