
package SalarioVendedor;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Una compania de venta de carros usados, paga a su personal de ventas un 
salario de 1000 mensuales, mas una comision de 150 por cada carro vendido, 
mas el 5% del valor de la venta por carro. 
Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes. 
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.*/

public class SalarioVendedor {
    public static void main (String [] args){
        float valorCarro;
        float salarioFinal, comisionCinco, comisionPorCarro, promedioVenta;
        
        int carrosVendidos, salario = 1000, comision = 150;
        
        Scanner datos = new Scanner (System.in);
        
        //Clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Ingrese suma total del dinero de carros que haya vendido: ");//Monto total de los carros vendidos
        valorCarro = datos.nextFloat();
        
        System.out.println("Cuantos carros vendio este mes: "); //Cantidades de carros vendidos
        carrosVendidos = datos.nextInt();
        
        comisionCinco = (float) valorCarro * 0.05f; // comision del 5% del valor de la venta por carro
        
        comisionPorCarro = (float) comision * carrosVendidos; //kk
        
        salarioFinal = (float) salario + comisionPorCarro+ comisionCinco; //ingresos totales del vendedor
        
        promedioVenta = (float) valorCarro/carrosVendidos; //promedio del precio de cada carro vendido
        
        System.out.println("El salario mensual del empleado es: "+salario);
        
        System.out.println("Este mes el empleado logro vender: "+carrosVendidos+" carros.");
        System.out.println("Con lo cual la comision por $150 por cada carro vendido es: "+comisionPorCarro);
        System.out.println("La comision del 5% del valor de la venta por carro es: "+df.format(comisionCinco));
        System.out.println("\nEl promedio de venta de los autos es: "+df.format(promedioVenta));
        
        System.out.println("\t\t\n Los ingresos totales son: "+df.format(salarioFinal));
        
    }
}
