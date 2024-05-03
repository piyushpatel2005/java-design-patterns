package com.github.piyushpatel2005.iterator.rental;

import com.github.piyushpatel2005.iterator.rental.model.DVD;

import java.util.List;

public class SimpleDvdIterator implements DvdIterator {
    private List<DVD> movies;
    private int currentPosition;

    public SimpleDvdIterator(List<DVD> movies) {
        this.movies = movies;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < movies.size();
    }

    @Override
    public DVD next() {
        if (hasNext()) {
            return movies.get(currentPosition++);
        }
        return null;
    }
}
