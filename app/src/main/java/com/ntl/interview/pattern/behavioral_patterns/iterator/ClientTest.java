package com.ntl.interview.pattern.behavioral_patterns.iterator;

public class ClientTest {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.add(new Item("menu 1", "/menu1"));
        menu.add(new Item("menu 2", "/menu2"));
        menu.add(new Item("menu 3", "/menu3"));
        menu.add(new Item("menu 4", "/menu4"));

        ItemIterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getTitle());
        }

    }
}
