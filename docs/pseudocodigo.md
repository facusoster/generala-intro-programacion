# Pseudocódigo del Programa Principal

```txt
INICIO DEL PROGRAMA

    El juego comienza mostrando un mensaje de bienvenida al usuario.

    Se preparan cinco dados, cada uno con un valor inicial aleatorio entre 1 y 6.

    El jugador tiene hasta tres intentos para decidir si quiere relanzar alguno de los dados.
    También puede quedarse con lo que salió desde el primer momento.

    Mientras el jugador no haya decidido quedarse y todavía queden intentos:

        Se muestran los cinco dados en pantalla junto con sus imágenes correspondientes.

        Si ya estamos en el tercer intento, el jugador no puede relanzar más dados,
        así que el ciclo termina.

        En caso contrario, se le pregunta al jugador si quiere volver a tirar.

        Si el jugador acepta:
            Se revisa cada uno de los cinco dados.
            Para cada dado, se le pregunta si quiere relanzarlo.
            Si dice que sí, ese dado recibe un nuevo valor aleatorio.
            Al terminar, se pasa al siguiente intento.

        Si el jugador no quiere relanzar:
            El programa entiende que se queda con la jugada actual
            y finaliza el ciclo.

    Cuando ya no hay más intentos o el jugador decidió quedarse,
    el programa analiza la combinación obtenida y muestra el resultado final.

FIN DEL PROGRAMA
```

# Pseudocódigo — Mostrar Dados con Imágenes

```txt
FUNCIÓN mostrarDadosConImagenes(dados, intentoActual)

    Se crea una lista de imágenes, una por cada dado.

    Para cada dado:
        Se busca la imagen que corresponde al número que salió.
        Esa imagen se guarda en la lista.

    Se arma un mensaje que describe los valores actuales de los cinco dados.

    Finalmente, se muestra una ventana con el mensaje y las imágenes,
    para que el jugador vea claramente su jugada.

FIN FUNCIÓN
```

# Pseudocódigo — Evaluación de Combinaciones

```txt
FUNCIÓN evaluarYAnunciarResultado(dados)

    Se cuenta cuántas veces aparece cada número del 1 al 6.
    Esto permite saber si hay pares, tríos, póker o generala.

    También se revisa si los dados forman una escalera,
    ya sea del 1 al 5 o del 2 al 6.

    Con esa información se determina la jugada:
        - Si todos los dados son iguales → Generala
        - Si cuatro son iguales → Póker
        - Si hay un trío y un par → Full
        - Si forman una escalera → Escalera
        - Si no se cumple nada de lo anterior → Sin combinación mayor

    Una vez identificada la jugada,
    se muestra un mensaje final con los valores de los dados
    y el nombre de la combinación obtenida.

FIN FUNCIÓN
```
