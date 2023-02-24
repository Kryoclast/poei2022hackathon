package com.freestack.spring.feature1.repo;

import com.freestack.spring.feature1.models.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
