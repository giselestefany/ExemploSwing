
package exemploswing;

import java.util.ArrayList;


public class Movimentacao {
    
   private Aluno objAluno;
   private String horaEntrada;
   private String horaSaida;
   private String data;
   private ArrayList<Movimentacao> movimentacaoAL = new ArrayList<Movimentacao>();

    public Aluno getObjAluno() {
        return objAluno;
    }

    public void setObjAluno(Aluno objAluno) {
        this.objAluno = objAluno;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
   
   
   
}
