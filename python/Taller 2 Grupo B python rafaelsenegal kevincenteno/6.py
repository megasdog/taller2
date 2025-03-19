
x1 = float(input("ingrese la nota 1: "))
x2 = float(input("ingrese la nota 2: "))
x3 = float(input("ingrese la nota 3: "))
x4 = float(input("ingrese la nota 4: "))
x5 = float(input("ingrese la nota 5: "))

#calcular la nota final porcentajes
nota_final = (x1 * 0.15) + (x2 * 0.20) + (x3 * 0.15) + (x4 * 0.30) + (x5 * 0.20)


print(f"nota final: {nota_final:.2f}")

#mensaje correspondiente

if nota_final < 2.0:
    print("no puede habilitar.")
    
elif nota_final < 3.0:
    print("reprobó.")
    
elif nota_final >= 4.5:
    print("felicitaciones")
    
else:
    print("aprobo.")
