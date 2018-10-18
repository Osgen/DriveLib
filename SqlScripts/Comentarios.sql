CREATE TABLE Comentarios(
    IdComentario int NOT NULL AUTO_INCREMENT,
    IdAlumno int NOT NULL,
    IdPublicacion int NOT NULL,
    FechaPublicacion date NOT NULL,
    PRIMARY KEY (IdComentario),
    FOREIGN KEY (IdAlumno) REFERENCES Alumnos(IdAlumno),
    FOREIGN KEY (IdPublicacion) REFERENCES Publicaciones(IdPublicacion)
);