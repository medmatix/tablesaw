package com.github.lwhite1.tablesaw.filter;

import com.github.lwhite1.tablesaw.api.Table;
import com.github.lwhite1.tablesaw.columns.ColumnReference;
import com.github.lwhite1.tablesaw.columns.FloatColumn;
import org.roaringbitmap.RoaringBitmap;

/**
 */
public class FloatGreaterThanOrEqualTo extends ColumnFilter {

  private float value;

  public FloatGreaterThanOrEqualTo(ColumnReference reference, float value) {
    super(reference);
    this.value = value;
  }

  public RoaringBitmap apply(Table relation) {
    FloatColumn floatColumn = (FloatColumn) relation.column(columnReference.getColumnName());
    return floatColumn.isGreaterThanOrEqualTo(value);
  }
}
