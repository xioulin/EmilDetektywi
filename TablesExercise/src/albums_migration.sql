USE codeup_test_db;
CREATE TABLE albums
(
    id           INT UNSIGNED NOT NULL AUTO_INCREMENT,
    artist       VARCHAR(50),
    name         VARCHAR(50),
    release_date INT,
    sales        FLOAT,
    genre        VARCHAR(50),
    PRIMARY KEY (id)
); .