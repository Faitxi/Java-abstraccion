package animal;

public class Perro extends Animal {// Herencia de clase superior Animal

	
		
		//"Polimorfear" o sobreescribir el metodo heredado
	
	@Override //con la anotacion @override, le decimos a Java que el metodo hacerSonido será sobreescrito
	public void hacerSonido() {
		System.out.println("El perrito ladra y hace guau");
	} //metodo hacerSonido heredado de Animal
		
	
	
	
	
	public static void main (String[]args) {
		
		
		//Generar la instancia de mi perrito
		
		//Aqui NO hay ploimorfismo, ya que instancio un animal generico y utilizo su metodo hacerSonido
		Animal Generico = new Animal (); //Genera un animal generico (abstracto)
		Generico.hacerSonido(); //Antes de la ejecucion
		
		//Generar la instancia de mi perrito
		//SI hay orolimorfismo, porque es el equivalente a decir "instancio un animal que es un perrito"
		//Referenciar primero la clase general y luego la instancia particular, permite el polimorfismo
		Animal Chilaquil = new Perro();
		Chilaquil.hacerSonido(); //polimorfismo en tiempo de ejecucion
		
		
		
		
		
		
	}//Metodo main
	


}// Cierre classe Perro
