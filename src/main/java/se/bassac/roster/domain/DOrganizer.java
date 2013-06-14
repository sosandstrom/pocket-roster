/*
 * INSERT COPYRIGHT HERE
 */

package se.bassac.roster.domain;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author sosandstrom
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class DOrganizer extends AbstractLongEntity {

    @Basic
    private String name;
    
    /** The admins can create and edit Series and Races */
    @Basic
    private Collection<DAthlete> admins;
    
    /** The athletes have participated in zero or more Races */
    @Basic
    private Collection<DAthlete> athletes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<DAthlete> getAdmins() {
        return admins;
    }

    public void setAdmins(Collection<DAthlete> admins) {
        this.admins = admins;
    }

    public Collection<DAthlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(Collection<DAthlete> athletes) {
        this.athletes = athletes;
    }
    
}
