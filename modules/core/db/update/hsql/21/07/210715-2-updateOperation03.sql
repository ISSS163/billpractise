alter table BILLPRACTISE_OPERATION add constraint FK_BILLPRACTISE_OPERATION_ON_BILL foreign key (BILL_ID) references BILLPRACTISE_BILL(ID);
create index IDX_BILLPRACTISE_OPERATION_ON_BILL on BILLPRACTISE_OPERATION (BILL_ID);
