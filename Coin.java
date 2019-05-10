/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

//Coin
public enum Coin { 
	NICKEL("NICKEL",5), DIME("DIME",10), QUARTER("QUARTER",25), DOLLAR("DOLLAR",100); 
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