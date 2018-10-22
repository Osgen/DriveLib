CREATE TABLE Clasificaciones(
    IdClasificacion int NOT NULL AUTO_INCREMENT;
    IdEtiqueta int NOT NULL,
    IdPublicacion int NOT NULL,
    PRIMARY KEY (IdClasificacion),
    FOREIGN KEY (IdPublicacion) REFERENCES Publicaciones(IdPublicacion),
    FOREIGN KEY (IdEtiqueta) REFERENCES Etiquetas(IdEtiqueta)
);