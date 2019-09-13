CREATE TABLE user (
  id    BIGINT IDENTITY NOT NULL PRIMARY KEY,
  name  VARCHAR(50),
);

CREATE INDEX idx_user_name
  ON user (name);
  
  
CREATE TABLE tweet (
  id       IDENTITY NOT NULL PRIMARY KEY,
  content  VARCHAR(500),
  userId   BIGINT,
  createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
);
  
  
CREATE TABLE follow (
  userId    BIGINT NOT NULL,
  followId BIGINT NOT NULL,
);

