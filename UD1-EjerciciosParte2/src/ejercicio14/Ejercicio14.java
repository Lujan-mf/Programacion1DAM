package ejercicio14;

import java.util.Scanner;
/*Un videojuego comienza con 100 puntos y 3 vidas.
 *  Modifica estas variables utilizando los operadores 
 *  +=, -=, ++ y -- para representar esta secuencia: 
 *  gana 50 puntos, pierde 20 puntos, obtiene una vida 
 *  extra y después pierde una vida. Muestra el estado final.
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer puntos = 100;
		Integer vida = 3;
		puntos +=50;
		puntos -=20;
		puntos ++100;
		puntos --70;
		System.out.println("Rdesultado Final: ");
		
		sc.close();
	}

}
//EN LA ULTIMA PAGINA HAY QUE PONER EL NIVEL DE INGLES QUE TENGAMOS