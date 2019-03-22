CREATE TABLE TIPS(ID BIGINT AUTO_INCREMENT PRIMARY KEY,
                  CRIME VARCHAR(64) NOT NULL,
                  TEXTBOX VARCHAR(64),
                  LOCATION VARCHAR(64)
                      );

--New tables, see documentation for further details--
CREATE TABLE SUSPICION(ID BIGINT AUTO_INCREMENT PRIMARY KEY,
                       DATE_AND_LOCATION_ID BIGINT NOT NULL,
                       CATEGORY_OF_SUSPISION VARCHAR(64) NOT NULL,
                       TYPE_OF_SUSPICION VARCHAR(64) NOT NULL,
                       SUBTYPE_OF_SUSPICION VARCHAR(64),
                       DETAILS VARCHAR(500),
                       MEDIA VARCHAR(200)
                       );

CREATE TABLE DATA_AND_LOCATION(ID BIGINT AUTO_INCREMENT PRIMARY KEY,
                               SUSPISION_ID BIGINT NOT NULL,
                               REGION_ID BIGINT NOT NULL,
                               LONGITUTE FLOAT NOT NULL,
                               LATTITUTE FLOAT NOT NULL,
                               [DATE] DATE NOT NULL,
                               [TIME] TIME NOT NULL,
                               );

CREATE TABLE REGION(ID BIGINT AUTO_INCREMENT PRIMARY KEY,
                    REGION_NAME VARCHAR(100) NOT  NULL
                    );

CREATE TABLE POLICE_LOGIN(ID BIGINT AUTO_INCREMENT PRIMARY KEY,
                          FIRST_NAME VARCHAR(64) NOT NULL,
                          LAST_NAME VARCHAR(64) NOT NULL,
                          USERNAME VARCHAR(64) NOT NULL,
                          PASSWORD VARCHAR(64) NOT NULL
                          );

CREATE TABLE CONNECTION_TABLE(ID BIGINT AUTO_INCREMENT PRIMARY KEY,
                              SUSPICION_ID BIGINT NOT NULL,
                              DATE_AND_LOCATION_ID BIGINT NOT NULL,
                              )

