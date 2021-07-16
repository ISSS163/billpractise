package com.company.billpractise.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Table(name = "BILLPRACTISE_OPERATION")
@Entity(name = "billpractise_Operation")
@NamePattern("%s %s %s|type,date,amount")
public class Operation extends StandardEntity {
    private static final long serialVersionUID = -5402109706238181899L;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    private String type;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    @Positive
    private Integer amount;

    @NotNull
    @Column(name = "DATE_", nullable = false)
    private LocalDateTime date;

    @NotNull
    @Column(name = "CATEGORY", nullable = false)
    private String category;

    @Column(name = "COMMENT_")
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BILL_ID")
    private Bill bill;

    public void setCategory(EOperationCategory category) {
        this.category = category == null ? null : category.getId();
    }

    public EOperationCategory getCategory() {
        return category == null ? null : EOperationCategory.fromId(category);
    }

    public void setType(EOperationType type) {
        this.type = type == null ? null : type.getId();
    }

    public EOperationType getType() {
        return type == null ? null : EOperationType.fromId(type);
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}