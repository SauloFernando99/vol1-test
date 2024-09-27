import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    private String uf;
    private List<Pessoa> pessoas = new ArrayList<>();

    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void obterMedicos(){
        List<Medico> medicos = new ArrayList<>();

        System.out.println("Cidade do médico:" + this.nome);

        for(Medico medico: medicos){
            System.out.println("Nome do médico:" + medico.getNome() +
                    "CPF do médico: " + medico.getCpf() +
                    "CRM do médico: " + medico.getInscricaoCRM());
        }





    }
}
