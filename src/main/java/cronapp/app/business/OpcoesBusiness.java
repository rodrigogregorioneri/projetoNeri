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
 * Classe que representa a camada de negócios de OpcoesBusiness
 * 
 * @generated
 **/
@Service("OpcoesBusiness")
public class OpcoesBusiness {



  /**
   * Instância da classe OpcoesDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("OpcoesDAO")
  protected OpcoesDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Opcoes post(final Opcoes entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Opcoes result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Opcoes put(final Opcoes entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Opcoes result = repository.saveAndFlush(entity);
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
    Opcoes entity = this.get(id);
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
  public Opcoes get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Opcoes result = repository.findOne(id);
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
  public Page<Opcoes> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Opcoes> result = repository.list(pageable);
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
   * Foreign Key questoes
   * @generated
   */
  public Page<Opcoes> findOpcoessByQuestoes(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Opcoes> result = repository.findOpcoessByQuestoes(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
