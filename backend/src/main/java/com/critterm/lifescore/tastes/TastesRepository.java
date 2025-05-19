package com.critterm.lifescore.tastes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//
@Repository
public interface TastesRepository extends JpaRepository<Tastes, Long> {



}
