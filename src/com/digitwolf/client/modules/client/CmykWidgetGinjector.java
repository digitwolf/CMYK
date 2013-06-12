package com.digitwolf.client.modules.client;

import com.digitwolf.client.AppPresenter;
import com.digitwolf.client.view.MainView;
import com.digitwolf.client.view.MenuView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 11.06.13
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
@GinModules(CmykClientModule.class)
public interface CmykWidgetGinjector extends Ginjector {
    public static final CmykWidgetGinjector Instance = GWT.create(CmykWidgetGinjector.class);

    AppPresenter getAppPresenter();
    //PlaceHistoryHandler getPlaceHistoryHandler();
    MainView getMainView();
    MenuView getMenuView();
}
