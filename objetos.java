import java.util.HashMap;


/*
{}
clase objetos:
	--variables--
	definir nombre:
		nombre = nombre;
	definir atributos objeto:
		a = a;
		b = b;
		c = c;
	descripcion del objeto:
		descripcion = descripcion;
	main:
	.
	.
	.
*/


//Los atributos de un objeto; los que vayamos a crear
public class objetos {
	
	String nombre;
	
	int armadura;
	int danyo;
	int gasto_mana;
	
	String desc;
	
}

  // Creamos instancias; algunos objetos

objetos espada = new objetos();
espada.nombre = "Espada";
espada.armadura = 0;
espada.danyo = 5;
espada.gasto_mana = 0;
espada.desc = "Una espada de toda la vida";
mapObj.put(espada.nombre, espada);

objetos armadura = new objetos();
armadura.nombre = "casco de hierro";
armadura.armadura = 5;
armadura.danyo = 0;
armadura.gasto_mana = 0;
armadura.desc = "Un casco *clonk* *clonk*";
mapObj.put(armadura.nombre, armadura);

