package com.golf.business;

import com.golf.domain.Entity;

/**
 * Encapsulates filter criteria, including paging and sorting, for Accessor find operations.
 */
/**
 * @author Keith
 *
 * @param <E>
 */
public interface Filter<E extends Entity> {

    /** @return boolean   */
    boolean hasNoCriteria();
    
    /** 
     * @param  key <code>String</code>
     * @return     <code>String</code>   */
    String getStringCriterion(String key);
    
    /** @return <code>String</code>   */
    String getSortBy();
    
    /** @return <code>Boolean</code>   */
    Boolean isSortDescending();
    
    /** @return <code>Integer</code>   */
    Integer getStartItem();
    
    /** @return <code>Integer</code>   */
    Integer getCount();


}
