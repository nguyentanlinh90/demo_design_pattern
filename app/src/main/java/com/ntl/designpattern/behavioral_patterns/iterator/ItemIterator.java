package com.ntl.designpattern.behavioral_patterns.iterator;

public interface ItemIterator<T> {
    boolean hasNext();
    T next();
}
