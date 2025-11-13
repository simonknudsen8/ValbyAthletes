USE ValbyAthletes;

INSERT INTO User(UserName, Email, UserPassword)
VALUES ('admin', 'admin@valbyjudoclub.com', '123');

INSERT INTO Athlete(AthleteUserName, AthleteEmail, AthletePassword, AthleteName, AthleteBirthday, AthleteStance, AthleteBelt, AthleteWeightCategory, AthleteStatus)
VALUES  ('Simonknu', 'simon.knudsen@gmail.com', '123', 'Simon Knudsen', '2003-11-19', 'right', 'Blue', 73, 'Amateur'),
        ('Sebastianols', 'sebastian.olsen@gmail.com', '123', 'Sebastian Olsen', '2006-03-20', 'right', 'Blue', 81, 'Amateur'),
        ('Charliedeb', 'charlie.debusscher@gmail.com', '123','Charlie Debusscher', '1998-01-01', 'right', 'Brown', 90, 'Amateur'),
        ('Morganaag', 'morgan.aagaard@gmail.com', '123', 'Morgan Aagaard', '2004-04-25', 'right', 'Black', 73, 'NationalTeam');

INSERT INTO TashiWazaTechnique(TashiWazaName, TashiWazaType)
VALUES  -- Te waza
        ('Seoi-nage', 'Te-waza'),
        ('Ippon-seoi-nage', 'Te-waza'),
        ('Seoi-otoshi', 'Te-waza'),
        ('Tai-otoshi', 'Te-waza'),
        ('Kata-guruma', 'Te-waza'),
        ('Sukui-nage', 'Te-waza'),
        ('Obi-otoshi', 'Te-waza'),
        ('Uki-otoshi', 'Te-waza'),
        ('Sumi-otoshi', 'Te-waza'),
        ('Yama-arashi', 'Te-waza'),
        ('Obi-tori-gaeshi', 'Te-waza'),
        ('Morote-gari', 'Te-waza'),
        ('Kuchiki-taoshi', 'Te-waza'),
        ('Kibisu-gaeshi', 'Te-waza'),
        ('Ucih-mata-sukashi', 'Te-waza'),
        ('Ko-uchi-gaeshi', 'Te-waza'),
        -- Ashi waza
        ('De-ashi-harai','Ashi-waza'),
        ('Hiza-guruma','Ashi-waza'),
        ('Sasae-tsurikomi-ashi','Ashi-waza'),
        ('O-soto-gari','Ashi-waza'),
        ('O-uchi-gari','Ashi-waza'),
        ('Ko-soto-gari','Ashi-waza'),
        ('Ko-uchi-gari','Ashi-waza'),
        ('Okuri-ashi-harai','Ashi-waza'),
        ('Uchi-mata','Ashi-waza'),
        ('Ko-soto-gake','Ashi-waza'),
        ('Ashi-guruma','Ashi-waza'),
        ('Harai-tsurikomi-ashi','Ashi-waza'),
        ('O-guruma','Ashi-waza'),
        ('O-soto-guruma','Ashi-waza'),
        ('O-soto-otoshi','Ashi-waza'),
        ('Tsubame-gaeshi','Ashi-waza'),
        ('O-soto-gaeshi','Ashi-waza'),
        ('O-uchi-gaeshi','Ashi-waza'),
        ('Hane-goshi-gaeshi','Ashi-waza'),
        ('Harai-goshi-gaeshi','Ashi-waza'),
        ('Uchi-mata-gaeshi','Ashi-waza'),
        -- Koshi waza
        ('Uki-goshi', 'Koshi-waza'),
        ('O-goshi', 'Koshi-waza'),
        ('Koshi-guruma', 'Koshi-waza'),
        ('Tsurikomi-goshi', 'Koshi-waza'),
        ('Sode-tsurikomi-goshi', 'Koshi-waza'),
        ('Harai-goshi', 'Koshi-waza'),
        ('Tsuri-goshi', 'Koshi-waza'),
        ('Hane-goshi', 'Koshi-waza'),
        ('Utsuri-goshi', 'Koshi-waza'),
        ('Ushiro-goshi', 'Koshi-waza'),
        -- Ma sutemi waza
        ('Tomoe-nage', 'Ma-sutemi-waza'),
        ('Sumi-gaeshi', 'Ma-sutemi-waza'),
        ('Hikikomi-gaeshi', 'Ma-sutemi-waza'),
        ('Tawara-gaeshi', 'Ma-sutemi-waza'),
        ('Ura-nage', 'Ma-sutemi-waza'),
        -- Yoko-sutemi-waza
        ('Yoko-otoshi','Yoko-sutemi-waza'),
        ('Tani-otoshi','Yoko-sutemi-waza'),
        ('Hane-makikomi','Yoko-sutemi-waza'),
        ('Soto-makikomi','Yoko-sutemi-waza'),
        ('Uchi-makikomi','Yoko-sutemi-waza'),
        ('Uki-waza','Yoko-sutemi-waza'),
        ('Yoko-wakare','Yoko-sutemi-waza'),
        ('Yoko-guruma','Yoko-sutemi-waza'),
        ('Yoko-gake','Yoko-sutemi-waza'),
        ('Daki-wakare','Yoko-sutemi-waza'),
        ('O-soto-makikomi','Yoko-sutemi-waza'),
        ('Uchi-mata-makikomi','Yoko-sutemi-waza'),
        ('Harai-makikomi','Yoko-sutemi-waza'),
        ('Ko-uchi-makikomi','Yoko-sutemi-waza'),
        ('Kani-basami','Yoko-sutemi-waza'),
        ('Kawazu-gake','Yoko-sutemi-waza');
        
INSERT INTO UsesTashiWaza(AthleteID, TashiWazaID)
VALUES	-- Simons Techinques
		(1, 25),
        (1, 42),
        (1, 4),
        (1, 20),
        (1, 5);
		
		
        
        
