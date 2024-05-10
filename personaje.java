import java.util.Scanner;


//{}
//clase personaje:
//	Solicitud de nombre
//		nombre_de_personaje = nombre_de_personaje;
//	Creamos estado:
//		vida = 100;
//		mana = 50;
//		nivel = 1;
//  El jugador reparte los atributos:
//		puntos_de_atributo = 30;
//		fuerza = fuerza;
//		vitalidad = vitalidad;
//		agilidad = agilidad;
//		sigilo = sigilo;


// Creamos la clase personaje
public class personaje  {


//Aqui se solicita el nombre del personaje al jugador
	static void nombre() {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Selcciona el nombre de personaje!");
		String nombre = myObj.nextLine();

	}

//Se asignan valores por defecto al personaje
	static void estado() {

		int vida = 100;
		int mana = 50;
		int nivel = 1;

	}

//Se ofrecen 30 puntos a repartir para los atributos
	static void atributos() {

		System.out.println("Tienese para repartir 30 puntos");
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Puntos a fuerza: ");
		int fuerza = myObj.nextInt();

		System.out.println("Puntos a vitalidad: ");
		int vitalidad = myObj.nextInt();
		
		System.out.println("Puntos a agilidad: ");
		int agilidad = myObj.nextInt();

		System.out.println("Puntos a sigilo: ");
		int sigilo = myObj.nextInt();


	}

//Llamamos a los metodos	
	public static void main() {

		nombre();
		estado();
		atributos();
		
		System.out.println("¿Este es tu personaje?:");
		
		System.out.println("Nombre " + nombre);
		System.out.println("Estado: VD" + vida + " MN" + mana + " NV" + nivel);
		System.out.println("Atributos:");
		System.out.println("Fuerza: " + fuerza);
		System.out.println("vitalidad: " + vitalidad);
		System.out.println("Agilidad: " + agilidad);
		System.out.println("Sigilo: " + sigilo);
		



	}
	
}
