
     USE testdb;
     
     CREATE TABLE user (
		idUser		INT NOT NULL auto_increment,
        nameUser	VARCHAR(45) NULL,
        password	VARCHAR(45) NULL,
        urlImage	VARCHAR(255) NULL,
        PRIMARY KEY (idUser));
        
        SELECT*FROM user;
        
        DROP TABLE usuario;
        create table usuario(
			idUsuario	INT not null auto_increment,
			nombre		VARCHAR(20) null,
            apellido	varCHAR(20) null,
            correo		varchar(100) null,
            contrasenia	varchar(100) null, 
            nombreUsuario varchar(20) null,
            primary key (idUsuario)
        )
        
        select*from usuario;
        delete from usuario where idUsuario = 5;
        
        alter table usuario add column fotoUsuario varchar(255) null;
        
        
        CALL sp_insertar_usuario('admin','root', 'admin@admin.com',12345678, 'usuario', 'imagen');
        
        update usuario set fotoUsuario = 'imagen' where idUsuario = 1;

	

        