package org.hexagonframework.ddd.domain;

import java.io.Serializable;

/**
 * @author Xuegui Yuan
 */
public interface ConcurrencySafeAggregateRoot<ID extends Serializable> extends ConcurrencySafeEntity<ID> {
}
