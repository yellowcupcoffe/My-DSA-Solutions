# Write your MySQL query statement below
select Person.firstName, person.lastName, address.city, address.state
from person 
left join address
on person.personid = address.personid;
