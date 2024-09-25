import java.util.Scanner;

public class Personaje {

    private String nombre;
    private String raza;
    private String poderMagico;
    private String armas;
    private int vida;

    public Personaje(String nombre, String raza, String poderMagico, String armas, int vida) {
        this.nombre = nombre;
        this.raza = raza;
        this.poderMagico = poderMagico;
        this.armas = armas;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public void recibirDanio(int danio){
        this.vida -= danio;
    }

    public boolean conSanPedro(){

        return vida <= 0;
    }

    public void mostrarDetalles(){
        System.out.println("Detalles del personaje");
        System.out.println("Nombre " + nombre);
        System.out.println("Raza " + raza);
        System.out.println("poder mágico " + poderMagico);
        System.out.println("Armas " + armas);
        System.out.println("Vida " + vida);
    }
}
