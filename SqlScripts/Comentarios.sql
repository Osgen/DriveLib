CREATE TABLE Comentarios(
    IdComentario int NOT NULL AUTO_INCREMENT,
    IdAlumno int NOT NULL,
    IdRepositorio int NOT NULL,
    Contenido varchar(255) NOT NULL,
    Fecha date NOT NULL,
    PRIMARY KEY (IdComentario),
    FOREIGN KEY (IdAlumno) REFERENCES Alumnos(IdAlumno),
    FOREIGN KEY (IdRepositorio) REFERENCES Repositorios(IdRepositorio)
);