USE ValbyAthletes;

INSERT INTO User(UserName, Email, UserPassword)
VALUES ('admin', 'admin@valbyjudoclub.com', '123');

INSERT INTO Athlete(AthleteName, AthleteBirthday, AthleteStance, AthleteBelt)
VALUES  ('Simon Knudsen', '2003-11-19', 'right', 'Blue'),
        ('Sebastian Olsen', '2006-03-20', 'right', 'Blue'),
        ('Charlie Debusscher', '1998-01-01', 'right', 'Brown'),
        ('Morgan Aagaard', '2004-04-25', 'right', 'Black');