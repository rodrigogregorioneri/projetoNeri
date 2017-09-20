package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela RESPOSTASPESQUISA
 * @generated
 */
@Entity
@Table(name = "\"RESPOSTASPESQUISA\"")
@XmlRootElement
public class RespostasPesquisa implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_funcionarios", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Profissionais funcionarios;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_questoes", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Questoes questoes;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_opcoes", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Opcoes opcoes;
  
  /**
   * Construtor
   * @generated
   */
  public RespostasPesquisa(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public RespostasPesquisa setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém funcionarios
   * return funcionarios
   * @generated
   */
  public Profissionais getFuncionarios(){
    return this.funcionarios;
  }
  
  /**
   * Define funcionarios
   * @param funcionarios funcionarios
   * @generated
   */
  public RespostasPesquisa setFuncionarios(Profissionais funcionarios){
    this.funcionarios = funcionarios;
    return this;
  }
  
  /**
   * Obtém questoes
   * return questoes
   * @generated
   */
  public Questoes getQuestoes(){
    return this.questoes;
  }
  
  /**
   * Define questoes
   * @param questoes questoes
   * @generated
   */
  public RespostasPesquisa setQuestoes(Questoes questoes){
    this.questoes = questoes;
    return this;
  }
  
  /**
   * Obtém opcoes
   * return opcoes
   * @generated
   */
  public Opcoes getOpcoes(){
    return this.opcoes;
  }
  
  /**
   * Define opcoes
   * @param opcoes opcoes
   * @generated
   */
  public RespostasPesquisa setOpcoes(Opcoes opcoes){
    this.opcoes = opcoes;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    RespostasPesquisa object = (RespostasPesquisa)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}
