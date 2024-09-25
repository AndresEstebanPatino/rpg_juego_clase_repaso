public class Main {

    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("lindir", "elfo", "invisivilidad", "arco y flechas", 3);

        Enemigo enemigo1 = new Enemigo("Orco", 6);

        Juego juego = new Juego(personaje1, enemigo1);
        juego.iniciar();

    }
}
