package restaurant;

import java.util.ArrayList;

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
}
