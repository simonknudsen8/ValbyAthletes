DROP DATABASE IF EXISTS ValbyAthletes;
CREATE DATABASE ValbyAthletes;
USE ValbyAthletes;

CREATE TABLE User(
    UserID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
    UserName VARCHAR(25) NOT NULL UNIQUE,
    Email VARCHAR(50) NOT NULL UNIQUE,
    UserPassword VARCHAR(25) NOT NULL 
);

CREATE TABLE Athlete(
    AthleteID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
    AthleteName VARCHAR(25) NOT NULL,
    AthleteBirthday DATE,
    AthleteBelt VARCHAR(10) DEFAULT 'white',
    AthleteStance VARCHAR(6) DEFAULT 'right'
);

CREATE TABLE Technique(
    TechniqueID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
    TechniqueName VARCHAR(25) NOT NULL,
    TechniqueType ENUM( 'Te-waza', 
                        'Ashi-waza', 
                        'Koshi-waza', 
                        'Mae-sutemi-waza', 
                        'Yoko-sutemi-waza') NOT NULL
);

CREATE TABLE UsesTechnique(
    AthleteID int,
    TechniqueID int,
    AmountUses int DEFAULT 0,
    FOREIGN KEY (AthleteID) REFERENCES Athlete(AthleteID),
    FOREIGN KEY (TechniqueID) REFERENCES Technique(TechniqueID)
);