
CREATE TABLE Publicaciones(
    IdPublicacion int NOT NULL AUTO_INCREMENT,
    IdAutor int NOT NULL,
    IdEtiqueta int NOT NULL,
    IdDocente int NOT NULL,
    Vistas int NOT NULL,
    Contenido varchar(255) NOT NULL,
    FechaPublicacion date NOT NULL,
    PRIMARY KEY (IdPublicacion),
    FOREIGN KEY (IdAutor) REFERENCES Autores(IdAutor),
    FOREIGN KEY (IdEtiqueta) REFERENCES Etiquetas(IdEtiqueta),
    FOREIGN KEY (IdDocente) REFERENCES Docentes(IdDocente)
);