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
    TYPE_ varchar(255) not null,
    AMOUNT integer not null,
    DATE_ timestamp not null,
    CATEGORY varchar(255) not null,
    COMMENT_ varchar(255),
    --
    primary key (ID)
);