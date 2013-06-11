package com.digitwolf.client;

import com.digitwolf.client.models.Order;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.core.client.GWT;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 10.06.13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
@RemoteServiceRelativePath("OrdersService")
public interface OrdersService extends RemoteService {

    List<Order> getOrders();

    /**
     * Utility/Convenience class.
     * Use OrdersService.App.getInstance() to access static instance of OrdersServiceAsync
     */
    public static class App {
        private static final OrdersServiceAsync ourInstance = (OrdersServiceAsync) GWT.create(OrdersService.class);

        public static OrdersServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
