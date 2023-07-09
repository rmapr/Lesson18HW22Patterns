package patternFactory.factories;

import patternFactory.chairs.Chair;
import patternFactory.chairs.ModernChair;
import patternFactory.tables.ModernTable;
import patternFactory.tables.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

}
