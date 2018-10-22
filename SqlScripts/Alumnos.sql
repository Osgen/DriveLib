CREATE TABLE Alumnos(
    IdAlumno int NOT NULL AUTO_INCREMENT,
    ApellidoAlumno varchar(40) NOT NULL,
    NombreAlumno varchar(40) NOT NULL,
    EmailAlumno varchar(50) NOT NULL, 
    ContrasenaAlumno varchar(40) NOT NULL,
    NumeroTelefonoAlumno int,
    PRIMARY KEY(IdAlumno)
);