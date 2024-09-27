import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cidade cidade1 = new Cidade("São Carlos", "SP");
        Cidade cidade2 = new Cidade("São José do Rio Preto", "SP");

        List<Consulta> consultasPaciente1 = new ArrayList<>();
        List<Consulta> consultasPaciente2 = new ArrayList<>();

        List<Medico> medicos = new ArrayList<>();
        Especialidade especialidade1 = new Especialidade(123, "Ortopedia", medicos);

        Medico medico1 = new Medico("434", "Maurício", cidade1, "1414", especialidade1);
        Medico medico2 = new Medico("433", "Laura", cidade2, "1314", especialidade1);

        Paciente paciente1 = new Paciente("111", "Giulia", cidade1, "16991923", consultasPaciente1);
        Paciente paciente2 = new Paciente("121", "Giuliano", cidade2, "16992223", consultasPaciente2);

        Consulta consulta1 = new Consulta(1, LocalDate.of(2024, 9, 1), LocalTime.of(14, 30), 250, paciente1);
        Consulta consulta2 = new Consulta(2, LocalDate.of(2024, 9, 1), LocalTime.of(15, 30), 250, paciente2);

        paciente1.adicionarConsulta(consulta1);
        paciente2.adicionarConsulta(consulta2);

        System.out.println("Dados da consulta de Giulia:");
        consulta1.obterDados();

        System.out.println("Dados da consulta de Giuliano:");
        consulta2.obterDados();

        System.out.println("Total gasto por Giulia: " + paciente1.calcularTotalGasto());
        System.out.println("Total gasto por Giuliano: " + paciente2.calcularTotalGasto());
    }
}
