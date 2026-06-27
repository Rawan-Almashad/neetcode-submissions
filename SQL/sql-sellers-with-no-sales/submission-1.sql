-- Write your query below

select seller_name 
from seller S 
where
seller_id not in (select seller_id from orders where EXTRACT(YEAR FROM sale_date) = 2020)
order by seller_name;