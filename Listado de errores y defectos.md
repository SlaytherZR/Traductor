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
