select * from lms.roles;
insert into sms.roles values (1,'ADMIN');
insert into sms.roles values (2,'USER');

select * from lms.users;
-- admin/admin ; bhuvana/bhuvana
insert into sms.users values(1,'$2a$12$sPV7/Zk2FpmI8n59FWSlMuuOmXjSYMNTykJoj5llU68uSIPnhnACy','admin');
insert into sms.users values(2,'$2a$12$hLvh0VgUrdclxrvpKTfVCecHVGwpIkgAphniGVu6Bh1C4BRUAtIbu','bhuvana');

select * from lms.users_roles;
insert into sms.users_roles values(1,1);
insert into sms.users_roles values(2,2);