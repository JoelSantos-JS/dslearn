INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '123456');
INSERT INTO tb_user (name, email, password) VALUES ('Maria',  'maria@gmail.com', '123456');


INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);


INSERT INTO tb_course(name, img_Uri,img_Gray_Uri) VALUES ('Spring Boot', 'spring-boot.png','spring-boot-gray.png');
INSERT INTO tb_course(name, img_Uri,img_Gray_Uri) VALUES ('Angular', 'angular.png','angular-gray.png');


INSERT INto tb_offer(edition,start_Moment,end_Moment,course_id) VALUES ('1.0', '2020-06-20T03:00:00Z', '2020-12-20T03:00:00Z', 1);

INSERT INTO tb_resource(title, description, position, img_Uri, type, offer_id) VALUES ('Video', 'Video do curso', 1, 'video.jpg',  1, 1);
INSERT INTO tb_resource(title, description, position, img_Uri, type, offer_id) VALUES ('Video2', 'Video do curso2', 1, 'video.jpg',  2, 1);