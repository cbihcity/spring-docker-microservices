package com.apress.spring.repository;

import com.apress.spring.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ihhe0417 on 5/3/2017.
 */
public interface TitleRepository extends CrudRepository<Title, Long> {
}
