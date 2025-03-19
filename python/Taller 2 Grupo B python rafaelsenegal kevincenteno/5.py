
numero = int(input("ingrese un numero: "))

# Verificar si es par o impar
if numero % 2 == 0:
    if numero > 0:
        print("el numero es par-positivo")
    elif numero < 0:
        print("el numero es par-negativo")
    else:
        print("el numero es cero que es par pero no positivo ni negativo")
else:
    if numero > 0:
        print("el numero es impar-positivo")
    else:
        print("el número es impar-negativo")
