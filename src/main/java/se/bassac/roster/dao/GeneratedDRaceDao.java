package se.bassac.roster.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import se.bassac.roster.domain.DRace;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DRace entities.
 *
 * Generated on 2013-06-20T14:52:45.890+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDRaceDao extends Dao<DRace, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";


	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field name is "name" */
	static final String COLUMN_NAME_NAME = "name";
	/** Column name for field series is "series" */
	static final String COLUMN_NAME_SERIES = "series";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_SERIES,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList(		COLUMN_NAME_SERIES);


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DRaces for the specified createdBy
	 */
	Iterable<DRace> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DRaces for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DRaces for the specified createdBy
	 */
	CursorPage<DRace, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DRaces for the specified createdDate
	 */
	Iterable<DRace> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DRaces for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DRaces for the specified createdDate
	 */
	CursorPage<DRace, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DRaces for the specified name
	 */
	Iterable<DRace> queryByName(java.lang.String name);
		
	/**
	 * query-keys-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DRaces for the specified name
	 */
	Iterable<java.lang.Long> queryKeysByName(java.lang.String name);

	/**
	 * query-page-by method for field name
	 * @param name the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DRaces for the specified name
	 */
	CursorPage<DRace, java.lang.Long> queryPageByName(java.lang.String name,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DRaces for the specified updatedBy
	 */
	Iterable<DRace> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DRaces for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DRaces for the specified updatedBy
	 */
	CursorPage<DRace, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DRaces for the specified updatedDate
	 */
	Iterable<DRace> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DRaces for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DRaces for the specified updatedDate
	 */
	CursorPage<DRace, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field series
	 * @param series the id of the related se.bassac.roster.domain.DSeries entity
	 * @return an Iterable of DRaces belonging to the many-to-one relation
	 */
	Iterable<DRace> queryBySeries(se.bassac.roster.domain.DSeries series);

	/**
	 * query-page-by method for many-to-one field series
	 * @param series the related se.bassac.roster.domain.DSeries entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DRaces belonging to the many-to-one relation
	 */
	CursorPage<DRace, java.lang.Long> queryPageBySeries(se.bassac.roster.domain.DSeries series,
            int pageSize, String cursorString);

	/**
	 * query-key-by method for many-to-one field series
	 * @param series the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DRaces with the specified attribute
	 */
	Iterable<java.lang.Long> queryKeysBySeries(se.bassac.roster.domain.DSeries series);

	/**
	 * query-by method for many-to-one field series
	 * @param id the related se.bassac.roster.domain.DSeries entity's simple key
	 * @return an Iterable of DRaces belonging to the many-to-one relation
	 */
	Iterable<DRace> queryBySeriesId(java.lang.Long id);

	/**
	 * query-keys-by method for many-to-one field series
	 * @param id the related se.bassac.roster.domain.DSeries entity's simple key
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	Iterable<java.lang.Long> queryKeysBySeriesId(java.lang.Long id);
	
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DRace persist(		java.lang.Long id, 
		java.lang.String name, 
		se.bassac.roster.domain.DSeries series);	

}
