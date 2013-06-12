package com.digitwolf.client.view;

import com.digitwolf.client.MainPresenter;
import com.digitwolf.client.modules.client.CmykWidgetGinjector;
import com.github.gwtbootstrap.client.ui.Container;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 11.06.13
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 */
public class MainView extends Composite implements MainPresenter.Display {
    interface MainViewUiBinder extends UiBinder<Widget, MainView> {
    }

    private static MainViewUiBinder ourUiBinder = GWT.create(MainViewUiBinder.class);
    //private final CmykWidgetGinjector injector = GWT.create(CmykWidgetGinjector.class);

    @UiField
    Panel menuContainer;

    @UiField
    Container container;

    @Inject
    public MainView(final MenuView menu) {

        initWidget(ourUiBinder.createAndBindUi(this));

        menuContainer.add(menu);

    }
}