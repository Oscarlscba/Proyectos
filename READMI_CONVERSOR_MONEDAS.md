# Conversor de Monedas

¡Bienvenido al Conversor de Monedas! En este proyecto, construiremos un conversor de monedas que obtiene tasas de cambio de una API, maneja datos JSON y muestra las tasas de cambio al usuario.

## Tabla de Contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Créditos](#créditos)
- [Licencia](#licencia)

## Descripción

Este proyecto es un conversor de monedas que utiliza la API de Exchange Rate para obtener las tasas de cambio actualizadas. El conversor permite convertir entre varias monedas como el Peso argentino, Boliviano boliviano, Real brasileño, Peso chileno, Peso colombiano y Dólar estadounidense.

## Características

- Obtiene tasas de cambio actualizadas desde una API.
- Convierte entre múltiples monedas.
- Interfaz interactiva de línea de comandos.
- Manejo de errores para entradas no válidas.

## Requisitos

- Java 11 o superior.
- Biblioteca Gson para manejo de JSON.

## Instalación

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tu-usuario/conversor-de-monedas.git
   ├── src
## Uso
│   ├── ClienteApi.java
│   ├── ConvertidorDeMonedas.java
│   ├── Principal.java
│   └── RespuestaTasasDeCambio.java
├── README.md
└── .gitignore
ClienteApi.java: Clase que maneja la solicitud HTTP a la API de tasas de cambio.
ConvertidorDeMonedas.java: Clase principal que maneja la lógica de conversión de monedas.
Principal.java: Clase que contiene el método main para ejecutar el programa.
RespuestaTasasDeCambio.java: Clase que representa la estructura de la respuesta JSON de la API.
