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
@Repository("PesquisaDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface PesquisaDAO extends JpaRepository<Pesquisa, java.lang.String> {

  /**
   * Obtém a instância de Pesquisa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pesquisa entity WHERE entity.id = :id")
  public Pesquisa findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pesquisa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pesquisa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Pesquisa c")
  public Page<Pesquisa> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Questoes entity WHERE entity.pesquisa.id = :id")
  public Page<Questoes> findQuestoes(@Param(value="id") java.lang.String id, Pageable pageable);

}
