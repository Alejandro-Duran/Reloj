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
public class Reloj {
    private int segundos;
    private int minutos;
    private int horas;

    public Reloj(int horas, int minutos, int segundos) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
        public void MostrarHora (){
        System.out.println(this.horas+":"+this.minutos+":"+this.segundos);
    }
    public void IncrementarSegundos () {
        if ((segundos>=0)&&(segundos<=58)){
            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex) {

                Thread.currentThread().interrupt();

            }
            segundos ++;
            System.out.println(this.horas+":"+this.minutos+":"+this.segundos);
            IncrementarHoras();
        }
    }
    public void IncrementarMinutos () {
        if ((minutos>=0)&&(minutos<=58)&&(segundos==59)){
            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex) {

                Thread.currentThread().interrupt();

            }
            segundos++;
            segundos=0;
            minutos ++;
            System.out.println(this.horas+":"+this.minutos+":"+this.segundos);
            IncrementarSegundos();    
        }
        else{
            while (true){
                IncrementarSegundos();
            }
        }
    }
    public void IncrementarHoras () {
        if ((horas>=0)&&(horas<=22)&&(segundos==59)&&(minutos==59)){
            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex) {

                Thread.currentThread().interrupt();

            }
            segundos++;
            segundos=0;
            minutos++;
            minutos=0;
            horas ++;
            System.out.println(this.horas+":"+this.minutos+":"+this.segundos);
            IncrementarMinutos();
        }
        else if((horas==23)&&(minutos==59)&&(segundos==59)){
            try {

                Thread.sleep(1000);

            } catch (InterruptedException ex) {

                Thread.currentThread().interrupt();

            }
            segundos++;
            segundos=0;
            minutos++;
            minutos=0;
            horas++;
            horas=0;
            System.out.println(this.horas+":"+this.minutos+":"+this.segundos);
            IncrementarMinutos();
        }
        else{
            while(true){
                IncrementarMinutos();
            }
        }
    }
}
