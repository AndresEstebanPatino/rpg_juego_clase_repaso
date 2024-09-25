public class Enemigo {

    // Un objeto es una entidad que tiene atributos y comportamientos
    // Una clase es una plantilla de objetos
    // Método constructor es quien construye el objeto.

    //nombre, vida.

    private String nombre;
    private int vida;

    public Enemigo(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}

