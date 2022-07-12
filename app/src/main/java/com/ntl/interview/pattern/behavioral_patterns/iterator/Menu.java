package com.ntl.interview.pattern.behavioral_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> menus = new ArrayList<>();

    public void add(Item item) {
        menus.add(item);
    }

    public MenuIterator iterator() {
        return new MenuIterator();
    }

    public class MenuIterator implements ItemIterator<Item> {

        private Integer currPosition = 0;

        @Override
        public boolean hasNext() {
            return currPosition < menus.size();
        }

        @Override
        public Item next() {
            return menus.get(currPosition++);
        }
    }
}
