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

INSERT INTO tb_section(title, description, position, img_Uri, resource_id , prerequiste_id) VALUES ('Aula 1', 'Descrição da aula 1', 1, 'section.jpg', 1, NULL);
INSERT INTO tb_section(title, description, position, img_Uri, resource_id , prerequiste_id) VALUES ('Aula 2', 'Descrição da aula 2', 2, 'section.jpg', 1, NULL);
INSERT INTO tb_enrollment (user_id, offer_id,enrool_Moment,refund_Moment,available,only_Update)VALUES(1, 1 , '2020-06-20T03:00:00Z', NULL, true , false);

INSERT INTO tb_lesson(position, title, section_id) VALUES (1, 'aula2', 1);
 INSERT INTO tb_content(id,text_Context,video_Uri) VALUES (1,'Conte�]', 'www.youtube.com');

INSERT INTO tb_lesson(position, title, section_id) VALUES (2, 'aula3', 2);
 INSERT INTO tb_content(id,text_Context,video_Uri) VALUES (2,'Conte�] 2', 'www.youtube.com/qwkqllçsdk');

 INSERT INTO tb_lessons_done(lesson_id,user_id,offer_id) VALUES (1,1,1);

 INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Primeiro feedback de tarefa: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-10T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Segundo feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);
INSERT INTO tb_notification (text, moment, read, route, user_id) VALUES ('Terceiro feedback: favor revisar', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', true, '/offers/1/resource/1/sections/1', 1);

INSERT INTO tb_deliver (uri, moment, status, feedback, correct_Count, lesson_id, user_id, offer_id) VALUES ('https://github.com/devsuperior/bds-dslearn', TIMESTAMP WITH TIME ZONE '2020-12-10T10:00:00Z', 0, null, null, 1, 1, 1);


INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 1', 'Corpo do tópico 1', TIMESTAMP WITH TIME ZONE '2020-12-12T13:00:00Z', 1, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 2', 'Corpo do tópico 2', TIMESTAMP WITH TIME ZONE '2020-12-13T13:00:00Z', 1, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 3', 'Corpo do tópico 3', TIMESTAMP WITH TIME ZONE '2020-12-14T13:00:00Z', 1, 1, 1);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 4', 'Corpo do tópico 4', TIMESTAMP WITH TIME ZONE '2020-12-15T13:00:00Z', 1, 1, 2);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 5', 'Corpo do tópico 5', TIMESTAMP WITH TIME ZONE '2020-12-16T13:00:00Z', 1, 1, 2);
INSERT INTO tb_topic (title, body, moment, author_id, offer_id, lesson_id) VALUES ('Título do tópico 6', 'Corpo do tópico 6', TIMESTAMP WITH TIME ZONE '2020-12-17T13:00:00Z', 1, 1, 1);

INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (1, 2);
INSERT INTO tb_topic_likes (topic_id, user_id) VALUES (2, 1);

INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Tente reiniciar o computador', TIMESTAMP WITH TIME ZONE '2020-12-15T13:00:00Z', 1, 2);
INSERT INTO tb_reply (body, moment, topic_id, author_id) VALUES ('Deu certo, valeu!', TIMESTAMP WITH TIME ZONE '2020-12-20T13:00:00Z', 1, 1);

INSERT INTO tb_reply_likes (reply_id, user_id) VALUES (1, 1);