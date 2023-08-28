package org.fasttrack;

import org.fasttrack.curs16.Generics.Category;
import org.fasttrack.curs16.Generics.Clothes;
import org.fasttrack.curs16.Generics.Shop;
import org.fasttrack.curs16.Recursivitate.RecursiveObjects;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        //EX-1

        RecursiveObjects obj = new RecursiveObjects();
        System.out.println(obj.sumOfFirstNEvenInt(10));
        System.out.println(obj.sumOfDigits(1111111111));
        System.out.println(obj.FibbArray(7));

        System.out.println("-----------------------------");

        //EX-2
        Shop<Clothes> clothesShop = new Shop<>();
        clothesShop.addItem(new Clothes("Shirt", 25, Category.ON_SALE));
        clothesShop.addItem(new Clothes("Pants", 40, Category.NEW));

        List<Clothes> onSaleClothes = clothesShop.findByCategory(Category.ON_SALE);
        for (Clothes item : onSaleClothes) {
            System.out.println("Name: " + item.name() + ", Price: " + item.price());
        }

        Optional<Clothes> foundItem = clothesShop.findByName("Pants");
        foundItem.ifPresent(item -> System.out.println("Found: " + item.name()));

        Optional<Clothes> removedItem = clothesShop.removeItem("Shirt");
        removedItem.ifPresent(item -> System.out.println("Removed: " + item.name()));


    }
}