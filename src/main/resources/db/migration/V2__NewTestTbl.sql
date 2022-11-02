CREATE TABLE public.test
(
    id integer NOT NULL,
    text "char",
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.test
    OWNER to postgres;