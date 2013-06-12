package com.digitwolf.client;

import com.digitwolf.client.modules.client.CmykWidgetGinjector;
import com.digitwolf.client.view.MenuView;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.*;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 09.06.13
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
public class Cmyk implements EntryPoint {
    private final CmykWidgetGinjector injector = GWT.create(CmykWidgetGinjector.class);

    public void onModuleLoad() {
        //RootPanel.get().add(injector.getMainView());

        final AppPresenter appPresenter = injector.getAppPresenter();
        appPresenter.go(RootPanel.get());

        // goes to the place represented on url, or the default place
//        injector.getPlaceHistoryHandler().handleCurrentHistory();
    }
}
