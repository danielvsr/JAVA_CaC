import java.util.Scanner;

public class datos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner entrada = new Scanner (System.in);
		String nombre ="";
		String apellido ="";
		int edad=0;
		String hobbie ="";
		String editorCodigo ="";
		String sistemaOperativo="";
		
		System.out.println("***********************************************");
		System.out.println("* Bienvenido al sistema de solicitud de datos *");
		System.out.println("***********************************************");
		System.out.println("");
	
		System.out.print("Indique su nombre: ");
		nombre=entrada.nextLine();
		System.out.print("Indique su apellido: ");
		apellido=entrada.nextLine();
		System.out.print("Indique su edad: ");
		edad=entrada.nextInt();
		entrada.nextLine();
		System.out.print("Indique su hobbie: ");
		hobbie=entrada.nextLine();
		System.out.print("Indique su editor de codigo por preferencia: ");
		editorCodigo=entrada.nextLine();
		System.out.print("Indique su sistema operativo preferido: ");
		sistemaOperativo=entrada.nextLine();

		System.out.println("");
		System.out.println("********************************************");
		System.out.println("* Los datos ingresados son los siguientes: *");
		System.out.println("********************************************");
		System.out.println("");
		System.out.println("Nombre y apellido: " + nombre + " " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Hobbie: " + hobbie);
		System.out.println("Editor de codido preferido: " + editorCodigo);
		System.out.println("Sistema operativo por preferencia: " + sistemaOperativo);
	}

}
