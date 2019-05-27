package com.example.demo.repository;

import com.example.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** La sgt notacion.
 * @Repository y @Service son especializaciones de @Component.
 *     *  añadiendo un valor semántico que indica la utilidad de la clase anotada
 *     *  (@Repository para acceso a BD y @Service para la capa de negocio)
 */
@Repository
public interface DepartmentRepository2 extends JpaRepository<Department,Integer> {

/** debido a esta relación de herencia, JpaRepository contiene la API completa de:
 *  CrudRepository y PagingAndSortingRepository*/

}
