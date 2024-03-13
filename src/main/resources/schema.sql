# CREATE DATABASE basico;
DROP TABLE IF EXISTS usuario;
CREATE TABLE usuario(
                        id_usuario         int AUTO_INCREMENT,
                        login              varchar(100),
                        password           varchar(20),
                        fecha_ultimo_login date,
                        CONSTRAINT PK_usuario PRIMARY KEY (id_usuario),
                        CONSTRAINT UQ_usuario_login UNIQUE (login),
                        CONSTRAINT CK_usuario_login_non_null CHECK (login IS NOT NULL)
);