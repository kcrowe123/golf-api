package com.golf.domain;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

// TODO: Auto-generated Javadoc
/**
 * A Domain Object that is not persisted to permanent storage, except as part of Entity objects.
 */
public abstract class ValueObject implements Serializable {

    private static final int INITIAL_ODD_NUMBER = 23;
	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }

        EqualsBuilder builder = new EqualsBuilder();
        addFieldsToEqualsBuilder(builder, obj);
        return builder.isEquals();
    }

    /**
     * Adds the fields to equals builder.
     *
     * @param builder <code>EqualsBuilder</code>
     * @param obj     <code>Object</code>
     */
    protected abstract void addFieldsToEqualsBuilder(EqualsBuilder builder, Object obj);

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public final int hashCode() {
        HashCodeBuilder builder = new HashCodeBuilder(INITIAL_ODD_NUMBER, hashCodeMultiplier());
        addFieldsToHashCodeBuilder(builder);
        return builder.toHashCode();
    }

    /**
     * Override with a non-zero odd number that is unique across the set of Domain Objects.
     * @return  <code>int</code>
     */
    protected abstract int hashCodeMultiplier();

    /**
     * Adds the fields to hash code builder.
     *
     * @param builder <code>HashCodeBuilder</code>
     */
    protected abstract void addFieldsToHashCodeBuilder(HashCodeBuilder builder);

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public final String toString() {
        ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE);
        addFieldsToToStringBuilder(builder);
        return builder.toString();
    }

    /**
     * Adds the fields to to string builder.
     *
     * @param builder <code>ToStringBuilder</code>
     */
    protected abstract void addFieldsToToStringBuilder(ToStringBuilder builder);

}