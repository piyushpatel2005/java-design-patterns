package com.github.piyushpatel2005.iterator.rental;

import com.github.piyushpatel2005.iterator.rental.model.DVD;

import java.util.ArrayList;
import java.util.List;

public class DvdStoreImpl implements DvdStore {
    private List<DVD> movies;

    public DvdStoreImpl() {
        this.movies = new ArrayList<>();
    }

    public void add(DVD dvd) {
        movies.add(dvd);
    }

    public void remove(DVD dvd) {
        movies.remove(dvd);
    }

    public void addAll(List<DVD> dvds) {
        movies.addAll(dvds);
    }

    public DvdIterator getIterator() {
        return new SimpleDvdIterator(movies);
    }
}
