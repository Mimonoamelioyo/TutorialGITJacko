package tGITJacko;
/**
 * Esta clase es para un ejercicio de entornos, no tiene ningun
 * sentido
 * @author javfe
 * @version 1.0
 *
 */

public class HolaMundo {
	static int numeros[] = {34,45,98};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comentario agregado desde un cliente
		System.out.println("Hola Mundo by Jacko");
		int suma = 0;
		for(int i = 0; i < numeros.length; i++){
			System.out.println("Siguiente valor: " + numeros[i]);
			suma += i;
		}
		
		System.out.println("La suma es: " + suma);

	}

}
