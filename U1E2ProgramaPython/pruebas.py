archivo = open("cadena de texto.txt")
cadena = archivo.read()
listareal = ["Instituto", "tecnologico", "de", "Cuautla"]
lista = []
lista = cadena.split()
back = ""

if len(listareal) != len(lista):
    print("Inices no coinciden")


for x in range(0, len(lista)):

    for i in range(0, len(listareal)):
        for j in range(0, len(lista)):
            if listareal[i] == lista[j]:
                back += lista[j] + "   "

                lista[j] = "0"

lista2 = back.split()
print("Cadena real:")
print(listareal)
print("Cadena acomodada:")
print(lista2)
