import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private String telefone;
    private List<Consulta> consultas = new ArrayList<>();

    public Paciente(String cpf, String nome, Cidade cidade, String telefone, List<Consulta> consultas) {
        super(cpf, nome, cidade);
        this.telefone = telefone;
        this.consultas = consultas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void adicionarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public void removerConsulta(Consulta consulta){
        this.consultas.remove(consulta);
    }

    public double calcularTotalGasto(){
        double total=0;
        for(Consulta consulta: consultas){
            total+=consulta.getValorConsulta();

        }
        return total;

    }

    public void obterConsultas(LocalDate data, LocalTime hora){
        List<Consulta> consultas = new ArrayList<>();
        for(Consulta consulta: consultas){
            System.out.println("Data da consulta:" + consulta.getData() +
                    "Horário da consulta" + consulta.getHora());

        }

    }

    public void obterConsultas(Especialidade especialidade){
        List<Consulta> consultas = new ArrayList<>();
        for(Consulta consulta: consultas){
            System.out.println("Especialidade do médico: " + especialidade.getDescricao());
        }

    }

    public void obterConsultas(Medico medico){
        List<Consulta> consultas = new ArrayList<>();
        for(Consulta consulta: consultas){
            System.out.println("Consulta do médico:" + medico.getNome());
        }

    }


}
