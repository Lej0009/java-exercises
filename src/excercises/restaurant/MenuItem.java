package excercises.restaurant;

import java.security.IdentityScope;
import java.util.Date;

public class MenuItem {

    private static final int NEW_ITEM_DURATION_IN_DAYS = 7;
    private String name;
    private String description;
    private double price;
    private String category;
    private final Date added;

    public void MenuItem(String name, String description, double price, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.added = new Date();
    }

    public MenuItem(String name, double price, String category) {
        this(name, "", price, category);
    }

    public MenuItem(String name, double price, String category) {
        this(name, "", price, "entree");
    }

    public boolean isNew() {
        long nowInMs = new Date().getTime();
        long newItemDurationInMs = NEW_ITEM_DURATION_IN_DAYS *24*60*1000;
        return nowInMs - added.getTime() < newItemDurationInMs;
    }

    public String toString() {
        String itemStr = name + " - $" + String.format("%1$,.2f", price) + " (" + category + ")";
            if (isNew()) {
                itemStr += " (NEW)";
            }
            return itemStr;
    }
//    public double getPrice() {
//        return price;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public static void main(String[] args) {
//        MenuItem hamburger = new MenuItem;
//    }

}
