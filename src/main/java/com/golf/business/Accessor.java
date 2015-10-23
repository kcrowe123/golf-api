package com.golf.business;

import java.util.List;

import com.golf.domain.Entity;

/**
 * Defines operations for retrieving Entity information.
 */
public interface Accessor<E extends Entity> {

    List<E> find(Filter<E> filter);

    E load(Long id);

}
