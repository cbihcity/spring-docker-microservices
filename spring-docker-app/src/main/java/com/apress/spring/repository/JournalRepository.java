package com.apress.spring.repository;

import com.apress.spring.domain.Journal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ihhe0417 on 4/26/2017.
 */
@Transactional
public interface JournalRepository extends CrudRepository<Journal, Long> {

    @Override
    void delete(Iterable<? extends Journal> iterable);
}