package com.github.lwhite1.tablesaw.filter;

import com.github.lwhite1.tablesaw.api.Table;
import com.github.lwhite1.tablesaw.columns.Column;
import com.github.lwhite1.tablesaw.columns.ColumnReference;
import org.roaringbitmap.RoaringBitmap;

/**
 * A filter that matches all non-missing values in a column
 */
public class IsNotMissing extends ColumnFilter {

  public IsNotMissing(ColumnReference reference) {
    super(reference);
  }

  public RoaringBitmap apply(Table relation) {
    Column column = relation.column(columnReference.getColumnName());
    return column.isNotMissing();
  }
}
