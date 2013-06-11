package com.digitwolf.client.events;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 10.06.13
 * Time: 22:36
 * To change this template use File | Settings | File Templates.
 */
public class AddMachineEvent extends GwtEvent<AddMachineEventHandler> {
    public static Type<AddMachineEventHandler> TYPE = new Type<AddMachineEventHandler>();

    public Type<AddMachineEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(AddMachineEventHandler handler) {
        handler.onAddMachine(this);
    }
}
