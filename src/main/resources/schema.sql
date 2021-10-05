DROP TABLE IF EXISTS account;
CREATE TABLE account
(
    id VARCHAR(32) NOT NULL PRIMARY KEY,
    name VARCHAR(32),
    phone_number VARCHAR(32),
    pin VARCHAR(16),
    created_at DATETIME
);
INSERT INTO account (id, name, phone_number, pin, created_at) VALUES ('mb_1', 'James Han', '1231231231', '1234', CURRENT_TIMESTAMP())