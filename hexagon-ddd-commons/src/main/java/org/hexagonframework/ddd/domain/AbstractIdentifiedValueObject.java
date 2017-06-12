package org.hexagonframework.ddd.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Xuegui Yuan
 */
public abstract class AbstractIdentifiedValueObject implements IdentifiedValueObject<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }
}
