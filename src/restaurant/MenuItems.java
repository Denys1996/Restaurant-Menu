package restaurant;

import java.awt.*;

public class MenuItems {
    //Class Variable
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //Constructors
    public MenuItems(String name, String description, Double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = category;
        this.isNew = false;
    }

    public MenuItems(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //Methods
    //Getter & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //2. A way to tell if a menu item is new.
    public Boolean isNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    //4. A way to print out both a single menu item as well as the entire menu.
    @Override
    public String toString() {
        String name = "Name: " + this.name;
        String description = "Description: " + this.description;
        String price = "Price: " + this.price;
        String category = "Category: " + this.category;
        String isNew = "New? " + this.isNew;
        return name + "\n" + description + "\n" + price + "\n" + category + "\n" + isNew;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return false;
        }
        if (!(obj instanceof MenuItems)) {
            return false;
        }
        MenuItems menuItem = (MenuItems) obj;
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category)) {
            return true;
        } else {
            return false;
        }
    }
}