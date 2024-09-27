import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta implements SaidaFormatada {
    private int id;
    private LocalDate data;
    private LocalTime hora;
    private double valorConsulta;
    private Paciente paciente;
    private Medico medico;

    public Consulta(Medico medico) {
        this.medico = medico;
    }

    public Consulta(int id, LocalDate data, LocalTime hora, double valorConsulta, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.valorConsulta = valorConsulta;
        this.paciente = paciente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void obterDados() {
        System.out.println("Consulta{" +
                "id=" + id +
                ", data=" + data +
                ", hora=" + hora +
                ", valorConsulta=" + valorConsulta +
                ", paciente=" + paciente +
                ", medico=" + medico +
                '}');

    }

}
