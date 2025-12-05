# Write your MySQL query statement below


-- select e1.name as Employee from Employee e1 inner join Employee e2 on e1.managerId = e2.id
--             where e1.salary > e2.salary


select name as Employee from Employee a 
        where a.salary > (select b.salary from Employee b where b.id = a.managerId )