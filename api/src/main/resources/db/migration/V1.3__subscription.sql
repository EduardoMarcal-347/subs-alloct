CREATE TABLE subscription(
        id                  UUID            PRIMARY KEY NOT NULL,
        expanse_type        varchar(25)     NOT NULL,
        company_card_id     BIGINT          NOT NULL,
        costumer_id         UUID            NOT NULL,
        created_at          TIMESTAMP       NOT NULL,
        last_modified_at    TIMESTAMP       NULL,
        deleted_at          TIMESTAMP       NULL,
        version             INT             NOT NULL,
        FOREIGN KEY (company_card_id) REFERENCES company_card(id)
)