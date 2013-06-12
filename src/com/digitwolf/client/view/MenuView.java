package com.digitwolf.client.view;

import com.github.gwtbootstrap.client.ui.NavLink;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 10.06.13
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */
public class MenuView extends Composite  {
    interface MenuViewUiBinder extends UiBinder<Widget, MenuView> {
    }

    private static MenuViewUiBinder ourUiBinder = GWT.create(MenuViewUiBinder.class);

    @UiField
    NavLink homeLink;

    @UiField
    NavLink machinesLink;

    @UiHandler("homeLink")
    public void homeClick(ClickEvent event) {

    }

    @UiHandler("machinesLink")
    public void machinesClick(ClickEvent event) {

    }

    public MenuView() {
        initWidget(ourUiBinder.createAndBindUi(this));


    }
}