-- update BILLPRACTISE_OPERATION set BILL_ID = <default_value> where BILL_ID is null ;
alter table BILLPRACTISE_OPERATION alter column BILL_ID set not null ;
