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
import se.bassac.roster.domain.DPassage;
import se.bassac.roster.domain.DCheckpoint;

/**
 * The DPassage domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2013-06-14T20:04:52.499+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDPassageDaoImpl extends TypeDaoImpl<DPassage, java.lang.Long> 
	implements GeneratedDPassageDao {

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
   public GeneratedDPassageDaoImpl() {
      super(DPassage.class, java.lang.Long.class);
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
    protected Object getDomainProperty(DPassage domain, String name) {
        Object value;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            value = domain.getId();
        }
        // parent key?
        else if (COLUMN_NAME_TIMINGSKEY.equals(name)) {
            value = domain.getTimingsKey();
        }
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
        }
        else if (COLUMN_NAME_PASSAGETIME.equals(name)) {
            value = domain.getPassageTime();
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
        else if (COLUMN_NAME_TIMINGSKEY.equals(name)) {
            clazz = java.lang.Object.class;
        }
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_PASSAGETIME.equals(name)) {
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
    protected void setDomainProperty(final DPassage domain, final String name, final Object value) {
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            domain.setId((java.lang.Long) value);
        }
        // parent key?
        else if (COLUMN_NAME_TIMINGSKEY.equals(name)) {
            domain.setTimingsKey((java.lang.Object) value);
        }
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_PASSAGETIME.equals(name)) {
            domain.setPassageTime((java.util.Date) value);
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
    protected void setDomainStringProperty(final DPassage domain, final String name, final Map<String, String> properties) {
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

    /** Default implementation returns null, overrides for timingsKey parent */
    public String getParentKeyColumnName() {
        return COLUMN_NAME_TIMINGSKEY;
    }

   // ------ END DaoImpl overrides -----------------------------

        public Object getParentKey(DPassage domain) {
            return domain.getTimingsKey();
        }

        public void setParentKey(DPassage domain, Object timingsKey) {
            domain.setTimingsKey((Serializable) timingsKey);
        }

	// ----------------------- parent finders -------------------------------

	/**
	 * query-by method for parent field timingsKey
	 * @param timingsKey the specified attribute
	 * @return an Iterable of DPassages for the specified parent
	 */
	public final Iterable<DPassage> queryByTimingsKey(Object timingsKey) {
            return queryIterable(false, 0, -1, timingsKey, null, null, false, null, false);
	}
	
	/**
	 * query-key-by method for parent field timingsKey
	 * @param timingsKey the parent
	 * @return an Iterable of keys to the DPassages with the specified parent
	 */
	public final Iterable<java.lang.Long> queryKeysByTimingsKey(Object timingsKey) {
            return queryIterableKeys(0, -1, timingsKey, null, null, false, null, false);
	}

	/**
	 * query-page-by method for parent field timingsKey
	 * @param timingsKey the specified parent
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DPassages for the specified timingsKey
	 */
	public final CursorPage<DPassage, java.lang.Long> queryPageByTimingsKey(java.lang.Object timingsKey,
            int pageSize, String cursorString) {
            return queryPage(false, pageSize, timingsKey, null, null, false, null, false, cursorString);
        }


        /**
         * @return the simple key for specified DPassage domain object
         */
        public Long getSimpleKey(DPassage domain) {
            if (null == domain) {
                return null;
            }
            return domain.getId();
        }

        /**
         * @return the simple key for specified DPassage domain object
         */
        public void setSimpleKey(DPassage domain, Long id) {
            domain.setId(id);
        }

        public String getCreatedByColumnName() {
            return COLUMN_NAME_CREATEDBY;
        }

        public String getCreatedBy(DPassage domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedBy();
        }

        public void _setCreatedBy(DPassage domain, String creator) {
            domain.setCreatedBy(creator);
        }

        public String getUpdatedByColumnName() {
            return COLUMN_NAME_UPDATEDBY;
        }

        public String getUpdatedBy(DPassage domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedBy();
        }

        public void _setUpdatedBy(DPassage domain, String updator) {
            domain.setUpdatedBy(updator);
        }

        public String getCreatedDateColumnName() {
            return COLUMN_NAME_CREATEDDATE;
        }

        public Date getCreatedDate(DPassage domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedDate();
        }

        public void _setCreatedDate(DPassage domain, Date date) {
            domain.setCreatedDate(date);
        }

        public String getUpdatedDateColumnName() {
            return COLUMN_NAME_UPDATEDDATE;
        }

        public Date getUpdatedDate(DPassage domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedDate();
        }

        public void _setUpdatedDate(DPassage domain, Date date) {
            domain.setUpdatedDate(date);
        }

	// ----------------------- field finders -------------------------------
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DPassage> queryByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of keys to the DPassages with the specified attribute
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
	 * @return a Page of DPassages for the specified createdBy
	 */
	public final CursorPage<DPassage, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DPassage> queryByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of keys to the DPassages with the specified attribute
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
	 * @return a Page of DPassages for the specified createdDate
	 */
	public final CursorPage<DPassage, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DPassage> queryByPassageTime(java.util.Date passageTime) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PASSAGETIME, passageTime);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field passageTime
	 * @param passageTime the specified attribute
	 * @return an Iterable of keys to the DPassages with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByPassageTime(java.util.Date passageTime) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PASSAGETIME, passageTime);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field passageTime
	 * @param passageTime the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DPassages for the specified passageTime
	 */
	public final CursorPage<DPassage, java.lang.Long> queryPageByPassageTime(java.util.Date passageTime,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PASSAGETIME, passageTime);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DPassage> queryByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of keys to the DPassages with the specified attribute
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
	 * @return a Page of DPassages for the specified updatedBy
	 */
	public final CursorPage<DPassage, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DPassage> queryByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of keys to the DPassages with the specified attribute
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
	 * @return a Page of DPassages for the specified updatedDate
	 */
	public final CursorPage<DPassage, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field checkpoint
	 * @param checkpoint the id of the related se.bassac.roster.domain.DCheckpoint entity
	 * @return an Iterable of DPassages belonging to the many-to-one relation
	 */
	public final Iterable<DPassage> queryByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint) {
            final Object foreignKey = checkpointDao.getPrimaryKey(checkpoint);
            final Filter filter = createEqualsFilter(COLUMN_NAME_CHECKPOINT, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for many-to-one field checkpoint
	 * @param checkpoint the related se.bassac.roster.domain.DCheckpoint entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DPassages belonging to the many-to-one relation
	 */
	public final CursorPage<DPassage, java.lang.Long> queryPageByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint,
                int pageSize, String cursorString) {
            final Object foreignKey = checkpointDao.getPrimaryKey(checkpoint);
            final Filter filter = createEqualsFilter(COLUMN_NAME_CHECKPOINT, foreignKey);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	/**
	 * query-key-by method for many-to-one field checkpoint
	 * @param checkpoint the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DPassages with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint) {
            final Object foreignKey = checkpointDao.getPrimaryKey(checkpoint);
            final Filter filter = createEqualsFilter(COLUMN_NAME_CHECKPOINT, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-by method for many-to-one field checkpoint
	 * @param id the related se.bassac.roster.domain.DCheckpoint entity's simple key
	 * @return an Iterable of DPassages belonging to the many-to-one relation
	 */
	public final Iterable<DPassage> queryByCheckpointId(java.lang.Long id) {
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
	public DPassage persist(Object timingsKey,  	
		java.lang.Long id, 
		java.util.Date passageTime, 
		se.bassac.roster.domain.DCheckpoint checkpoint) {

            DPassage domain = null;
            // if primaryKey specified, use it
            if (null != id) {
                    domain = findByPrimaryKey(timingsKey, id);
            }
		
            // create new?
            if (null == domain) {
                    domain = new DPassage();
                    // set parent
                    domain.setTimingsKey((java.lang.Object) timingsKey);
                    // generate Id?
                    if (null != id) {
                            domain.setId(id);
                    }
                    // fields
                    domain.setPassageTime(passageTime);
                    // one-to-ones
                    // many-to-ones
                    domain.setCheckpoint(checkpoint);
			
                    persist(domain);
            }
            return domain;
	}



}
