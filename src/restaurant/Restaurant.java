package restaurant;

import java.util.Collections;

public class Restaurant {
    public static void main(String[] args) {
        MenuItems item1 = new MenuItems("KASPI Salad", "Kale and Spinach", 8.2, "Salads", true);
        MenuItems item2 = new MenuItems("KASPI Salad", "Kale and Spinach", 8.2, "Salads", true);
        MenuItems item3 = new MenuItems("Cake", "Chocolate Cake", 5.2, "Dessert", false);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);
      //  myMenu.removeMenuItem(item2);
//        System.out.println(myMenu.toString());
        System.out.println(myMenu.toString());

        //System.out.println(item1.equals(item3));


    }
}
