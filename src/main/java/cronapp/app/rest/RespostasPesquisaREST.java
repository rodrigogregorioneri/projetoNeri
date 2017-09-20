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
 * Controller para expor serviços REST de RespostasPesquisa
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/RespostasPesquisa")
public class RespostasPesquisaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
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
  public RespostasPesquisa post(@Validated @RequestBody final RespostasPesquisa entity) throws Exception {
    return respostasPesquisaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public RespostasPesquisa put(@Validated @RequestBody final RespostasPesquisa entity) throws Exception {
    return respostasPesquisaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{respostasPesquisaId}")
  public RespostasPesquisa put(@Validated @RequestBody final RespostasPesquisa entity, @PathVariable("respostasPesquisaId") java.lang.String respostasPesquisaId) throws Exception {
    return respostasPesquisaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{respostasPesquisaId}")
  public void delete(@PathVariable("respostasPesquisaId") java.lang.String respostasPesquisaId) throws Exception {
    respostasPesquisaBusiness.delete(respostasPesquisaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<RespostasPesquisa>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(respostasPesquisaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{respostasPesquisaId}")
  public RespostasPesquisa get(@PathVariable("respostasPesquisaId") java.lang.String respostasPesquisaId) throws Exception {
    return respostasPesquisaBusiness.get(respostasPesquisaId);
  }

  /**
   * Foreign Key funcionarios
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Funcionarios/{profissionaisId}")    
  public HttpEntity<PagedResources<RespostasPesquisa>> findRespostasPesquisasByFuncionarios(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasPesquisaBusiness.findRespostasPesquisasByFuncionarios(profissionaisId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key questoes
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Questoes/{questoesId}")    
  public HttpEntity<PagedResources<RespostasPesquisa>> findRespostasPesquisasByQuestoes(@PathVariable("questoesId") java.lang.String questoesId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasPesquisaBusiness.findRespostasPesquisasByQuestoes(questoesId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key opcoes
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Opcoes/{opcoesId}")    
  public HttpEntity<PagedResources<RespostasPesquisa>> findRespostasPesquisasByOpcoes(@PathVariable("opcoesId") java.lang.String opcoesId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(respostasPesquisaBusiness.findRespostasPesquisasByOpcoes(opcoesId, pageable)), HttpStatus.OK);
  }
}
