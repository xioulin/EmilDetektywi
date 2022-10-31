USE employees;
    SELECT first_name,last_name,birth_date FROM employees;

SHOW TABLES;

DESCRIBE users;
DESCRIBE roles;
INSERT INTO roles (name) VALUES ('admin');
INSERT INTO roles (name) VALUES ('author');
INSERT INTO roles (name) VALUES ('reviewer');
INSERT INTO roles (name) VALUES ('commenter');
SELECT* FROM roles;
SELECT* FROM users;


UPDATE users
SET role_id = (SELECT id FROM roles WHERE name = 'admin')
WHERE email = 'fer@codeup.com';

INSERT INTO users (name, email, role_id)
VALUES('fer', 'fer@codeup.com',
       (SELECT id FROM roles WHERE name = 'commenter')
      );

Select* from employees;
# Find all the employees with the same hire date as employee 101010 using a subquery.


SELECT * from employees where emp_no = 101010;

SELECT * from employees where hire_date IN (
    SELECT hire_date FROM EMPLOYEES WHERE emp_no = 101010
    );
# 69 Rows
#
# Find all the titles held by all employees with the first name Aamod.

SELECT * FROM Employees where first_name in (
    SELECT first_name from employees where first_name = 'Aamod'
    );
# 314 total titles, 6 unique titles
#
# Find all the current department managers that are female.
SELECT gender, first_name,last_name FROM employees where gender ='F' AND emp_no IN (
    SELECT emp_no from dept_manager
    );


#
# +------------+------------+
# | first_name | last_name  |
# +------------+------------+
# | Isamu      | Legleitner |
# | Karsten    | Sigstam    |
# | Leon       | DasSarma   |
# | Hilary     | Kambil     |
# +------------+------------+