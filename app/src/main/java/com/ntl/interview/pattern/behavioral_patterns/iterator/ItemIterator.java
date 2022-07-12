package com.ntl.interview.pattern.behavioral_patterns.iterator;

public interface ItemIterator<T> {
    boolean hasNext();
    T next();
}
