/*
 * GwtExt - Gwt Ext Integration library.
 *
 * Copyright (c) 2007, Sanjiv Jivan
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package com.gwtext.client.widgets.grid.event;

import com.gwtext.client.widgets.grid.ColumnModel;

public interface ColumnModelListener {

    /**
     * Fires when a column's locked state is changed.
     *
     * @param cm this
     * @param colIndex the column index
     * @param locked true if locked
     */
    void onColumnLockChange(ColumnModel cm, int colIndex, boolean locked);

    /**
     * Fires when a column is moved.
     *
     * @param cm this
     * @param oldIndex the old column index
     * @param newIndex the new column index
     */
    void onColumnMoved(ColumnModel cm, int oldIndex, int newIndex);

    /**
     * Fires when the text of a header changes.
     *
     * @param cm this
     * @param columnIndex the column index
     * @param newText the new header text
     */
    void onHeaderChange(ColumnModel cm, int columnIndex, String newText);

    /**
     * Fires when a column is hidden or "unhidden".
     * 
     * @param cm this
     * @param colIndex the column index
     * @param hidden true if hidden, false otherwise
     */
    void onHiddenChange(ColumnModel cm, int colIndex, boolean hidden);

    /**
     * Fires when the width of a column changes.
     *
     * @param cm this
     * @param colIndex the column index
     * @param newWidth the new width
     */
    void onWidthChange(ColumnModel cm, int colIndex, int newWidth);
}