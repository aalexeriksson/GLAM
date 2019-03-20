CREATE TABLE TIPS (ID BIGINT AUTOINCREMENT PRIMARY KEY,
                    [CATEGORY] VARCHAR(64) NOT NULL,
                    [TYPE] VARCHAR(64) NOT NULL,
                    SUBTYPE VARCHAR(64) NULL,
                    TEXT VARCHAR(500) NULL,
                    LONGITUDE FLOAT NOT NULL,
                    LATTITUDE FLOAT NOT NULL);