USE employees;
DESCRIBE employees;

# select * FROM employees
# WHERE gender = 'M' AND (first_name = 'Irena' OR first_name = 'Vidya' OR first_name = 'Maya') ;
#
# select * FROM employees
# WHERE first_name = 'Irena' OR first_name = 'Vidya' OR first_name = 'Maya'ORDER BY first_name;
#
# select * FROM employees
# WHERE first_name = 'Irena' OR first_name = 'Vidya' OR first_name = 'Maya' ORDER BY last_name, first_name;
#
# select * FROM employees
# WHERE last_name LIKE 'E%' OR last_name LIKE '%e' ORDER BY emp_no;
#


select Concat(first_name,' ',last_name)as full_name FROM employees
WHERE last_name LIKE 'E%' AND last_name LIKE '%e';

select * from employees where year(hire_date) Between 1990 AND 1999  ANd MOnth(birth_date)=12 AND Day(birth_date)=25 order by birth_date;

select * from employees where Month(birth_date)=12 AND Day(birth_date)=25;

select datediff(curdate(),hire_date),first_name,last_name from employees where Month(birth_date)=12 AND Day(birth_date)=25;

select last_name FROM employees
WHERE last_name LIKE '%q%';

select last_name FROM employees
WHERE last_name LIKE '%q%' AND last_name NOT LIKE '%qu%';