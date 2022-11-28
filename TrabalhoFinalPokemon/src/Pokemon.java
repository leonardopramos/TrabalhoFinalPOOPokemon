public class Pokemon{

    private int vida;
    private int ataque;
    private String nome;
    private TiposPokemon tipo;
   
    public Pokemon(int vida, int ataque, String nome, TiposPokemon tipo) {
        this.vida = vida;
        this.ataque = ataque;
        this.nome = nome;
        this.tipo = tipo;
    }
   

    public void atacar(Pokemon atacado){
        System.out.println("POKEMON ATACANDO:" + this.getNome());
        System.out.println("ATAQUE UTILIZADO: " + this.getTipo().getAtaqueDoTipo());
        System.out.println("POKEMON ATACADO: " + atacado.getNome());
        atacado.setVida(atacado.getVida() - this.getAtaque());
        System.out.println("VALOR DE ATAQUE DO " + this.getTipo().getAtaqueDoTipo() + ": " + this.getAtaque());
        System.out.println("VIDA ATUAL DO POKEMON ATACADO: " + atacado.getVida());
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public TiposPokemon getTipo() {
        return tipo;
    }
    public String getNome() {
        return nome;
    }
}
