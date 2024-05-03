package com.github.piyushpatel2005.iterator.rental;

import com.github.piyushpatel2005.iterator.rental.model.DVD;

import java.util.List;

public interface DvdStore {
    void add(DVD dvd);
    void remove(DVD dvd);
    void addAll(List<DVD> dvds);
    DvdIterator getIterator();
}
