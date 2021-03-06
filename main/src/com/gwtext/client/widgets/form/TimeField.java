/*
 * GWT-Ext Widget Library
 * Copyright 2007 - 2008, GWT-Ext LLC., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
 

package com.gwtext.client.widgets.form;

import com.google.gwt.core.client.JavaScriptObject;

import java.util.Date;

/**
 * Basic text field.
 *
 * @author Sanjiv Jivan
 */
public class TimeField extends ComboBox {

    private static JavaScriptObject configPrototype;

    static {
        init();
    }

    private static native void init()/*-{
		var c = new $wnd.Ext.form.TimeField();
		@com.gwtext.client.widgets.form.TimeField::configPrototype = c.initialConfig;
	}-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return "timefield";
    }

    public TimeField() {
    }

	public TimeField(String fieldLabel) {
		super(fieldLabel);
	}

	public TimeField(String fieldLabel, String name) {
		super(fieldLabel, name);
	}

	public TimeField(String fieldLabel, String name, int width) {
		super(fieldLabel, name, width);
	}

	public TimeField(JavaScriptObject jsObj) {
        super(jsObj);
    }


    protected native JavaScriptObject create(JavaScriptObject jsObj) /*-{
        return new $wnd.Ext.form.TimeField(jsObj);
    }-*/;

    //--- config properties ---

	/**
	 * Multiple date formats separated by "|" to try when parsing a user input value and it doesn't match the defined format (defaults to 'm/d/Y|m-d-y|m-d-Y|m/d|m-d|d').
     *
	 * @param altFormats the alt formats
	 * @throws IllegalStateException this property cannot be changed after the Component has been rendered
	 */
	public void setAltFormats(String altFormats) throws IllegalStateException {
        setAttribute("altFormats", altFormats, true);
    }

    /**
     * The default date format string which can be overriden for localization support. The format must be valid according to Date.parseDate (defaults to 'm/d/y').
     *
     * @param format the date format string
     * @throws IllegalStateException this property cannot be changed after the Component has been rendered
     */
    public void setFormat(String format) throws IllegalStateException {
        setAttribute("format", format, true);
    }

	/**
     * The number of minutes between each time value in the list (defaults to 15).
     *  
	 * @param increment the number of minutes between each time value in the list (defaults to 15).
     * @throws IllegalStateException this property cannot be changed after the Component has been rendered
	 */
	public void setIncrement(int increment) throws IllegalStateException {
        setAttribute("increment", increment, false);
    }

    /**
	 * The error text to display when the time in the field is invalid (defaults to '{value} is not a valid time - it must be in the format {format}').
     *
     * @param invalidtext the error text to display when the time in the field is invalid
	 */
	public void setInvalidText(String invalidtext) {
        setAttribute("invalidText", invalidtext, true, true);
    }

    /**
     * The error text to display when the time is after maxValue (defaults to 'The time in this field must be equal to or before {0}').
     *
     * @param maxText The error text to display when the time is after maxValue
     */
    public void setMaxText(String maxText)  {
        setAttribute("maxText", maxText, true, true);
    }

    /**
     * The maximum allowed time.
     *
     * @param maxValue the max value
     * @throws IllegalStateException this property cannot be changed after the Component has been rendered
     */
    public void setMaxValue(Date maxValue) throws IllegalStateException {
        setAttribute("maxValue", maxValue, true);
    }

    /**
     * The maximum allowed time in valid date format.
     * @param maxValue The maximum allowed time.
     *
     * @throws IllegalStateException this property cannot be changed after the Component has been rendered
     */
    public void setMaxValue(String maxValue) throws IllegalStateException {
        setAttribute("maxValue", maxValue, true);
    }

    /**
     * The error text to display when the date in the cell is before minValue (defaults to 'The time in this field must be equal to or after {0}').
     * 
     * @param minText The error text to display when the date in the cell is before minValue
     */
    public void setMinText(String minText) {
        setAttribute("minText", minText, true, true);
    }

    /**
     * The minimum allowed time.
     *
     * @param minValue The minimum allowed time.
     * @throws IllegalStateException this property cannot be changed after the Component has been rendered
     */
    public void setMinValue(Date minValue) throws IllegalStateException {
        setAttribute("minValue", minValue, true);
    }

    /**
     * The minimum allowed time in valid date format.
     *
     * @param minValue The minimum allowed time.
     * @throws IllegalStateException this property cannot be changed after the Component has been rendered
     */
    public void setMinValue(String minValue) throws IllegalStateException {
        setAttribute("minValue", minValue, true);
    }
}