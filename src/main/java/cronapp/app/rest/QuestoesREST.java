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
 * Controller para expor serviços REST de Questoes
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Questoes")
public class QuestoesREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("QuestoesBusiness")
  private QuestoesBusiness questoesBusiness;

  /**
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
  public Questoes post(@Validated @RequestBody final Questoes entity) throws Exception {
    return questoesBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Questoes put(@Validated @RequestBody final Questoes entity) throws Exception {
    return questoesBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{questoesId}")
  public Questoes put(@Validated @RequestBody final Questoes entity, @PathVariable("questoesId") java.lang.String questoesId) throws Exception {
    return questoesBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{questoesId}")
  public void delete(@PathVariable("questoesId") java.lang.String questoesId) throws Exception {
    questoesBusiness.delete(questoesId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Questoes>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(questoesBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{questoesId}/Opcoes")    
  public HttpEntity<PagedResources<Opcoes>> findOpcoes(@PathVariable("questoesId") java.lang.String questoesId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(questoesBusiness.findOpcoes(questoesId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{questoesId}/Opcoes/{opcoesId}")    
  public void deleteOpcoes(@PathVariable("opcoesId") java.lang.String opcoesId) throws Exception {
    this.opcoesBusiness.delete(opcoesId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{questoesId}/Opcoes")
  public Opcoes putOpcoes(@Validated @RequestBody final Opcoes entity, @PathVariable("questoesId") java.lang.String questoesId) throws Exception {
    return this.opcoesBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{questoesId}/Opcoes")
  public Opcoes postOpcoes(@Validated @RequestBody final Opcoes entity, @PathVariable("questoesId") java.lang.String questoesId) throws Exception {
    Questoes questoes = this.questoesBusiness.get(questoesId);
    entity.setQuestoes(questoes);
    return this.opcoesBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{questoesId}/RespostasPesquisa")    
  public HttpEntity<PagedResources<RespostasPesquisa>> findRespostasPesquisa(@PathVariable("questoesId") java.lang.String questoesId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(questoesBusiness.findRespostasPesquisa(questoesId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{questoesId}/RespostasPesquisa/{respostasPesquisaId}")    
  public void deleteRespostasPesquisa(@PathVariable("respostasPesquisaId") java.lang.String respostasPesquisaId) throws Exception {
    this.respostasPesquisaBusiness.delete(respostasPesquisaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{questoesId}/RespostasPesquisa")
  public RespostasPesquisa putRespostasPesquisa(@Validated @RequestBody final RespostasPesquisa entity, @PathVariable("questoesId") java.lang.String questoesId) throws Exception {
    return this.respostasPesquisaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{questoesId}/RespostasPesquisa")
  public RespostasPesquisa postRespostasPesquisa(@Validated @RequestBody final RespostasPesquisa entity, @PathVariable("questoesId") java.lang.String questoesId) throws Exception {
    Questoes questoes = this.questoesBusiness.get(questoesId);
    entity.setQuestoes(questoes);
    return this.respostasPesquisaBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{questoesId}")
  public Questoes get(@PathVariable("questoesId") java.lang.String questoesId) throws Exception {
    return questoesBusiness.get(questoesId);
  }

  /**
   * Foreign Key pesquisa
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Pesquisa/{pesquisaId}")    
  public HttpEntity<PagedResources<Questoes>> findQuestoessByPesquisa(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(questoesBusiness.findQuestoessByPesquisa(pesquisaId, pageable)), HttpStatus.OK);
  }
}
