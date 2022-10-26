USE employees;
DESCRIBE
    employees;


select first_name, gender
FROM employees
WHERE gender = 'M'
  AND (first_name = 'Irena' OR first_name = 'Vidya' OR first_name = 'Maya');

select last_name
FROM employees
WHERE last_name LIKE 'E%'
   OR last_name LIKE '%e';

select last_name FROM employees
WHERE last_name LIKE 'E%' AND last_name LIKE '%e';

select last_name
FROM employees
WHERE last_name LIKE '%q%';

select last_name
FROM employees
WHERE last_name LIKE '%q%'
  AND last_name NOT LIKE '%qu%';