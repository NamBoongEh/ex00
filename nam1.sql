-- 표를 보고 테이블 작성
create table test(
id          number(5)
,name       char(25)
,salary     number(7,2)
,title      char(25)    default '사원'
,in_date    date        default 'SYSDATE'
,dept_name  char(25)
);
 
 -- 각 부서별 평균 급여를 구하시오.
 
 -- 각 부서별 직책이 사원인 직원들의 평균급여를 구하시오.
 
 SELECT dept_id, avg(salary) FROM s_emp
 where title = '사원'
 group by dept_id
 order by dept_id;
 
 -- 각 지역별 부서가 몇 개인지 구하시오.
 
-- like로 바꿔보기
select substr(title, -2), sum(salary) from s_emp
where (substr(title, -2)!='부장')
group by substr(title, -2)
having sum(salary)>=8000
order by substr(title, -2);

  -- 각 부서별 직책이 사원들인 직원들에 대해서만 평균 급여를 구하시오.
  select dept_id, avg(salary)
  from s_emp
  where title='사원'
  group by dept_id
  order by dept_id;
  
  
  -- 직원 테이블과 급여 테이블  join, 사원 이름, 급여, 해당 급여등급 나타내기
  
  select s_emp.name, s_emp.salary, salgrade.grade
  from s_emp, salgrade
  where s_emp.salary between salgrade.losal and salgrade.hisal;
  
  
  -- 직원 테이블과 고객 테이블에서 사원의 이름, 사번, 그리고 각 사원의 담당고객 이름. 그리고 고객 없더라도 가져오기. 오름차순 정렬
  
  select s_emp.id, s_emp.name,  s_customer.name
  from s_emp, s_customer
  where s_emp.id(+) = s_customer.sales_rep_id
  order by s_emp.id
  ;
  
  
  -- 직원 중 '김정미'와 같은 직책 사원 이름, 직책, 급여, 부서번호 나타내기(self join)
  select s1.title, s2.name, s2.salary, s2.dept_id
  from s_emp s1, s_emp s2
  where (s1.name='김정미')
  and s1.title=s2.title
  and s2.name!='김정미'
  ;