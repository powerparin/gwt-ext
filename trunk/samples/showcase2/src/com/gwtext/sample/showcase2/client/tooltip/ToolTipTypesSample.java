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
 
package com.gwtext.sample.showcase2.client.tooltip;

import com.gwtext.client.widgets.Panel;
import com.gwtext.client.widgets.ToolTip;
import com.gwtext.client.widgets.layout.HorizontalLayout;
import com.gwtext.sample.showcase2.client.ShowcasePanel;

public class ToolTipTypesSample extends ShowcasePanel {

    public String getSourceUrl() {
        return "source/tooltip/TooltipTypesSample.java.html";
    }

    public Panel getViewPanel() {
        if (panel == null) {
            panel = new Panel();

            String bodyStyle = "text-align:center;padding:5px 0;" +
                    "border:1px dotted #99bbe8;background:#dfe8f6;" +
                    "color:#15428b;cursor:default;margin:10px;" +
                    "font:bold 11px tahoma,arial,sans-serif;";

            Panel panel1 = new Panel();
            panel1.setBorder(false);
            panel1.setWidth(100);
            panel1.setBodyStyle(bodyStyle);
            panel1.setHtml("Basic Tooltip");

            ToolTip tip1 = new ToolTip();
            tip1.setHtml("A very simple tooltip");
            tip1.applyTo(panel1);

            Panel panel2 = new Panel();
            panel2.setBodyStyle(bodyStyle);
            panel2.setBorder(false);
            panel2.setWidth(100);
            panel2.setHtml("AutoHide Disabled");

            ToolTip tip2 = new ToolTip();
            tip2.setTitle("My Tip Title");
            tip2.setHtml("Click the X to close me");
            tip2.setClosable(true);
            tip2.setAutoHide(false);
            tip2.applyTo(panel2);
            tip2.setDraggable(true);

            Panel panel3 = new Panel();
            panel3.setBodyStyle(bodyStyle);
            panel3.setBorder(false);
            panel3.setWidth(100);
            panel3.setHtml("Ajax Tooltip");

            ToolTip tip3 = new ToolTip();
            tip3.setAutoLoad("data/ajax-tip.html");
            tip3.setWidth(200);
            tip3.setDismissDelay(15000);
            tip3.applyTo(panel3);

            Panel panel4 = new Panel();
            panel4.setBodyStyle(bodyStyle);
            panel4.setBorder(false);
            panel4.setWidth(100);
            panel4.setHtml("Mouse Track");

            ToolTip tip4 = new ToolTip();
            tip4.setTitle("Mouse Track");
            tip4.setHtml("This tip will follow the mouse while it is over the element");
            tip4.setDismissDelay(15000);
            tip4.setWidth(200);            
            tip4.setTrackMouse(true);
            tip4.applyTo(panel4);

            Panel horizontalPanel = new Panel();
            //layout buttons horizontally with 10 pixels between them
            horizontalPanel.setLayout(new HorizontalLayout(20));

            horizontalPanel.add(panel1);
            horizontalPanel.add(panel2);
            horizontalPanel.add(panel3);
            horizontalPanel.add(panel4);

            panel.add(horizontalPanel);
        }
        return panel;
    }

    protected boolean showEvents() {
        return true;
    }

    public String getIntro() {
         return "<p>This Tooltip sample demonstrates:</p>" +
                "    <p>" +
                "        - Simple static tooltips<br>" +
                "        - Tooltips with titles<br>" +
                "        - Closable Tooltips<br>" +
                "        - Tooltips with Ajax content<br>" +
                "        - Other config options like autoHide and trackMouse<br>" +
                "    </p><p>It is important to note that tooltips can be applied to any element such as Form fields, Images and Buttons.</p>";
    }
}