/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

/**
 *
 * @author richardeuse
 */
public class RelojEjecutar {
    public static void main (String [] args){
        Reloj clock1 = new Reloj(23,35,0);
        clock1.MostrarHora();
        clock1.IncrementarHoras();
        clock1.IncrementarMinutos();
        clock1.IncrementarSegundos();
    }
}
