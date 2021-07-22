--DB ����
CREATE DATABASE shop_db;

--database ����
USE shop_db; 

drop table user_table;

--���̺� ����
create table user_table (
	user_id 	CHAR(8) NOT NULL,
	--CQurry Server���� �ѱ��ھ� ����ϴ� �Լ� NCHAR
    user_name NCHAR(5) NOT NULL,
    user_age 	INT,
    PRIMARY KEY(user_id)
);

--������ �Է�
INSERT INTO user_table VALUES('AAA','ȫ�浿', 20);
INSERT INTO user_table VALUES('BBB','�̼���', 21);

--������ ���
SELECT * FROM user_table;
SELECT user_name, user_age FROM user_table;
SELECT * FROM user_table WHERE user_name = 'ȫ�浿';
SELECT * FROM user_table WHERE user_age >= 23 ;

--���̺� ����
USE shop_db;

--������ ����
DROP TABLE user_table;

--DB ����
USE TEMPDB;
DROP DATABASE shop_db;