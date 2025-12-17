# Write your MySQL query statement below

select date_format(trans_date,'%Y-%m')as month, 
            country ,
            count(*) as trans_count,
            sum(state = 'approved')as approved_count,
            sum(amount) as trans_total_amount,
            sum(if(state = 'approved',amount,0))as approved_total_amount  
            from Transactions group by month,country

-- +----------+---------+-------------+----------------+--------------------+-----------------------+
-- | month    | country | trans_count | approved_count | trans_total_amount | approved_total_amount |
-- +----------+---------+-------------+----------------+--------------------+-----------------------+
-- | 2018-12  | US      | 2           | 1              | 3000               | 1000                  |
-- | 2019-01  | US      | 1           | 1              | 2000               | 2000                  |
-- | 2019-01  | DE      | 1           | 1              | 2000               | 2000                  |
-- +----------+---------+-------------+----------------+--------------------+-----------------------+



-- select date_format(trans_date,'%Y-%m')as month, 
--             country ,
--             count(*) as trans_count,
--             (select count(*) from Transactions where state = 'approved') as approved_count,
--             sum(amount) as trans_total_amount,
--             (select sum(amount) from transactions where state = 'approved')as approved_total_amount  
--             from Transactions group by month,country