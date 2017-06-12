package org.hexagonframework.ddd.domain;

import java.util.Date;

/**
 * @author Xuegui Yuan
 */
public interface DomainEvent {

    int eventVersion();

    Date occurredOn();
}
