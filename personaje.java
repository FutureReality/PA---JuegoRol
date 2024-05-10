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

	static String nombre;
    static int vida;
    static int mana;
    static int nivel;
    static int fuerza;
    static int vitalidad;
    static int agilidad;
    static int sigilo;

//Aqui se solicita el nombre del personaje al jugador
	static void nombre() {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Selcciona el nombre de personaje!");
		nombre = myObj.nextLine();

	}

//Se asignan valores por defecto al personaje
	static void estado() {

		vida = 100;
		mana = 50;
		nivel = 1;

	}

//Se ofrecen 30 puntos a repartir para los atributos
	static void atributos() {

		System.out.println("Tienese para repartir 30 puntos");
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Puntos a fuerza: ");
		fuerza = myObj.nextInt();

		System.out.println("Puntos a vitalidad: ");
		vitalidad = myObj.nextInt();
		
		System.out.println("Puntos a agilidad: ");
		agilidad = myObj.nextInt();

		System.out.println("Puntos a sigilo: ");
		sigilo = myObj.nextInt();



	}

//Llamamos a los metodos	
	public static void main(String[] args) {

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
