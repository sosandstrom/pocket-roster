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
import se.bassac.roster.domain.DRace;
import se.bassac.roster.domain.DSeries;

/**
 * The DRace domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2013-06-20T14:52:45.890+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDRaceDaoImpl extends TypeDaoImpl<DRace, java.lang.Long> 
	implements GeneratedDRaceDao {

    /** DAO for Many-To-One relation series */
    private GeneratedDSeriesDaoImpl seriesDao;
    /** Setter for Many-To-One series DAO */
    public void setSeriesDao(GeneratedDSeriesDaoImpl dao) {
        seriesDao = dao;
        MANY_TO_ONE_DAOS.put(COLUMN_NAME_SERIES, dao);
    }
    /** Getter for Many-To-One series DAO */
    protected GeneratedDSeriesDaoImpl getSeriesDao() {
        return seriesDao;
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
   public GeneratedDRaceDaoImpl() {
      super(DRace.class, java.lang.Long.class);
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
    protected Object getDomainProperty(DRace domain, String name) {
        Object value;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            value = domain.getId();
        }
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
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
        else if (COLUMN_NAME_SERIES.equals(name)) {
            value = domain.getSeries();
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
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
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
        else if (COLUMN_NAME_SERIES.equals(name)) {
            clazz = se.bassac.roster.domain.DSeries.class;
        }
        // many-to-manys
        else {
            throw new IllegalArgumentException("No such column " + name);
        }

        return clazz;
    }
      
    @Override
    protected void setDomainProperty(final DRace domain, final String name, final Object value) {
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            domain.setId((java.lang.Long) value);
        }
        // fields
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
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
        else if (COLUMN_NAME_SERIES.equals(name)) {
            DSeries foreign = null;
            if (null != value) {
                foreign = seriesDao.createDomain(value);
            }
            domain.setSeries(foreign);
        }
        // many-to-manys
        else {
            super.setDomainProperty(domain, name, value);
        }
    }

    @Override
    protected void setDomainStringProperty(final DRace domain, final String name, final Map<String, String> properties) {
        final String value = properties.get(name);
        Class clazz = getColumnClass(name);
        // many-to-ones
        if (COLUMN_NAME_SERIES.equals(name)) {
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
        else if (COLUMN_NAME_SERIES.equals(name)) {
            // many-to-one: replace foreign entity with its primary key
            DSeries foreign = (DSeries) value;
            value = seriesDao.getPrimaryKey(foreign);
        }
        super.setCoreProperty(core, name, value);
    }

   // ------ END DaoImpl overrides -----------------------------

        // DRace has no parent

        /**
         * @return the simple key for specified DRace domain object
         */
        public Long getSimpleKey(DRace domain) {
            if (null == domain) {
                return null;
            }
            return domain.getId();
        }

        /**
         * @return the simple key for specified DRace domain object
         */
        public void setSimpleKey(DRace domain, Long id) {
            domain.setId(id);
        }

        public String getCreatedByColumnName() {
            return COLUMN_NAME_CREATEDBY;
        }

        public String getCreatedBy(DRace domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedBy();
        }

        public void _setCreatedBy(DRace domain, String creator) {
            domain.setCreatedBy(creator);
        }

        public String getUpdatedByColumnName() {
            return COLUMN_NAME_UPDATEDBY;
        }

        public String getUpdatedBy(DRace domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedBy();
        }

        public void _setUpdatedBy(DRace domain, String updator) {
            domain.setUpdatedBy(updator);
        }

        public String getCreatedDateColumnName() {
            return COLUMN_NAME_CREATEDDATE;
        }

        public Date getCreatedDate(DRace domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedDate();
        }

        public void _setCreatedDate(DRace domain, Date date) {
            domain.setCreatedDate(date);
        }

        public String getUpdatedDateColumnName() {
            return COLUMN_NAME_UPDATEDDATE;
        }

        public Date getUpdatedDate(DRace domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedDate();
        }

        public void _setUpdatedDate(DRace domain, Date date) {
            domain.setUpdatedDate(date);
        }

	// ----------------------- field finders -------------------------------
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DRace> queryByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of keys to the DRaces with the specified attribute
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
	 * @return a Page of DRaces for the specified createdBy
	 */
	public final CursorPage<DRace, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DRace> queryByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of keys to the DRaces with the specified attribute
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
	 * @return a Page of DRaces for the specified createdDate
	 */
	public final CursorPage<DRace, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DRace> queryByName(java.lang.String name) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field name
	 * @param name the specified attribute
	 * @return an Iterable of keys to the DRaces with the specified attribute
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
	 * @return a Page of DRaces for the specified name
	 */
	public final CursorPage<DRace, java.lang.Long> queryPageByName(java.lang.String name,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DRace> queryByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of keys to the DRaces with the specified attribute
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
	 * @return a Page of DRaces for the specified updatedBy
	 */
	public final CursorPage<DRace, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DRace> queryByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of keys to the DRaces with the specified attribute
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
	 * @return a Page of DRaces for the specified updatedDate
	 */
	public final CursorPage<DRace, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field series
	 * @param series the id of the related se.bassac.roster.domain.DSeries entity
	 * @return an Iterable of DRaces belonging to the many-to-one relation
	 */
	public final Iterable<DRace> queryBySeries(se.bassac.roster.domain.DSeries series) {
            final Object foreignKey = seriesDao.getPrimaryKey(series);
            final Filter filter = createEqualsFilter(COLUMN_NAME_SERIES, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for many-to-one field series
	 * @param series the related se.bassac.roster.domain.DSeries entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DRaces belonging to the many-to-one relation
	 */
	public final CursorPage<DRace, java.lang.Long> queryPageBySeries(se.bassac.roster.domain.DSeries series,
                int pageSize, String cursorString) {
            final Object foreignKey = seriesDao.getPrimaryKey(series);
            final Filter filter = createEqualsFilter(COLUMN_NAME_SERIES, foreignKey);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	/**
	 * query-key-by method for many-to-one field series
	 * @param series the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DRaces with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysBySeries(se.bassac.roster.domain.DSeries series) {
            final Object foreignKey = seriesDao.getPrimaryKey(series);
            final Filter filter = createEqualsFilter(COLUMN_NAME_SERIES, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-by method for many-to-one field series
	 * @param id the related se.bassac.roster.domain.DSeries entity's simple key
	 * @return an Iterable of DRaces belonging to the many-to-one relation
	 */
	public final Iterable<DRace> queryBySeriesId(java.lang.Long id) {
            final Object foreignKey = seriesDao.getPrimaryKey(null, id);
            final Filter filter = createEqualsFilter(COLUMN_NAME_SERIES, foreignKey);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-keys-by method for many-to-one field series
	 * @param id the related se.bassac.roster.domain.DSeries entity's simple key
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	public final Iterable<java.lang.Long> queryKeysBySeriesId(java.lang.Long id) {
            final Object foreignKey = seriesDao.getPrimaryKey(null, id);
            final Filter filter = createEqualsFilter(COLUMN_NAME_SERIES, foreignKey);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	

	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------

	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	public DRace persist(		java.lang.Long id, 
		java.lang.String name, 
		se.bassac.roster.domain.DSeries series) {

            DRace domain = null;
            // if primaryKey specified, use it
            if (null != id) {
                    domain = findByPrimaryKey(id);
            }
		
            // create new?
            if (null == domain) {
                    domain = new DRace();
                    // generate Id?
                    if (null != id) {
                            domain.setId(id);
                    }
                    // fields
                    domain.setName(name);
                    // one-to-ones
                    // many-to-ones
                    domain.setSeries(series);
			
                    persist(domain);
            }
            return domain;
	}



}
