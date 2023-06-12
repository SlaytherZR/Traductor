# Lista de errores y defectos
## Prueba predefinida
- Entrada: 7, Salida: kanchis -- CORRECTO
- Entrada: 59. Salida: pichka chunka iskun -- CORRECTO
- Entrada: 864. Salida: pusak patsak sukta chunka chusku -- CORRECTO
- Entrada: 3201. Salida: kimsa waranka ishkay patsak shuk -- CORRECTO

## Prueba exploratoria 
- Entrada: 100, Salida: patsak -- INCORRECTO (resultado: chunka patsak)
- Entrada: 10, Salida: chunka-- INCORRECTO (resultado: chunka chunka)
- Entrada: 20, Salida: ishkay chunka -- CORRECTO

---
### Errores de codificación 
- La excepción no se completa. Es necesario colocar un *try()* para instanciar el lector de datos de entrada.

### Defectos de funcionamiento 
- Las siguientes impresiones son incorrectas. Por lo tanto, existen inconsistencia en los resultados.
	-  Entrada: 100, Salida: patsak -- INCORRECTO (resultado: chunka patsak)
	-  Entrada: 10, Salida: chunka-- INCORRECTO (resultado: chunka chunka)
	
### Defectos de usabilidad
- Navegación confusa en terminal.
- Falta de retroalimentación.
- No se presenta interfaz gráfica amigable con el usuario.

### Defectos de seguridad 
- El codigo no esta ofuscado, por lo tanto, es facil acceder al código fuente en a la hora de descompilar el ejecutable.

## Mantenimiento 
### Adaptativo 
- 
### Perfectivo 
- Colocar una interfaz más amigable.
- Devolver una mejor retroalimentación que evite que el usuario se confunda con la salida del programa.

### Aditivo
- Es posible que en futuros prototipos se pueda añadir un mayor rango de números permitidos.
- Agregar la funcionalidad de seguir ingresando numeros después de cada impresión sin tener que volver a ejecutar el programa.

### Correctivo 
- Solucionar el error en la impresión con respecto a los errores de funcionamiento. 

### Preventivo 
- Colocar el *try()* en la excepción.
