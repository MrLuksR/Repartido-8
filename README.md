# Funcionamiento del código
### Clases:
El código funciona de la siguiente manera: Se comienza con una clase padre llamada "Campeon", la cual tiene sus propios atrbutos y métodos básicos que tendrán
cada una de las clase hijas del mismo. Ataques básicos, especiales, recibir ataque, etc.
Cada clase hija es una extensión de la clase padre, a excepción de 1 atributo que tendrán como exclusividad dependiendo del modo de combate de cada personaje.
### Main:
Como primera instancia en la clase main, se crean dos arrays llamados "equipo1" y "equipo2", esto con la finalidad de guardar los objetos dentro de cada array 
para facilitar la programación del combate. Antes de llegar al combate se crea una función llamada "equipoSigueVivo" que devuelve un resultado verdadero si almenos
un personaje dentro del equipo sigue con vida. También se crea un método llamado "obtenerVivoAleatorio" que tiene como propósito seleccionar un campeon vivo al 
azar en un equipo dado.
### Combate:
El combate funciona con un bucle while condicionado a que un equipo seleccionado siga en pie. Se toma de manera aleatoria 1 numero en la variable "num" que determina
si el ataque a realizar es uno normal o especial. Se selecciona "champ1" y "champ2" para definir capeon atacante y campeon defensor, en ese orden, y luego se continua
con el combate realizando ataques hasta que el equipo quede sin campeones vivos.
