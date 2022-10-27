USE employees;
SELECT title from titles group by title;

select last_name,COUNT(last_name) FROM employees WHERE last_name LIKE 'E%' AND last_name LIKE '%e' group by last_name;

SELECT DISTINCT first_name,last_name from employees WHERE last_name LIKE 'E%' AND last_name LIKE '%e';

select  last_name,count(last_name) FROM employees
WHERE last_name LIKE '%q%' AND last_name NOT LIKE '%qu%' group by last_name;

select count(*),gender FROM employees
WHERE first_name = 'Irena' OR first_name = 'Vidya' OR first_name = 'Maya'group by gender;