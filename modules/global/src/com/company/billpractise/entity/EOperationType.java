package com.company.billpractise.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum EOperationType implements EnumClass<String> {

    TRANSFER("A"),
    PAYMENT("B");

    private String id;

    EOperationType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EOperationType fromId(String id) {
        for (EOperationType at : EOperationType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}