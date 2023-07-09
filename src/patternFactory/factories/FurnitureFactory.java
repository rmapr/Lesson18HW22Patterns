package patternFactory.factories;

import patternFactory.chairs.Chair;
import patternFactory.tables.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
