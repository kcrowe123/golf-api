package com.golf.business;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.golf.domain.Entity;
import com.google.common.collect.Maps;

/**
 * Base class for Filter implementations.
 */
public abstract class BaseFilter<E extends Entity> implements Filter<E> {

    public static final String SORT_BY = "sort_by";
    public static final String SORT_DESC = "sort_desc";
    public static final String START_ITEM = "start_item";
    public static final String COUNT = "count";

    private final Map<String, String> stringCriteria = Maps.newHashMap();
    private final String sortBy;
    private Boolean sortDescending = Boolean.FALSE;
    private Integer startItem = 1;
    private Integer count = 1000;

    public BaseFilter(String sortBy, Boolean sortDescending, Integer startItem, Integer count) {
        this.sortBy = sortBy;
        if (sortDescending != null) {
            this.sortDescending = sortDescending;
        }
        if (startItem != null) {
            this.startItem = startItem;
        }
        if (count != null) {
            this.count = count;
        }
    }

    protected void addStringCriterion(String key, String value) {
        if (StringUtils.isNotBlank(value)) {
            stringCriteria.put(key, value);
        }
    }


    @Override
    public boolean hasNoCriteria() {
        return stringCriteria.isEmpty();
    }

    @Override
    public String getStringCriterion(String key) {
        return stringCriteria.get(key);
    }


    @Override
    public String getSortBy() {
        return sortBy;
    }

    @Override
    public Boolean isSortDescending() {
        return sortDescending;
    }

    @Override
    public Integer getStartItem() {
        return startItem;
    }

    @Override
    public Integer getCount() {
        return count;
    }
}