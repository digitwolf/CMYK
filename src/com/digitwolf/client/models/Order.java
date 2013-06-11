package com.digitwolf.client.models;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 10.06.13
 * Time: 10:34
 * To change this template use File | Settings | File Templates.
 */
public class Order implements IsSerializable {

    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Order() {
    }

    public Order(String description) {
        this.description = description;
    }
}
