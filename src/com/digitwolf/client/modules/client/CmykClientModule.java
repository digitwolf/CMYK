package com.digitwolf.client.modules.client;

import com.digitwolf.client.AppPresenter;
import com.digitwolf.client.MainPresenter;
import com.digitwolf.client.view.MainView;
import com.digitwolf.client.view.MenuView;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import net.customware.gwt.presenter.client.DefaultEventBus;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.gin.AbstractPresenterModule;
import net.customware.gwt.presenter.client.place.PlaceManager;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 11.06.13
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
public class CmykClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);
        //bind(PlaceManager.class).in(Singleton.class);
        //bind(ILog.class).to(GwtLogAdapter.class).in(Singleton.class);
        bind(AppPresenter.class);

        bindPresenter(MainPresenter.class, MainPresenter.Display.class, MainView.class);

        bind(MainView.class).in(Singleton.class);
        bind(MenuView.class).in(Singleton.class);
    }
}
