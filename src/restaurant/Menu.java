package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Menu {
    //Class Variable
    private ArrayList<MenuItems> menuItems = new ArrayList<>();
    private Date lastUpdated;
    //Constructors
    public Menu() {
        this.lastUpdated = new Date();
    }

    //Methods
    //Getters and Setters


    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //Method to Add Item
    public void addMenuItem(MenuItems item) {
        for(MenuItems menuItems : this.menuItems) {
            if(item.equals(menuItems)) {
                System.out.println("Warning: This item already exists!");
                return;
            }
        }
        this.menuItems.add(item);
        //update the date
        this.lastUpdated = new Date();

    }

    //Method to Remove Item
    public void removeMenuItem(MenuItems item) {
        this.menuItems.remove(item);
        //update the date
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        //for menuItem in listOfMenuItem
        for(MenuItems item : this.menuItems) {
            // menuItem.prinOutMenuItems();
            returnString += item.toString() + "\n\n";
        }
        return returnString;
    }
}
