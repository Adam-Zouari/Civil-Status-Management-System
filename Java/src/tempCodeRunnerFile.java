"SELECT Nom, Prénom, Date_de_naissance, Lieu_de_naissance, Nombre_de_retrait_total " +
           "FROM Naissance WHERE nombre_de_retrait_total = (SELECT MIN(nombre_de_retrait_total) FROM Naissance)";