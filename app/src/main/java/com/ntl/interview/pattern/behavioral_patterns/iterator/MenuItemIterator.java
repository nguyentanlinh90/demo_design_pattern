package com.ntl.interview.pattern.behavioral_patterns.iterator;

public class MenuItemIterator implements ItemIterator<Item>{


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Item next() {
        return null;
    }
}
