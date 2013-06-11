package com.digitwolf.client;

import com.digitwolf.client.models.Order;
import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 10.06.13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
public interface OrdersServiceAsync {
    void getOrders(AsyncCallback<List<Order>> async);
}
