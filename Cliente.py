class Cliente:
    def __init__(self, nombre, apellido, edad, telefono, correo, direccion, cedula, fecha_nacimiento):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad 
        self.telefono = telefono
        self.correo = correo
        self.direccion = direccion
        self.cedula = cedula
        self.fecha_nacimiento = fecha_nacimiento

    def imprimir_datos(self):
        print(f"nombre: {self.nombre} \n Apellido: {self.apellido} \n Edad: {self.edad} \n Correo: {self.correo} \n Telefono: {self.telefono}, \n Direccion: {self.direccion} \n Cedula: {self.cedula} \n Fecha de nacimiento: {self.fecha_nacimiento}")

    def obtener_edad(self):
        dia, mes, anio = map(int, self.fecha_nacimiento.split('/'))
        edad = 2024 - anio
        return edad


C = Cliente("Luis Felipe", "Diaz Arriaga", 20, "301546685", "Lu10s89@gmail.com", "Cartagena", "10348356", "18/07/2004")



edad_cliente = C.obtener_edad()

C.imprimir_datos()

print(f"Mi nombre es {C.nombre} {C.apellido} y vivo en {C.direccion}. Tengo {edad_cliente} años de edad. Naci el {C.fecha_nacimiento}.")
