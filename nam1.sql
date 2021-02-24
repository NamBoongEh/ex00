create sequence seq_board;

create table tbl_board
(bno number(10,0),
title varchar2(200) not null,
content varchar2(2000) not null,
writer varchar2(50) not null,
regdate date default sysdate,
updatedate date default sysdate)
;

alter table tbl_board add constraint pk_board
primary key(bno);

drop table tbl_board_;

insert into tbl_board (bno, title, content, writer)
values (seq_board.nextval, '�׽�Ʈ ����', '�׽�Ʈ ����', '���ؾ�')
;

insert into tbl_board (bno, title, content, writer)
values (seq_board.nextval, '�׽�Ʈ ����', '�׽�Ʈ ����', '���ؾ�')
;

select * from tbl_board where bno>0;




-- 1��
delete from emp_113;

-- 2��
select title
from s_emp
group by title;

-- 3��
select *
from s_emp
order by dept_id desc, salary asc
;

-- 4�� (20015�⵵ ������ �� �� ����)
select *
from s_emp
where start_date < '2015.01.01'
;

-- 5��
select *
from s_emp
where salary between 1000 and 5000
;

-- 6��
select dept_id, avg(salary)
from s_emp
group by dept_id
;

-- 7��
select dept_id, avg(salary)
from s_emp
where title = '���'
group by dept_id
;

-- 8��
select region_id, count(*)
from s_dept
group by region_id
;

-- 9��
select dept_id, avg(salary)
from s_emp
group by dept_id
having avg(salary)>=2000
;

-- 10��
select title, sum(salary)
from s_emp
group by title
having title not like '%����'
and sum(salary)>=8000
order by sum(salary) asc
;

-- 11��
select dept_id, avg(salary)
from s_emp
where title = '���'
group by dept_id
;

-- 12��
select dept_id, title, count(*)
from s_emp
group by dept_id, title
;

-- 13��
select dept_id, count(*)
from s_emp
group by dept_id
;

-- 14��
select dept_id, min(salary), max(salary)
from s_emp
group by dept_id
having min(salary) != max(salary)
;

-- 15��
select s_emp.name, s_emp.dept_id, s_dept.name
from s_emp, s_dept
where s_emp.dept_id = s_dept.id
;

-- 16��
select s_emp.name, s_dept.name, s_region.name
from s_emp, s_dept, s_region
where s_emp.dept_id = s_dept.id
and s_dept.region_id = s_region.id
and s_region.name = '����Ư����'
;


-- 17��
select s_emp.name, s_emp.salary, salgrade.grade
from s_emp, salgrade
where s_emp.salary between losal and hisal
;


-- 18��
select s_emp.name, s_emp.id, s_customer.name
from s_emp, s_customer
where  s_emp.id(+) = s_customer.sales_rep_id
order by s_emp.id
;

-- 19��
select s2.name, s2.title, s2.salary, s2.dept_id
from s_emp s1, s_emp s2
where s1.name = '������'
and s1.title = s2.title
;

-- 20��
select title, avg(salary)
from s_emp
group by title
having avg(salary) =
(select min(avg(salary))
from s_emp
group by title)
;

-- 20�� Ȯ�ο�
select title, avg(salary)
from s_emp
group by title
;

-- 21��
select name, salary, decode(salary between 3000 and 4000 B between 2000 and 3000 C between 1000 and 2000 D) 
from s_emp
;

-- 22��
select s1.name, s1.salary, s1.dept_id, s2.dept_id
from s_emp s1
where s1.salary
;

select s2.dept_id, avg(s2.salary)
from s_emp s2
group by s2.dept_id
;