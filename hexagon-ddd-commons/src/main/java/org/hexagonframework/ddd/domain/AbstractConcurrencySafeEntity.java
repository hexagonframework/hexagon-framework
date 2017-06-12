package org.hexagonframework.ddd.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * @author Xuegui Yuan
 */
@MappedSuperclass
public abstract class AbstractConcurrencySafeEntity extends AbstractEntity implements ConcurrencySafeEntity<Long> {

    @Version
    private long version;

    @Override
    public long getVersion() {
        return version;
    }
}
