/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

public enum Item {

    COKE("COKE", 100), 
    SPRITE("SPRITE", 100), 
    DR_PEPPER("DR.PEPPER", 100), 
    FANTA("FANTA", 100), 
    PIBB("PIBB", 100), 
    LEMONADE("LEMONADE", 100),
    ROOTBEER("ROOTBEER", 100),
    CRUSH("CRUSH", 100),
    LAYS("LAYS", 50),
    TRISCUIT("TRISCUIT", 50),
    SNYDERS("SNYDERS", 50),
    SNICKERS("SNICKERS", 65),
    SKITTLES("SKITTLES", 65),
    LIFESAVERS("LIFESAVERS", 50),
    FRITOS("FRITOS", 50),
    DORITOS("DORITOS", 50),
    SUNCHIPS("SUNCHIPS", 50),
    RICEKRISPIES("RICEKRISPIES", 50),
    //CANDY("CANDY", 65), 
    //CHIPS("CHIPS", 50),
    ;
    
    private String name;
    private int price;

    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
