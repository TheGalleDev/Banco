/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gestor_Banco;
import java.util.Scanner;



/**
 *
 * @author Camilo Gallego B
 */
public class Gestor_Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        CajeroAutomatico cajero = new CajeroAutomatico(banco);
        
    String continuar = "si";
    
    while(continuar.equalsIgnoreCase("si")){
      System.out.println("\n----- Bienvenido al Cajero Automático -----");
      System.out.println("1. Abrir una cuenta corriente");
      System.out.println("2. Abrir una cuenta de ahorro");
      System.out.println("3. Retirar dinero");
      System.out.println("4. Depositar dinero");
      System.out.println("5. Transferir dinero entre cuentas");
      System.out.println("6. Salir");
      System.out.print("Seleccione una opción: ");  
      
      int opcion = scanner.nextInt();
      scanner.nextLine();
      
      switch (opcion){
          case 1:
              System.out.println("Ingrese el numero de cuenta: ");
              String numeroCuentaCorriente = scanner.nextLine();
              System.out.println("ingrese el saldo inicial: (minimo $200.000)");
              double saldoCorriente = scanner.nextDouble();
              if (saldoCorriente <200000){
                  System.out.println("el saldo inicial debe ser de minimo $200.000");
                  break;
              }
              scanner.nextLine();
              System.out.println("Ingrese el nombre del titular: ");
              String nombreTitularCorriente = scanner.nextLine();
              System.out.println("Ingrese el apellido del titular: ");
              String apellidoTitularCorriente = scanner.nextLine();
              System.out.println("Ingrese su numero de documento de identificacion: ");
              String documentoTitularCorriente = scanner.nextLine();
              System.out.println("Ingrese su edad: (SI ES MENOR DE 18 NECESITA TUTOR)");
              int edadTitular = scanner.nextInt();
              Cliente clienteCorriente;
              if (edadTitular <18){
                  System.out.println("El cliente es menor de edad, se requiere de un representante mayor de edad.");
                  System.out.println("¿ Cuenta con un representante ? (1. SI 2. NO)");
                  int respuesta = scanner.nextInt();
                  scanner.nextLine();
                  
                  switch (respuesta){
                      case 1: 
                          System.out.println("Ingrese los datos del tutor o representante del cliente.");
                          System.out.println("Ingrese el nombre del representante: ");
                          String nombreRepresentante = scanner.nextLine();
                          System.out.println("Ingrese el apellido del representante: ");
                          String apellidoRepresentante = scanner.nextLine();
                          System.out.println("Ingrese el numero de documento del representante: ");
                          String documentoRepresentante = scanner.nextLine();
                          System.out.println("Ingrese la edad del representante: ");
                          int edadRepresentante = scanner.nextInt();
                          scanner.nextLine();
                          clienteCorriente = new Cliente(nombreTitularCorriente, apellidoTitularCorriente, edadTitular, documentoTitularCorriente,nombreRepresentante, apellidoRepresentante, documentoRepresentante, edadRepresentante);
                          System.out.println("Representante asignado con exito: " + nombreRepresentante + "" + apellidoRepresentante );
                          break;
                      case 2:
                          System.out.println("Lo lamentamos pero necesitamos de tu representante, te esperamos para que realices tu apertura de tu cuenta bancaria con tu representante.");
                          System.exit(0);
                          return;
                      default: 
                          System.out.println("opcion no valida.");
                          continue;
                    }
              }else{
                clienteCorriente = new Cliente(nombreTitularCorriente, apellidoTitularCorriente, edadTitular, documentoTitularCorriente);
              }
              
              Cuenta cuentaCorriente = new Cuentacorriente(numeroCuentaCorriente, saldoCorriente, clienteCorriente);
              banco.abrirCuenta(cuentaCorriente);
              System.out.println("Cuenta  abierta exitosamente.");
              
              break;
          case 2:
              System.out.println("Ingrese el numero de cuenta: ");
              String numeroCuentaAhorros = scanner.nextLine();
              System.out.println("ingrese el saldo inicial: (minimo $200.000)");
              double saldoAhorros = scanner.nextDouble();
              if (saldoAhorros <200000){
                  System.out.println("el saldo inicial debe ser de minimo $200.000");
                  break;
              }
              scanner.nextLine();
              System.out.println("Ingrese el nombre del titular: ");
              String nombreTitularAhorros = scanner.nextLine();
              System.out.println("Ingrese el apellido del titular: ");
              String apellidoTitularAhorros = scanner.nextLine();
              System.out.println("Ingrese su numero de documento de identificacion: ");
              String documentoTitularAhorros = scanner.nextLine();
              System.out.println("Ingrese su edad: (SI ES MENOR DE 18 NECESITA TUTOR)");
              int edadTitularAhorros = scanner.nextInt();
              Cliente clienteAhorros;
              if (edadTitularAhorros <18){
                  System.out.println("El cliente es menor de edad, se requiere de un representante mayor de edad.");
                  System.out.println("¿ Cuenta con un representante ? (1. SI 2. NO)");
                  int respuesta = scanner.nextInt();
                  scanner.nextLine();
              
              switch (respuesta){
                      case 1: 
                          System.out.println("Ingrese los datos del tutor o representante del cliente.");
                          System.out.println("Ingrese el nombre del representante: ");
                          String nombreRepresentanteAhorros = scanner.nextLine();
                          System.out.println("Ingrese el apellido del representante: ");
                          String apellidoRepresentanteAhorros = scanner.nextLine();
                          System.out.println("Ingrese el numero de documento del representante: ");
                          String documentoRepresentanteAhorros = scanner.nextLine();
                          System.out.println("Ingrese la edad del representante: ");
                          int edadRepresentanteAhorros = scanner.nextInt();
                          scanner.nextLine();
                          clienteAhorros = new Cliente(nombreTitularAhorros, apellidoTitularAhorros, edadTitularAhorros, documentoTitularAhorros,nombreRepresentanteAhorros, apellidoRepresentanteAhorros, documentoRepresentanteAhorros, edadRepresentanteAhorros);
                          System.out.println("Representante asignado con exito: " + nombreRepresentanteAhorros + "" + apellidoRepresentanteAhorros );
                          break;
                      case 2:
                          System.out.println("Lo lamentamos pero necesitamos de tu representante, te esperamos para que realices tu apertura de tu cuenta bancaria con tu representante.");
                          System.exit(0);
                          return;
                      default: 
                          System.out.println("opcion no valida.");
                          continue;
                    }
              }else{
                clienteAhorros = new Cliente(nombreTitularAhorros, apellidoTitularAhorros, edadTitularAhorros, documentoTitularAhorros);
              }
              
              Cuenta cuentaAhorros = new CuentaAhorros(numeroCuentaAhorros, saldoAhorros, clienteAhorros);
              banco.abrirCuenta(cuentaAhorros);
              System.out.println("Cuenta Ahorros abierta exitosamente.");
              
              break;
          case 3:
              System.out.println("ingrese el numero de cuenta: ");
              String numeroCuentaRetiro = scanner.nextLine();
              System.out.println("Ingrese el monto a retitrar: ");
              double montoRetiro = scanner.nextDouble();
              System.out.println("¿Es un cajero propio? /(SI o NO)");
              String esPropio = scanner.nextLine();
              boolean esCajeroPropio = esPropio.equalsIgnoreCase("si");
              
              cajero.RetirarDinero(numeroCuentaRetiro, montoRetiro, esCajeroPropio);
             
              break;
          case 4:
              System.out.println("Ingrese el numerod e cuienta: ");
              String numeroCuentaDeposito = scanner.nextLine();
              System.out.println("Ingrese el monto a depositar: ");
              double montoDeposito = scanner.nextDouble();
              scanner.nextLine();
              
              cajero.depositarDinero(numeroCuentaDeposito, montoDeposito);
              
              break;
          case 5 : 
              System.out.println("Ingrese el numero de la cuenta origen: ");
              String numeroCuentaOrigen = scanner.nextLine();
              System.out.println("Ingrese el numero de la cuenta destino: ");
              String numeroCuentaDestino = scanner.nextLine();
              System.out.println("Ingrese el monto a transferir: ");
              double montoTransferencia = scanner.nextDouble();
              
              banco.transferir(numeroCuentaOrigen, numeroCuentaDestino, montoTransferencia);
              
              break;
          case 6:
              System.out.println("Gracias por visitarnos te esperamos de vuelta");
              continuar = "no";
              break;
              
          default: 
              System.out.println("Opcion no valida. Por favor seleccione una opcion valida.");    
            }
        }
    }   
}
