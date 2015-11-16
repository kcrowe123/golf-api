package com.golf.domain.player;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.golf.domain.Entity;

@SuppressWarnings("serial")
public class Player1 extends Entity {

    private final String name;

    public Player1(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected void addEntityFieldsToEqualsBuilder(EqualsBuilder builder, Object obj) {
    	Player1 rhs = (Player1) obj;
        builder.append(name, rhs.name);
    }

    @Override
    protected int hashCodeMultiplier() {
        return 7;
    }

    @Override
    protected void addEntityFieldsToHashCodeBuilder(HashCodeBuilder builder) {
        builder.append(name);
    }

    @Override
    protected void addEntityFieldsToToStringBuilder(ToStringBuilder builder) {
        builder.append("name", name);
    }
}
