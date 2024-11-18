CREATE TABLE colegio (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(255) NOT NULL
);

CREATE TABLE curso (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       grado INT NOT NULL,
                       salon VARCHAR(10) NOT NULL,
                       colegio_id BIGINT NOT NULL,
                       FOREIGN KEY (colegio_id) REFERENCES colegio(id) ON DELETE CASCADE
);

CREATE TABLE profesor (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          nombre VARCHAR(255) NOT NULL
);

CREATE TABLE estudiante (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            nombre VARCHAR(255) NOT NULL
);

CREATE TABLE asignatura (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            nombre VARCHAR(255) NOT NULL,
                            profesor_id BIGINT NOT NULL,
                            curso_id BIGINT NOT NULL,
                            FOREIGN KEY (profesor_id) REFERENCES profesor(id) ON DELETE CASCADE,
                            FOREIGN KEY (curso_id) REFERENCES curso(id) ON DELETE CASCADE
);

CREATE TABLE asignatura_estudiante (
                                       asignatura_id BIGINT NOT NULL,
                                       estudiante_id BIGINT NOT NULL,
                                       PRIMARY KEY (asignatura_id, estudiante_id),
                                       FOREIGN KEY (asignatura_id) REFERENCES asignatura(id) ON DELETE CASCADE,
                                       FOREIGN KEY (estudiante_id) REFERENCES estudiante(id) ON DELETE CASCADE
);

INSERT INTO colegio (id, nombre) VALUES (1, 'El colegio del Olimpo');

INSERT INTO curso (id, grado, salon, colegio_id) VALUES (1, 10, 'A', 1);
INSERT INTO curso (id, grado, salon, colegio_id) VALUES (2, 10, 'B', 1);
INSERT INTO curso (id, grado, salon, colegio_id) VALUES (3, 11, 'A', 1);
INSERT INTO curso (id, grado, salon, colegio_id) VALUES (4, 11, 'B', 1);

INSERT INTO profesor (id, nombre) VALUES (1, 'Némesis');
INSERT INTO profesor (id, nombre) VALUES (2, 'Príapo');
INSERT INTO profesor (id, nombre) VALUES (3, 'Iris');

INSERT INTO estudiante (id, nombre) VALUES (1, 'Afrodita');
INSERT INTO estudiante (id, nombre) VALUES (2, 'Artemisa');
INSERT INTO estudiante (id, nombre) VALUES (3, 'Hefesto');
INSERT INTO estudiante (id, nombre) VALUES (4, 'Hermes');
INSERT INTO estudiante (id, nombre) VALUES (5, 'Apolo');
INSERT INTO estudiante (id, nombre) VALUES (6, 'Atenea');
INSERT INTO estudiante (id, nombre) VALUES (7, 'Hera');
INSERT INTO estudiante (id, nombre) VALUES (8, 'Hades');
INSERT INTO estudiante (id, nombre) VALUES (9, 'Ares');
INSERT INTO estudiante (id, nombre) VALUES (10, 'Dionisio');
INSERT INTO estudiante (id, nombre) VALUES (11, 'Poseidón');
INSERT INTO estudiante (id, nombre) VALUES (12, 'Zeus');

INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (1, 'Matemáticas', 1, 1);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (2, 'Matemáticas', 1, 2);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (3, 'Matemáticas', 1, 3);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (4, 'Matemáticas', 1, 4);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (5, 'Español', 2, 1);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (6, 'Español', 2, 2);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (7, 'Inglés básico', 3, 1);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (8, 'Inglés avanzado', 3, 2);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (9, 'Pre Icfes', 1, 3);
INSERT INTO asignatura (id, nombre, profesor_id, curso_id) VALUES (10, 'Pre Icfes', 1, 4);

-- Estudiantes inscritos en Matemáticas (10A, 10B, 11A, 11B)
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (1, 1);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (1, 2);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (2, 3);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (2, 4);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (3, 5);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (3, 6);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (4, 7);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (4, 8);

-- Estudiantes inscritos en Español
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (5, 9);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (6, 10);

-- Estudiantes inscritos en Inglés
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (7, 11);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (8, 12);

-- Estudiantes inscritos en Pre Icfes
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (9, 5);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (9, 6);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (10, 7);
INSERT INTO asignatura_estudiante (asignatura_id, estudiante_id) VALUES (10, 8);
