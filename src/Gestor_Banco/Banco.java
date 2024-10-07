/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor_Banco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Gallego B
 */
public class Banco {
    private List<Cuenta> Cuentas = new ArrayList<>();
    
    public void abrirCuenta(Cuenta cuenta){
        Cuentas.add(cuenta);
    }
    public void transferir(String numeroCuentaOrigen, String numeroCuentaDestino,double monto){
        Cuenta CuentaOrigen = BuscarCuenta(numeroCuentaOrigen);
        Cuenta CuentaDestino = BuscarCuenta(numeroCuentaDestino);
        if(CuentaOrigen != null && CuentaDestino != null){
        CuentaOrigen.retirar(monto);
        CuentaDestino.depositar(monto);
        }else{
            System.out.println("una o ambas cuentas no existen");
    }
    } 
    Cuenta BuscarCuenta(String numeroCuenta){
        for (Cuenta cuenta : Cuentas){
            if(cuenta.getnumerocuenta().equals(numeroCuenta)){
                return cuenta;
            }
        }
        return null;
    }
    public void cerrarMes(){
        for(Cuenta cuenta : Cuentas){
            cuenta.cerrarMes();
        }
    }
}

