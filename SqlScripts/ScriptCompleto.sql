CREATE DATABASE DriveLib;

USE DriveLib;

DROP TABLE Alumnos;

CREATE TABLE Alumnos(
    IdAlumno int NOT NULL AUTO_INCREMENT,
    ApellidoAlumno varchar(40) NOT NULL,
    NombreAlumno varchar(40) NOT NULL,
    EmailAlumno varchar(50),
    NumeroTelefonoAlumno int,
    PRIMARY KEY(IdAlumno)
);

DROP TABLE Docente;

CREATE TABLE Docente(
    IdDocente int NOT NULL AUTO_INCREMENT,
    NombreDocente varchar(40) NOT NULL,
    ApellidoDocente varchar(40) NOT NULL,
    Administrador bit NOT NULL,
    PRIMARY KEY (IdDocente)
);

DROP TABLE Autores;

CREATE TABLE Autores (
    IdAutor int NOT NULL AUTO_INCREMENT,
    NombreAutor varchar(40) NOT NULL,
    PRIMARY KEY (IdAutor)
);

DROP TABLE Comentarios;

CREATE TABLE Comentarios(
    IdComentario int NOT NULL AUTO_INCREMENT,
    IdAlumno int NOT NULL,
    IdRepositorio int NOT NULL,
    Contenido varchar(255) NOT NULL,
    FechaPublicacion date NOT NULL,
    PRIMARY KEY (IdComentario),
    FOREIGN KEY (IdAlumno) REFERENCES Alumnos(IdAlumno),
    FOREIGN KEY (IdRepositorio) REFERENCES Repositorios(IdRepositorio)
);

DROP TABLE Etiquetas;

CREATE TABLE Etiquetas(
    IdEtiqueta int NOT NULL AUTO_INCREMENT,
    NombreEtiqueta varchar(40) NOT NULL,
    Descripcion varchar(255) NOT NULL,
    PRIMARY KEY (IdEtiqueta)
);

DROP TABLE Contenidos;
--Crear tabla contenidos

DROP TABLE Publicaciones;

CREATE TABLE Publicaciones(
    IdPublicacion int NOT NULL AUTO_INCREMENT,
    IdContenido int NOT NULL,
    IdAutor int NOT NULL,
    IdEtiqueta int NOT NULL,
    FechaPublicacion date NOT NULL,
    PRIMARY KEY (IdPublicacion),
    FOREIGN KEY (IdAutor) REFERENCES Autores(IdAutor),
    FOREIGN KEY (IdEtiqueta) REFERENCES Etiquetas(IdEtiqueta),
    FOREIGN KEY (IdContenido) REFERENCES Contenidos(IdContenido)
);

