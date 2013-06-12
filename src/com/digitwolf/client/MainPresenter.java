package com.digitwolf.client;


import com.google.inject.Inject;
import net.customware.gwt.dispatch.client.DispatchAsync;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.widget.WidgetDisplay;
import net.customware.gwt.presenter.client.widget.WidgetPresenter;

public class MainPresenter extends WidgetPresenter<MainPresenter.Display> {

    @Override
    protected void onBind() {


    }

    @Override
    protected void onUnbind() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void onRevealDisplay() {
        //To change body of implemented methods use File | Settings | File Templates.
    }



    @Inject
    public MainPresenter(final Display display,
                         final EventBus eventBus) {
        super(display, eventBus);

      //  _dispatch = dispatch;
    }

    public interface Display extends WidgetDisplay {
    }
}
