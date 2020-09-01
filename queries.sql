## Part 1: Test it with SQL

SELECT COLUMN_NAME, DATA_TYPE FROM INFORMATION_SCHEMA.COLUMN WHERE TABLE_SCHEMA = 'techjobs' AND TABLE_NAME = 'job';

## Part 2: Test it with SQL

SELECT * FROM techjobs.employer WHere location = "St. Louis City";

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT DISTINCT skill.name, skill.description FROM skill INNER JOIN  job_skills ON skill.id = job_skills.skills_id
ORDER BY skills.name;