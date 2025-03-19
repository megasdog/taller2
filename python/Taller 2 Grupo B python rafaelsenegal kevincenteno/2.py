import math

#coordenadas del usuario
#abs= valor absoluto los numeros negativos seran positivos

x1 = abs(float(input("Ingrese x1: ")))
y1 = abs(float(input("Ingrese y1: ")))
x2 = abs(float(input("Ingrese x2: ")))
y2 = abs(float(input("Ingrese y2: ")))

#formula de la distancia 
distancia = math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)


print(f"La distancia entre los puntos es: {distancia:.2f}")
