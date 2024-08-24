CREATE TABLE IF NOT EXISTS users
(
    id           SERIAL PRIMARY KEY,
    login        VARCHAR(20)  NOT NULL,
    password     VARCHAR(255) NOT NULL,
    ipv4_address character(15),
    ipv6_address character(39),
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)