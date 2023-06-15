INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '123456');
INSERT INTO tb_user (name, email, password) VALUES ('Maria',  'maria@gmail.com', '123456');


INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);


INSERT INTO tb_course(name, img_Uri,img_Gray_Uri) VALUES ('Spring Boot', 'spring-boot.png','spring-boot-gray.png');
INSERT INTO tb_course(name, img_Uri,img_Gray_Uri) VALUES ('Angular', 'angular.png','angular-gray.png');