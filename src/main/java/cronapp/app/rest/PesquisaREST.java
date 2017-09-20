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
 * Controller para expor serviços REST de Pesquisa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Pesquisa")
public class PesquisaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("PesquisaBusiness")
  private PesquisaBusiness pesquisaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("QuestoesBusiness")
  private QuestoesBusiness questoesBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Pesquisa post(@Validated @RequestBody final Pesquisa entity) throws Exception {
    return pesquisaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Pesquisa put(@Validated @RequestBody final Pesquisa entity) throws Exception {
    return pesquisaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{pesquisaId}")
  public Pesquisa put(@Validated @RequestBody final Pesquisa entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    return pesquisaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{pesquisaId}")
  public void delete(@PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    pesquisaBusiness.delete(pesquisaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Pesquisa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(pesquisaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{pesquisaId}/Questoes")    
  public HttpEntity<PagedResources<Questoes>> findQuestoes(@PathVariable("pesquisaId") java.lang.String pesquisaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pesquisaBusiness.findQuestoes(pesquisaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{pesquisaId}/Questoes/{questoesId}")    
  public void deleteQuestoes(@PathVariable("questoesId") java.lang.String questoesId) throws Exception {
    this.questoesBusiness.delete(questoesId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{pesquisaId}/Questoes")
  public Questoes putQuestoes(@Validated @RequestBody final Questoes entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    return this.questoesBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{pesquisaId}/Questoes")
  public Questoes postQuestoes(@Validated @RequestBody final Questoes entity, @PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    Pesquisa pesquisa = this.pesquisaBusiness.get(pesquisaId);
    entity.setPesquisa(pesquisa);
    return this.questoesBusiness.post(entity);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{pesquisaId}")
  public Pesquisa get(@PathVariable("pesquisaId") java.lang.String pesquisaId) throws Exception {
    return pesquisaBusiness.get(pesquisaId);
  }
}
