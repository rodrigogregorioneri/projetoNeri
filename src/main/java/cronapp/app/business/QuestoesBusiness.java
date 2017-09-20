package cronapp.app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import cronapp.app.dao.*;
import cronapp.app.entity.*;

/**
 * Classe que representa a camada de negócios de QuestoesBusiness
 * 
 * @generated
 **/
@Service("QuestoesBusiness")
public class QuestoesBusiness {



  /**
   * Instância da classe QuestoesDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("QuestoesDAO")
  protected QuestoesDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Questoes post(final Questoes entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Questoes result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Questoes put(final Questoes entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Questoes result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    Questoes entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Questoes get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Questoes result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Questoes> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Questoes> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Opcoes> findOpcoes(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Opcoes> result = repository.findOpcoes(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<RespostasPesquisa> findRespostasPesquisa(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<RespostasPesquisa> result = repository.findRespostasPesquisa(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * Foreign Key pesquisa
   * @generated
   */
  public Page<Questoes> findQuestoessByPesquisa(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Questoes> result = repository.findQuestoessByPesquisa(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
