import java.util.Scanner;

public class Juego {

    private Personaje personaje;
    private Enemigo enemigo;
    private String[] ataques = {"Ataque rápido", "Ataque potente", "Ataque devastador"};
    private int[] damage = {1, 2, 3};


    public Juego(Personaje personaje, Enemigo enemigo) {
        this.personaje = personaje;
        this.enemigo = enemigo;
    }

    public void iniciar(){

        Scanner scanner = new Scanner(System.in);
        boolean continuarJuego = true;

        System.out.println("¡Bienvenidos al bosque tenebroso!");
        personaje.mostrarDetalles();

        while (personaje.getVida() > 0 && continuarJuego){

            System.out.println("Aparece un enemigo " + enemigo.getNombre() + " con " + enemigo.getVida() + " de vida");

            while (enemigo.getVida() > 0 && personaje.getVida() > 0){

                System.out.println("El enemigo ataca. ¿Quieres usar el escudo o atacar? (escudo/atacar)");
                String accion = scanner.nextLine();

                if (accion.equalsIgnoreCase("escudo")){
                    System.out.println("Usaste el escudo, no pierdes vida");
                    atacarEnemigo(scanner);
                } else if(accion.equalsIgnoreCase("atacar")){
                    personaje.recibirDanio(1);
                    System.out.println("Tenías que defenderte primero, el enemigo ataca y te quita vida, te quedan: " + personaje.getVida() + " de vida");
                    atacarEnemigo(scanner);
                }

            }
        }

    }

    private void atacarEnemigo(Scanner scanner){
        System.out.println("Ahora tienes la oportunidad de atacar");
        mostrarOpcionesDeAtaque();

        int opcionAtaque = scanner.nextInt();
        scanner.nextLine();

        if (opcionAtaque >= 1 && opcionAtaque <= ataques.length){
            int danio = damage[opcionAtaque-1];
            enemigo.recibirDanio(danio);
            System.out.println("Usaste" + ataques[opcionAtaque - 1] + ". El enemigo pierde " + danio + " de vida. La vida del enemigo restante es de:  " + enemigo.getVida());
        }

        }


    private void mostrarOpcionesDeAtaque(){
        System.out.println("Elige un ataque");
        for (int i = 0 ; i < ataques.length; i++){
            System.out.println((i + 1) + ". " + ataques[i]);
        }
    }
}
