package SistemaVuelosSB.services;

import SistemaVuelosSB.entities.Base;
import java.util.Optional;

import java.io.Serializable;
import java.util.List;

/**
 * Interfaz base genérica para la capa de servicios.
 * Define las operaciones CRUD comunes a todas las entidades del sistema.
 *
 * @param <E> Tipo de entidad.
 * @param <ID> Tipo del identificador.
 * @author Fernando Castro
 */
public interface BaseService<E extends Base, ID extends Serializable>{
    /**
     * Obtiene todas las entidades.
     *
     * @return Una lista que contiene todas las entidades encontradas.
     */
    public List<E> findAll() throws Exception;
    /**
     * Busca una entidad por su id.
     *
     * @param id identificador de la entidad.
     * @return entidad encontrada.
     */
    public E findById(ID id) throws Exception;
    /**
     * Guarda una entidad.
     *
     * @param entity entidad a persistir.
     * @return entidad guardada.
     */
    public E save(E entity) throws Exception;
    /**
     * Actualiza una entidad existente.
     *
     * @param id identificador de la entidad.
     * @param entity nuevos datos de la entidad.
     * @return entidad actualizada.
     */
    public E update(ID id, E entity) throws Exception;
    /**
     * Elimina una entidad por su identificador.
     *
     * @param id identificador de la entidad.
     * @return true si se eliminó correctamente.
     */
    public boolean delete(ID id) throws Exception;
}
