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

package com.gwtext.client.widgets.form;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Creates a fieldset container for layout and rendering of fields in a {@link Form}.
 *
 * @see com.gwtext.client.widgets.form.Form#fieldset(FieldSetConfig)
 */
public class FieldSet extends Layout {

    /**
     * Creates a new FieldSet.
     */
    public FieldSet() {
        this(new FieldSetConfig());
    }

    /**
     * Creates a new FieldSet using the specified configuration.
     *
     * @param config fieldset configuration
     */
    public FieldSet(FieldSetConfig config) {
        super(config);
    }

    protected native JavaScriptObject create(JavaScriptObject jsObj) /*-{
        return new $wnd.Ext.form.FieldSet(jsObj);
    }-*/;
}
