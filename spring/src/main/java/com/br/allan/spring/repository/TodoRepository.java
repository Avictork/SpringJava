package com.br.allan.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.allan.spring.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
