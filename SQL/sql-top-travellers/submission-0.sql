-- Write your query below
select name , travelled_distance
from
(select user_id, name , sum(COALESCE(distance,0)) as travelled_distance
from rides r right join users u
on r.user_id = u.id
group by user_id , name
) order by travelled_distance desc, name;
