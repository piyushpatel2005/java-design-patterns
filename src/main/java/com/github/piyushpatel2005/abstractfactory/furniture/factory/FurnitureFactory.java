package com.github.piyushpatel2005.abstractfactory.furniture.factory;

import com.github.piyushpatel2005.abstractfactory.furniture.model.Furniture;
import com.github.piyushpatel2005.abstractfactory.furniture.model.bed.Bed;
import com.github.piyushpatel2005.abstractfactory.furniture.model.chair.Chair;
import com.github.piyushpatel2005.abstractfactory.furniture.model.table.Table;

public abstract class FurnitureFactory {

    public static FurnitureFactory getFactory(String userPreference) {
        if (userPreference.equals("Foldable")) {
            return new FoldableFurnitureFactory();
        } else if (userPreference.equals("NonFoldable")) {
            return new NonFoldableFurnitureFactory();
        }
        return null;
    }

    public abstract Chair createChair();
    public abstract Table createTable();
    public abstract Bed createBed();
}
