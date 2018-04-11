INSERT INTO USER (username, password, enabled) VALUES ('admin', '$2a$10$QvPOBMZhcsC3i2drlLeM2.AnQX3WQXXU3FYvAH8XunytRXmItonEq', true);
INSERT INTO USER (username, password, enabled) VALUES ('user', '$2a$10$U.LrY7sMQ.MLTOCmv8wtt.M5XbCzl6YE4/QjHy67oD7Wty52FG9oy', true);

INSERT INTO USER_ROLE (username, role) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO USER_ROLE (username, role) VALUES ('user', 'ROLE_USER');