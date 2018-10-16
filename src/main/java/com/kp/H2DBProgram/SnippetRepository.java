package com.kp.H2DBProgram;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface SnippetRepository extends CrudRepository<Snippet, String> {

}
