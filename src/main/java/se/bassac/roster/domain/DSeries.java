/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import net.sf.mardao.core.Parent;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class DSeries extends AbstractLongEntity {
    
    @Parent(kind="DOrganizer")
    private Object organizerKey;

    @Basic
    private String name;

    public Object getOrganizerKey() {
        return organizerKey;
    }

    public void setOrganizerKey(Object organizerKey) {
        this.organizerKey = organizerKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
