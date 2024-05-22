package ecommerce;

import java.time.LocalDate;
import java.util.Random;

public class Cliente {
    private String nome;
    private String cognome;
    private int codiceCliente;
    private String email;
    private String dataIscrizione;


    public Cliente(String nome, String cognome, String email) {
        Random rand = new Random();

        LocalDate oggi = LocalDate.now();

        this.nome = nome;
        this.cognome = cognome;
        this.codiceCliente = rand.nextInt(1, 1000);
        this.email = email;
        this.dataIscrizione = oggi.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));


    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codiceCliente=" + codiceCliente +
                ", email='" + email + '\'' +
                ", dataIscrizione='" + dataIscrizione + '\'' +
                '}';
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
