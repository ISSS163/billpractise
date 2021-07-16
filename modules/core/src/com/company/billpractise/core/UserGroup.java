package com.company.billpractise.core;

import com.company.billpractise.entity.Bill;
import com.haulmont.cuba.security.app.group.AnnotatedAccessGroupDefinition;
import com.haulmont.cuba.security.app.group.annotation.AccessGroup;
import com.haulmont.cuba.security.app.group.annotation.JpqlConstraint;
import com.haulmont.cuba.security.group.ConstraintsContainer;

@AccessGroup(name = "User", parent = ArchiveGroup.class)
public class UserGroup extends AnnotatedAccessGroupDefinition {

    @JpqlConstraint(target = Bill.class, where = "{E}.archive = false")
    @Override
    public ConstraintsContainer accessConstraints() {
        return super.accessConstraints();
    }

}
