CREATE TABLE Publicaciones(
    IdPublicacion int NOT NULL AUTO_INCREMENT,
    IdContenido int NOT NULL,
    IdAutor int NOT NULL,
    IdEtiqueta int NOT NULL,
    PRIMARY KEY (IdPublicacion),
    FOREIGN KEY (IdAutor) REFERENCES Autores(IdAutor),
    FOREIGN KEY (IdEtiqueta) REFERENCES Etiquetas(IdEtiqueta),
    FOREIGN KEY (IdContenido) REFERENCES Contenidos(IdContenido)
);