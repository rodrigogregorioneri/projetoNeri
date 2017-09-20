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
@Repository("RespostasPesquisaDAO")
@Transactional(transactionManager="cronapp.app-TransactionManager")
public interface RespostasPesquisaDAO extends JpaRepository<RespostasPesquisa, java.lang.String> {

  /**
   * Obtém a instância de RespostasPesquisa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM RespostasPesquisa entity WHERE entity.id = :id")
  public RespostasPesquisa findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de RespostasPesquisa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM RespostasPesquisa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from RespostasPesquisa c")
  public Page<RespostasPesquisa> list(Pageable pageable);
  


  /**
   * Foreign Key funcionarios
   * @generated
   */
  @Query("SELECT entity FROM RespostasPesquisa entity WHERE entity.funcionarios.id = :id")
  public Page<RespostasPesquisa> findRespostasPesquisasByFuncionarios(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key questoes
   * @generated
   */
  @Query("SELECT entity FROM RespostasPesquisa entity WHERE entity.questoes.id = :id")
  public Page<RespostasPesquisa> findRespostasPesquisasByQuestoes(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key opcoes
   * @generated
   */
  @Query("SELECT entity FROM RespostasPesquisa entity WHERE entity.opcoes.id = :id")
  public Page<RespostasPesquisa> findRespostasPesquisasByOpcoes(@Param(value="id") java.lang.String id, Pageable pageable);

}
