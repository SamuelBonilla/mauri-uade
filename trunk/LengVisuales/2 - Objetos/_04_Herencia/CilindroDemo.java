/*
 * Created on 05/05/2006
 *
 */
package _04_Herencia;

import javax.swing.JOptionPane;

import _01_Clases_Definicion.Punto;

public class CilindroDemo {

    public static void main(String[] args) {
        Punto p = new Punto(3,5);
        float r = 5; 				 	// radio
        float a = 8; 					// altura
        Cilindro f = new Cilindro(p,r,a);
  
        System.out.println("Prisma: " + f.toString());		// método redefinido
        System.out.println("Perímetro: " + f.perimetro());	// método heredado
        System.out.println("Area: " + f.area());			// método redefinido
        System.out.println("Volumen: " + f.volumen());		// método propio
        
        
        StringBuffer buf = new StringBuffer();
        buf.append("Prisma:  ").append(f.toString());
        buf.append("\nPerímetro:  ").append(f.perimetro());
        buf.append("\nArea:  ").append(f.area());
        buf.append("\nVolumen:  ").append(f.volumen());
        JOptionPane.showMessageDialog(null,buf,"PrismaDemo",JOptionPane.PLAIN_MESSAGE);
    }
}
