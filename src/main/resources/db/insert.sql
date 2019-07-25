
delete from course where id<100;

INSERT INTO course (name, created_date , cost)
VALUES ('java', 1563740760, 2500);
INSERT INTO course (name, created_date , cost)
VALUES ('php', 1563740780, 2300);
INSERT INTO course (name, created_date , cost)
VALUES ('html', 1563740800, 2000);



INSERT INTO section (name, created_date , course_id)
VALUES ('jvm', 1563741760, 1);
INSERT INTO section (name, created_date , course_id)
VALUES ('spring', 1563741780, 1);
INSERT INTO section (name, created_date , course_id)
VALUES ('IDEA', 1563741800, 1);

INSERT INTO section (name, created_date , course_id)
VALUES ('english', 1563742760, 2);
INSERT INTO section (name, created_date , course_id)
VALUES ('computer', 1563742780, 2);
INSERT INTO section (name, created_date , course_id)
VALUES ('git', 1563742800, 2);

INSERT INTO section (name, created_date , course_id)
VALUES ('notepad+', 1563741760, 3);
INSERT INTO section (name, created_date , course_id)
VALUES ('css', 1563741780, 3);
INSERT INTO section (name, created_date , course_id)
VALUES ('js', 1563741800, 3);



INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('download', 1563741760, 'some content',1);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('installing', 1563741780, 'some content',1);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('use', 1563741800, 'some content',1);

INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('spring-app', 1563742760, 'some content', 2);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('mvc', 1563742780, 'some content', 2);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('spring-boot', 1563742800, 'some content', 2);

INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('run', 1563741760, 'some content', 3);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('debug', 1563741780, 'some content', 3);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('deploy', 1563741800, 'some content', 3);

INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('read', 1563741760, 'some content', 4);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('speak', 1563741780, 'some content', 4);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('listen', 1563741800, 'some content', 4);

INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('EVM', 1563742760, 'some content', 5);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('it', 1563742780, 'some content', 5);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('www', 1563742800, 'some content', 5);

INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('git bush', 1563741760, 'some content', 6);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('cmd', 1563741780, 'some content', 6);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('rebase', 1563741800, 'some content', 6);

INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('note', 1563741760, 'some content', 7);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('use notepad', 1563741780, 'some content', 7);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('development', 1563741800, 'some content', 7);

INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('css1', 1563742760, 'some content', 8);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('css2', 1563742780, 'some content', 8);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('css3', 1563742800, 'some content', 8);

INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('js1', 1563741760, 'some content', 9);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('js2', 1563741780, 'some content', 9);
INSERT INTO lesson (name, created_date , content, section_id)
VALUES ('js3', 1563741800, 'some content', 9);



select * from course;