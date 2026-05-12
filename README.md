# 53696-Analizador

# Instructivo de uso

Para usar este programa lo primero que debe notar, es que dentro del repositorio de incluyen 4 archivos con los nombres: 

InputCorrecto1.txt
InputCorrecto2.txt
InputIncorrecto1.txt
InputIncorrecto2.txt

Estos archivos contienen texto que serán de utilidad para probar el funcionamiento del programa.
Entre las funcionalidades del programa, encontramos que nos permite comprobar la validez de ciertos inputs. Una vez validada su entrada, el programa, generará una tabla de lexemas y tokens y la traducción a JavaScript con su respectiva ejecución. 

Para poder probar la validez de un input (y obtener todas las salidas posteriores), lo primero que debe hacer es clonar el repositorio con el comando que se adjunta al final del intructivo. Luego, ejecute cd 53696-Analizador, y por último ejecute . code. Si Usd siguió los pasos correctamente deberia abrirse un folder en visual studio code. 

<img width="1918" height="1078" alt="image" src="https://github.com/user-attachments/assets/652f12ed-c5ed-46e1-93a5-cf940d861c5d" />

(con el nombre de 53696-Analizador, en mi captura se ve prueba-analizador, pero era porque cloné el repositorio con ese nombre para ver si funcionaba correctamente) 

Luego, debe copiar una de las cadenas:

<img width="221" height="121" alt="image" src="https://github.com/user-attachments/assets/d9e1bcb2-6fde-4e63-84fa-4ce913cd66b4" />

y pegarla en el archivo input.txt (es de suma importancia que se pegue en ese archivo porque sino el programa no tendrá entradas y le pedirá ingresar las cadenas de manera manual) y luego guarde los cambios (ctrl + s).

Guardados los cambios ingrese a la terminal (ctrl + j) (Instale las dependencias en caso de no tenerlas instaladas), y luego ejecute los siguientes codigos en el siguiente orden: 

1. cd "C:\Users\Usuario\53696-Analizador"
2. npm.cmd start

En caso de querer probar otra cadena, copie una diferente, copiela en el archivo input.txt,  guarde los cambios (ctrl + s) y ejecute nuevamente: 

npm.cmd start


# Para clonar el repositiorio: 

git clone https://github.com/tinojuarezz/53696-Analizador.git
