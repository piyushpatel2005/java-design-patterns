package com.github.piyushpatel2005.abstractfactory.furniture;

import com.github.piyushpatel2005.abstractfactory.furniture.factory.FoldableFurnitureFactory;
import com.github.piyushpatel2005.abstractfactory.furniture.factory.FurnitureFactory;
import com.github.piyushpatel2005.abstractfactory.furniture.model.bed.Bed;
import com.github.piyushpatel2005.abstractfactory.furniture.model.chair.Chair;
import com.github.piyushpatel2005.abstractfactory.furniture.model.table.Table;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new FoldableFurnitureFactory();
        Chair chair = furnitureFactory.createChair();
        Table table = furnitureFactory.createTable();
        Bed bed = furnitureFactory.createBed();
        System.out.println(chair.getClass().getName());
        System.out.println(table.getClass().getName());
        System.out.println(bed.getClass().getName());

        System.out.println("====================================");

        furnitureFactory = FurnitureFactory.getFactory("NonFoldable");
        chair = furnitureFactory.createChair();
        table = furnitureFactory.createTable();
        bed = furnitureFactory.createBed();
        System.out.println(chair.getClass().getName());
        System.out.println(table.getClass().getName());
        System.out.println(bed.getClass().getName());

    }
}
