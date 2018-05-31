Mysql init
-----------
-- installation
  refer [https://blog.csdn.net/lynnyq/article/details/80296137] Mysql install
  https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-18-04



systemctl status mysql.service mysql.service
https://www.digitalocean.com/community/tutorials/how-to-install-mysql-on-ubuntu-18-04


-- config root
update mysql.user set authentication_string=PASSWORD('Root@1234'), plugin='mysql_native_password' where user='root';

grant all on *.* to root@'%' identified by 'Root@1234' with grant option;

-- create db demo
-- for clean up purpose ---------------------
-- run as root --
-- mysql -h localhost -u root -p
-- first drop database demo and user demo
drop database if exists demo;
create database demo;

-- create user demo and give the password  demo
grant all privileges on demo.* to demo@'%' identified by 'Demo@1234';

show databases;


--test
curl -X POST -H 'Content-Type: application/json' -i http://localhost:8080/api/v1/downloads --data '{
  "appId": 1,
  "downloadCount": 1
}'

curl -X GET -i http://localhost:8080/api/v1/downloads/count/1