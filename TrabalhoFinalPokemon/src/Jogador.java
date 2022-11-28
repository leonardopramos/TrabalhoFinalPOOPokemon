public class Jogador {
    
    private String nome;
    private int rodadasRestantes;
    private Pokemon pokemonDaVez;
    public Jogador(String nome, int rodadasRestantes, Pokemon pokemonDaVez) {
        this.nome = nome;
        this.rodadasRestantes = rodadasRestantes;
        this.pokemonDaVez = pokemonDaVez;
    }
    public String getNome() {
        return nome;
    }
    public int getRodadasRestantes() {
        return rodadasRestantes;
    }
    public Pokemon getPokemonDaVez() {
        return pokemonDaVez;
    }

    
}
