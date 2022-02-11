select o.product_name, c.name
from ORDERS o
         join CUSTOMERS c on c.id = o.customer_id
where name = :name;