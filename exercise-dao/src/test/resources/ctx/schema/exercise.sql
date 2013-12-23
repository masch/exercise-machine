/************************************************************************/

DROP TABLE AUTHOR IF EXISTS;

CREATE TABLE AUTHOR (
    ID INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL,
    NAME VARCHAR(40) NOT NULL,
    FIRST_NAME VARCHAR(40) NOT NULL,
    MIDDLE_NAME VARCHAR(40) NULL,
    LAST_NAME VARCHAR(50) NOT NULL,
    CONSTRAINT IDX_AUTHOR_ID PRIMARY KEY (ID)
);

/************************************************************************/

DROP TABLE BOOK IF EXISTS;

CREATE TABLE BOOK (
    ID INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL,
    NAME VARCHAR(40) NOT NULL,
    AUTHOR_ID INTEGER NOT NULL,
    CONSTRAINT IDX_BOOK_ID PRIMARY KEY (ID),
    CONSTRAINT FK_AUTHOR FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR(ID)
);

/************************************************************************/

DROP TABLE LEVEL IF EXISTS;

CREATE TABLE LEVEL (
    ID INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL,
    NAME VARCHAR(40) NOT NULL,
    CONSTRAINT IDX_LEVEL_ID PRIMARY KEY (ID)
);

/************************************************************************/

DROP TABLE EXERCISE_BASE IF EXISTS;

CREATE TABLE EXERCISE_BASE (
    ID INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL,
    NAME VARCHAR(40) NOT NULL,
    CONSTRAINT IDX_EXERCISE_BASE_ID PRIMARY KEY (ID)
);

/************************************************************************/

DROP TABLE EXERCISE_LEVEL_BASE IF EXISTS;

CREATE TABLE EXERCISE_LEVEL_BASE (
    ID INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL,
    LEVEL_ID INTEGER NOT NULL,
    EXERCISE_BASE_ID INTEGER NOT NULL,
    VELOCITY INTEGER NULL,
    CONSTRAINT IDX_EXERCISE_LEVEL_ID PRIMARY KEY (ID),
    CONSTRAINT FK_LEVEL FOREIGN KEY (LEVEL_ID) REFERENCES LEVEL(ID),
    CONSTRAINT FK_EXERCISE FOREIGN KEY (EXERCISE_BASE_ID) REFERENCES EXERCISE_BASE(ID)
);

/************************************************************************/

DROP TABLE ROUTINE_BASE IF EXISTS;

CREATE TABLE ROUTINE_BASE (
    ID INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL,
    NAME VARCHAR(40) NOT NULL,
    CONSTRAINT IDX_ROUTINE_BASE_ID PRIMARY KEY (ID)
);

/************************************************************************/

DROP TABLE ROUTINE_BASE_EXERCISE_BASE IF EXISTS;

CREATE TABLE ROUTINE_BASE_EXERCISE_BASE (
    ID INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1) NOT NULL,
    ROUTINE_BASE_ID INTEGER NOT NULL,
    EXERCISE_BASE_ID INTEGER NOT NULL
);
