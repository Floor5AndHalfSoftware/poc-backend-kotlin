CREATE TABLE RECRUITMENT.PROJECTS (
    ID SERIAL PRIMARY KEY,
    NAME VARCHAR(100),
    DESCRIPTION TEXT,
    START_DATE DATE,
    END_DATE DATE,
    RECRUITER_ID INTEGER REFERENCES RECRUITMENT.RECRUITERS(ID),
    SKILLS TEXT,
    CREATION_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);