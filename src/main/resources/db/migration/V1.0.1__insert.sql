INSERT INTO user (name) VALUES ('user1');
INSERT INTO user (name) VALUES ('user2');
INSERT INTO user (name) VALUES ('user3');

INSERT INTO tweet (userId, content) VALUES ('1', 'Content from user1 - 1');
INSERT INTO tweet (userId, content) VALUES ('1', 'Content from user1 - 2');
INSERT INTO tweet (userId, content) VALUES ('2', 'Content from user2 - 1');
INSERT INTO tweet (userId, content) VALUES ('3', 'Content from user3 - 1');
INSERT INTO tweet (userId, content) VALUES ('3', 'Content from user3 - 2');
INSERT INTO tweet (userId, content) VALUES ('3', 'Content from user3 - 3');
INSERT INTO tweet (userId, content) VALUES ('3', 'Content from user3 - 4');

INSERT INTO follow (userId, followId) VALUES (2, 1);
INSERT INTO follow (userId, followId) VALUES (2, 3);
INSERT INTO follow (userId, followId) VALUES (1, 3);



