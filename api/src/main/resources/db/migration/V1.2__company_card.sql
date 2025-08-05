CREATE TABLE company_card(
        id                  BIGSERIAL       PRIMARY KEY NOT NULL,
        plan_type           varchar(15)     NOT NULL,
        price               BIGINT          NOT NULL,
        company_id          UUID            NOT NULL,
        created_at          TIMESTAMP       NOT NULL,
        last_modified_at    TIMESTAMP       NULL,
        deleted_at          TIMESTAMP       NULL,
        version             INT             NOT NULL,
        FOREIGN KEY (company_id) REFERENCES company(id)
)