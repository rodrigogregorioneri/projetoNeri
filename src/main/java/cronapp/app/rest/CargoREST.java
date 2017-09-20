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
 * Controller para expor serviços REST de Cargo
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/cronapp/app/Cargo")
public class CargoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("CargoBusiness")
  private CargoBusiness cargoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Cargo post(@Validated @RequestBody final Cargo entity) throws Exception {
    return cargoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Cargo put(@Validated @RequestBody final Cargo entity) throws Exception {
    return cargoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{cargoId}")
  public Cargo put(@Validated @RequestBody final Cargo entity, @PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    return cargoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{cargoId}")
  public void delete(@PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    cargoBusiness.delete(cargoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Cargo>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(cargoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{cargoId}")
  public Cargo get(@PathVariable("cargoId") java.lang.String cargoId) throws Exception {
    return cargoBusiness.get(cargoId);
  }

  /**
   * Foreign Key funcionarios
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Funcionarios/{profissionaisId}")    
  public HttpEntity<PagedResources<Cargo>> findCargosByFuncionarios(@PathVariable("profissionaisId") java.lang.String profissionaisId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cargoBusiness.findCargosByFuncionarios(profissionaisId, pageable)), HttpStatus.OK);
  }
}
