
texto = input("ingresar un texto: ")

#convertir a minusculas y eliminar espacios
texto_sin_espacio = texto.replace(" ", "")

#verificar si es un palindromo usando un ciclo

es_palindromo = True
longitud = len(texto_sin_espacio)

for x in range(longitud // 2):
    if texto_sin_espacio[x] != texto_sin_espacio[longitud - 1 - x]:
        es_palindromo = False
        break

if es_palindromo:
    print("el texto es un palindromo.")
else:
    print("el texto NO es un palindromo.")
