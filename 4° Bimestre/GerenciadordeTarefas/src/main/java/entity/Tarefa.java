package entity;
import jakarta.persistence.*;
@Entity(name = "Tarefa")
@Table(name = "Tarefa")


/*produz os objetos que correspondem as tarefas dentro do sistema de gerenciador de tarefas.*/  
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @Column
    private String vencimento;
    @Column
   /*indica que a classe Tarefa tem um relacionamento "muitos para um" com a classe Materia:*/
    @ManyToOne
    private Materia materia;
    @Column
    private String status;
    @Column
    /*indica que a classe Tarefa tem um           relacionamento de "muitos para um" com a classe      Categoria:*/
    @ManyToOne 
    private Categoria categoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
