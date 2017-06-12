package org.hexagonframework.ddd.domain;

import javax.persistence.MappedSuperclass;

/**
 * @author Xuegui Yuan
 */
@MappedSuperclass
public abstract class AbstractAggregateRoot extends AbstractEntity implements AggregateRoot<Long> {
    @Override
    public void apply(DomainEvent domainEvent) {

    }
}
