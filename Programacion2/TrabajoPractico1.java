/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class TrabajoPractico1 {
    
    public static void main(String[] args) {
    
        //Ejercicio1
        
    Scanner input= new Scanner(System.in);
    int anno;
   
    System.out.print("Ingrese el anno a corroborar bisiesto: ");
    anno = Integer.parseInt(input.nextLine());
    
        if (anno%400==0 || (anno%4==0 && anno%100!=0)) {
            System.out.print("El anno es biciesto");
            
        } else {
            System.out.print("El anno no es biciesto");
            
        }
        
        //Ejercicio2
     int num1,num2,num3;
        
        System.out.print("Ingrese el primer numero");
        num1=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero");
        num2=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el tercer numero");
        num3=Integer.parseInt(input.nextLine());
        
         if (num1>num2 && num1>num3) {
             System.out.print("El numero mayor es: " +num1 );
         } else if (num2>num3 && num2>num3) {
             System.out.print("El numero mayor es: " +num2 );
         } else {
             System.out.print("El numero mayor es: " +num3 );
         
         }
        
        //Ejercicio3
        int edad;
        
        System.out.print("Ingrese su edad");
        edad=Integer.parseInt(input.nextLine());
        
        
         if (edad<12) {
             System.out.print("Niño");
         } else if (edad>12 && edad<17) {
             System.out.print("Adolecente");
         } else if (edad>18 && edad<59) {
             System.out.print("Adulto");
         } else {
             System.out.print("Adulto mayor");
         
         }
         //Ejercicio4
         
         int precio; 
        double  precioFinal;
        String categoria;
        
        System.out.print("Ingrese el precio del producto: ");
        precio=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la categoria que corresponda (A,B,C): ");
        categoria=input.nextLine();
        
         switch (categoria) {
             case "A":
                 System.out.println("El descuento aplicado es de 10%");
                 precioFinal=(precio*0.9);
                 System.out.println("El precio final es: " +precioFinal);
                 break;
             case "B":
                 System.out.println("El descuento aplicado es de 15%");
                 precioFinal=(precio*0.85);
                 System.out.println("El precio final es: " +precioFinal);
                 break;
             case "C":
                 System.out.println("El descuento aplicado es de 20%");
                 precioFinal=(precio*0.8);
                 System.out.println("El precio final es: " +precioFinal);
                 break;
             default:
                 throw new AssertionError();
         }
     
        //Ejercicio5 
        int num,suma; 
        suma=0;
         do {
             System.out.print("Ingrese un numero (0 para terminar): ");
             num=Integer.parseInt(input.nextLine());
             if (num%2==0) {
                 suma += num;
             }
         } while (num!=0);
         
         System.out.print("La suma de los numeros pares es: " +suma);
    
    
        //Ejercicio6
         int num,positivos,negativos,ceros;
        positivos=0;
        negativos=0;
        ceros=0;
         for (int i = 0; i < 10; i++) {
             System.out.print("Ingrese un numero: ");
             num=Integer.parseInt(input.nextLine());
             if (num<0) {
                 negativos +=1;
            } else if (num==0){
                ceros +=1;
            } else {
                positivos +=1;
         }    
         }
         System.out.println("Resultados: ");
         System.out.println("Positivos: " +positivos);
         System.out.println("Negativos: " +negativos);
         System.out.println("Ceros: " +ceros);
         
         //Ejercicio7
         int nota;
         do {
             System.out.println("Ingrese una nota (0-10): ");
             nota=Integer.parseInt(input.nextLine());
             if (nota<0 || nota>10) {
                 System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");    
             }
             
         } while (nota<0 || nota>10);
         System.out.println("Nota guardad correctamente");
         
         //Ejercicio8
         
             double precio, impuesto, descuento;
        System.out.print("Ingrese el precio base del producto: ");
        precio=Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto del producto: ");
        impuesto=Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el descuento del producto: ");
        descuento=Double.parseDouble(input.nextLine());
        
        calcularPrecioFinal(impuesto, descuento, precio);
        
     }
    public static void calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
    double precioFinal;    
    precioFinal = precioBase + (precioBase*impuesto/100)-(precioBase*descuento/100);
    System.out.print("El precio final del producto es: " +precioFinal);
    }
    //Ejercicio9
    
        double precio, pesoPaquete;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precio=Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete: ");
        pesoPaquete=Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona=input.nextLine();
        
        
         calcularCostoEnvio(pesoPaquete, zona);
         calcularTotalCompra(precio,calcularCostoEnvio(pesoPaquete, zona));
        
        
     }
    public static double calcularCostoEnvio(double peso, String zona) {
    double costoDeEnvio;
    costoDeEnvio=0;
        if (zona.equalsIgnoreCase("nacional") ) {
            costoDeEnvio= (peso*5);
        } else if (zona.equalsIgnoreCase("internacional") ) {
            costoDeEnvio= (peso*10);
        }
    return costoDeEnvio;
    
    }
    public static void calcularTotalCompra(double precioProducto, double costoEnvio){
    double totalCompra;
    totalCompra= costoEnvio + precioProducto;
    
    System.out.print("El total a pagar es: " +totalCompra);

    //Ejercicio10
        int stock,venta,recibo;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stock=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        venta=Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        recibo=Integer.parseInt(input.nextLine());
        
         actualizarStock(stock, venta, recibo);
        
     }
    
    public static void actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
    int nuevoStock;
    nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
    System.out.print("El nuevo stock del producto es: " +nuevoStock);
    
    //Ejercicio11
     static double DESCUENTO_ESPECIAL=0.1; 
     int precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio=Integer.parseInt(input.nextLine());
       
         calcularDescuentoEspecial(precio);
        
        
     }
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado, precioFinal;
        descuentoAplicado= (precio*DESCUENTO_ESPECIAL);
        System.out.println("El descuento especial aplicado es: " +descuentoAplicado);
        precioFinal=precio-descuentoAplicado;
        System.out.println("El precio final con descuento es: " +precioFinal);

    //Ejercicio12
        
    
         double[] precios={199.99, 299.5, 149.75, 399, 89.99};
        
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: "+precios[i]);
        }
        precios[2]=129.99;
        System.out.println("Precios modificados:");
         for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: "+precios[i]);
         }
         //Ejercicio 13
        
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};

        mostrarPrecios(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);

    }

        public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
        return;
        }
        
       System.out.println("Precios: " +precios[indice]);
    }
    }
    
    
    
    
    
    

    
    



