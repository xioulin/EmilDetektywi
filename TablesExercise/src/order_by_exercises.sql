USE employees;
DESCRIBE employees;

select * FROM employees
WHERE gender = 'M' AND (first_name = 'Irena' OR first_name = 'Vidya' OR first_name = 'Maya') ;

select * FROM employees
WHERE first_name = 'Irena' OR first_name = 'Vidya' OR first_name = 'Maya'ORDER BY first_name;

select * FROM employees
WHERE first_name = 'Irena' OR first_name = 'Vidya' OR first_name = 'Maya' ORDER BY last_name, first_name;

select * FROM employees
WHERE last_name LIKE 'E%' OR last_name LIKE '%e' ORDER BY emp_no;



select last_name FROM employees
WHERE last_name LIKE 'E%' AND last_name LIKE '%e';

select last_name FROM employees
WHERE last_name LIKE '%q%';

select last_name FROM employees
WHERE last_name LIKE '%q%' AND last_name NOT LIKE '%qu%';