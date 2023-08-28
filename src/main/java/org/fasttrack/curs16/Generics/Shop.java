package org.fasttrack.curs16.Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop<T extends ShopItem>{

    private List<T> list = new ArrayList<>();

    public void addItem(T item) {

        list.add(item);
        System.out.println(item.name() + " added successfully!");

    }
    public List<T> findByCategory(Category cat) {

        List<T> myList = new ArrayList<>();

        for (T item : list) {

            if (item.category() == cat) {

                myList.add(item);
            }
        }

        return myList;
    }

    public List<T> findWithLowerPrice(int maxPrice) {

        List<T> myList = new ArrayList<>();

        for (T item : list) {
            if (item.price() < maxPrice) {
                myList.add(item);
            }
        }

        return myList;
    }

    public Optional<T> findByName(String name){

        return list.stream().filter(item -> item.name().equals(name)).findFirst();
    }

    public Optional<T> removeItem(String name) {

        Optional<T> itemToRemove = findByName(name);
        itemToRemove.ifPresent(list::remove);
        return itemToRemove;
    }
}
