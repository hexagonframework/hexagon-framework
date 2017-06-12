package org.hexagonframework.ddd.domain;

import java.io.Serializable;

/**
 * @author Xuegui Yuan
 */
public interface IdentifiedValueObject<ID extends Serializable> extends IdentifiedDomainObject<ID> {
}
