package cronapp.app.dao;

import cronapp.app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("OpcoesDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface OpcoesDAO extends JpaRepository<Opcoes, java.lang.String> {

  /**
   * Obtém a instância de Opcoes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Opcoes entity WHERE entity.id = :id")
  public Opcoes findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Opcoes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Opcoes entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Opcoes c")
  public Page<Opcoes> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM RespostasPesquisa entity WHERE entity.opcoes.id = :id")
  public Page<RespostasPesquisa> findRespostasPesquisa(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key questoes
   * @generated
   */
  @Query("SELECT entity FROM Opcoes entity WHERE entity.questoes.id = :id")
  public Page<Opcoes> findOpcoessByQuestoes(@Param(value="id") java.lang.String id, Pageable pageable);

}
