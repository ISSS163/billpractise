package com.company.billpractise.web.screens.operation;

import com.haulmont.cuba.gui.screen.*;
import com.company.billpractise.entity.Operation;

@UiController("billpractise_Operation.browse")
@UiDescriptor("operation-browse.xml")
@LookupComponent("operationsTable")
@LoadDataBeforeShow
public class OperationBrowse extends StandardLookup<Operation> {
}