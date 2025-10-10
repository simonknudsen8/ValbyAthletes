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

CREATE TABLE TashiWazaTechnique(
    TashiWazaID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
    TashiWazaName VARCHAR(25) NOT NULL,
    TashiWazaType ENUM( 'Te-waza', 
                        'Ashi-waza', 
                        'Koshi-waza', 
                        'Ma-sutemi-waza', 
                        'Yoko-sutemi-waza') NOT NULL
);


CREATE TABLE UsesTashiWaza(
    AthleteID int,
    TashiWazaID int,
    AmountUses int DEFAULT 0,
    FOREIGN KEY (AthleteID) REFERENCES Athlete(AthleteID),
    FOREIGN KEY (TashiWazaID) REFERENCES TashiWazaTechnique(TashiWazaID)
);


CREATE TABLE NeWazaTechnique(
    NeWazaID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
    NeWazaName VARCHAR(25) NOT NULL UNIQUE
);