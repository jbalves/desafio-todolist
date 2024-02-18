package br.com.jeffcreativesolutions.desafiotodolist.repository;

import br.com.jeffcreativesolutions.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo,Long> {
}
