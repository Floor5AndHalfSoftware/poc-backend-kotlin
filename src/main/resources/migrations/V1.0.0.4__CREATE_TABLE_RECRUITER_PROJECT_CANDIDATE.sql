CREATE TABLE recruitment.recruiter_project_candidate (
    id SERIAL PRIMARY KEY,
    recruiter_id INTEGER REFERENCES recruitment.recruiters(id),
    project_id INTEGER REFERENCES recruitment.projects(id),
    candidate_id INTEGER REFERENCES recruitment.candidates(id),
    assignment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);