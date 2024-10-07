/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor_Banco;


/**
 *
 * @author Camilo Gallego B
 */
public abstract class Cuenta {
    protected String numerocuenta;
    protected double saldo;
    protected Cliente titular;

    
    public Cuenta(String numerocuenta, double saldo, Cliente titular) {
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

   
    public abstract void depositar(double monto);
    public abstract void retirar(double monto);
    public abstract void cobrarComisiones();
    public abstract void cerrarMes();

    
    public String getnumerocuenta() {
        return numerocuenta;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) { 
        this.saldo = saldo;
    }

    public Cliente gettitular() {
        return titular;
    }

    
    public void mostrarInfoCuenta() {
        System.out.println("Número de cuenta: " + numerocuenta);
        System.out.println("Titular: " + titular.getnombre() + " " + titular.getapellido());
        System.out.println("documento: " + titular.getdocumento());
        System.out.println("Saldo: " + saldo);
    }

    void add(Cuenta cuenta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


class Cuentacorriente extends Cuenta {
    private static final double TASA_MANTENIMIENTO = 0.015; 
    private static final double MONTO_MINIMO_APERTURA = 200000; 

    
    public Cuentacorriente(String numerocuenta, double saldo, Cliente titular) {
        
        super(numerocuenta, saldo >= MONTO_MINIMO_APERTURA ? saldo : MONTO_MINIMO_APERTURA, titular);
    }

    
    @Override
    public void depositar(double monto) {
        saldo += monto; 
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void cobrarComisiones() {
        saldo -= saldo * TASA_MANTENIMIENTO; 
    }

    @Override
    public void cerrarMes() {
        cobrarComisiones(); 
    }

    
   }
class CuentaAhorros extends Cuenta {
    private static final double TASA_RENDIMIENTO_ANUAL = 0.022;
    
    public CuentaAhorros(String numerocuenta, double saldo, Cliente titular){
        super(numerocuenta, saldo, titular);
               
    }
    @Override
    public void depositar(double monto){
        saldo += monto;
        if(monto >= 500000 && monto < 2000000){
            saldo -= 3000 + monto *0.01;
        }else if(monto < 10000000){
            saldo -= 2000 + monto* 0.05;
        }else if(monto < 100000000){
            saldo -= monto * 0.018;
        }else{
            saldo -= monto * 0.02;
        }
        }
    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    @Override
    public void cobrarComisiones() {
        
    }
    @Override
     public void cerrarMes() {
        
        saldo += saldo * TASA_RENDIMIENTO_ANUAL / 12;
    }
    }