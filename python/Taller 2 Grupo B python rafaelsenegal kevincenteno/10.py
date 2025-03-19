
n = int(input("ingresar el  numero n: "))
m = int(input("ingresar el  numero m: "))

if m > n:
    
    # Calcular la suma de los numeros
    
    suma = sum(range(n + 1, m))
    print(f"la suma de los numeros naturales entre {n} y {m} es: {suma}")
    
else:
    print("error: m debe ser mayor que n")
