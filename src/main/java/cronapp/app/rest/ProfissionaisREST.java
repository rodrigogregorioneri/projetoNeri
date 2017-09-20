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
 * Controller para expor serviços REST de Profissionais
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Profissionais")
public class ProfissionaisREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ProfissionaisBusiness")
  private ProfissionaisBusiness profissionaisBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("EmpresaBusiness")
  private EmpresaBusiness empresaBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("TecnologiasBusiness")
  private TecnologiasBusiness tecnologiasBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("CargoBusiness")
  private CargoBusiness cargoBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("CidadesBusiness")
  private CidadesBusiness cidadesBusiness;

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
  public Profissionais post(@Validated @RequestBody final Profissionais entity) throws Exception {
    return profissionaisBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Profissionais put(@Validated @RequestBody final Profissionais entity) throws Exception {
    return profissionaisBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{profissionaisId}")
  public Profissionais put(@Validated @RequestBody final Profissionais entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    return profissionaisBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{profissionaisId}")
  public void delete(@PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    profissionaisBusiness.delete(profissionaisId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Profissionais>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(profissionaisBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{profissionaisId}/Tecnologias")    
  public HttpEntity<PagedResources<Tecnologias>> findTecnologias(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(profissionaisBusiness.findTecnologias(profissionaisId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{profissionaisId}/Tecnologias/{tecnologiasId}")    
  public void deleteTecnologias(@PathVariable("tecnologiasId") java.lang.String tecnologiasId) throws Exception {
    this.tecnologiasBusiness.delete(tecnologiasId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{profissionaisId}/Tecnologias")
  public Tecnologias putTecnologias(@Validated @RequestBody final Tecnologias entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    return this.tecnologiasBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{profissionaisId}/Tecnologias")
  public Tecnologias postTecnologias(@Validated @RequestBody final Tecnologias entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    Profissionais funcionarios = this.profissionaisBusiness.get(profissionaisId);
    entity.setFuncionarios(funcionarios);
    return this.tecnologiasBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{profissionaisId}/Cargo")    
  public HttpEntity<PagedResources<Cargo>> findCargo(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(profissionaisBusiness.findCargo(profissionaisId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{profissionaisId}/Cargo/{cargoId}")    
  public void deleteCargo(@PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    this.cargoBusiness.delete(cargoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{profissionaisId}/Cargo")
  public Cargo putCargo(@Validated @RequestBody final Cargo entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    return this.cargoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{profissionaisId}/Cargo")
  public Cargo postCargo(@Validated @RequestBody final Cargo entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    Profissionais funcionarios = this.profissionaisBusiness.get(profissionaisId);
    entity.setFuncionarios(funcionarios);
    return this.cargoBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{profissionaisId}/Cidades")    
  public HttpEntity<PagedResources<Cidades>> findCidades(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(profissionaisBusiness.findCidades(profissionaisId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{profissionaisId}/Cidades/{cidadesId}")    
  public void deleteCidades(@PathVariable("cidadesId") java.lang.String cidadesId) throws Exception {
    this.cidadesBusiness.delete(cidadesId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{profissionaisId}/Cidades")
  public Cidades putCidades(@Validated @RequestBody final Cidades entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    return this.cidadesBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{profissionaisId}/Cidades")
  public Cidades postCidades(@Validated @RequestBody final Cidades entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    Profissionais profissionais = this.profissionaisBusiness.get(profissionaisId);
    entity.setProfissionais(profissionais);
    return this.cidadesBusiness.post(entity);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{profissionaisId}/RespostasPesquisa")    
  public HttpEntity<PagedResources<RespostasPesquisa>> findRespostasPesquisa(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(profissionaisBusiness.findRespostasPesquisa(profissionaisId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{profissionaisId}/RespostasPesquisa/{respostasPesquisaId}")    
  public void deleteRespostasPesquisa(@PathVariable("respostasPesquisaId") java.lang.String respostasPesquisaId) throws Exception {
    this.respostasPesquisaBusiness.delete(respostasPesquisaId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{profissionaisId}/RespostasPesquisa")
  public RespostasPesquisa putRespostasPesquisa(@Validated @RequestBody final RespostasPesquisa entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    return this.respostasPesquisaBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{profissionaisId}/RespostasPesquisa")
  public RespostasPesquisa postRespostasPesquisa(@Validated @RequestBody final RespostasPesquisa entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    Profissionais funcionarios = this.profissionaisBusiness.get(profissionaisId);
    entity.setFuncionarios(funcionarios);
    return this.respostasPesquisaBusiness.post(entity);
  }

  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET,value="/{profissionaisId}/Empresa")
  public HttpEntity<PagedResources<Empresa>> listEmpresa(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(profissionaisBusiness.listEmpresa(profissionaisId, pageable)), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST,value="/{profissionaisId}/Empresa")
  public Profissionais postEmpresa(@Validated @RequestBody final Empresa entity, @PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    Cidades newCidades = new Cidades();

    Profissionais profissionais = this.profissionaisBusiness.get(profissionaisId);

    newCidades.setEmpresa(entity);
    newCidades.setProfissionais(profissionais);
    
    this.cidadesBusiness.post(newCidades);

    return newCidades.getProfissionais();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE,value="/{profissionaisId}/Empresa/{EmpresaId}")
  public void deleteEmpresa(@PathVariable("profissionaisId") java.lang.String profissionaisId, @PathVariable("EmpresaId") java.lang.String EmpresaId) {
    this.profissionaisBusiness.deleteEmpresa(profissionaisId, EmpresaId);
  }  

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{profissionaisId}")
  public Profissionais get(@PathVariable("profissionaisId") java.lang.String profissionaisId) throws Exception {
    return profissionaisBusiness.get(profissionaisId);
  }

  /**
   * Foreign Key nome
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Nome/{empresaId}")    
  public HttpEntity<PagedResources<Profissionais>> findProfissionaissByNome(@PathVariable("empresaId") java.lang.String empresaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(profissionaisBusiness.findProfissionaissByNome(empresaId, pageable)), HttpStatus.OK);
  }
}
