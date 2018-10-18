CREATE TABLE Docentes(
    IdDocente int NOT NULL AUTO_INCREMENT,
    NombreDocente varchar(40) NOT NULL,
    ApellidoDocente varchar(40) NOT NULL,
    EmailDocente varchar(50) NOT NULL,
    ContrasenaDocente varchar(40) NOT NULL,
    Administrador bit NOT NULL,
    PRIMARY KEY (IdDocente)
);