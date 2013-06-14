package se.bassac.roster.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.Filter;
import net.sf.mardao.core.dao.DaoImpl;
import net.sf.mardao.core.dao.TypeDaoImpl;
import net.sf.mardao.core.geo.DLocation;
import se.bassac.roster.domain.DClass;
import se.bassac.roster.domain.DTrack;

/**
 * The DClass domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2013-06-14T20:04:52.499+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDClassDaoImpl extends TypeDaoImpl<DClass, java.lang.Long> 
	implements GeneratedDClassDao {

    /** DAO for Many-To-One relation track */
    private GeneratedDTrackDaoImpl trackDao;
    /** Setter for Many-To-One track DAO */
    public void setTrackDao(GeneratedDTrackDaoImpl dao) {
        trackDao = dao;
        MANY_TO_ONE_DAOS.put(COLUMN_NAME_TRACK, dao);
    }
    /** Getter for Many-To-One track DAO */
    protected GeneratedDTrackDaoImpl getTrackDao() {
        return trackDao;
    }

    /** to list the property names for ManyToOne relations */
    @Override
    protected List<String> getBasicColumnNames() {
        return BASIC_NAMES;
    }

    /** to list the property names for ManyToOne relations */
    @Override
    protected List<String> getManyToOneColumnNames() {
        return MANY_TO_ONE_NAMES;
    }

    private final Map<String, DaoImpl> MANY_TO_ONE_DAOS = new TreeMap<String, DaoImpl>();

    /** Default constructor */
   public GeneratedDClassDaoImpl() {
      super(DClass.class, java.lang.Long.class);
   }

   // ------ BEGIN DaoImpl overrides -----------------------------
   
   public String getPrimaryKeyColumnName() {
   		return COLUMN_NAME_ID;
   }
   
   public List<String> getColumnNames() {
        return COLUMN_NAMES;
   }

   @Override
   protected DaoImpl getManyToOneDao(String columnName) {
       return MANY_TO_ONE_DAOS.get(columnName);
   }

    @Override
    protected Object getDomainProperty(DClass domain, String name) {
        Object value;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            value = domain.getId();
        }
        // parent key?
        else if (COLUMN_NAME_RACEKEY.equals(name)) {
            value = domain.getRaceKey();
        }
        // fields
        else if (COLUMN_NAME_ACTUALSTART.equals(name)) {
            value = domain.getActualStart();
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            value = domain.getName();
        }
        else if (COLUMN_NAME_SCHEDULEDSTART.equals(name)) {
            value = domain.getScheduledStart();
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            value = domain.getUpdatedBy();
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            value = domain.getUpdatedDate();
        }
        // one-to-ones
        // many-to-ones
        else if (COLUMN_NAME_TRACK.equals(name)) {
            final se.bassac.roster.domain.DTrack foreign = domain.getTrack();
            final Object foreignKey = trackDao.getPrimaryKey(foreign);
            value = foreignKey;
        }
        // many-to-manys
        else {
            value = super.getDomainProperty(domain, name);
        }

        return value;
    }

    /**
     * Returns the class of the domain property for specified column
     * @param name
     * @return the class of the domain property
     */
    public Class getColumnClass(String name) {
        Class clazz;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            clazz = java.lang.Long.class;
        }
        // parent key?
        else if (COLUMN_NAME_RACEKEY.equals(name)) {
            clazz = java.lang.Object.class;
        }
        // fields
        else if (COLUMN_NAME_ACTUALSTART.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_SCHEDULEDSTART.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        // one-to-ones
        // many-to-ones
        else if (COLUMN_NAME_TRACK.equals(name)) {
            clazz = se.bassac.roster.domain.DTrack.class;
        }
        // many-to-manys
        else {
            throw new IllegalArgumentException("No such column " + name);
        }

        return clazz;
    }
      
    @Override
    protected void setDomainProperty(final DClass domain, final String name, final Object value) {
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            domain.setId((java.lang.Long) value);
        }
        // parent key?
        else if (COLUMN_NAME_RACEKEY.equals(name)) {
            domain.setRaceKey((java.lang.Object) value);
        }
        // fields
        else if (COLUMN_NAME_ACTUALSTART.equals(name)) {
            domain.setActualStart((java.util.Date) value);
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            domain.setName((java.lang.String) value);
        }
        else if (COLUMN_NAME_SCHEDULEDSTART.equals(name)) {
            domain.setScheduledStart((java.util.Date) value);
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            domain.setUpdatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            domain.setUpdatedDate((java.util.Date) value);
        }
        // one-to-ones
        // many-to-ones
        else if (COLUMN_NAME_TRACK.equals(name)) {
            DTrack foreign = null;
            if (null != value) {
                try {
                    foreign = trackDao.createDomain(value);
                } catch (InstantiationException ex) {
                    LOG.error("Creating foreign domain", ex);
                } catch (IllegalAccessException ex) {
                    LOG.error("Creating foreign domain", ex);
                }
            }
            domain.setTrack(foreign);
        }
        // many-to-manys
        else {
            super.setDomainProperty(domain, name, value);
        }
    }

    @Override
    protected void setDomainStringProperty(final DClass domain, final String name, final Map<String, String> properties) {
        final String value = properties.get(name);
        Class clazz = getColumnClass(name);
        // many-to-ones
        if (COLUMN_NAME_TRACK.equals(name)) {
            clazz = java.lang.Long.class;
        }
        setDomainProperty(domain, name, parseProperty(value, clazz));
    }

    /**
     * Overrides to substitute Entity properties with foreign keys
     */
    @Override
    protected void setCoreProperty(Object core, String name, Object value) {
        if (null == core || null == name) {
            return;
        }
        else if (null == value) {
            // do nothing in particular, will call super at end
        }
        super.setCoreProperty(core, name, value);
    }

    /** Default implementation returns null, overrides for raceKey parent */
    public String getParentKeyColumnName() {
        return COLUMN_NAME_RACEKEY;
    }

   // ------ END DaoImpl overrides -----------------------------

        public Object getParentKey(DClass domain) {
            return domain.getRaceKey();
        }

        public void setParentKey(DClass domain, Object raceKey) {
            domain.setRaceKey((Serializable) raceKey);
        }

	// ----------------------- parent finders -------------------------------

	/**
	 * query-by method for parent field raceKey
	 * @param raceKey the specified attribute
	 * @return an Iterable of DClasss for the specified parent
	 */
	public final Iterable<DClass> queryByRaceKey(Object raceKey) {
            return queryIterable(false, 0, -1, raceKey, null, null, false, null, false);
	}
	
	/**
	 * query-key-by method for parent field raceKey
	 * @param raceKey the parent
	 * @return an Iterable of keys to the DClasss with the specified parent
	 */
	public final Iterable<java.lang.Long> queryKeysByRaceKey(Object raceKey) {
            return queryIterableKeys(0, -1, raceKey, null, null, false, null, false);
	}

	/**
	 * query-page-by method for parent field raceKey
	 * @param raceKey the specified parent
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified raceKey
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByRaceKey(java.lang.Object raceKey,
            int pageSize, String cursorString) {
            return queryPage(false, pageSize, raceKey, null, null, false, null, false, cursorString);
        }


        /**
         * @return the simple key for specified DClass domain object
         */
        public Long getSimpleKey(DClass domain) {
            if (null == domain) {
                return null;
            }
            return domain.getId();
        }

        /**
         * @return the simple key for specified DClass domain object
         */
        public void setSimpleKey(DClass domain, Long id) {
            domain.setId(id);
        }

        public String getCreatedByColumnName() {
            return COLUMN_NAME_CREATEDBY;
        }

        public String getCreatedBy(DClass domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedBy();
        }

        public void _setCreatedBy(DClass domain, String creator) {
            domain.setCreatedBy(creator);
        }

        public String getUpdatedByColumnName() {
            return COLUMN_NAME_UPDATEDBY;
        }

        public String getUpdatedBy(DClass domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedBy();
        }

        public void _setUpdatedBy(DClass domain, String updator) {
            domain.setUpdatedBy(updator);
        }

        public String getCreatedDateColumnName() {
            return COLUMN_NAME_CREATEDDATE;
        }

        public Date getCreatedDate(DClass domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedDate();
        }

        public void _setCreatedDate(DClass domain, Date date) {
            domain.setCreatedDate(date);
        }

        public String getUpdatedDateColumnName() {
            return COLUMN_NAME_UPDATEDDATE;
        }

        public Date getUpdatedDate(DClass domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedDate();
        }

        public void _setUpdatedDate(DClass domain, Date date) {
            domain.setUpdatedDate(date);
        }

	// ----------------------- field finders -------------------------------
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DClass> queryByActualStart(java.util.Date actualStart) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALSTART, actualStart);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field actualStart
	 * @param actualStart the specified attribute
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByActualStart(java.util.Date actualStart) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALSTART, actualStart);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field actualStart
	 * @param actualStart the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified actualStart
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByActualStart(java.util.Date actualStart,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALSTART, actualStart);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DClass> queryByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified createdBy
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DClass> queryByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified createdDate
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DClass> queryByName(java.lang.String name) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field name
	 * @param name the specified attribute
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByName(java.lang.String name) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field name
	 * @param name the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified name
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByName(java.lang.String name,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DClass> queryByScheduledStart(java.util.Date scheduledStart) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SCHEDULEDSTART, scheduledStart);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field scheduledStart
	 * @param scheduledStart the specified attribute
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByScheduledStart(java.util.Date scheduledStart) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SCHEDULEDSTART, scheduledStart);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field scheduledStart
	 * @param scheduledStart the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified scheduledStart
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByScheduledStart(java.util.Date scheduledStart,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SCHEDULEDSTART, scheduledStart);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DClass> queryByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified updatedBy
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DClass> queryByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified updatedDate
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field track
	 * @param track the id of the related se.bassac.roster.domain.DTrack entity
	 * @return an Iterable of DClasss belonging to the many-to-one relation
	 */
	public final Iterable<DClass> queryByTrack(se.bassac.roster.domain.DTrack track) {
            final Object foreignKey = trackDao.getPrimaryKey(track);
            final Filter filter = createEqualsFilter(COLUMN_NAME_TRACK, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for many-to-one field track
	 * @param track the related se.bassac.roster.domain.DTrack entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DClasss belonging to the many-to-one relation
	 */
	public final CursorPage<DClass, java.lang.Long> queryPageByTrack(se.bassac.roster.domain.DTrack track,
                int pageSize, String cursorString) {
            final Object foreignKey = trackDao.getPrimaryKey(track);
            final Filter filter = createEqualsFilter(COLUMN_NAME_TRACK, foreignKey);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	/**
	 * query-key-by method for many-to-one field track
	 * @param track the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByTrack(se.bassac.roster.domain.DTrack track) {
            final Object foreignKey = trackDao.getPrimaryKey(track);
            final Filter filter = createEqualsFilter(COLUMN_NAME_TRACK, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-by method for many-to-one field track
	 * @param id the related se.bassac.roster.domain.DTrack entity's simple key
	 * @return an Iterable of DClasss belonging to the many-to-one relation
	 */
	public final Iterable<DClass> queryByTrackId(java.lang.Long id) {
            final Object foreignKey = trackDao.getPrimaryKey(null, id);
            final Filter filter = createEqualsFilter(COLUMN_NAME_TRACK, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-keys-by method for many-to-one field track
	 * @param id the related se.bassac.roster.domain.DTrack entity's simple key
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	public final Iterable<java.lang.Long> queryKeysByTrackId(java.lang.Long id) {
            final Object foreignKey = trackDao.getPrimaryKey(null, id);
            final Filter filter = createEqualsFilter(COLUMN_NAME_TRACK, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	

	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------

	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	public DClass persist(Object raceKey,  	
		java.lang.Long id, 
		java.util.Date actualStart, 
		java.lang.String name, 
		java.util.Date scheduledStart, 
		se.bassac.roster.domain.DTrack track) {

            DClass domain = null;
            // if primaryKey specified, use it
            if (null != id) {
                    domain = findByPrimaryKey(raceKey, id);
            }
		
            // create new?
            if (null == domain) {
                    domain = new DClass();
                    // set parent
                    domain.setRaceKey((java.lang.Object) raceKey);
                    // generate Id?
                    if (null != id) {
                            domain.setId(id);
                    }
                    // fields
                    domain.setActualStart(actualStart);
                    domain.setName(name);
                    domain.setScheduledStart(scheduledStart);
                    // one-to-ones
                    // many-to-ones
                    domain.setTrack(track);
			
                    persist(domain);
            }
            return domain;
	}



}
