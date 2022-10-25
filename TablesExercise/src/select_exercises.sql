USE codeup_test_db;
SELECT * from albums WHERE artist ="Pink Floyd" AS "Pink Floyd Albums";
SELECT release_date FROM albums WHERE artist = "Beatles";
SELECT genre FROM albums WHERE name="Nevermind";
SELECT * FROM albums WHERE release_date>1989 AND release_date<2000;
SELECT * FROM albums WHERE sales <20000000;
SELECT * FROM albums WHERE genre = "rock";