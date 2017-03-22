package tGITJacko;

public class HolaMundo {
	String nombre = "Jacko";
	int numAle = 1;
	static int datos[] = {1,2,3};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comentario agregado desde un cliente
		System.out.println("Hola Mundo by Jacko");
		System.out.println("Numeros: ");
		for(int i:datos){
			System.out.println("Numero siguiente: " + datos[i]);
		}

	}

}
