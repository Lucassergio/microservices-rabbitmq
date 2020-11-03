package com.example.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.authentication.entity.Permission;

@Repository
public interface PermissionRepository  extends JpaRepository<Permission, Long>{

	@Query("SELECT p FROM Permission p WHERE p.descricao =:descricao")
	Permission findByDescricao(@Param("descricao") String descricao);
}
