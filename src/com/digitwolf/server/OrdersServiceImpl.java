package com.digitwolf.server;

import com.digitwolf.client.models.Order;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.digitwolf.client.OrdersService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 10.06.13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
public class OrdersServiceImpl extends RemoteServiceServlet implements OrdersService {
    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order("Order 1"));
        orders.add(new Order("Order 2"));
        orders.add(new Order("Order 3"));
        return orders;
    }
}