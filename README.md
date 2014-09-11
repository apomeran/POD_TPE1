POD_TPE1
========

TPE1 Programacion Objetos Distribuidos


TP - THREADS

================
Implemente un programa que escriba �hola mundo� por cada thread que se cree (cinco o seis bastan) y que indiquen el thread que imprime la linea.
Ej: �hola mundo - Thread id: xx�
Haga que cada thread espere x segundos antes de imprimir (x diferente para cada thread)
Pruebe las diferencias entre extender de la clase Thread y de implementar la interfaz Runnable. Nota alguna diferencia?

================
Implemente un programa que lance cuatro threads. Cada thread incrementar� un contador de tipo entero compartido por todos los threads 1000 veces. �Cu�l es el resultado esperado? �Cu�l es el obtenido?
Sincronice el acceso a dicha variable y pruebe nuevamente.
Utilice en vez de Int, AtomicInteger y pruebe nuevamente.

================
Implementar una aplicaci�n Productor / Consumidor de la siguiente manera:
Un Thread es el productor.
Un Thread es el consumidor. 
El productor produce strings aleatorios.
El consumidor toma los strings e imprime cuantas vocales tienen dichos strings
Realizar una re implementaci�n de la aplicaci�n con 4 Threads que producen strings y 2 Threads que consumen dichos strings.
Analizar los posibles problemas de la aplicaci�n con muchos threads siendo productores y muchos threads siendo consumidores.

================
Generar un deadlock.
Se le ocurre una soluci�n para resolverlo?

================
Realizar los puntos 1, 2 y 3 usando executors (pueden elegir el que les parezca mejor y deben explicar por qu� utilizaron el mismo)

