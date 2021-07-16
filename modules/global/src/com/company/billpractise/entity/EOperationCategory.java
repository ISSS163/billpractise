package com.company.billpractise.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum EOperationCategory implements EnumClass<String> {

    FOOD("1"),
    MEDICINE("2"),
    CLIENT("3"),
    TRANSPORT("4"),
    EDUCATION("5");

    private String id;

    EOperationCategory(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static EOperationCategory fromId(String id) {
        for (EOperationCategory at : EOperationCategory.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}