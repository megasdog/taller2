#contadores

total_numeros = 0
contador_pares = 0
contador_terminan_5 = 0

#leer numeros hasta cumplas las condiciones

while contador_pares < 100 and contador_terminan_5 < 80:

    numeros = int(input("ingrese un numero positivo: "))


    if numeros > 0:
        total_numeros += 1  # contar cada numero ingresado
        
        if numeros % 2 == 0:
            contador_pares += 1  # contar numeros pares
        
        if numeros % 10 == 5:
            contador_terminan_5 += 1  # contar numeros que terminan en 5
    else:
        print("solo se permiten numeros positivos.")

print(f"total de numeros leidos: {total_numeros}")
