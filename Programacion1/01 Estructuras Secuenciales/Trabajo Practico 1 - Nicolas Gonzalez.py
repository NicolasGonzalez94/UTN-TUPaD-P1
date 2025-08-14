
#Ejercicio 10
n1=int(input("Ingrese el primer numero: "))
n2=int(input("Ingrese el segundo numero: "))
n3=int(input("Ingrese el tercer numero: "))
promedio = (n1+n2+n3)/3
print(f"el promedio de {n1} - {n2} - {n3} es: {promedio}")
#Ejercicio 9 
temp=int(input("Ingrese el la temperatura en celsius para convertir a fahrenheit: "))
fahr=(9/5)*temp+32
print(f"la temperatura en fahrenheit es: {fahr}" )
#Ejercicio 8
peso=int(input("Ingrese su peso en kg: "))
altura=float(input("Ingrese su altura en M: "))
imc=peso/(altura*altura)
print(f"su IMC es: {imc}")
#Ejercicio 7
num1 = int(input("Por favor, ingrese el primer numero:"))
num2 = int(input("Por favor, ingrese el segundo numero:"))
num1 != 0
num2 != 0
suma = num1 + num2
resta = num1 - num2
multi = num1 * num2
div = num1 / num2
print(f"La suma entre {num1} + {num2} = {suma}")
print(f"La resta entre {num1} - {num2} = {resta}")
print(f"La multiplicacion entre {num1} * {num2} = {multi} ")
print(f"La division entre {num1} / {num2} = {div} ")
#Ejercicio 6
numero = int(input("Por favor, ingrese un numero:"))
print(f"Tabla de multiplicar del {numero}:")
for i in range(1, 11):
    resultado = numero * i
    print(f"{numero} x {i} = {resultado}")
#Ejercicio 5
Segundos = float(input("Por favor, ingrese una cantidad de segundos:"))
Horas = Segundos / 3600
print(f"La cantidad de segundo ingresados equivale a {Horas} horas")
#Ejercicio 4
Radio = float(input("Por favor, ingrese el radio del círculo:"))
Pi = 3.14159
Area = Pi * Radio * Radio
Perimetro = 2 * Pi * Radio
print(f"El área del círculo es de {Area} y el perímetro es de {Perimetro}")
#Ejercicio 3
nombre = input("Por favor, ingrese su nombre:")
apellido = input("Por favor, ingrese su apellido:")
edad = input("Por favor, ingrese su edad:")
Residencia = input("Por favor, ingrese su lugar de residencia:")
print(f"Soy "+nombre+" "+apellido+", tengo "+edad+" años y vivo en "+Residencia)
#Ejercicio 2
nombre = input("Por favor, ingrese su nombre: ")
print(f"Hola " +nombre+ "!")
#Ejercicio 1
print("hola mundo!")
