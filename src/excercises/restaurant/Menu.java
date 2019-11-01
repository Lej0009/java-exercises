package excercises.restaurant;

import java.util.Calendar;

public class Menu {
    private static boolean new = false;
    private static Calendar updated;

    public void Menu(Calendar updated, boolean new) {
        this.new = new;
        this.updated = Calendar.getInstance();
    }

    public boolean isNew() {
        return new;
    }

    public Calendar getUpdated() {
        return updated;
    }

    public static void main(String[] args) {
        Menu menu = new Menu;
    }
}
