package engtelecom.poo;


import java.util.Random;

public class Buzz {


    // Atrubutos

    private boolean estado = true; // aberto
    private String frases [] = new String[]{"Ao infinito e além!",
            "Estamos em uma missão intergaláctica!",
            "Com o capacete retrátil, estou pronto para qualquer desafio!",
            "As asas se abrem, e a aventura começa!",
            "Laser carregado e pronto para ação!",
            "Buzz Lightyear, o brinquedo espacial mais corajoso do universo!"
    };




    // Métodos
    
    public void capaceteRetratil(boolean x){
        if (estado != x){
            System.out.println("Capacete Fechado");
        } else {
            System.out.println("Capacete Aberto");
        }
    }

    public void falarFrase(){
        Random r = new Random();
        int n = r.nextInt(frases.length);
        System.out.println(frases[n]) ;
    }

    public void disparaLaser(boolean x){
        if (estado != x){
            System.out.println("Laser descarregado");
        } else {
            System.out.println("Laser Disparado -------------- *");
        }
    }

    public void bracoArticulado(boolean x){
        if (estado != x){
            System.out.println("Braço desarticulado");
        } else {
            System.out.println("Braço Articulado");
        }
    }

    public void abreAsas(boolean x){
        if (estado != x){
            System.out.println("Asas Fechadas");
        } else {
            System.out.println("Asas Abertas");
        }
    }

}
