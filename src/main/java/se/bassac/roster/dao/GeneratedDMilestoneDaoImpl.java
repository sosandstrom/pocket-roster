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
import se.bassac.roster.domain.DMilestone;
import se.bassac.roster.domain.DCheckpoint;

/**
 * The DMilestone domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2013-06-14T20:04:52.499+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDMilestoneDaoImpl extends TypeDaoImpl<DMilestone, java.lang.Long> 
	implements GeneratedDMilestoneDao {

    /** DAO for Many-To-One relation checkpoint */
    private GeneratedDCheckpointDaoImpl checkpointDao;
    /** Setter for Many-To-One checkpoint DAO */
    public void setCheckpointDao(GeneratedDCheckpointDaoImpl dao) {
        checkpointDao = dao;
        MANY_TO_ONE_DAOS.put(COLUMN_NAME_CHECKPOINT, dao);
    }
    /** Getter for Many-To-One checkpoint DAO */
    protected GeneratedDCheckpointDaoImpl getCheckpointDao() {
        return checkpointDao;
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
   public GeneratedDMilestoneDaoImpl() {
      super(DMilestone.class, java.lang.Long.class);
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
    protected Object getDomainProperty(DMilestone domain, String name) {
        Object value;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            value = domain.getId();
        }
        // parent key?
        else if (COLUMN_NAME_TRACKKEY.equals(name)) {
            value = domain.getTrackKey();
        }
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
        }
        else if (COLUMN_NAME_DISTANCE.equals(name)) {
            value = domain.getDistance();
        }
        else if (COLUMN_NAME_LAPNUMBER.equals(name)) {
            value = domain.getLapNumber();
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            value = domain.getName();
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            value = domain.getUpdatedBy();
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            value = domain.getUpdatedDate();
        }
        // one-to-ones
        // many-to-ones
        else if (COLUMN_NAME_CHECKPOINT.equals(name)) {
            final se.bassac.roster.domain.DCheckpoint foreign = domain.getCheckpoint();
            final Object foreignKey = checkpointDao.getPrimaryKey(foreign);
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
        else if (COLUMN_NAME_TRACKKEY.equals(name)) {
            clazz = java.lang.Object.class;
        }
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_DISTANCE.equals(name)) {
            clazz = java.lang.Integer.class;
        }
        else if (COLUMN_NAME_LAPNUMBER.equals(name)) {
            clazz = java.lang.Integer.class;
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        // one-to-ones
        // many-to-ones
        else if (COLUMN_NAME_CHECKPOINT.equals(name)) {
            clazz = se.bassac.roster.domain.DCheckpoint.class;
        }
        // many-to-manys
        else {
            throw new IllegalArgumentException("No such column " + name);
        }

        return clazz;
    }
      
    @Override
    protected void setDomainProperty(final DMilestone domain, final String name, final Object value) {
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            domain.setId((java.lang.Long) value);
        }
        // parent key?
        else if (COLUMN_NAME_TRACKKEY.equals(name)) {
            domain.setTrackKey((java.lang.Object) value);
        }
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_DISTANCE.equals(name)) {
            domain.setDistance((java.lang.Integer) value);
        }
        else if (COLUMN_NAME_LAPNUMBER.equals(name)) {
            domain.setLapNumber((java.lang.Integer) value);
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            domain.setName((java.lang.String) value);
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            domain.setUpdatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            domain.setUpdatedDate((java.util.Date) value);
        }
        // one-to-ones
        // many-to-ones
        else if (COLUMN_NAME_CHECKPOINT.equals(name)) {
            DCheckpoint foreign = null;
            if (null != value) {
                try {
                    foreign = checkpointDao.createDomain(value);
                } catch (InstantiationException ex) {
                    LOG.error("Creating foreign domain", ex);
                } catch (IllegalAccessException ex) {
                    LOG.error("Creating foreign domain", ex);
                }
            }
            domain.setCheckpoint(foreign);
        }
        // many-to-manys
        else {
            super.setDomainProperty(domain, name, value);
        }
    }

    @Override
    protected void setDomainStringProperty(final DMilestone domain, final String name, final Map<String, String> properties) {
        final String value = properties.get(name);
        Class clazz = getColumnClass(name);
        // many-to-ones
        if (COLUMN_NAME_CHECKPOINT.equals(name)) {
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

    /** Default implementation returns null, overrides for trackKey parent */
    public String getParentKeyColumnName() {
        return COLUMN_NAME_TRACKKEY;
    }

   // ------ END DaoImpl overrides -----------------------------

        public Object getParentKey(DMilestone domain) {
            return domain.getTrackKey();
        }

        public void setParentKey(DMilestone domain, Object trackKey) {
            domain.setTrackKey((Serializable) trackKey);
        }

	// ----------------------- parent finders -------------------------------

	/**
	 * query-by method for parent field trackKey
	 * @param trackKey the specified attribute
	 * @return an Iterable of DMilestones for the specified parent
	 */
	public final Iterable<DMilestone> queryByTrackKey(Object trackKey) {
            return queryIterable(false, 0, -1, trackKey, null, null, false, null, false);
	}
	
	/**
	 * query-key-by method for parent field trackKey
	 * @param trackKey the parent
	 * @return an Iterable of keys to the DMilestones with the specified parent
	 */
	public final Iterable<java.lang.Long> queryKeysByTrackKey(Object trackKey) {
            return queryIterableKeys(0, -1, trackKey, null, null, false, null, false);
	}

	/**
	 * query-page-by method for parent field trackKey
	 * @param trackKey the specified parent
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified trackKey
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByTrackKey(java.lang.Object trackKey,
            int pageSize, String cursorString) {
            return queryPage(false, pageSize, trackKey, null, null, false, null, false, cursorString);
        }


        /**
         * @return the simple key for specified DMilestone domain object
         */
        public Long getSimpleKey(DMilestone domain) {
            if (null == domain) {
                return null;
            }
            return domain.getId();
        }

        /**
         * @return the simple key for specified DMilestone domain object
         */
        public void setSimpleKey(DMilestone domain, Long id) {
            domain.setId(id);
        }

        public String getCreatedByColumnName() {
            return COLUMN_NAME_CREATEDBY;
        }

        public String getCreatedBy(DMilestone domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedBy();
        }

        public void _setCreatedBy(DMilestone domain, String creator) {
            domain.setCreatedBy(creator);
        }

        public String getUpdatedByColumnName() {
            return COLUMN_NAME_UPDATEDBY;
        }

        public String getUpdatedBy(DMilestone domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedBy();
        }

        public void _setUpdatedBy(DMilestone domain, String updator) {
            domain.setUpdatedBy(updator);
        }

        public String getCreatedDateColumnName() {
            return COLUMN_NAME_CREATEDDATE;
        }

        public Date getCreatedDate(DMilestone domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedDate();
        }

        public void _setCreatedDate(DMilestone domain, Date date) {
            domain.setCreatedDate(date);
        }

        public String getUpdatedDateColumnName() {
            return COLUMN_NAME_UPDATEDDATE;
        }

        public Date getUpdatedDate(DMilestone domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedDate();
        }

        public void _setUpdatedDate(DMilestone domain, Date date) {
            domain.setUpdatedDate(date);
        }

	// ----------------------- field finders -------------------------------
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DMilestone> queryByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of keys to the DMilestones with the specified attribute
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
	 * @return a Page of DMilestones for the specified createdBy
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DMilestone> queryByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of keys to the DMilestones with the specified attribute
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
	 * @return a Page of DMilestones for the specified createdDate
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DMilestone> queryByDistance(java.lang.Integer distance) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_DISTANCE, distance);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field distance
	 * @param distance the specified attribute
	 * @return an Iterable of keys to the DMilestones with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByDistance(java.lang.Integer distance) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_DISTANCE, distance);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field distance
	 * @param distance the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified distance
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByDistance(java.lang.Integer distance,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_DISTANCE, distance);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DMilestone> queryByLapNumber(java.lang.Integer lapNumber) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LAPNUMBER, lapNumber);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field lapNumber
	 * @param lapNumber the specified attribute
	 * @return an Iterable of keys to the DMilestones with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByLapNumber(java.lang.Integer lapNumber) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LAPNUMBER, lapNumber);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field lapNumber
	 * @param lapNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified lapNumber
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByLapNumber(java.lang.Integer lapNumber,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LAPNUMBER, lapNumber);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DMilestone> queryByName(java.lang.String name) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field name
	 * @param name the specified attribute
	 * @return an Iterable of keys to the DMilestones with the specified attribute
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
	 * @return a Page of DMilestones for the specified name
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByName(java.lang.String name,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DMilestone> queryByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of keys to the DMilestones with the specified attribute
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
	 * @return a Page of DMilestones for the specified updatedBy
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DMilestone> queryByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of keys to the DMilestones with the specified attribute
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
	 * @return a Page of DMilestones for the specified updatedDate
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field checkpoint
	 * @param checkpoint the id of the related se.bassac.roster.domain.DCheckpoint entity
	 * @return an Iterable of DMilestones belonging to the many-to-one relation
	 */
	public final Iterable<DMilestone> queryByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint) {
            final Object foreignKey = checkpointDao.getPrimaryKey(checkpoint);
            final Filter filter = createEqualsFilter(COLUMN_NAME_CHECKPOINT, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for many-to-one field checkpoint
	 * @param checkpoint the related se.bassac.roster.domain.DCheckpoint entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DMilestones belonging to the many-to-one relation
	 */
	public final CursorPage<DMilestone, java.lang.Long> queryPageByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint,
                int pageSize, String cursorString) {
            final Object foreignKey = checkpointDao.getPrimaryKey(checkpoint);
            final Filter filter = createEqualsFilter(COLUMN_NAME_CHECKPOINT, foreignKey);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	/**
	 * query-key-by method for many-to-one field checkpoint
	 * @param checkpoint the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DMilestones with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint) {
            final Object foreignKey = checkpointDao.getPrimaryKey(checkpoint);
            final Filter filter = createEqualsFilter(COLUMN_NAME_CHECKPOINT, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-by method for many-to-one field checkpoint
	 * @param id the related se.bassac.roster.domain.DCheckpoint entity's simple key
	 * @return an Iterable of DMilestones belonging to the many-to-one relation
	 */
	public final Iterable<DMilestone> queryByCheckpointId(java.lang.Long id) {
            final Object foreignKey = checkpointDao.getPrimaryKey(null, id);
            final Filter filter = createEqualsFilter(COLUMN_NAME_CHECKPOINT, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-keys-by method for many-to-one field checkpoint
	 * @param id the related se.bassac.roster.domain.DCheckpoint entity's simple key
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	public final Iterable<java.lang.Long> queryKeysByCheckpointId(java.lang.Long id) {
            final Object foreignKey = checkpointDao.getPrimaryKey(null, id);
            final Filter filter = createEqualsFilter(COLUMN_NAME_CHECKPOINT, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	

	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------

	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	public DMilestone persist(Object trackKey,  	
		java.lang.Long id, 
		java.lang.Integer distance, 
		java.lang.Integer lapNumber, 
		java.lang.String name, 
		se.bassac.roster.domain.DCheckpoint checkpoint) {

            DMilestone domain = null;
            // if primaryKey specified, use it
            if (null != id) {
                    domain = findByPrimaryKey(trackKey, id);
            }
		
            // create new?
            if (null == domain) {
                    domain = new DMilestone();
                    // set parent
                    domain.setTrackKey((java.lang.Object) trackKey);
                    // generate Id?
                    if (null != id) {
                            domain.setId(id);
                    }
                    // fields
                    domain.setDistance(distance);
                    domain.setLapNumber(lapNumber);
                    domain.setName(name);
                    // one-to-ones
                    // many-to-ones
                    domain.setCheckpoint(checkpoint);
			
                    persist(domain);
            }
            return domain;
	}



}
