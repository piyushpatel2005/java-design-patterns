package com.github.piyushpatel2005.abstractfactory.furniture.factory;

import com.github.piyushpatel2005.abstractfactory.furniture.model.bed.*;
import com.github.piyushpatel2005.abstractfactory.furniture.model.chair.*;
import com.github.piyushpatel2005.abstractfactory.furniture.model.table.*;

public class FoldableFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new FoldableChair();
    }

    @Override
    public Table createTable() {
        return new FoldableTable();
    }

    @Override
    public Bed createBed() {
        return new FoldableBed();
    }
}
