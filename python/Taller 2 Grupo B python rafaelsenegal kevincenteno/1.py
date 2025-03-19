# formula de la energia cinetica ( Ec = 1/2*m*v^2 )
# energia cinetica en julios (Ec)
# mas en kilogramos (kg)
# velocidad en metro por segundo (m/s)

masa = float(input("ingrese la masa del objeto en (kilogramo): "))

velocidad = float(input("ingrese la velocidad del objeto en (metro/segundo): "))

energia_cinetica = 0.5 * masa * velocidad ** 2

print(f"La energia cinetica del objeto es: {energia_cinetica} julios")
