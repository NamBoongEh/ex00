-- ǥ�� ���� ���̺� �ۼ�
create table test(
id          number(5)
,name       char(25)
,salary     number(7,2)
,title      char(25)    default '���'
,in_date    date        default 'SYSDATE'
,dept_name  char(25)
);
 
 -- �� �μ��� ��� �޿��� ���Ͻÿ�.
 
 -- �� �μ��� ��å�� ����� �������� ��ձ޿��� ���Ͻÿ�.
 
 SELECT dept_id, avg(salary) FROM s_emp
 where title = '���'
 group by dept_id
 order by dept_id;
 
 -- �� ������ �μ��� �� ������ ���Ͻÿ�.
 
-- like�� �ٲ㺸��
select substr(title, -2), sum(salary) from s_emp
where (substr(title, -2)!='����')
group by substr(title, -2)
having sum(salary)>=8000
order by substr(title, -2);

  -- �� �μ��� ��å�� ������� �����鿡 ���ؼ��� ��� �޿��� ���Ͻÿ�.
  select dept_id, avg(salary)
  from s_emp
  where title='���'
  group by dept_id
  order by dept_id;
  
  
  -- ���� ���̺�� �޿� ���̺�  join, ��� �̸�, �޿�, �ش� �޿���� ��Ÿ����
  
  select s_emp.name, s_emp.salary, salgrade.grade
  from s_emp, salgrade
  where s_emp.salary between salgrade.losal and salgrade.hisal;
  
  
  -- ���� ���̺�� �� ���̺��� ����� �̸�, ���, �׸��� �� ����� ���� �̸�. �׸��� �� ������ ��������. �������� ����
  
  select s_emp.id, s_emp.name,  s_customer.name
  from s_emp, s_customer
  where s_emp.id(+) = s_customer.sales_rep_id
  order by s_emp.id
  ;
  
  
  -- ���� �� '������'�� ���� ��å ��� �̸�, ��å, �޿�, �μ���ȣ ��Ÿ����(self join)
  select s1.title, s2.name, s2.salary, s2.dept_id
  from s_emp s1, s_emp s2
  where (s1.name='������')
  and s1.title=s2.title
  and s2.name!='������'
  ;