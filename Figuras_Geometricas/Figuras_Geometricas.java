
package Figuras_Geometricas;

import java.util.Scanner;

public class Figuras_Geometricas {

    public static void main(String[] args) {

        float perimetro = 0, area, radio = 0;
        Cuadrado objCuadrado = new Cuadrado();
        objCuadrado.getcolor();
        objCuadrado.getdescr();

        Triangulo objTriangulo = new Triangulo();
        objCuadrado.getcolor();
        objCuadrado.getdescr();

        Circulo objCirculo = new Circulo();
        objCirculo.getcolor();
        objCirculo.getdescr();

        Rectangulo objRectangulo = new Rectangulo();
        objRectangulo.getcolor();
        objRectangulo.getdescr();

        System.out.println("Seleccione la opción correspondiente a la figura: " + "\n" + "1 cuadrado" + "\n" + "2 Triangulo" + "\n" + "3 Circulo" + "\n" + "4 Rectangulo");
        Scanner fg = new Scanner(System.in);
        String figura = fg.nextLine();
        if ("1".equals(figura)) {
            figura = "cuadrado";
            System.out.println("Vamos a hallar el perimetro del " + figura);
            System.out.println("Digite la medida  (en centimetros) que deseea asignar a un lado del " + figura);
            Scanner ld = new Scanner(System.in);
            String lado = ld.nextLine();
            float lad = Float.parseFloat(lado);
            perimetro = (lad * 4);
            System.out.println("El " + figura + "," + " " + "de color " + objCuadrado.getcolor() + ", " + objCuadrado.getdescr() + " "
                    + "y su perimetro es " + perimetro + " cm");
        }
        if ("2".equals(figura)) {
            figura = "triangulo";
            System.out.println("Vamos a hallar el área del " + figura);
            System.out.println("Digite la medida  (en centimetros) que deseea asignar a la base del " + figura);
            Scanner bs = new Scanner(System.in);
            String bas = bs.nextLine();
            float base = Float.parseFloat(bas);
            System.out.println("Digite la medida  (en centimetros) para la altura del " + figura);
            Scanner al = new Scanner(System.in);
            String alt = bs.nextLine();
            float altura = Float.parseFloat(alt);
            area = (base * altura) / 2;
            System.out.println("El " + figura + "," + " " + "de color " + objTriangulo.getcolor() + ", " + objTriangulo.getdescr() + " "
                    + "y su área es " + area + " cm²");
        }
        if ("3".equals(figura)) {
            figura = "circulo";
            System.out.println("Vamos a hallar el perimetro del " + figura);
            System.out.println("Digite la medida  (en centimetros) para el diametro del " + figura);
            Scanner dm = new Scanner(System.in);
            String diam = dm.nextLine();
            float diametro = Float.parseFloat(diam);
            perimetro = (float) (diametro * Math.PI);
            System.out.println("El " + figura + "," + " " + "de color " + objCirculo.getcolor() + ", " + objCirculo.getdescr() + " "
                    + "y su perimetro es " + perimetro + " cm");
        }
        if ("4".equals(figura)) {
            figura = "rectangulo";
            System.out.println("Vamos a hallar el área del " + figura);
            System.out.println("Digite la medida  (en centimetros) que desea asignar a uno de los lados cortos del " + figura);
            Scanner l1 = new Scanner(System.in);
            String lad1 = l1.nextLine();
            float lado1 = Float.parseFloat(lad1);
            System.out.println("Digite la medida  (en centimetros) que desea asignar a uno de los lados largos del " + figura);
            Scanner l2 = new Scanner(System.in);
            String lad2 = l2.nextLine();
            float lado2 = Float.parseFloat(lad2);
            area = lado2 * lado1;
            System.out.println("El " + figura + "," + " " + "de color " + objRectangulo.getcolor() + ", " + objRectangulo.getdescr() + " "
                    + "y su perimetro es " + area + " cm²");
        }
    System.out.println("Gracias");        
        
    } 

    }
