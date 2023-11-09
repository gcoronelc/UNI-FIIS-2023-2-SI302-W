

select chr_cliecodigo codigo, vch_cliepaterno paterno,
vch_cliematerno materno, vch_clienombre nombre,
chr_cliedni dni, vch_clieciudad ciudad,
vch_cliedireccion direccion, vch_clietelefono telefono,
vch_clieemail email
from cliente
go 

select * from Empleado
go

select * from Moneda
go

select * from Asignado 
where chr_emplcodigo = '0005'
go

select * from Cuenta
go

select * from Movimiento
where chr_cuencodigo = '00400001'
go

select * from Sucursal
go

select count(1) cont from Cliente
Where chr_cliecodigo = '00001'
go

select * from Empleado
go

