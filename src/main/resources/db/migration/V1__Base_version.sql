BEGIN;

CREATE TABLE IF NOT EXISTS users
(
    id_user integer NOT NULL,
    login "char" NOT NULL,
    password "char" NOT NULL,
    is_admin boolean NOT NULL DEFAULT false,
    PRIMARY KEY (id_user)
);

CREATE TABLE IF NOT EXISTS products
(
    id_product integer NOT NULL,
    id_subcategory integer NOT NULL,
    name "char" NOT NULL,
    description "char" NOT NULL,
    price numeric NOT NULL,
    quantity integer NOT NULL,
    PRIMARY KEY (id_product)
);

CREATE TABLE IF NOT EXISTS categories
(
    id_category integer NOT NULL,
    name "char" NOT NULL,
    PRIMARY KEY (id_category)
);

CREATE TABLE IF NOT EXISTS subcategories
(
    id_subcategory integer NOT NULL,
    id_category integer NOT NULL,
    name "char" NOT NULL,
    PRIMARY KEY (id_subcategory)
);

ALTER TABLE IF EXISTS products
    ADD CONSTRAINT fk_subcategory FOREIGN KEY (id_subcategory)
    REFERENCES subcategories (id_subcategory) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;


ALTER TABLE IF EXISTS subcategories
    ADD CONSTRAINT fk_category FOREIGN KEY (id_category)
    REFERENCES categories (id_category) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;

END;