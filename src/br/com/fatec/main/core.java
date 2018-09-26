package br.com.fatec.main;

import br.com.fatec.engine.Agenda;
import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Professor;

import java.io.*;

public class core {
  private final static String arquivo = "Agenda.ser";
  public static void main(String[] args){
    Agenda agenda = core.LerAgenda();
    agenda.listarTodos();

  }
  private static void SalvarAgenda(Agenda agenda){
    try {
      FileOutputStream escreverFile = new FileOutputStream(arquivo);
      ObjectOutputStream escreverObjeto = new ObjectOutputStream(escreverFile);
      escreverObjeto.writeObject(agenda);
      escreverObjeto.close();
      System.out.print("Agenda Salva com sucesso");
    }catch (Exception ex){
      ex.printStackTrace();
    }
  }
  private static Agenda LerAgenda() {
    Agenda agenda = null;
    try {
      InputStream file = new FileInputStream(arquivo);
      InputStream buffer = new BufferedInputStream(file);
      ObjectInput input = new ObjectInputStream(buffer);
      agenda = (Agenda) input.readObject();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return agenda;
  }
}
