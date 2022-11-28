public class TiposPokemon {

    private String nomeDoTipo;
    private String ataqueDoTipo;

    private static TiposPokemon agua = new TiposPokemon("Agua", "Hydro Pump");
    private static TiposPokemon fogo = new TiposPokemon("Fogo", "Flamethrower");
    private static TiposPokemon planta = new TiposPokemon("Planta", "Solarbeam");
    private static TiposPokemon normal = new TiposPokemon("Normal", "Quick attack");

    public TiposPokemon(String nomeDoTipo, String nomeDoAtaque) {
        this.nomeDoTipo = nomeDoTipo;
        this.ataqueDoTipo = nomeDoAtaque;
    }

    public static TiposPokemon AGUA() {
        return agua;
    }
    public static TiposPokemon FOGO() {
        return fogo;
    }
    public static TiposPokemon PLANTA() {
        return planta;
    }
    public static TiposPokemon NORMAL(){
        return normal;
    }
    public String getNomeDoTipo() {
        return nomeDoTipo;
    }
    public String getAtaqueDoTipo() {
        return ataqueDoTipo;
    }
}
