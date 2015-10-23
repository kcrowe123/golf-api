package com.golf.business;

import com.golf.domain.Entity;

/**
 * Encapsulates filter criteria, including paging and sorting, for Accessor find operations.
 */
public interface Filter<E extends Entity> {

    boolean hasNoCriteria();

    String getStringCriterion(String key);

    String getSortBy();

    Boolean isSortDescending();

    Integer getStartItem();

    Integer getCount();


}
