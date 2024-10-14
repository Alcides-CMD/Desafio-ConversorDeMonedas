Este programa es un conversor de moneda simple que permite a los usuarios convertir entre diferentes monedas. El programa consta de dos clases principales:

ConversorMoneda: Esta clase maneja la lógica de conversión de monedas.
Utiliza la API de Exchange Rate API para obtener las tasas de cambio actualizadas.
Proporciona un método convertir que realiza la conversión entre dos monedas.

MenuConversor: Esta es la clase principal que interactúa con el usuario.
Muestra un menú con opciones para diferentes conversiones de moneda.
Maneja la entrada del usuario y muestra los resultados de la conversión.

Funcionamiento del programa:
Al iniciarse, el programa crea una instancia de ConversorMoneda que obtiene las tasas de cambio actualizadas.
Muestra un menú con las siguientes opciones:

Peso Argentino a Dólar
Dólar a Peso Argentino
Peso Chileno a Dólar
Dólar a Peso Chileno
Dólar a Peso Colombiano
Peso Colombiano a Dólar
Salir

El usuario selecciona una opción ingresando un número.
Si la opción es válida, el programa solicita al usuario que ingrese la cantidad a convertir.
Si la opcion no es válida, se muestra un mensaje.
Utiliza la clase ConversorMoneda para realizar la conversión.
Muestra el resultado de la conversión al usuario.
El proceso se repite hasta que el usuario elige salir del programa.

Este conversor de moneda proporciona una interfaz simple para que los usuarios realicen conversiones entre diferentes monedas latinoamericanas y dólares estadounidenses, utilizando tasas de cambio actualizadas en tiempo real.
