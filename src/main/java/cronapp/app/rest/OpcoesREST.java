package cronapp.app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import cronapp.app.entity.*;
import cronapp.app.business.*;

/**
 * Controller para expor serviços REST de Opcoes
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Opcoes")
public class OpcoesREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("OpcoesBusiness")
  private OpcoesBusiness opcoesBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("RespostasPesquisaBusiness")
  private RespostasPesquisaBusiness respostasPesquisaBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Opcoes post(@Validated @RequestBody final Opcoes entity) throws Exception {
    return opcoesBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Opcoes put(@Validated @RequestBody final Opcoes entity) throws Exception {
    return opcoesBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{opcoesId}")
  public Opcoes put(@Validated @RequestBody final Opcoes entity, @PathVariable("opcoesId") java.lang.String opcoesId) throws Exception {
    return opcoesBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{opcoesId}")
  public void delete(@PathVariable("opcoesId") java.lang.String opcoesId) throws Exception {
    opcoesBusiness.delete(opcoesId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Opcoes>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(opcoesBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{opcoesId}/RespostasPesquisa")    
  public HttpEntity<PagedResources<RespostasPesquisa>> findRespostasPesquisa(@PathVariable("opcoesId") java.lang.String opcoesId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(opcoesBusiness.findRespostasPesquisa(opcoesId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{opcoesId}/RespostasPesquisa/{respostasPesquisaId}")    
  public void deleteRespostasPesquisa(@PathVariable("respostasPesquisaId") java.lang.String respostasPesquisaId) throws Exception {
    this.respostasPesquisaBusiness.delete(respostasPesquisaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{opcoesId}/RespostasPesquisa")
  public RespostasPesquisa putRespostasPesquisa(@Validated @RequestBody final RespostasPesquisa entity, @PathVariable("opcoesId") java.lang.String opcoesId) throws Exception {
    return this.respostasPesquisaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{opcoesId}/RespostasPesquisa")
  public RespostasPesquisa postRespostasPesquisa(@Validated @RequestBody final RespostasPesquisa entity, @PathVariable("opcoesId") java.lang.String opcoesId) throws Exception {
    Opcoes opcoes = this.opcoesBusiness.get(opcoesId);
    entity.setOpcoes(opcoes);
    return this.respostasPesquisaBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{opcoesId}")
  public Opcoes get(@PathVariable("opcoesId") java.lang.String opcoesId) throws Exception {
    return opcoesBusiness.get(opcoesId);
  }

  /**
   * Foreign Key questoes
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Questoes/{questoesId}")    
  public HttpEntity<PagedResources<Opcoes>> findOpcoessByQuestoes(@PathVariable("questoesId") java.lang.String questoesId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(opcoesBusiness.findOpcoessByQuestoes(questoesId, pageable)), HttpStatus.OK);
  }
}
