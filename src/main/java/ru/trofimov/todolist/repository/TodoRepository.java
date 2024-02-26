package ru.trofimov.todolist.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.trofimov.todolist.domain.todo.Todo;

import java.util.List;

public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {

    List<Todo> findAllByUserId(Long id);

}
