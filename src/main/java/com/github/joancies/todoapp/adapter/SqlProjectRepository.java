package com.github.joancies.todoapp.adapter;



import com.github.joancies.todoapp.model.Project;
import com.github.joancies.todoapp.model.ProjectRepository;
import com.github.joancies.todoapp.model.TaskGroup;
import com.github.joancies.todoapp.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
interface SqlProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {
    @Override
    @Query(value = "from Project p join fetch p.steps")
    List<Project> findAll();
   }
