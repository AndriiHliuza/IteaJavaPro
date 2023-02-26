-- Restricting and Sorting Data

-- Таблиця Employees. Отримати список з інформацією про всіх співробітників
SELECT * FROM Employees;

-- Таблиця Employees. Отримати список всіх співробітників з ім'ям 'David'
SELECT * FROM Employees WHERE name = 'David';

-- Таблиця Employees. Отримати список всіх співробітників з job_id рівним 'IT_PROG'
SELECT * FROM Employees WHERE job_id = 'IT_PROG';

-- Таблиця Employees. Отримати список всіх співробітників з 50-го відділу (department_id) з зарплатою (salary), понад 4000
SELECT * FROM Employees WHERE department_id = 50 AND salary > 4000;

-- Таблиця Employees. Отримати список всіх співробітників з 20-го і з 30-го відділу (department_id)
SELECT * FROM Employees WHERE department_id IN (20, 30);

-- Таблиця Employees. Отримати список всіх співробітників у яких остання буква в імені дорівнює 'a'
SELECT * FROM Employees WHERE first_name LIKE '%a';

-- Таблиця Employees. Отримати список всіх співробітників з 50-го і з 80-го відділу (department_id) у яких є бонус (значення в колонці commission_pct не порожнє)
SELECT * FROM Employees WHERE department_id IN (20, 30) AND commission_pct IS NOT NULL;

-- Таблиця Employees. Отримати список всіх співробітників у яких в імені містяться мінімум 2 літери 'n'
-- SELECT * FROM Employees WHERE first_name LIKE '%n%n%';

-- Таблиця Employees. Отримати список всіх співробітників у яких довжина імені більше 4 букв
SELECT * FROM Employees WHERE first_name LIKE '_____%';

-- Таблиця Employees. Отримати список всіх співробітників у яких зарплата знаходиться в проміжку від 8000 до 9000 (включно)
SELECT * FROM Employees WHERE salary BETWEEN 8000 AND 9000;

-- Таблиця Employees. Отримати список всіх співробітників у яких в імені міститься символ '%'
SELECT * FROM Employees WHERE first_name LIKE '%\%%';

-- Таблиця Employees. Отримати список всіх ID менеджерів
SELECT ID FROM Employees;


-- Using Single-Row Functions to Customize Output

-- Таблиця Employees. Отримати список всіх співробітників у яких довжина імені більше 10 букв
SELECT * FROM Employees WHERE LENGTH(first_name) > 10;

-- Таблиця Employees. Отримати список всіх співробітників у яких в імені є буква 'b' (без урахування регістру)
SELECT * FROM Employees WHERE first_name REGEXP '[Bb]';

-- Таблиця Employees. Отримати список всіх співробітників у яких в імені містяться мінімум 2 літери 'a'
SELECT * FROM Employees WHERE first_name LIKE '%a%a%';

-- Таблиця Employees. Отримати список всіх співробітників зарплата яких кратна 1000
SELECT * FROM Employees WHERE (salary % 1000) = 0;

-- Таблиця Employees. Отримати перше 3х значне число телефонного номера співробітника якщо його номер в форматі ХХХ.ХХХ.ХХХХ
SELECT SUBSTRING(phone_number, 1, 3) FROM Employees WHERE phone_number LIKE '___.___.____';

-- Таблиця Departments. Отримати перше слово з імені департаменту для тих у кого в назві більше одного слова
SELECT SUBSTRING_INDEX(department_name, ' ', 1) FROM Departments WHERE department_name LIKE '_% _%';

-- Таблиця Employees. Отримати імена співробітників без першої і останньої літери в імені
SELECT SUBSTRING(first_name, 2, LENGTH(first_name) - 2) FROM Employees;

-- Таблиця Employees. Отримати список всіх співробітників у яких остання буква в імені дорівнює 'm' і довжиною імені більше 5ти
SELECT * FROM Employees WHERE SUBSTRING(first_name, LENGTH(first_name)) = 'm' AND LENGTH(first_name) > 5;

-- Таблиця Dual. Отримати дату наступної п'ятниці
SELECT date FROM Dual WHERE date LIKE DATE_ADD(CURDATE(), INTERVAL ((6 - DAYOFWEEK(CURDATE()))) DAY) AS NextFridayDate;

-- Таблиця Employees. Отримати список всіх співробітників які працюють в компанії більше 17 років
SELECT * FROM Employees WHERE (EXTRACT(YEAR FROM CURDATE()) - EXTRACT(YEAR FROM hire_date)) > 17;

-- Таблиця Employees. Отримати список всіх співробітників у яких остання цифра телефонного номера непарна і складається з 3-ох чисел між якими ставиться крапка
SELECT * FROM Employees WHERE SUBSTRING(phone_number, LENGTH(phone_number)) IN ('1', '3', '5', '7', '9') AND phone_number LIKE '___.___.___';

-- Таблиця Employees. Отримати список всіх співробітників у яких в значенні job_id після знака '_' як мінімум 3 символИ але при цьому це значення після '_' не дорівнює 'CLERK'
SELECT * FROM Employees WHERE (job_id LIKE '%\____%') AND (job_id NOT LIKE '%\_CLERK%');

-- Таблиця Employees. Отримати список всіх співробітників замінивши в значенні PHONE_NUMBER все '.' на '-'
SELECT first_name, REPLACE(phone_number, '.', '-') FROM Employees;

-- Using Conversion Functions and Conditional Expressions

-- Таблиця Employees. Отримати список всіх співробітників які прийшли на роботу в перший день місяця (будь-якого)
SELECT * FROM Employees WHERE EXTRACT(DAY FROM hire_date) = 1;

-- Таблиця Employees. Отримати список всіх співробітників які прийшли на роботу в 2008ом році
SELECT * FROM Employees WHERE EXTRACT(YEAR FROM hire_date) = 2008;

-- Таблиця DUAL. Показати завтрашню дату в форматі: Tomorrow is Second day of January
SELECT CONCAT('Tomorrow is ', DAYOFMONTH(date), ' of ', MONTHNAME(date)) FROM DUAL WHERE date = DATE_ADD(CURDATE(), INTERVAL 1 DAY);

-- Reporting Aggregated Data Using the Group Functions
-- Таблиця Employees. Скільки співробітників імена яких починається з однієї і тієї ж букви? Сортувати за кількістю. Показувати тільки ті де кількість більше 1
SELECT * FROM (SELECT SUBSTRING(first_name,1,1) AS first_letter, COUNT(*) AS amount FROM Employees GROUP BY first_letter) AS t WHERE amount > 2 ORDER BY amount;

-- Таблиця Employees. Скільки співробітників які працюють в одному і тому ж відділі і отримують однакову зарплату?
SELECT DEPARTMENT_ID, SALARY, COUNT(*) AS amount FROM Employees GROUP BY DEPARTMENT_ID, SALARY;

-- Displaying Data from Multiple Tables Using Joins
-- Таблиця Employees, Departaments, Locations, Countries, Regions. Отримати список регіонів і кількість співробітників в кожному регіоні
SELECT
    REGION_ID,
    COUNT(*)
FROM
    (
        SELECT
            Regions.REGION_ID
        FROM
            Regions
                JOIN Contries ON Regions.REGION_ID = Countries.REGION_ID
                JOIN Locations ON Countries.COUNTRY_ID = Locations.COUNTRY_ID
                JOIN Departments ON Locations.LOCATION_ID = Departments.LOCATION_ID
                JOIN Employees ON Departments.DEPARTMENT_ID = Employees.DEPARTMENT_ID
    ) AS t
GROUP BY
    REGION_ID;

-- Таблиця Employees, Departaments. Показати всі департаменти в яких працюють більше 30ти співробітників
SELECT * FROM (SELECT DEPARTMENT_ID, COUNT(*) AS number FROM Employees GROUP BY DEPARTMENT_ID) AS t WHERE number > 30;

-- Using Subqueries to Solve Queries
-- Таблиця Employees. Отримати список співробітників з найдовшим іменем.
SELECT * FROM Employees WHERE LENGTH(first_name) = ALL(SELECT MAX(LENGTH(first_name) FROM Employees);

-- Таблиця Employees. Отримати список співробітників з зарплатою більшою середньої зарплати всіх співробітників.
SELECT * FROM Employees WHERE SALARY > ALL(SELECT AVG(SALARY) FROM Employees);
