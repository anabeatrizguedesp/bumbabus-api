package com.api.bumbabusapi.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.bumbabusapi.models.LineModel;

@Repository
public interface LineRepository extends JpaRepository<LineModel,Integer> {


 

}
