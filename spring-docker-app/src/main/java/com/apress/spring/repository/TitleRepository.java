package com.apress.spring.repository;

import com.apress.spring.domain.Journal;
import com.apress.spring.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ihhe0417 on 5/3/2017.
 */
@Transactional
public interface TitleRepository extends CrudRepository<Title, Long> {
}
