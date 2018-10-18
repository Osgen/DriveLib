CREATE TABLE Docente(
    IdDocente int NOT NULL AUTO_INCREMENT,
    NombreDocente varchar(255) NOT NULL,
    ApellidoDocente varchar(255) NOT NULL,
    EmailDocente varchar(50) NOT NULL,
    ContrasenaDocente varchar(40) NOT NULL,
    PRIMARY KEY (IdDocente)
);