package com.github.piyushpatel2005.iterator.rental;

import com.github.piyushpatel2005.iterator.rental.model.DVD;

import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        DVD dvd1 = new DVD("Titanic", "Romance");
        DVD dvd2 = new DVD("Avatar", "Fantasy");
        DVD dvd3 = new DVD("True Lies", "Action");

        List<DVD> dvds = List.of(dvd1, dvd2, dvd3);
        DvdStoreImpl dvdStore = new DvdStoreImpl();
        dvdStore.addAll(dvds);
        DvdIterator dvdIterator = dvdStore.getIterator();

        while (dvdIterator.hasNext()) {
            System.out.println(dvdIterator.next().getTitle());
        }
    }
}
