-- begin BILLPRACTISE_BILL
create table BILLPRACTISE_BILL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CURRENCY varchar(20) not null,
    FUNDS integer not null,
    ARCHIVE boolean not null,
    --
    primary key (ID)
)^
-- end BILLPRACTISE_BILL
-- begin BILLPRACTISE_OPERATION
create table BILLPRACTISE_OPERATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_ varchar(50) not null,
    AMOUNT integer not null,
    DATE_ timestamp not null,
    CATEGORY varchar(50) not null,
    COMMENT_ varchar(255),
    BILL_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end BILLPRACTISE_OPERATION
