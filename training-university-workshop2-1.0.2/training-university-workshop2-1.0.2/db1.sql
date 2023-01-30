
-- DROP TABLE students;
CREATE TABLE students (
  id int(11) NOT NULL auto_increment,
  name varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  email varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  state Integer(2) NOT NULL,
  created datetime DEFAULT NULL,  
  PRIMARY KEY (id)
);

SELECT * FROM students;