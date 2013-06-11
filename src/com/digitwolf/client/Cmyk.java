package com.digitwolf.client;

import com.digitwolf.client.views.MenuView;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 09.06.13
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
public class Cmyk implements EntryPoint {
    public void onModuleLoad() {
        final MenuView menuView = new MenuView();

        RootPanel.get("menu").add(menuView);
    }
}
