
public class Pessoa{
    public int idPessoa;
    public String nome;
    Pessoa[] amigosClasse;
    String[] vinculos = new String[5];

    public void setAmigos(Pessoa[] amigos) {
        this.amigosClasse = amigos;
    }

    public Pessoa(int idPessoa, String nome, Pessoa[] amigos) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.amigosClasse = amigos;
    }

    public void verAmigos() {
        for (int i = 0; i < amigosClasse.length; i++){
            System.out.println("Amigos de "+nome+ ": "+ amigosClasse[i].nome);
        }
    }

    public void recomendarAmigos(int qtd, Pessoa recomenda) {
        int x=0;
        for (int i = 0; i < amigosClasse.length; i++) {
            for (int j = 0; j < recomenda.amigosClasse.length; j++) {
                if(recomenda.amigosClasse[j].nome == this.amigosClasse[i].nome){
                    vinculos[x] = recomenda.amigosClasse[j].nome;
                }
            }
        }
        for (int i = 0; i < vinculos.length; i++){
            try {
                if (recomenda.amigosClasse[i].nome == vinculos[i]) {
                
                } else {
                    System.out.println("Recomendamos: "+recomenda.amigosClasse[i].nome );
                }
            } catch (Exception e) {
                System.out.println("Não temos mais amigos a recomendar!");
                break;
            }
        }
    }
}