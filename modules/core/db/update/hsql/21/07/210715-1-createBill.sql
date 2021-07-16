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
);