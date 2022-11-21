CREATE TABLE test
(
    id integer NOT NULL,
    text "char",
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS test
    OWNER to postgres;