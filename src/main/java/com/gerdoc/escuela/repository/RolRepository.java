package com.gerdoc.escuela.repository;

import com.gerdoc.escuela.model.Profesor;
import com.gerdoc.escuela.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>
{
}
