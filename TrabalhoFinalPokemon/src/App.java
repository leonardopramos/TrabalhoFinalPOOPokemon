import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pokemon p1 = new Pokemon(2000, 300, "Charizard", TiposPokemon.FOGO());
        Pokemon p2 = new Pokemon(2000, 200, "Arcanine", TiposPokemon.FOGO());
        Pokemon p3 = new Pokemon(3000, 100, "Flareon", TiposPokemon.FOGO());
        Pokemon p4 = new Pokemon(4000, 75, "Blastoise", TiposPokemon.AGUA());
        Pokemon p5 = new Pokemon(2000, 100, "Gyarados", TiposPokemon.AGUA());
        Pokemon p6 = new Pokemon(1000, 400, "Golduck", TiposPokemon.AGUA());
        Pokemon p7 = new Pokemon(1500, 350, "Venusaur", TiposPokemon.PLANTA());
        Pokemon p8 = new Pokemon(2500, 150, "Victreebell", TiposPokemon.PLANTA());
        Pokemon p9 = new Pokemon(5000, 50, "Beedrill", TiposPokemon.PLANTA());


        Scanner sc = new Scanner(System.in);
        int numeroRodadas = 3;

        Random r = new Random();
        Random rr = new Random();
        int r1 = r.nextInt(1,10);
        int r2 = rr.nextInt(1, 10);
        Pokemon j1 = null;
        Pokemon j2 = null;

        if(r1 == 1){
            j1 = p1;
        }
        if(r1 == 2){
            j1 = p2;
        }
        if(r1 == 3){
            j1 = p3;
        }
        if(r1 == 4){
            j1 = p4;
        }
        if(r1 == 5){
            j1 = p5;
        }
        if(r1 == 6){
            j1 = p6;
        }
        if(r1 == 7){
            j1 = p7;
        }
        if(r1 == 8){
            j1 = p8;
        }
        if(r1 == 9){
            j1 = p9;
        }

        if(r2 == 1){
            j2 = p1;
        }
        if(r2 == 2){
            j2 = p2;
        }
        if(r2 == 3){
            j2 = p3;
        }
        if(r2 == 4){
            j2 = p4;
        }
        if(r2 == 5){
            j2 = p5;
        }
        if(r2 == 6){
            j2 = p6;
        }
        if(r2 == 7){
            j2 = p7;
        }
        if(r2 == 8){
            j2 = p8;
        }
        if(r2 == 9){
            j2 = p9;
        }
        Jogador jogador1 = new Jogador("Leonardo", numeroRodadas, j1);
        Jogador jogador2 = new Jogador("Matheus", numeroRodadas, j2);

        int i = 0;

        Random randomizaPrimeiroJogador = new Random();
        int jogadorDaVez = randomizaPrimeiroJogador.nextInt(2);

        for(;;){
            if(jogador2.getPokemonDaVez().getVida() < 0){
                System.out.println("jogador 1 venceu");
                break;
            }
            if(jogador1.getPokemonDaVez().getVida() < 0){
                System.out.println("jogador 2 venceu");
                break;
            }
            System.out.println("COMEÇO DO JOGO" + "\n");
            System.out.println("Pokemon do jogador 1: " + jogador1.getPokemonDaVez().getNome());
            System.out.println("Ataque do jogador 1: " + "Dano: " + jogador1.getPokemonDaVez().getAtaque() + " Nome: " + jogador1.getPokemonDaVez().getTipo().getAtaqueDoTipo());
            System.out.println("Vida do jogador 1: " + jogador1.getPokemonDaVez().getVida());
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Pokemon do jogador 2: " + jogador2.getPokemonDaVez().getNome());
            System.out.println("Ataque do jogador 2: " + "Dano: " + jogador2.getPokemonDaVez().getAtaque() + " Nome: " + jogador2.getPokemonDaVez().getTipo().getAtaqueDoTipo());
            System.out.println("Vida do jogador 2: " + jogador2.getPokemonDaVez().getVida());

            //pokemons irao batalhar
            System.out.println("--------------HORA DA BATALHA--------------");
                
            if(jogadorDaVez == 0){
                jogador1.getPokemonDaVez().atacar(jogador2.getPokemonDaVez());
                jogadorDaVez = 1;
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("Digite qualquer tecla e aperte enter para a proxima rodada.");
                sc.next();
                continue;
            }
            if(jogadorDaVez == 1){
                jogador2.getPokemonDaVez().atacar(jogador1.getPokemonDaVez());
                jogadorDaVez = 0;
                System.out.println("------------------------------------------------------------------------------------------------------");
                System.out.println("Digite qualquer tecla e aperte enter para a proxima rodada.");
                sc.next();
                continue;
            }
           
        }
        
    }
}
