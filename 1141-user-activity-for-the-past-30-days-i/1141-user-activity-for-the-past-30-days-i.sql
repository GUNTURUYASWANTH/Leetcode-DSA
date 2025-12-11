# Write your MySQL query statement below

select activity_date as day,
    count(distinct user_id) as active_users
    from Activity
    where datediff('2019-07-27',activity_date) <30  and activity_date <= '2019-07-27'
    and
    activity_type in ('open_session', 'end_session', 'scroll_down','send_message')
    group by day
    order by day
    
-- select activity_date from Activity where datediff('2019-07-27',activity_date)<=30 group by activity_date





 


-- What i learned and implemented
-- select 
--     if (datediff(activity_date,'2019-07-27')<30 , activity_date,null) as day ,
--     if(activity_type in ('open_session', 'end_session', 'scroll_down', 'send_message'))
--     from Activity group by day 


-- This is the idea first i got when i see the question

-- select activity_date as date , count(*) as active_users 
--         from Activity
--         where activity_type = 'open_session' 
--         and
--         activity_type = 'scroll_down'
--         and 
--         activity_type  = 'end_session'
--         and 
--         activity_type = 'send_message'


