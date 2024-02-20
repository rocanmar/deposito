/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentas;

/**
 *
 * @author Pablo
 */
public class Main {

    public static void main(String[] args) {
   
        operativa_cuenta(null);
    }

    private static void operativa_cuenta(Float cantidad) {
        CCuenta cuenta;
        double saldoActual;
        
        cuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
