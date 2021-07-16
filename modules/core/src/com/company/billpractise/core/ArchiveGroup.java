package com.company.billpractise.core;

import com.company.billpractise.entity.Bill;
import com.haulmont.cuba.security.app.group.AnnotatedAccessGroupDefinition;
import com.haulmont.cuba.security.app.group.annotation.AccessGroup;
import com.haulmont.cuba.security.app.group.annotation.JpqlConstraint;
import com.haulmont.cuba.security.group.ConstraintsContainer;

@AccessGroup(name = "ArchiveGroup")
public class ArchiveGroup extends AnnotatedAccessGroupDefinition {

}

