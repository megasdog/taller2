total_segundos = int(input("ingrese cantidad de segundos: "))
 
#se divide la cantidad total de segundos por 3600 porque 1 hora tiene 3600 segundos 
horas = total_segundos // 3600
 
#usamos el operador módulo % que devuelve el resto de la división anterior
resto = total_segundos % 3600

minutos = resto // 60

segundos = resto % 60

print(f"Resultado: {horas:02}:{minutos:02}:{segundos:02}")
