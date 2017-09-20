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
 * Classe que representa a camada de negócios de RespostasPesquisaBusiness
 * 
 * @generated
 **/
@Service("RespostasPesquisaBusiness")
public class RespostasPesquisaBusiness {



  /**
   * Instância da classe RespostasPesquisaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("RespostasPesquisaDAO")
  protected RespostasPesquisaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public RespostasPesquisa post(final RespostasPesquisa entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    RespostasPesquisa result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public RespostasPesquisa put(final RespostasPesquisa entity) throws Exception {
    // begin-user-code  
    // end-user-code
    RespostasPesquisa result = repository.saveAndFlush(entity);
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
    RespostasPesquisa entity = this.get(id);
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
  public RespostasPesquisa get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    RespostasPesquisa result = repository.findOne(id);
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
  public Page<RespostasPesquisa> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<RespostasPesquisa> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key funcionarios
   * @generated
   */
  public Page<RespostasPesquisa> findRespostasPesquisasByFuncionarios(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<RespostasPesquisa> result = repository.findRespostasPesquisasByFuncionarios(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key questoes
   * @generated
   */
  public Page<RespostasPesquisa> findRespostasPesquisasByQuestoes(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<RespostasPesquisa> result = repository.findRespostasPesquisasByQuestoes(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key opcoes
   * @generated
   */
  public Page<RespostasPesquisa> findRespostasPesquisasByOpcoes(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<RespostasPesquisa> result = repository.findRespostasPesquisasByOpcoes(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
