-- Write your query below
select first_name ,last_name ,city ,state
from person P left join address A
on P.person_id = A.person_id;