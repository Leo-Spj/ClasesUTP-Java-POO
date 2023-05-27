# Pogramación Orientada a Objetos

|Tipo|Descripcion|Semana|Observacion| % |
| :----: | :----: | :----: | :----: | :----: | 
| APF1 | Avance de Proyecto Final 1| 5 | Proyecto final con un avance al 30%| 10%|
|APF2| Avance de proyecto final 2| 10| Proyecto final con un avance al 50%|20%|
|TA1| Tarea academica 1|14|Trabajo investigacion: Clases persistentes con Python, C#, Scala, Resolucion de ejercicios|10%|
|APF3|Avance de proyecto final 3|15|Proyecto final con un avance al 70%|20%|
|TA2|Tarea academica 2|16|Trabajo investigacion: Clases persistentes con vase de datos en Python, C#, Scala.|10%|
|PROY| Proyecto final|18| [Proyecto final avance al 100%](https://github.com/Leo-Spj/Java-POO-UTP)|30%|

SEMANAS:
* 1s1 [Clases y Objetos](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S01_Clases%20y%20Objetos)
* 2s1 [Sobre Carga de Metodos](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S02.s1_Sobrecarga%20Medotos)
* 4s1 [Herencia](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S04.s1_Herencia)
* 4s2 [Herencia](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S04.s2_Herencia)
* 6s1 [Polimorfismo](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S06.s1_Polimorfismo%201)
* 6s2 [Polimorfismo](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S06.s1_Polimorfismo%202)
* 7s1 [Clase Abstracta](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S07.s1_ClaseAbstracta%201)
* 7s2 [Clase Abstracta](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S07.s1_ClaseAbstracta%202)
* 8s2 [Clase Interface](https://github.com/Leo-Spj/POO-java-UTP/tree/main/S08.s2_Interface)

# Resumen:

Aquí tienes una mejora del resumen:

5. **Herencia:** Se utiliza la palabra clave `extends` para que una subclase pueda acceder a los campos de la superclase. Los campos con el modificador `protected` son accesibles por las subclases. La herencia permite compartir atributos y comportamientos entre las clases.
6. **Polimorfismo:** Existen dos formas de polimorfismo. La sobrecarga de métodos se basa en tener múltiples métodos con el mismo nombre pero con diferentes parámetros. La sobrescritura de métodos en las subclases permite redefinir un método de la superclase en una subclase con el mismo nombre y parámetros.
7. **Clase Abstracta:** Se utiliza para representar conceptos generales y definir subclases más específicas. Una clase abstracta contiene al menos un método abstracto, que no tiene implementación. No se puede instanciar directamente. Se utiliza la palabra clave `abstract` al crear un método abstracto y `extends` para heredar de una clase abstracta.
8. **Interfaces:** Las interfaces son similares a las clases abstractas, pero no se pueden instanciar. Se utilizan para lograr la herencia múltiple en Java y se definen mediante la palabra clave `interface`. Las interfaces declaran métodos y variables abstractas que deben ser implementados por las clases que las utilizan. Se utiliza la palabra clave `implements` para implementar una interfaz en una clase.
9. **Genéricos:** Los genéricos en Java proporcionan flexibilidad en el tipo de datos que se utilizará en una clase o método. Se utilizan para crear clases y métodos que pueden manejar diferentes tipos de datos. Los nombres genéricos sugeridos son: E (elemento de una colección), K (clave), N (número), T (tipo) y V (valor). Los genéricos no permiten crear objetos directamente, usar arrays, sobrecargar métodos o utilizar `instanceof` con tipos genéricos. Se pueden combinar con clases abstractas. Por ejemplo, `Vivienda<S, T>` es una clase genérica y `Casa extends Vivienda<Integer, String>` es una subclase específica de `Vivienda`.
