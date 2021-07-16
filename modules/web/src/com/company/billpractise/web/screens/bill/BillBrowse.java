package com.company.billpractise.web.screens.bill;

import com.haulmont.cuba.gui.screen.*;
import com.company.billpractise.entity.Bill;

@UiController("billpractise_Bill.browse")
@UiDescriptor("bill-browse.xml")
@LookupComponent("billsTable")
@LoadDataBeforeShow
public class BillBrowse extends StandardLookup<Bill> {
}