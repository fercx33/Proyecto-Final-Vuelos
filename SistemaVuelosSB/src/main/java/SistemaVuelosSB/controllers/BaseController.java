package SistemaVuelosSB.controllers;

import SistemaVuelosSB.entities.Base;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

/**
 * Interfaz base para los controladores REST.
 * Define las operaciones CRUD comunes para todas las entidades del sistema.
 *
 * @param <E> Tipo de entidad.
 * @param <ID> Tipo del identificador.
 */
public interface BaseController<E extends Base, ID extends Serializable>{
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
