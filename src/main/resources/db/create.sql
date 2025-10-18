DROP DATABASE IF EXISTS ValbyAthletes;
CREATE DATABASE ValbyAthletes;
USE ValbyAthletes;

CREATE TABLE User(
    UserID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
    UserName VARCHAR(25) NOT NULL UNIQUE COLLATE utf8mb4_bin,
    Email VARCHAR(50) NOT NULL UNIQUE,
    UserPassword VARCHAR(25) NOT NULL COLLATE utf8mb4_bin 
);

CREATE TABLE Athlete(
    AthleteID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
    AthleteUserName VARCHAR(25) NOT NULL UNIQUE COLLATE utf8mb4_bin,
    AthleteEmail VARCHAR(50) NOT NULL UNIQUE,
    AthleteUserPassword VARCHAR(25) NOT NULL COLLATE utf8mb4_bin,
    AthleteName VARCHAR(25) NOT NULL,
    AthleteBirthday DATE,
    AthleteBelt VARCHAR(10) DEFAULT 'white',
    AthleteStance VARCHAR(6) DEFAULT 'right',
    AthleteWightCategory int, 
    AthleteStatus ENUM ('NationalTeam', 'middle', 'Amateur') DEFAULT 'Amateur' NOT NULL
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


CREATE TABLE Training(
TrainingID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
AthleteID int,
FOREIGN KEY (AthleteID) REFERENCES Athlete(AthleteID),
TrainingName VARCHAR(25),
TrainingStartTime TIME NOT NULL,
TrainingEndTime TIME NOT NULL,
TrainingDay VARCHAR(10),
TrainingDesc VARCHAR(100),
TrainingPlace VARCHAR(50)
);


CREATE TABLE Results(
ResultID int PRIMARY KEY AUTO_INCREMENT UNIQUE,
AthleteID int,
FOREIGN KEY (AthleteID) REFERENCES Athlete(AthleteID),
ResultName VARCHAR(20),
ResultDate DATE NOT NULL,
ResultPlace VARCHAR(50),
ResultPlacement VARCHAR(100) -- Need to think aobut the best data type for this one 
);


