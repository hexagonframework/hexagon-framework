package org.hexagonframework.ddd.domain;

import java.io.Serializable;

/**
 * @author Xuegui Yuan
 */
public interface ConcurrencySafeEntity<ID extends Serializable> extends Entity<ID> {

    long getVersion();

}
