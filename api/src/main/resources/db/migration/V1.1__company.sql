CREATE TABLE company(
        id                  UUID        PRIMARY KEY NOT NULL,
        name                varchar(90) NOT NULL,
        document            varchar(14) NOT NULL,
        created_at          TIMESTAMP   NOT NULL,
        last_modified_at    TIMESTAMP   NULL,
        deleted_at          TIMESTAMP   NULL,
        version             INT         NOT NULL
)