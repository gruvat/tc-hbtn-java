package serializacao;

import java.io.*;
import java.util.List;

public class SerializarEstudantes<Estudante> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try {
            FileOutputStream file = new FileOutputStream(this.nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(estudantes);
            out.close();
            file.close();
        } catch (Exception e) {
            System.out.println("Não foi possivel serializar");
        }

    }

    public List<Estudante> desserializar() {
        try {
            FileInputStream file = new FileInputStream(this.nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(file);
            List<Estudante> estudantes = (List<Estudante>) in.readObject();
            return estudantes;
        } catch (Exception e) {
            System.out.println("Não foi possivel desserializar");
            return null;
        }
    }
}
