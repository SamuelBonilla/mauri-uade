package _02_System_in;
import java.util.Scanner;

public class ScannerDemo {
	public static final Scanner INPUT = new Scanner(System.in);
	
	void iniciar(){
		System.out.println("Ingrese una linea de texto: ");
		String linea = INPUT.nextLine();
		System.out.println("Ingrese un entero: ");
		int nro = INPUT.nextInt();
		System.out.format("texto %s numero %d", linea , (nro+1));
	}
	
	public static void main(String[] args) {
		System.out.println("Scanner Demo");
		ScannerDemo demo = new ScannerDemo();
	    demo.iniciar();
	}

}
