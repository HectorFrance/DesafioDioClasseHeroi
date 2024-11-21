public class Heroi {

    private String nome, tipo;
    private int idade;
    public Heroi( String nome, String tipo, int idade ){
        this.idade=idade;
        this.nome=nome;
        this.tipo=tipo;
    }

    public void atacar(){
        if(this.tipo.equalsIgnoreCase("guerreiro")){
            System.out.println("O "+this.tipo+" Atacou usando uma espada");
        } else if (this.tipo.equalsIgnoreCase("mago")) {
            System.out.println("O "+this.tipo+" Atacou usando magia");
        } else if (this.tipo.equalsIgnoreCase("monge")) {
            System.out.println("O "+this.tipo+" Atacou usando artes marciais");
        } else if (this.tipo.equalsIgnoreCase("ninja")) {
            System.out.println("O "+this.tipo+" Atacou usando uma shuriken");
        } else {
            System.out.println("Classe não definida");
        }

    }

}
