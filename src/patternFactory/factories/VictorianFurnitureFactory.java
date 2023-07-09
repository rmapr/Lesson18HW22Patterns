package patternFactory.factories;

import patternFactory.chairs.Chair;
import patternFactory.chairs.VictorianChair;
import patternFactory.tables.VictorianTable;
import patternFactory.tables.Table;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
