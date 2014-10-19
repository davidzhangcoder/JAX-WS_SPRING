use jaxws_spring;

select * from p_message;

truncate table p_message;

ALTER TABLE p_message drop  `FK_M_MESSAGE`;

delete from p_message where id = 2;

insert into p_message ( id , message , user_id ) values ( 1 , 'aaa' , 1 );
insert into p_message ( id , message , user_id ) values ( 2 , 'bbb' , 1 );
