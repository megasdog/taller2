x = input("usuario ingrese un dígito: ")

# Generar los números x, xx y xxx

x1 = int(x)
x2 = int(x*2)
x3 = int(x*3)

suma = x1 + x2 + x3

print(f"Números generados: {x1}, {x2}, {x3}")
print(f"Suma total: {suma}")
