package com.github.lwhite1.tablesaw.filter.dates;

import com.github.lwhite1.tablesaw.api.Table;
import com.github.lwhite1.tablesaw.filter.ColumnFilter;
import com.github.lwhite1.tablesaw.columns.ColumnReference;
import com.github.lwhite1.tablesaw.columns.DateColumn;
import org.roaringbitmap.RoaringBitmap;

/**
 *
 */
public class LocalDateIsInMay extends ColumnFilter {

  public LocalDateIsInMay(ColumnReference reference) {
    super(reference);
  }

  @Override
  public RoaringBitmap apply(Table relation) {
    DateColumn dateColumn = (DateColumn) relation.column(columnReference().getColumnName());
    return dateColumn.isInMay();
  }
}
