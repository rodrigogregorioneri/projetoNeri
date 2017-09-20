package cronapp.app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela OPCOES
 * @generated
 */
@Entity
@Table(name = "\"OPCOES\"")
@XmlRootElement
public class Opcoes implements Serializable {

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
  @JoinColumn(name="fk_questoes", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private Questoes questoes;
  
  /**
  * @generated
  */
  @Column(name = "opcao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String opcao;
  
  /**
   * Construtor
   * @generated
   */
  public Opcoes(){
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
  public Opcoes setId(java.lang.String id){
    this.id = id;
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
  public Opcoes setQuestoes(Questoes questoes){
    this.questoes = questoes;
    return this;
  }
  
  /**
   * Obtém opcao
   * return opcao
   * @generated
   */
  public java.lang.String getOpcao(){
    return this.opcao;
  }
  
  /**
   * Define opcao
   * @param opcao opcao
   * @generated
   */
  public Opcoes setOpcao(java.lang.String opcao){
    this.opcao = opcao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Opcoes object = (Opcoes)obj;
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
