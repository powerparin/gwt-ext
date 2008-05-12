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
 
package com.gwtext.sample.showcase2.client.misc;

import com.google.gwt.user.client.Timer;
import com.gwtext.client.core.EventObject;
import com.gwtext.client.core.Ext;
import com.gwtext.client.core.Function;
import com.gwtext.client.util.Format;
import com.gwtext.client.widgets.*;
import com.gwtext.client.widgets.event.ButtonListenerAdapter;
import com.gwtext.client.widgets.layout.VerticalLayout;
import com.gwtext.sample.showcase2.client.ShowcasePanel;

public class ProgressBarSample extends ShowcasePanel {

    public String getSourceUrl() {
        return "source/misc/ProgressBarSample.java.html";
    }

    public String getCssUrl() {
        return "source/misc/ProgressBarSample.css.html";
    }

    public Panel getViewPanel() {
        if (panel == null) {
            panel = new Panel();
            panel.setLayout(new VerticalLayout(15));

            final ProgressBar pbar1 = new ProgressBar();
            pbar1.setWidth(300);
            pbar1.setText("Ready");

            Panel panel1 = new Panel();
            panel1.setTitle("Basic Progress Bar");
            panel1.setFrame(true);
            panel1.setWidth(400);
            panel1.setHeight(150);
            panel1.setPaddings(20);

            Button button1 = new Button("Start", new ButtonListenerAdapter() {
                public void onClick(final Button button, EventObject e) {
                    button.disable();
                    pbar1.reset();
                    for (int i = 1; i < 12; i++) {
                        final int j = i;
                        Timer timer = new Timer() {
                            public void run() {
                                if (j == 11) {
                                    pbar1.setText("Done.");
                                    button.enable();
                                } else {
                                    pbar1.setText(Format.format("Loading item {0} of 10...", j + ""));
                                    pbar1.setValue(pbar1.getValue() + 0.1f);
                                }
                            }
                        };
                        timer.schedule(i * 1000);
                    }

                }
            });
            panel1.add(new HTMLPanel("A Basic ProgressBar with build-in progress text.", 0, 0, 0, 10));
            panel1.add(pbar1);
            panel1.addButton(button1);
            panel.add(panel1);

            Panel panel2 = new Panel();
            panel2.setTitle("Left Align Text");
            panel2.setFrame(true);
            panel2.setWidth(400);
            panel2.setHeight(150);
            panel2.setPaddings(20);

            final ProgressBar pbar2 = new ProgressBar();
            pbar2.setCls("left-align");
            pbar2.setWidth(300);
            pbar2.setText("Ready");

            Button button2 = new Button("Start", new ButtonListenerAdapter() {
                public void onClick(final Button button, EventObject e) {
                    button.disable();
                    pbar2.reset();
                    for (int i = 1; i < 12; i++) {
                        final int j = i;
                        Timer timer = new Timer() {
                            public void run() {
                                if (j > 11) {
                                    pbar2.setText("Done.");
                                    button.enable();
                                } else {
                                    pbar2.setText(Format.format("Loading item {0} of 10...", j + ""));
                                    pbar2.setValue(pbar2.getValue() + 0.1f);
                                }
                            }
                        };
                        timer.schedule(i * 1000);
                    }

                }
            });
            panel2.add(new HTMLPanel("A ProgressBar with label left aligned via CSS.", 0, 0, 0, 10));
            panel2.add(pbar2);
            panel2.addButton(button2);
            panel.add(panel2);


            Panel panel3 = new Panel();
            panel3.setTitle("Waiting Bar");
            panel3.setFrame(true);
            panel3.setWidth(400);
            panel3.setHeight(150);
            panel3.setPaddings(20);

            final ProgressBar pbar3 = new ProgressBar();
            pbar3.setWidth(300);

            Button button3 = new Button("Start", new ButtonListenerAdapter() {
                public void onClick(final Button button, EventObject e) {
                    button.disable();
                    pbar3.reset();

                    pbar3.wait(new WaitConfig() {
                        {
                            setInterval(200);
                            setDuration(8000);
                            setIncrement(15);
                            setCallback(new Function() {
                                public void execute() {
                                    button.enable();
                                }
                            });
                        }
                    });
                }
            });
            panel3.add(new HTMLPanel("Wait for a long operation to complete (example will stop after 8 secs) with progress update every 200ms and in increments of 15 segments.", 0, 0, 0, 10));
            panel3.add(pbar3);
            panel3.addButton(button3);
            panel.add(panel3);


            Panel panel4 = new Panel();
            panel4.setTitle("Custom Styles");
            panel4.setFrame(true);
            panel4.setWidth(400);
            panel4.setHeight(170);
            panel4.setPaddings(20);

            final ProgressBar pbar4 = new ProgressBar();
            pbar4.setText("Waiting on you...");
            pbar4.setTextEl("p4text");
            pbar4.setCls("custom");
            pbar4.setWidth(300);

            Button button4 = new Button("Start", new ButtonListenerAdapter() {
                public void onClick(final Button button, EventObject e) {
                    button.disable();
                    pbar4.reset();

                    for (int i = 1; i < 12; i++) {
                        final int j = i;
                        Timer timer = new Timer() {
                            public void run() {
                                if (j == 11) {
                                    pbar4.setText("All Done!");
                                    button.enable();
                                } else {
                                    float value = pbar4.getValue() + 0.1f;
                                    pbar4.setText(Format.format("{0}% completed... ", (int) (value * 100) + ""));
                                    pbar4.setValue(value);
                                }
                            }
                        };
                        timer.schedule(i * 1000);
                    }
                }
            });
            panel4.add(new HTMLPanel("Rendered like Windows XP with custom progress text element.", 0, 0, 0, 10));
            panel4.add(pbar4);
            HTMLPanel status = new HTMLPanel("<div class=\"status\"><b>Status:</b> <span id=\"p4text\"></span></div>", 10, 0, 0, 0);
            //the textEl must be already present in the DOM prior to ProgressBar creation
            status.render(Ext.getBody().getDOM());
            panel4.add(status);

            panel4.addButton(button4);
            panel.add(panel4);
        }
        return panel;
    }

    public String getIntro() {
        return "This example demonstrates various ways a ProgressBar can be configured.";
    }
}