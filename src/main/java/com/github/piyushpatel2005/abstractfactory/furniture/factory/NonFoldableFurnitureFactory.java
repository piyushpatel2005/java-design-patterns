package com.github.piyushpatel2005.abstractfactory.furniture.factory;

import com.github.piyushpatel2005.abstractfactory.furniture.model.bed.Bed;
import com.github.piyushpatel2005.abstractfactory.furniture.model.bed.NonFoldableBed;
import com.github.piyushpatel2005.abstractfactory.furniture.model.chair.Chair;
import com.github.piyushpatel2005.abstractfactory.furniture.model.chair.NonFoldableChair;
import com.github.piyushpatel2005.abstractfactory.furniture.model.table.NonFoldableTable;
import com.github.piyushpatel2005.abstractfactory.furniture.model.table.Table;

public class NonFoldableFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new NonFoldableChair();
    }

    @Override
    public Table createTable() {
        return new NonFoldableTable();
    }

    @Override
    public Bed createBed() {
        return new NonFoldableBed();
    }
}
