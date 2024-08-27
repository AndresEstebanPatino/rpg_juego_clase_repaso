import java.util.Scanner;

public class Personaje {

    public static void main(String[] args) {

        //Redefinir el personaje
        //Tendremos enemigos y los atacaremos
        //Si no jugamos bien Podremos ir con mamá coco


        //1. Definición del personaje y el enemigo
        //2. Definición de los ataques
        //3. Crear una función para mostrar los ataques disponibles
        //4. Inicializar el escaner para que lea las entradas del usuario
        //5. Crear el bucle principal del juego
        //6. Acciones del enemigo y decisiones del jugador
        //7. Seleccionar ataque o posibilidad de usar el escudo
        //8. Consecuencias de no usar el escudo
        //9. Verificación de la muerte del personaje o del enemigo
        //10. Cierre del escaner

        //1. Definición del personaje.

        String raza = "Elfo";
        String nombre = "Lindir";
        String poderMagico = "Invisibilidad";
        String armas = "Arco y flechas";

        //Puntos de vida a mi personaje y al enemigo

        int vidaPersonaje = 3;
        int vidaEnemigo = 6;

        //2. Definición de los ataques

        String[] ataques = {"Ataque rápido", "Ataque potente", "Ataque devastador"};
        int[] damage = {1, 2, 3};

        //4. inicializar el escaner para que lea las entradas del usuario
        Scanner scanner = new Scanner(System.in);
        boolean continuarJuego = true;

        //5. Crear el bucle principal del juego

        while (vidaPersonaje > 0 && continuarJuego){

            System.out.println(" Bievenido al bosque tenebroso");
            System.out.println("¡Aparace un enemigo!!!!");

            //bucle para luchar con el enemigo
            while(vidaEnemigo > 0 && vidaPersonaje > 0){

                System.out.println("El enemigo te ataca!!!!");
                System.out.println("¿Quieres usar el escudo o quiere atacar (escudo/atacar):");

                String accion = scanner.nextLine();

                if (accion.equalsIgnoreCase("escudo")){

                    System.out.println("Usaste el escudo, no pierdes vida");
                    System.out.println("Ahora tienes la oportunidad de atacar");

                    //Seleccionamos el ataque
                    mostrarOpcionesDeAtaque(ataques);

                    int opcionAtaque = scanner.nextInt();
                    scanner.nextLine(); //es para limpiar la consola del texto anterior que ingresé

                    if(opcionAtaque >= 1 && opcionAtaque <= ataques.length) {

                        int danio = damage[opcionAtaque -1 ];
                        vidaEnemigo -= danio;
                        System.out.println("Usaste " + ataques[opcionAtaque - 1] + ". El enemigo pierde " + danio + " de vida. Vida del enemigo restante : " + vidaEnemigo);
                    } else {
                        System.out.println("Opción no válida. Perdiste la oportunidadde atacar");
                    }
                } else {

                    System.out.println("Opcición no válida. Pierdes la oportunidad de defenderte y atacar ");
                    continue; //Saltar al siguiente bucle
                }

                // Verficar vida nuestro personaje




            }
        }

       //mostrarOpcionesDeAtaque(ataques);
    }
    // 3. Crear función para mostrar los ataques disponibles
    public static void mostrarOpcionesDeAtaque(String[] ataques){

        System.out.println("Elige un ataque");
        // .leng== a la longitud de array
        for (int i = 0 ; i < ataques.length; i++){
            System.out.println((i + 1) + ". " + ataques[i]);
        }
        System.out.println("Opción: ");
    }

}
