# Documentación
Primero entendi la clase SymbolValidator. En esta parte, utilicé la pila que tenia antes para crear un algoritmo que verifica si los paréntesis y corchetes en una expresión están balanceados. 
Finalmente, hice un archivo Main.java con varios casos de prueba para imprimir los resultados en la consola.
# Gestión del Proyecto 
Para mantener todo ordenado, organicé el código con una librería para la estructura de la pila y un "handler" para ejecutar la aplicación.
Ejecuté el comando mvn clean install en la carpeta de mi librería para que Maven la instalara en mi repositorio local y así poder usarla como dependencia en mi proyecto principal.
# Errores 
Durante las pruebas, encontré un error de tipo NullPointerException. Al revisar el código, me di cuenta de que el método push fallaba cuando la pila estaba vacía porque intentaba acceder a un valor nulo. 
Corregí el código agregando una validación que revisa si el tope es nulo antes de asignar el nuevo nodo.
También tuve que ajustar las rutas en la terminal, ya que al trabajar en OneDrive, Windows se confundía con los espacios en los nombres de las carpetas.
# Ofuscación
Para proteger mi código, configuré el plugin de ProGuard en mi archivo pom.xml. Activé el perfil de ofuscación y generé el artefacto final con el comando mvn clean package -Pobfuscate.
Esto me generó un archivo JAR especial en la carpeta target que tiene el código protegido contra ingeniería inversa.
# Final
Para terminar, ejecuté mi programa ofuscado desde la terminal de PowerShell. Como el proyecto depende de mi librería externa, usé el comando java -cp para conectar ambos archivos JAR.
Confirmé que todo funciona correctamente porque la consola me mostró los resultados de true y false esperados. 
Por último, abrí el JAR en la herramienta JD-GUI y comprobé que mis variables originales habían desaparecido y ahora solo se ven letras, lo que significa que mi código está bien protegido.
