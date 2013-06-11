package com.digitwolf.client.models;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 10.06.13
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class Production implements IsSerializable {
    private String name;
    private String description;
    private Machine machine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Production() {
    }
}
