CREATE TABLE recruitment.candidates (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20),
    address VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(100),
    country VARCHAR(100),
    postal_code VARCHAR(20),
    university VARCHAR(100),
    academic_degree VARCHAR(100),
    work_experience TEXT,
    skills TEXT,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);