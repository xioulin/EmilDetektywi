
USE codeup_test_db;

--  Using the example in the Associative Table Joins section as a guide, write a query that shows each department along with the name of the current manager for that department.
# SELECT departments.dept_name AS DepartmentManager
# FROM employees as dept_name
#          JOIN dept_manager
#               ON employees.emp_no = dept_manager.emp_no
#          JOIN dept_manager
#               ON dept_manager.dept_no = de.dept_no
# WHERE de.to_date = '9999-01-01' AND e.emp_no = 10001;

-- #
-- # +--------------------+--------------------+
-- # | Department Name    | Department Manager |
-- # +--------------------+--------------------+
-- # | Customer Service   | Yuchang Weedman    |
-- # | Development        | Leon DasSarma      |
-- # | Finance            | Isamu Legleitner   |
-- # | Human Resources    | Karsten Sigstam    |
-- # | Marketing          | Vishwani Minakawa  |
-- # | Production         | Oscar Ghazalie     |
-- # | Quality Management | Dung Pesch         |
-- # | Research           | Hilary Kambil      |
-- # | Sales              | Hauke Zhang        |
-- # +--------------------+--------------------+