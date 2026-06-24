# Pseudocódigo del Programa Principal

```txt
INICIO

    MOSTRAR mensaje de bienvenida

    CREAR array DADOS de tamaño 5

    PARA i DESDE 0 HASTA 4
        DADOS[i] ← número aleatorio entre 1 y 6
    FIN PARA

    SE_QUEDA ← FALSO
    INTENTO ← 1

    MIENTRAS INTENTO ≤ 3 Y SE_QUEDA = FALSO

        MOSTRAR los 5 dados con imágenes (función mostrarDadosConImagenes)

        SI INTENTO = 3 ENTONCES
            SALIR del bucle (no se puede relanzar)
        FIN SI

        PREGUNTAR al jugador si desea relanzar dados

        SI responde "SÍ" ENTONCES

            PARA i DESDE 0 HASTA 4
                PREGUNTAR si desea relanzar el dado i
                SI responde "SÍ" ENTONCES
                    DADOS[i] ← número aleatorio entre 1 y 6
                FIN SI
            FIN PARA

            INTENTO ← INTENTO + 1

        SINO
            SE_QUEDA ← VERDADERO
        FIN SI

    FIN MIENTRAS

    LLAMAR a evaluarYAnunciarResultado(DADOS)

FIN
```

# Pseudocódigo — Mostrar Dados con Imágenes

```txt
FUNCIÓN mostrarDadosConImagenes(DADOS, INTENTO)

    CREAR array ICONOS de tamaño 5

    PARA i DESDE 0 HASTA 4
        ICONOS[i] ← cargar imagen correspondiente al valor DADOS[i]
    FIN PARA

    ARMAR mensaje con los valores de los 5 dados

    MOSTRAR ventana con el mensaje y las imágenes

FIN FUNCIÓN
```

# Pseudocódigo — Evaluación de Combinaciones

```txt
FUNCIÓN evaluarYAnunciarResultado(DADOS)

    CREAR array FREQ de tamaño 7 inicializado en 0

    PARA cada valor en DADOS
        FREQ[valor] ← FREQ[valor] + 1
    FIN PARA

    MAX_REPETIDOS ← 0
    TIENE_TRIO ← FALSO
    TIENE_PAR ← FALSO

    PARA v DESDE 1 HASTA 6
        SI FREQ[v] > MAX_REPETIDOS ENTONCES
            MAX_REPETIDOS ← FREQ[v]
        FIN SI

        SI FREQ[v] = 3 ENTONCES
            TIENE_TRIO ← VERDADERO
        FIN SI

        SI FREQ[v] = 2 ENTONCES
            TIENE_PAR ← VERDADERO
        FIN SI
    FIN PARA

    ES_ESCALERA ← 
        (FREQ[1]=1 Y FREQ[2]=1 Y FREQ[3]=1 Y FREQ[4]=1 Y FREQ[5]=1)
        O
        (FREQ[2]=1 Y FREQ[3]=1 Y FREQ[4]=1 Y FREQ[5]=1 Y FREQ[6]=1)

    CODIGO ← 0

    SI MAX_REPETIDOS = 5 ENTONCES
        CODIGO ← 5
    SINO SI MAX_REPETIDOS = 4 ENTONCES
        CODIGO ← 4
    SINO SI TIENE_TRIO Y TIENE_PAR ENTONCES
        CODIGO ← 3
    SINO SI ES_ESCALERA ENTONCES
        CODIGO ← 2
    FIN SI

    SEGÚN CODIGO HACER
        5: COMBINACION ← "GENERALA"
        4: COMBINACION ← "PÓKER"
        3: COMBINACION ← "FULL"
        2: COMBINACION ← "ESCALERA"
        OTRO: COMBINACION ← "Sin combinaciones mayores"
    FIN SEGÚN

    MOSTRAR mensaje final con los dados y la combinación obtenida

FIN FUNCIÓN
```
