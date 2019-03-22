
INSERT INTO TIPS(CRIME, TEXTBOX, LOCATION, LATITUDE, LONGITUDE, DATE1, TIME1)VALUES('Theft', 'something happened', 'Västmannagatan 105B, 113 43 Stockholm, Sverige', 59.34776306152344, 18.04206085205078, '22/3/2019', '15:55:51')
INSERT INTO TIPS(CRIME, TEXTBOX, LOCATION, LATITUDE, LONGITUDE, DATE1, TIME1)VALUES('Gang member', 'something happened', 'Jagiellońska 1, 83-110 Tczew, Polen', 54.09192657470703, 18.777307510375977, '22/3/2019', '15:55:51')
INSERT INTO TIPS(CRIME, TEXTBOX, LOCATION, LATITUDE, LONGITUDE, DATE1,TIME1)VALUES('Theft', 'something happened', '38 Exchange St E, Liverpool L2 3PS, Storbritannien', 53.40837097167969, -2.991572618484497,'22/3/2019', '15:55:51')
INSERT INTO TIPS(CRIME, TEXTBOX, LOCATION, LATITUDE, LONGITUDE, DATE1,TIME1)VALUES('Theft', 'something happened', '38 Exchange St E, Liverpool L2 3PS, Storbritannien', 59.34776306152344, 18.04206085205078,'22/3/2019', '15:55:51')
INSERT INTO TIPS(CRIME, TEXTBOX, LOCATION, LATITUDE, LONGITUDE, DATE1,TIME1)VALUES('Theft', 'something happened again', 'Västmannagatan 105B, 113 43 Stockholm, Sverige', 59.34776306152344, 18.04206085205078,'22/3/2019', '15:55:51')
INSERT INTO TIPS(CRIME, TEXTBOX, LOCATION, LATITUDE, LONGITUDE, DATE1,TIME1)VALUES('Theft', 'something happened once more', 'Västmannagatan 105B, 113 43 Stockholm, Sverige', 59.34776306152344, 18.04206085205078,'22/3/2019', '15:55:51')

INSERT INTO SUSPICION (CATEGORY_OF_SUSPICION, TYPE_OF_SUSPICION, SUBTYPE_OF_SUSPICION, DETAILS, MEDIA) VALUES ('Object', 'Bag/box', null, 'I was entering my building this evening and I saw an unattended bag in the entrance', null);
INSERT INTO SUSPICION (CATEGORY_OF_SUSPICION, TYPE_OF_SUSPICION, SUBTYPE_OF_SUSPICION, DETAILS, MEDIA) VALUES ('Object', 'Vehicle', null, 'I was walking to my building this evening and I saw an unattended van in the entrance', null);
INSERT INTO SUSPICION (CATEGORY_OF_SUSPICION, TYPE_OF_SUSPICION, SUBTYPE_OF_SUSPICION, DETAILS, MEDIA) VALUES ('Person', 'irregular behavior', null, 'I was walking to my building this evening and I saw a person screaming on the street', null);
INSERT INTO SUSPICION (CATEGORY_OF_SUSPICION, TYPE_OF_SUSPICION, SUBTYPE_OF_SUSPICION, DETAILS, MEDIA) VALUES ('Person', 'gang member', null, 'I was walking to my building this evening and I saw a shady person standing in with two other people acting all secretive', null);
INSERT INTO SUSPICION (CATEGORY_OF_SUSPICION, TYPE_OF_SUSPICION, SUBTYPE_OF_SUSPICION, DETAILS, MEDIA) VALUES ('Activity', 'Theft/Burglary/Robbery', 'Theft', 'I was walking to my building this evening and I saw a shady person running, after a second, I saw a second person chassing the first', null);
INSERT INTO SUSPICION (CATEGORY_OF_SUSPICION, TYPE_OF_SUSPICION, SUBTYPE_OF_SUSPICION, DETAILS, MEDIA) VALUES ('Activity', 'Animal related', 'Animal abuse', 'I was walking to my building this evening and I saw someone hitting their dog', null);

INSERT INTO DATE_AND_LOCATION (SUSPICION_ID, REGION_ID, LONGITUTE, LATTITUTE, DATE1, TIME1) VALUES (1, 1, 59.416309, 17.911178, '22/03/2019', '15:37');
INSERT INTO DATE_AND_LOCATION (SUSPICION_ID, REGION_ID, LONGITUTE, LATTITUTE, DATE1, TIME1) VALUES (2, 1, 59.407237, 17.946988, '19/03/2019', '18:37');
INSERT INTO DATE_AND_LOCATION (SUSPICION_ID, REGION_ID, LONGITUTE, LATTITUTE, DATE1, TIME1) VALUES (3, 2, 59.851714, 17.629577, '05/02/2019', '11:37');
INSERT INTO DATE_AND_LOCATION (SUSPICION_ID, REGION_ID, LONGITUTE, LATTITUTE, DATE1, TIME1) VALUES (4, 3, 63.821175, 20.279367, '22/03/2019', '22:37');
INSERT INTO DATE_AND_LOCATION (SUSPICION_ID, REGION_ID, LONGITUTE, LATTITUTE, DATE1, TIME1) VALUES (5, 1, 59.324469, 18.068798, '15/11/2019', '14:37');
INSERT INTO DATE_AND_LOCATION (SUSPICION_ID, REGION_ID, LONGITUTE, LATTITUTE, DATE1, TIME1) VALUES (6, 1, 59.337201, 18.089130, '01/02/2019', '10:37');

INSERT INTO REGION (REGION_NAME) VALUES ('Stockholm');
INSERT INTO REGION (REGION_NAME) VALUES ('Uppsala');
INSERT INTO REGION (REGION_NAME) VALUES ('Malmå');

INSERT INTO POLICE_LOGIN (FIRST_NAME, LAST_NAME, USERNAME, PASSWORD) VALUES ('Alex', 'Schwarzenegger', 'al-beback', '1234');
INSERT INTO POLICE_LOGIN (FIRST_NAME, LAST_NAME, USERNAME, PASSWORD) VALUES ('Lucine', 'Granger', 'Luciooosa', '1234');
INSERT INTO POLICE_LOGIN (FIRST_NAME, LAST_NAME, USERNAME, PASSWORD) VALUES ('Miriam', 'Croft', 'tomb', '1234');
INSERT INTO POLICE_LOGIN (FIRST_NAME, LAST_NAME, USERNAME, PASSWORD) VALUES ('Gregory', 'mendel', 'pea', '1234');


