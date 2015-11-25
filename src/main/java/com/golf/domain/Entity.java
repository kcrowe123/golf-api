package com.golf.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

// TODO: Auto-generated Javadoc
/**
 * A Domain Object that can be persisted to permanent storage.
 */
public abstract class Entity extends ValueObject {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private Long id;

    /**
     * Instantiates a new entity.
     */
    public Entity() {
        super();
    }

    /**
     * Instantiates a new entity.
     *
     * @param id the id
     */
    public Entity(Long id) {
        this.id = id;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see com.golf.domain.ValueObject#addFieldsToEqualsBuilder(org.apache.commons.lang3.builder.EqualsBuilder, java.lang.Object)
     */
    @Override
    protected final void addFieldsToEqualsBuilder(EqualsBuilder builder, Object obj) {
        Entity rhs = (Entity) obj;
        builder.append(id, rhs.id);
        addEntityFieldsToEqualsBuilder(builder, obj);
    }

    /**
     * Adds the entity fields to equals builder.
     *
     * @param builder the builder
     * @param obj the obj
     */
    protected abstract void addEntityFieldsToEqualsBuilder(EqualsBuilder builder, Object obj);

    /* (non-Javadoc)
     * @see com.golf.domain.ValueObject#addFieldsToHashCodeBuilder(org.apache.commons.lang3.builder.HashCodeBuilder)
     */
    @Override
    protected final void addFieldsToHashCodeBuilder(HashCodeBuilder builder) {
        builder.append(id);
        addEntityFieldsToHashCodeBuilder(builder);
    }

    /**
     * Adds the entity fields to hash code builder.
     *
     * @param builder the builder
     */
    protected abstract void addEntityFieldsToHashCodeBuilder(HashCodeBuilder builder);

    /* (non-Javadoc)
     * @see com.golf.domain.ValueObject#addFieldsToToStringBuilder(org.apache.commons.lang3.builder.ToStringBuilder)
     */
    @Override
    protected final void addFieldsToToStringBuilder(ToStringBuilder builder) {
        builder.append("id", id);
        addEntityFieldsToToStringBuilder(builder);
    }

    /**
     * Adds the entity fields to to string builder.
     *
     * @param builder the builder
     */
    protected abstract void addEntityFieldsToToStringBuilder(ToStringBuilder builder);

}