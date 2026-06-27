-- Write your query below
select student_id,exam_id,score
from
(select *, Row_Number() over(partition by student_id order by score desc ,exam_id ) as RN
from exam_results) as NTable
where RN = 1
order by student_id;