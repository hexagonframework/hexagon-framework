package org.hexagonframework.ddd.domain;

import javax.persistence.MappedSuperclass;

/**
 * @author Xuegui Yuan
 */
@MappedSuperclass
public class AbstractConcurrencyAggregateRoot extends AbstractConcurrencySafeEntity implements AggregateRoot<Long> {
    @Override
    public void apply(DomainEvent domainEvent) {

    }
}
