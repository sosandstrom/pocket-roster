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
import se.bassac.roster.domain.DParticipant;
import se.bassac.roster.domain.DClass;

/**
 * The DParticipant domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2013-06-20T14:52:45.890+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDParticipantDaoImpl extends TypeDaoImpl<DParticipant, java.lang.Long> 
	implements GeneratedDParticipantDao {

    /** DAO for Many-To-One relation raceClass */
    private GeneratedDClassDaoImpl raceClassDao;
    /** Setter for Many-To-One raceClass DAO */
    public void setRaceClassDao(GeneratedDClassDaoImpl dao) {
        raceClassDao = dao;
        MANY_TO_ONE_DAOS.put(COLUMN_NAME_RACECLASS, dao);
    }
    /** Getter for Many-To-One raceClass DAO */
    protected GeneratedDClassDaoImpl getRaceClassDao() {
        return raceClassDao;
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
   public GeneratedDParticipantDaoImpl() {
      super(DParticipant.class, java.lang.Long.class);
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
    protected Object getDomainProperty(DParticipant domain, String name) {
        Object value;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            value = domain.getId();
        }
        // parent key?
        else if (COLUMN_NAME_ATHLETEKEY.equals(name)) {
            value = domain.getAthleteKey();
        }
        // fields
        else if (COLUMN_NAME_BIBNUMBER.equals(name)) {
            value = domain.getBibNumber();
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            value = domain.getUpdatedBy();
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            value = domain.getUpdatedDate();
        }
        // one-to-ones
        // many-to-ones
        else if (COLUMN_NAME_RACECLASS.equals(name)) {
            value = domain.getRaceClass();
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
        else if (COLUMN_NAME_ATHLETEKEY.equals(name)) {
            clazz = java.lang.Object.class;
        }
        // fields
        else if (COLUMN_NAME_BIBNUMBER.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
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
        else if (COLUMN_NAME_RACECLASS.equals(name)) {
            clazz = se.bassac.roster.domain.DClass.class;
        }
        // many-to-manys
        else {
            throw new IllegalArgumentException("No such column " + name);
        }

        return clazz;
    }
      
    @Override
    protected void setDomainProperty(final DParticipant domain, final String name, final Object value) {
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            domain.setId((java.lang.Long) value);
        }
        // parent key?
        else if (COLUMN_NAME_ATHLETEKEY.equals(name)) {
            domain.setAthleteKey((java.lang.Object) value);
        }
        // fields
        else if (COLUMN_NAME_BIBNUMBER.equals(name)) {
            domain.setBibNumber((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            domain.setUpdatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            domain.setUpdatedDate((java.util.Date) value);
        }
        // one-to-ones
        // many-to-ones
        else if (COLUMN_NAME_RACECLASS.equals(name)) {
            DClass foreign = null;
            if (null != value) {
                foreign = raceClassDao.createDomain(value);
            }
            domain.setRaceClass(foreign);
        }
        // many-to-manys
        else {
            super.setDomainProperty(domain, name, value);
        }
    }

    @Override
    protected void setDomainStringProperty(final DParticipant domain, final String name, final Map<String, String> properties) {
        final String value = properties.get(name);
        Class clazz = getColumnClass(name);
        // many-to-ones
        if (COLUMN_NAME_RACECLASS.equals(name)) {
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
        else if (COLUMN_NAME_RACECLASS.equals(name)) {
            // many-to-one: replace foreign entity with its primary key
            DClass foreign = (DClass) value;
            value = raceClassDao.getPrimaryKey(foreign);
        }
        super.setCoreProperty(core, name, value);
    }

    /** Default implementation returns null, overrides for athleteKey parent */
    public String getParentKeyColumnName() {
        return COLUMN_NAME_ATHLETEKEY;
    }

   // ------ END DaoImpl overrides -----------------------------

        public Object getParentKey(DParticipant domain) {
            return domain.getAthleteKey();
        }

        public void setParentKey(DParticipant domain, Object athleteKey) {
            domain.setAthleteKey((Serializable) athleteKey);
        }

	// ----------------------- parent finders -------------------------------

	/**
	 * query-by method for parent field athleteKey
	 * @param athleteKey the specified attribute
	 * @return an Iterable of DParticipants for the specified parent
	 */
	public final Iterable<DParticipant> queryByAthleteKey(Object athleteKey) {
            return queryIterable(false, 0, -1, athleteKey, null, null, false, null, false);
	}
	
	/**
	 * query-key-by method for parent field athleteKey
	 * @param athleteKey the parent
	 * @return an Iterable of keys to the DParticipants with the specified parent
	 */
	public final Iterable<java.lang.Long> queryKeysByAthleteKey(Object athleteKey) {
            return queryIterableKeys(0, -1, athleteKey, null, null, false, null, false);
	}

	/**
	 * query-page-by method for parent field athleteKey
	 * @param athleteKey the specified parent
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DParticipants for the specified athleteKey
	 */
	public final CursorPage<DParticipant, java.lang.Long> queryPageByAthleteKey(java.lang.Object athleteKey,
            int pageSize, String cursorString) {
            return queryPage(false, pageSize, athleteKey, null, null, false, null, false, cursorString);
        }


        /**
         * @return the simple key for specified DParticipant domain object
         */
        public Long getSimpleKey(DParticipant domain) {
            if (null == domain) {
                return null;
            }
            return domain.getId();
        }

        /**
         * @return the simple key for specified DParticipant domain object
         */
        public void setSimpleKey(DParticipant domain, Long id) {
            domain.setId(id);
        }

        public String getCreatedByColumnName() {
            return COLUMN_NAME_CREATEDBY;
        }

        public String getCreatedBy(DParticipant domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedBy();
        }

        public void _setCreatedBy(DParticipant domain, String creator) {
            domain.setCreatedBy(creator);
        }

        public String getUpdatedByColumnName() {
            return COLUMN_NAME_UPDATEDBY;
        }

        public String getUpdatedBy(DParticipant domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedBy();
        }

        public void _setUpdatedBy(DParticipant domain, String updator) {
            domain.setUpdatedBy(updator);
        }

        public String getCreatedDateColumnName() {
            return COLUMN_NAME_CREATEDDATE;
        }

        public Date getCreatedDate(DParticipant domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedDate();
        }

        public void _setCreatedDate(DParticipant domain, Date date) {
            domain.setCreatedDate(date);
        }

        public String getUpdatedDateColumnName() {
            return COLUMN_NAME_UPDATEDDATE;
        }

        public Date getUpdatedDate(DParticipant domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedDate();
        }

        public void _setUpdatedDate(DParticipant domain, Date date) {
            domain.setUpdatedDate(date);
        }

	// ----------------------- field finders -------------------------------
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DParticipant> queryByBibNumber(java.lang.String bibNumber) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BIBNUMBER, bibNumber);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field bibNumber
	 * @param bibNumber the specified attribute
	 * @return an Iterable of keys to the DParticipants with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByBibNumber(java.lang.String bibNumber) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BIBNUMBER, bibNumber);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field bibNumber
	 * @param bibNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DParticipants for the specified bibNumber
	 */
	public final CursorPage<DParticipant, java.lang.Long> queryPageByBibNumber(java.lang.String bibNumber,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BIBNUMBER, bibNumber);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DParticipant> queryByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of keys to the DParticipants with the specified attribute
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
	 * @return a Page of DParticipants for the specified createdBy
	 */
	public final CursorPage<DParticipant, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DParticipant> queryByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of keys to the DParticipants with the specified attribute
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
	 * @return a Page of DParticipants for the specified createdDate
	 */
	public final CursorPage<DParticipant, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DParticipant> queryByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of keys to the DParticipants with the specified attribute
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
	 * @return a Page of DParticipants for the specified updatedBy
	 */
	public final CursorPage<DParticipant, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DParticipant> queryByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of keys to the DParticipants with the specified attribute
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
	 * @return a Page of DParticipants for the specified updatedDate
	 */
	public final CursorPage<DParticipant, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field raceClass
	 * @param raceClass the id of the related se.bassac.roster.domain.DClass entity
	 * @return an Iterable of DParticipants belonging to the many-to-one relation
	 */
	public final Iterable<DParticipant> queryByRaceClass(se.bassac.roster.domain.DClass raceClass) {
            final Object foreignKey = raceClassDao.getPrimaryKey(raceClass);
            final Filter filter = createEqualsFilter(COLUMN_NAME_RACECLASS, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for many-to-one field raceClass
	 * @param raceClass the related se.bassac.roster.domain.DClass entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DParticipants belonging to the many-to-one relation
	 */
	public final CursorPage<DParticipant, java.lang.Long> queryPageByRaceClass(se.bassac.roster.domain.DClass raceClass,
                int pageSize, String cursorString) {
            final Object foreignKey = raceClassDao.getPrimaryKey(raceClass);
            final Filter filter = createEqualsFilter(COLUMN_NAME_RACECLASS, foreignKey);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	/**
	 * query-key-by method for many-to-one field raceClass
	 * @param raceClass the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DParticipants with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByRaceClass(se.bassac.roster.domain.DClass raceClass) {
            final Object foreignKey = raceClassDao.getPrimaryKey(raceClass);
            final Filter filter = createEqualsFilter(COLUMN_NAME_RACECLASS, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-by method for many-to-one field raceClass
	 * @param id the related se.bassac.roster.domain.DClass entity's simple key
	 * @return an Iterable of DParticipants belonging to the many-to-one relation
	 */
	public final Iterable<DParticipant> queryByRaceClassId(java.lang.Long id) {
            final Object foreignKey = raceClassDao.getPrimaryKey(null, id);
            final Filter filter = createEqualsFilter(COLUMN_NAME_RACECLASS, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-keys-by method for many-to-one field raceClass
	 * @param id the related se.bassac.roster.domain.DClass entity's simple key
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	public final Iterable<java.lang.Long> queryKeysByRaceClassId(java.lang.Long id) {
            final Object foreignKey = raceClassDao.getPrimaryKey(null, id);
            final Filter filter = createEqualsFilter(COLUMN_NAME_RACECLASS, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	

	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	/**
	 * find-by method for unique attributes
	 * @param bibNumber the specified bibNumber
	 * @param raceClass the specified raceClass
	 * @return the unique DParticipant for the specified fields
	 */
	public final DParticipant findByBibNumberRaceClass(java.lang.String bibNumber, se.bassac.roster.domain.DClass raceClass) {
		final Filter[] filters = new Filter[2];
                int i = 0;
                filters[i++] = createEqualsFilter(COLUMN_NAME_BIBNUMBER, bibNumber);
                final Object foreignKey = raceClassDao.getPrimaryKey(raceClass);
                filters[i++] = createEqualsFilter(COLUMN_NAME_RACECLASS, foreignKey);
		return findUniqueBy(filters);
	}
	/**
	 * find-by method for unique attributes
	 * @param raceClass the specified raceClass
	 * @return the unique DParticipant for the specified fields
	 */
	public final DParticipant findByRaceClass(se.bassac.roster.domain.DClass raceClass) {
		final Filter[] filters = new Filter[1];
                int i = 0;
                final Object foreignKey = raceClassDao.getPrimaryKey(raceClass);
                filters[i++] = createEqualsFilter(COLUMN_NAME_RACECLASS, foreignKey);
		return findUniqueBy(filters);
	}

	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	public DParticipant persist(Object athleteKey,  	
		java.lang.Long id, 
		java.lang.String bibNumber, 
		se.bassac.roster.domain.DClass raceClass) {

            DParticipant domain = null;
            // if primaryKey specified, use it
            if (null != id) {
                    domain = findByPrimaryKey(athleteKey, id);
            }
		
            // use find-by unique column set
            if (null == domain) {
                domain = findByBibNumberRaceClass(
                    bibNumber,                     raceClass);
            }
            // create new?
            if (null == domain) {
                    domain = new DParticipant();
                    // set parent
                    domain.setAthleteKey((java.lang.Object) athleteKey);
                    // generate Id?
                    if (null != id) {
                            domain.setId(id);
                    }
                    // fields
                    domain.setBibNumber(bibNumber);
                    // one-to-ones
                    // many-to-ones
                    domain.setRaceClass(raceClass);
			
                    persist(domain);
            }
            return domain;
	}



}
