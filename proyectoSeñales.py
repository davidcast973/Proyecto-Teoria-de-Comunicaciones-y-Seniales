#import * from opFunciones
#import numpy as np
#import matplotlib.pyplot as plt
import matplotlib.pyplot as plt


def encuentra_origen(lista):
	i = 0
	for e in lista:
		#print("Elemento")
		#print(e)
		if(isinstance(e,str)):#si encuentra el elemento que es un string, entonces llego al origen

			break 		#sale del ciclo pues encontro la posicion del origen
		else:
			i=i+1

	return i	

def diferencia(lista1,lista2):
	diferencia = len(lista1) - len(lista2)#Diferencia del numero de elementos de cada lista
	if diferencia<0:
		diferencia = diferencia*(-1)#se vuelve positivo

	return diferencia#retorna la diferencia

def agrega_Ceros_izq(lista,num_ceros):#agregara ceros para nivelar el tamaño de las listas
	
	for i in range(0,num_ceros):#agregara la cantidad de ceros indicada
		lista.insert(0,0)
	#print ("la lista quedo:")
	#print (lista)

def agrega_Ceros_der(lista,num_ceros):#agregara ceros para nivelar el tamaño de las listas
	
	for i in range(0,num_ceros):#agregara la cantidad de ceros indicada
		lista.append(0)
	print ("la lista quedo:")
	print (lista)		

def suma_listas(lista1,lista2):

	listaFinal = []
	for i in range(0,len(lista1)):
		listaFinal.append(lista1[i]+lista2[i]) #agrega a la nueva lista la suma de las otras dos
	return listaFinal	

def resta_listas(lista1,lista2):

	listaFinal = []
	for i in range(0,len(lista1)):
		listaFinal.append(lista1[i]-lista2[i]) #agrega a la nueva lista la suma de las otras dos
	return listaFinal

def multiplica_listas(lista1,lista2):

	listaFinal = []
	for i in range(0,len(lista1)):
		listaFinal.append(lista1[i]*lista2[i]) #agrega a la nueva lista la suma de las otras dos
	return listaFinal

def getNegativosYpositivos(lista,origen):

	negativos = lista[:origen]#obtiene los negativos, todos los que estan a la izquierda del origen
	positivos = lista[origen+1:]#obtiene los positivos, todos los que estan a la derecha del origen
	return [negativos,positivos] #devuelve los resultados en una lista, en la pos 0 estan los negativos y en la pos 1 los positivos

def ingresaFuncion():
	numElementos = int(input("Ingresa el numero de elementos de la funcion "))	
	Funcion = []
	for i in range(0,numElementos):
		elemento = input("Ingresa elemento: ")
		if(elemento.find("*")!=-1):
			Funcion.append(elemento)#lo ingresa como str	
		else:
			Funcion.append(int(elemento))#lo ingresa como int
	return Funcion

	#[1,2,3,"*4",5,6]
	#[3,2,1,4,5,"*2",2,2,3]

	#def graficar():


def RealizaOperacion(cad1,cad2,codigoOp):
	print(cad1)
	print(cad2)
	
	iorigen1=encuentra_origen(cad1)
	negativos_Y_positivos_1 = getNegativosYpositivos(cad1,iorigen1) #obtiene los valores negativos y positivos de la funcion
	sNumorigen1 = cad1[iorigen1]#guarda el numero de otigen en string, pero este número tiene un * para ser identificado
	print (sNumorigen1)
	iNumorigen1 = int(sNumorigen1[1:])#guarda solo el numero(omite el *) y lo convierte a int
	
	"""
	print (iNumorigen1)
	print ("negativos y positivos de cad1")
	print (negativos_Y_positivos_1)
	"""

	iorigen2=encuentra_origen(cad2)
	negativos_Y_positivos_2 = getNegativosYpositivos(cad2,iorigen2)
	sNumorigen2 = cad2[iorigen2]#guarda el numero de origen en string
	iNumorigen2 = int(sNumorigen2[1:])#guarda solo el numero y lo convierte a int
	
	"""
	print (iNumorigen2)
	print ("negativos y positivos de cad2")
	print (negativos_Y_positivos_2)
	"""

	dif1 = diferencia(negativos_Y_positivos_1[0],negativos_Y_positivos_2[0]) #compara los negativos
	
	if(len(negativos_Y_positivos_1[0])<len(negativos_Y_positivos_2[0])):#si negativos1 es la lista más pequeña
		agrega_Ceros_izq(negativos_Y_positivos_1[0],dif1)
	else:#si negativos2 es la lista mas pequeña
		agrega_Ceros_izq(negativos_Y_positivos_2[0],dif1)

	
	print("comparando listas")
	print(negativos_Y_positivos_1[0])
	print(negativos_Y_positivos_2[0])
	

	dif2 = diferencia(negativos_Y_positivos_1[1],negativos_Y_positivos_2[1])
	if(len(negativos_Y_positivos_1[1])<len(negativos_Y_positivos_2[1])):#si negativos1 es la lista más pequeña
		agrega_Ceros_der(negativos_Y_positivos_1[1],dif2)
	else:#si negativos2 es la lista mas pequeña
		agrega_Ceros_der(negativos_Y_positivos_2[1],dif2)

	
	print("comparando listas")
	print(negativos_Y_positivos_1[1])
	print(negativos_Y_positivos_2[1])
	
	if(codigoOp == 1):
		negativosFinal = suma_listas(negativos_Y_positivos_1[0],negativos_Y_positivos_2[0])
		print("El resultado de sumar los negativos es:")
		print (negativosFinal)

		positivosFinal = suma_listas(negativos_Y_positivos_1[1],negativos_Y_positivos_2[1])
		print("El resultado de sumar los positivos es:")
		print (positivosFinal)

		origenFinal = iNumorigen1 + iNumorigen2#suma los dos numeros del origen
		print("El resultado de sumar ambos origenes es:")
		print(origenFinal)

		x2 = [-1]
		y2 = negativosFinal
		plt.scatter(x2,y2)
		x2 = [0]
		y2 = origenFinal
		plt.scatter(x2,y2)
		x2 = [1,2]
		y2 = positivosFinal
		plt.scatter(x2,y2)
		plt.show()

		negativosFinal.append("*"+str(origenFinal))#agrega el origen

		ListaFinal = negativosFinal+positivosFinal #concatena todo

		print ("el resultado final es:")
		print(ListaFinal)
	elif(codigoOp == 2):
		negativosFinal = resta_listas(negativos_Y_positivos_1[0],negativos_Y_positivos_2[0])
		print("El resultado de sumar los negativos es:")
		print (negativosFinal)

		positivosFinal = resta_listas(negativos_Y_positivos_1[1],negativos_Y_positivos_2[1])
		print("El resultado de sumar los positivos es:")
		print (positivosFinal)

		origenFinal = iNumorigen1 - iNumorigen2#resta los dos numeros del origen
		print("El resultado de sumar ambos origenes es:")
		print(origenFinal)

		x2 = [-1]
		y2 = negativosFinal
		plt.scatter(x2,y2)
		x2 = [0]
		y2 = origenFinal
		plt.scatter(x2,y2)
		x2 = [1,2]
		y2 = positivosFinal
		plt.scatter(x2,y2)
		plt.show()

		negativosFinal.append("*"+str(origenFinal))#agrega el origen

		ListaFinal = negativosFinal+positivosFinal #concatena todo

		print ("el resultado final es:")
		print(ListaFinal)
	elif(codigoOp == 3):
		negativosFinal = multiplica_listas(negativos_Y_positivos_1[0],negativos_Y_positivos_2[0])
		print("El resultado de sumar los negativos es:")
		print (negativosFinal)

		positivosFinal = multiplica_listas(negativos_Y_positivos_1[1],negativos_Y_positivos_2[1])
		print("El resultado de sumar los positivos es:")
		print (positivosFinal)

		origenFinal = iNumorigen1 * iNumorigen2#resta los dos numeros del origen
		print("El resultado de sumar ambos origenes es:")
		print(origenFinal)

		x2 = [-1]
		y2 = negativosFinal
		plt.scatter(x2,y2)
		x2 = [0]
		y2 = origenFinal
		plt.scatter(x2,y2)
		x2 = [1,2]
		y2 = positivosFinal
		plt.scatter(x2,y2)
		plt.show()

		negativosFinal.append("*"+str(origenFinal))#agrega el origen

		ListaFinal = negativosFinal+positivosFinal #concatena todo


		print ("el resultado final es:")
		print(ListaFinal)

#def reflejo(funcion):


def main():
	
	cad1 = []
	cad2 = []
	cad1 = ingresaFuncion()
	cad2 = ingresaFuncion()
	codigoOp = int(input("Ingresa el código de operacion: 1-suma 2-resta 3-Multiplicacion"))
	RealizaOperacion(cad1,cad2,codigoOp)
main()