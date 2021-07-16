package com.company.billpractise.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@Table(name = "BILLPRACTISE_BILL", indexes = {
        @Index(name = "IDX_BILLPRACTISE_BILL_NAME", columnList = "NAME")
})
@Entity(name = "billpractise_Bill")
@NamePattern("%s|name")
public class Bill extends StandardEntity {
    private static final long serialVersionUID = -1004148171070167458L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "bill")
    private List<Operation> operation;

    @Column(name = "CURRENCY", nullable = false, length = 20)
    @NotNull
    private String currency;

    @Column(name = "FUNDS", nullable = false)
    @NotNull
    @PositiveOrZero
    private Integer funds;

    @NotNull
    @Column(name = "ARCHIVE", nullable = false)
    private Boolean archive = false;

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public Integer getFunds() {
        return funds;
    }

    public void setFunds(Integer funds) {
        this.funds = funds;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}