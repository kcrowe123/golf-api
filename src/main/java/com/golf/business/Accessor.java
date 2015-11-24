package com.golf.business;

import java.util.List;

import com.golf.domain.Entity;

/**
 * @author Keith  Defines operations for retrieving Entity information.
 * @param <E>
 */
public interface Accessor<E extends Entity> {

    /**
     * @param filter <code>Filter<E></code>
     * @return       <code>List<E></code> 
     */
    List<E> find(Filter<E> filter);
    
    /**
     * @param id  <code>Long</code>
     * @return    <code>E</code>
     */
    E load(Long id);

}
