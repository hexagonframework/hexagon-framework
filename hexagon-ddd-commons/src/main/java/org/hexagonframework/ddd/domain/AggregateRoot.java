package org.hexagonframework.ddd.domain;

import java.io.Serializable;

/**
 * @author Xuegui Yuan
 */
public interface AggregateRoot<ID extends Serializable> extends Entity<ID> {

    void apply(DomainEvent domainEvent);

}
