CREATE TABLE users (
    user_id BIGINT PRIMARY KEY auto_increment,
    username VARCHAR(128) UNIQUE,
    password VARCHAR(256),
    enabled BOOL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


