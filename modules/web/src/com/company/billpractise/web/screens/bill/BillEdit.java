package com.company.billpractise.web.screens.bill;


import com.haulmont.cuba.gui.screen.*;
import com.company.billpractise.entity.Bill;

import javax.inject.Inject;

@UiController("billpractise_Bill.edit")
@UiDescriptor("bill-edit.xml")
@EditedEntityContainer("billDc")
@LoadDataBeforeShow
public class BillEdit extends StandardEditor<Bill> {

}