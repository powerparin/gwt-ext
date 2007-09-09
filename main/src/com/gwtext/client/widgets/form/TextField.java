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
import com.gwtext.client.widgets.form.event.TextFieldListener;

public class TextField extends Field {

    public TextField() {
        setJsObj(create(null));
    }

    public TextField(TextFieldConfig config) {
        super(config);
        if (config.getTextFieldListener() != null) {
            addTextFieldListener(config.getTextFieldListener());
        }
    }

    protected native JavaScriptObject create(JavaScriptObject jsObj) /*-{
        return new $wnd.Ext.form.TextField(jsObj);
    }-*/;

    public native void addTextFieldListener(TextFieldListener listener) /*-{
        var fieldJ = this;
        var field = this.@com.gwtext.client.widgets.BaseExtWidget::jsObj;

        field.addListener('autosize',
                function(fld, width) {
                    listener.@com.gwtext.client.widgets.form.event.TextFieldListener::onAutoSize(Lcom/gwtext/client/widgets/form/Field;I)(fieldJ, width);
                }
        );
    }-*/;

    public native void autoSize() /*-{
        var field = this.@com.gwtext.client.widgets.BaseExtWidget::jsObj;
        field.autoSize();
    }-*/;
    
    public native void selectText() /*-{
        var field = this.@com.gwtext.client.widgets.BaseExtWidget::jsObj;
        field.selectText();
    }-*/;

    public native void selectText(int start, int end) /*-{
        var field = this.@com.gwtext.client.widgets.BaseExtWidget::jsObj;
        field.selectText(start, end);
    }-*/;

    public native boolean validateValue(String value) /*-{
        var field = this.@com.gwtext.client.widgets.BaseExtWidget::jsObj;
        return field.validateValue(value);
    }-*/;     
}
