# Pruebas-Funcionales-con-Selenium-y-xUnit
## Estrategia Utilizada: Casos de Uso 

| Escenario de Prueba | Valores de Prueba      | Resultado Esperado  |
| -------------------- | ---------------------- | -------------------- |
| Porcentaje de Valores Positivos | Numero: 50,Porcentaje 10% | Resultado: 5 |
| Porcentaje de Valores Negativos | Numero: -50, Porcentaje 10% | Resultado: -5 |
| Porcentaje de cero | Numero: 0, Porcentaje 10% | Resultado: 0 
| Porcentaje con Valores Negativos | Numero: 50, Porcentaje -10% | Resultado: -5
| Porcentaje con Valores Incognita | Numero: 50, Porcentaje x%, Valor Resultado: 5 | Resultado: 10%
| Porcentaje de Valores Incognita | Numero: x, Porcentaje 10%, Valor Resultado: 5 | Resultado: 50 |

## Resultado de ejecución de los casos de prueba por medio de xUnit:


[![Aa.png](https://i.postimg.cc/85pbdxPj/Aa.png)](https://postimg.cc/3yqpYSGT)


### Porcentaje de Valores Positivos
Valores de Prueba: Número: 50, Porcentaje: 10%
Resultado Esperado: 5
Análisis: Este escenario está diseñado para probar la funcionalidad básica de calcular un porcentaje de un número positivo. 


[![A1.png](https://i.postimg.cc/RFgLgGNG/A1.png)](https://postimg.cc/ft0dLc70)


### Porcentaje de Valores Negativos
Valores de Prueba: Número: -50, Porcentaje: 10%
Resultado Esperado: -5
Análisis: Similar al caso anterior, pero ahora se prueba con un número negativo.

[![A2.png](https://i.postimg.cc/WbCXR9SH/A2.png)](https://postimg.cc/jL6zP4pH)


### Porcentaje de Cero
Valores de Prueba: Número: 0, Porcentaje: 10%
Resultado Esperado: 0
Análisis: Este escenario prueba cómo se maneja el cálculo de un porcentaje de cero. El resultado esperado es 0.
	
[![A3.png](https://i.postimg.cc/kgSw7xpX/A3.png)](https://postimg.cc/Wd20nJVQ)


### Porcentaje con Valores Negativos
Valores de Prueba: Número: 50, Porcentaje: -10%
Resultado Esperado: -5
Análisis: Aquí se prueba cómo se manejan los porcentajes negativos. El resultado esperado es -5.

[![A4.png](https://i.postimg.cc/7Ly9hfF1/A4.png)](https://postimg.cc/WdXgfbbt)


### Porcentaje con Valores Incógnita
Valores de Prueba: Número: 50, Porcentaje: x%, Valor Resultado: 5
Resultado Esperado: 10%
Análisis: Este caso prueba cómo se maneja un porcentaje con un valor incógnito. El resultado esperado es 10%. 


[![A5.png](https://i.postimg.cc/43b59XGD/A5.png)](https://postimg.cc/2qyhpRVG)
	

### Porcentaje de Valores Incógnita
Valores de Prueba: Número: x, Porcentaje: 10%, Valor Resultado: 5
Resultado Esperado: 50
Análisis: Similar al caso anterior, pero ahora el número es desconocido. El resultado esperado es 50.


[![A6.png](https://i.postimg.cc/vTDLk9ny/A6.png)](https://postimg.cc/64JvG8zb)
