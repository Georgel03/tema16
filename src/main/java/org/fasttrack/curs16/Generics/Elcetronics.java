package org.fasttrack.curs16.Generics;

public class Elcetronics implements ShopItem{

    private String name;

    private int price;

    private Category category;

    public Elcetronics(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public int price() {
        return 0;
    }

    @Override
    public Category category() {
        return null;
    }
}
