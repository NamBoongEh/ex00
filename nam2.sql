drop table tbl_board_ex02;

create sequence seq_board2;

create table tbl_board2(
    bno number(10,0),
    title varchar2(200) not null,
    content varchar2(2000) not null,
    writer varchar2(50) not null,
    regdate date default sysdate,
    updatedate date default sysdate
    );
    
alter table tbl_board2 add constraint pk_board2
primary key(bno);

insert into tbl_board2 (bno, title, content, writer)
values (seq_board2.nextval, '테스트 제목', '테스트 내용', '돌아와버렸어ㅠㅠ유저');

select *
from tbl_board2;

select * from tbl_board2 where bno>0;