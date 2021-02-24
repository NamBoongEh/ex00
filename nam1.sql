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
values (seq_board.nextval, '테스트 제목', '테스트 내용', '남붕어')
;

insert into tbl_board (bno, title, content, writer)
values (seq_board.nextval, '테스트 제목', '테스트 내용', '남붕어')
;

select * from tbl_board where bno>0;




-- 1번
delete from emp_113;

-- 2번
select title
from s_emp
group by title;

-- 3번
select *
from s_emp
order by dept_id desc, salary asc
;

-- 4번 (20015년도 이전은 한 명도 없다)
select *
from s_emp
where start_date < '2015.01.01'
;

-- 5번
select *
from s_emp
where salary between 1000 and 5000
;

-- 6번
select dept_id, avg(salary)
from s_emp
group by dept_id
;

-- 7번
select dept_id, avg(salary)
from s_emp
where title = '사원'
group by dept_id
;

-- 8번
select region_id, count(*)
from s_dept
group by region_id
;

-- 9번
select dept_id, avg(salary)
from s_emp
group by dept_id
having avg(salary)>=2000
;

-- 10번
select title, sum(salary)
from s_emp
group by title
having title not like '%부장'
and sum(salary)>=8000
order by sum(salary) asc
;

-- 11번
select dept_id, avg(salary)
from s_emp
where title = '사원'
group by dept_id
;

-- 12번
select dept_id, title, count(*)
from s_emp
group by dept_id, title
;

-- 13번
select dept_id, count(*)
from s_emp
group by dept_id
;

-- 14번
select dept_id, min(salary), max(salary)
from s_emp
group by dept_id
having min(salary) != max(salary)
;

-- 15번
select s_emp.name, s_emp.dept_id, s_dept.name
from s_emp, s_dept
where s_emp.dept_id = s_dept.id
;

-- 16번
select s_emp.name, s_dept.name, s_region.name
from s_emp, s_dept, s_region
where s_emp.dept_id = s_dept.id
and s_dept.region_id = s_region.id
and s_region.name = '서울특별시'
;


-- 17번
select s_emp.name, s_emp.salary, salgrade.grade
from s_emp, salgrade
where s_emp.salary between losal and hisal
;


-- 18번
select s_emp.name, s_emp.id, s_customer.name
from s_emp, s_customer
where  s_emp.id(+) = s_customer.sales_rep_id
order by s_emp.id
;

-- 19번
select s2.name, s2.title, s2.salary, s2.dept_id
from s_emp s1, s_emp s2
where s1.name = '김정미'
and s1.title = s2.title
;

-- 20번
select title, avg(salary)
from s_emp
group by title
having avg(salary) =
(select min(avg(salary))
from s_emp
group by title)
;

-- 20번 확인용
select title, avg(salary)
from s_emp
group by title
;

-- 21번
select name, salary, decode(salary between 3000 and 4000 B between 2000 and 3000 C between 1000 and 2000 D) 
from s_emp
;

-- 22번
select s1.name, s1.salary, s1.dept_id, s2.dept_id
from s_emp s1
where s1.salary
;

select s2.dept_id, avg(s2.salary)
from s_emp s2
group by s2.dept_id
;