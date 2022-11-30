--hola
create database ReservasHotelAlt
use ReservasHotelAlt
create table TipoUsuario(
	idTipoUsuario int not null primary key AUTO_INCREMENT,
	tipoUsuario varchar(50) not null,
	estadoTipoUsuario int not null
);
create table DetalleUsuario(
	idDetalleUsuario int not null primary key AUTO_INCREMENT,
	nombresUsuario varchar(50) not null,
	apellidosUsuario varchar(50) not null,
	direccionUsuario varchar(150) not null,
	telefonoUsuario numeric(15) not null unique,
	fechaNacUsuario date not null
);
create table Usuario(
	idUsuario int not null primary key AUTO_INCREMENT,
	emailUsuario varchar(100) not null unique,
	contraUsuario varchar(250) not null,
	fechaRegistro date,
	idDetalleUsuario int not null,
	idTipoUsuario int not null,
	estadoUsuario int not null,
	constraint fk_detalleUsuario foreign key (idDetalleUsuario) references DetalleUsuario(idDetalleUsuario),
	constraint fk_tipoUsuario foreign key (idTipoUsuario) references TipoUsuario(idTipoUsuario)
);

create table TipoHabitacion(
	idTipoHabitacion int not null primary key AUTO_INCREMENT,
	tipoHabitacion varchar(100) not null,
	estadoTipoHabitacion int not null
);
create table EstadoHabitacion(
	idEstadoHabitacion int not null primary key AUTO_INCREMENT,
	estadoHabitacion varchar(50) not null
);
create table Habitacion(
	idHabitacion int not null primary key AUTO_INCREMENT,
	nombreHabitacion varchar(100) not null,
	pisoHabitacion int not null,
	capacidadHabitacion int not null,
	descripcionHabitacion varchar(200),
	idTipoHabitacion int not null,
	idEstadoHabitacion int not null,
	precioHabitacion decimal(18,2) not null,
	constraint fk_tipoHabitacion foreign key (idTipoHabitacion) references TipoHabitacion(idTipoHabitacion),
	constraint fk_estadoHabitacion foreign key (idEstadoHabitacion) references EstadoHabitacion(idEstadoHabitacion)
);
create table Reserva(
	idReserva int not null primary key AUTO_INCREMENT,
	idUsuario int not null,
	idHabitacion int not null,
	totalPago decimal(18,2) not null,
	fechaInicio date,
	fechaFin date,
	constraint fk_usuarioR foreign key (idUsuario) references Usuario(idUsuario),
	constraint fk_habitacionR foreign key (idHabitacion) references Habitacion(idHabitacion)
);