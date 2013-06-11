package com.digitwolf.client.views;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 10.06.13
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
public class MachinesList extends Composite {
    interface MachinesListUiBinder extends UiBinder<Widget, MachinesList> {
    }

    private static MachinesListUiBinder ourUiBinder = GWT.create(MachinesListUiBinder.class);

    @UiField
    ListBox listBox;

    public MachinesList() {
        initWidget(ourUiBinder.createAndBindUi(this));


    }
}