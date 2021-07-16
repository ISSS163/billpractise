package com.company.billpractise.web.screens.operation;


import com.company.billpractise.entity.Operation;
import com.haulmont.cuba.gui.screen.*;

@UiController("billpractise_Operation.edit")
@UiDescriptor("operation-edit.xml")
@EditedEntityContainer("operationDc")
@LoadDataBeforeShow
public class OperationEdit extends StandardEditor<Operation> {


}