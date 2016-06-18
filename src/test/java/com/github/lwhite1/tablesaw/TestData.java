package com.github.lwhite1.tablesaw;

import com.github.lwhite1.tablesaw.api.ColumnType;
import com.github.lwhite1.tablesaw.api.Table;

import static com.github.lwhite1.tablesaw.api.ColumnType.CATEGORY;
import static com.github.lwhite1.tablesaw.api.ColumnType.FLOAT;
import static com.github.lwhite1.tablesaw.api.ColumnType.INTEGER;
import static com.github.lwhite1.tablesaw.api.ColumnType.LOCAL_DATE;
import static com.github.lwhite1.tablesaw.api.ColumnType.LOCAL_TIME;

/**
 * This class setup tablesaw Table from test data sources.
 * It purpose is to make easy for tests or example code get data to work with.
 */
public enum TestData {

    SIMPLE_UNSORTED_DATA(new ColumnType[]{CATEGORY, INTEGER, CATEGORY, LOCAL_DATE},"data/unsorted-simple-data.csv"),

    SIMPLE_SORTED_DATA_BY_INTEGER_ASCENDING(new ColumnType[]{CATEGORY, INTEGER, CATEGORY, LOCAL_DATE},"data/simple-data-sort_by_int_ascending.csv"),
    SIMPLE_SORTED_DATA_BY_INTEGER_DESCENDING(new ColumnType[]{CATEGORY, INTEGER, CATEGORY, LOCAL_DATE},"data/simple-data-sort_by_int_descending.csv"),

    SIMPLE_SORTED_DATA_BY_INTEGER_AND_DATE_ASCENDING(new ColumnType[]{CATEGORY, INTEGER, CATEGORY, LOCAL_DATE},"data/simple-data-sort_by_int_and_date_ascending.csv"),
    SIMPLE_SORTED_DATA_BY_INTEGER_AND_DATE_DESCENDING(new ColumnType[]{CATEGORY, INTEGER, CATEGORY, LOCAL_DATE},"data/simple-data-sort_by_int_and_date_descending.csv"),

    BUSH_APPROVAL(new ColumnType[]{LOCAL_DATE, INTEGER, CATEGORY}, "data/BushApproval.csv"),

    TORNADOES(new ColumnType[]{INTEGER, INTEGER, INTEGER, INTEGER, LOCAL_DATE, LOCAL_TIME, CATEGORY, CATEGORY, CATEGORY,
            INTEGER, INTEGER, INTEGER, INTEGER, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT, FLOAT,
            FLOAT, CATEGORY, CATEGORY, CATEGORY, CATEGORY}, "data/1950-2014_torn.csv");

    private Table table;
    private ColumnType[] columnTypes;

    /**
     * Creates a Table from the specified daa.
     *
     * @param columnTypes the data in each column of the specified CSV
     * @param csvSource   the CSV data
     */
    TestData(ColumnType[] columnTypes, String csvSource) {
        this.table = Table.fromCSV(columnTypes, csvSource);
        this.columnTypes = columnTypes;
    }

    /**
     * @return The TableSaw instance for a specific data set
     */
    public Table getTable() {
        return table;
    }

    /**
     * @return the column types for the data set.
     */
    public ColumnType[] getColumnTypes() {
        return columnTypes;
    }

}
