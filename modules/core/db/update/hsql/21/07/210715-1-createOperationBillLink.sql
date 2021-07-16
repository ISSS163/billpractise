create table BILLPRACTISE_OPERATION_BILL_LINK (
    OPERATION_ID varchar(36) not null,
    BILL_ID varchar(36) not null,
    primary key (OPERATION_ID, BILL_ID)
);
