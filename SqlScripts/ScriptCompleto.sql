CREATE DATABASE DriveLib;

USE DriveLib;

DROP TABLE IF EXISTS Alumnos;

CREATE TABLE Alumnos(
    IdAlumno int NOT NULL AUTO_INCREMENT,
    ApellidoAlumno varchar(40) NOT NULL,
    NombreAlumno varchar(40) NOT NULL,
    EmailAlumno varchar(50) NOT NULL,
    ContrasenaAlumno varchar(40) NOT NULL,
    NumeroTelefonoAlumno int,
    PRIMARY KEY(IdAlumno)
);

DROP TABLE IF EXISTS Docente;

CREATE TABLE Docentes(
    IdDocente int NOT NULL AUTO_INCREMENT,
    NombreDocente varchar(40) NOT NULL,
    ApellidoDocente varchar(40) NOT NULL,
    EmailDocente varchar(50) NOT NULL,
    ContrasenaDocente varchar(40) NOT NULL,
    Administrador bit NOT NULL,
    PRIMARY KEY (IdDocente)
);

DROP TABLE IF EXISTS Autores;

CREATE TABLE Autores (
    IdAutor int NOT NULL AUTO_INCREMENT,
    NombreAutor varchar(40) NOT NULL,
    PRIMARY KEY (IdAutor)
);

DROP TABLE IF EXISTS Publicaciones;

CREATE TABLE Publicaciones(
    IdPublicacion int NOT NULL AUTO_INCREMENT,
    IdAutor int NOT NULL,
    IdDocente int NOT NULL,
    Vistas int NOT NULL,
    Contenido varchar(255) NOT NULL,
    FechaPublicacion date NOT NULL,
    PRIMARY KEY (IdPublicacion),
    FOREIGN KEY (IdAutor) REFERENCES Autores(IdAutor),
    FOREIGN KEY (IdDocente) REFERENCES Docentes(IdDocente)
);

DROP TABLE IF EXISTS Etiquetas;

CREATE TABLE Etiquetas(
    IdEtiqueta int NOT NULL AUTO_INCREMENT,
    NombreEtiqueta varchar(40) NOT NULL,
    Descripcion varchar(255) NOT NULL,
    PRIMARY KEY (IdEtiqueta)
);

DROP TABLE IF EXISTS Clasificaciones;

CREATE TABLE Clasificaciones(
    IdClasificacion int NOT NULL AUTO_INCREMENT;
    IdEtiqueta int NOT NULL,
    IdPublicacion int NOT NULL,
    PRIMARY KEY (IdClasificacion),
    FOREIGN KEY (IdPublicacion) REFERENCES Publicaciones(IdPublicacion),
    FOREIGN KEY (IdEtiqueta) REFERENCES Etiquetas(IdEtiqueta)
);

DROP TABLE IF EXISTS Comentarios;

CREATE TABLE Comentarios(
    IdComentario int NOT NULL AUTO_INCREMENT,
    IdAlumno int NOT NULL,
    IdPublicacion int NOT NULL,
    FechaPublicacion date NOT NULL,
    PRIMARY KEY (IdComentario),
    FOREIGN KEY (IdAlumno) REFERENCES Alumnos(IdAlumno),
    FOREIGN KEY (IdPublicacion) REFERENCES Publicaciones(IdPublicacion)
);

