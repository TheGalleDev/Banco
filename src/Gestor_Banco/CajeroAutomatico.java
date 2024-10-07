/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor_Banco;

/**
 *
 * @author Camilo Gallego B
 */
public class CajeroAutomatico {
    private Banco banco;
    
    public CajeroAutomatico(Banco banco){
        this.banco = banco;
    }
    
    public void RetirarDinero( String numeroCuenta, double monto, boolean esCajeroPropio){
        Cuenta cuenta = banco.BuscarCuenta(numeroCuenta);
        
        if(cuenta != null){
            cuenta.retirar(monto);
            
            if (!esCajeroPropio){
                   cuenta.retirar(4500);
            }
        }else{
            System.out.println("Cuenta no encontrada.");
        }
    }
    public void depositarDinero( String numeroCuenta, double monto){
        Cuenta cuenta = banco.BuscarCuenta(numeroCuenta);
        if (cuenta != null) {
            cuenta.depositar(monto);
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }
}
