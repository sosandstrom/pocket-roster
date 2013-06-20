package se.bassac.roster.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import se.bassac.roster.domain.DClass;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DClass entities.
 *
 * Generated on 2013-06-20T14:52:45.890+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDClassDao extends Dao<DClass, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";

	/** Column name for parent raceKey is "raceKey" */
	static final String COLUMN_NAME_RACEKEY = "raceKey";


	/** Column name for field actualStart is "actualStart" */
	static final String COLUMN_NAME_ACTUALSTART = "actualStart";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field name is "name" */
	static final String COLUMN_NAME_NAME = "name";
	/** Column name for field scheduledStart is "scheduledStart" */
	static final String COLUMN_NAME_SCHEDULEDSTART = "scheduledStart";
	/** Column name for field track is "track" */
	static final String COLUMN_NAME_TRACK = "track";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_ACTUALSTART,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_SCHEDULEDSTART,
		COLUMN_NAME_TRACK,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_ACTUALSTART,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_SCHEDULEDSTART,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList(		COLUMN_NAME_TRACK);


	// ----------------------- parent finder -------------------------------
	/**
	 * query-by method for parent field raceKey
	 * @param raceKey the specified attribute
	 * @return an Iterable of DClasss with the specified parent
	 */
	Iterable<DClass> queryByRaceKey(Object raceKey);
		
	/**
	 * query-keys-by method for parent field raceKey
	 * @param raceKey the specified attribute
	 * @return an Iterable of DClasss with the specified parent
	 */
	Iterable<java.lang.Long> queryKeysByRaceKey(Object raceKey);

	/**
	 * query-page-by method for parent field raceKey
	 * @param raceKey the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified raceKey (parent)
	 */
	CursorPage<DClass, java.lang.Long> queryPageByRaceKey(java.lang.Object raceKey,
            int pageSize, String cursorString);

	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field actualStart
	 * @param actualStart the specified attribute
	 * @return an Iterable of DClasss for the specified actualStart
	 */
	Iterable<DClass> queryByActualStart(java.util.Date actualStart);
		
	/**
	 * query-keys-by method for field actualStart
	 * @param actualStart the specified attribute
	 * @return an Iterable of DClasss for the specified actualStart
	 */
	Iterable<java.lang.Long> queryKeysByActualStart(java.util.Date actualStart);

	/**
	 * query-page-by method for field actualStart
	 * @param actualStart the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified actualStart
	 */
	CursorPage<DClass, java.lang.Long> queryPageByActualStart(java.util.Date actualStart,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DClasss for the specified createdBy
	 */
	Iterable<DClass> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DClasss for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified createdBy
	 */
	CursorPage<DClass, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DClasss for the specified createdDate
	 */
	Iterable<DClass> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DClasss for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified createdDate
	 */
	CursorPage<DClass, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DClasss for the specified name
	 */
	Iterable<DClass> queryByName(java.lang.String name);
		
	/**
	 * query-keys-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DClasss for the specified name
	 */
	Iterable<java.lang.Long> queryKeysByName(java.lang.String name);

	/**
	 * query-page-by method for field name
	 * @param name the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified name
	 */
	CursorPage<DClass, java.lang.Long> queryPageByName(java.lang.String name,
            int pageSize, String cursorString);


	/**
	 * query-by method for field scheduledStart
	 * @param scheduledStart the specified attribute
	 * @return an Iterable of DClasss for the specified scheduledStart
	 */
	Iterable<DClass> queryByScheduledStart(java.util.Date scheduledStart);
		
	/**
	 * query-keys-by method for field scheduledStart
	 * @param scheduledStart the specified attribute
	 * @return an Iterable of DClasss for the specified scheduledStart
	 */
	Iterable<java.lang.Long> queryKeysByScheduledStart(java.util.Date scheduledStart);

	/**
	 * query-page-by method for field scheduledStart
	 * @param scheduledStart the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified scheduledStart
	 */
	CursorPage<DClass, java.lang.Long> queryPageByScheduledStart(java.util.Date scheduledStart,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DClasss for the specified updatedBy
	 */
	Iterable<DClass> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DClasss for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified updatedBy
	 */
	CursorPage<DClass, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DClasss for the specified updatedDate
	 */
	Iterable<DClass> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DClasss for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DClasss for the specified updatedDate
	 */
	CursorPage<DClass, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field track
	 * @param track the id of the related se.bassac.roster.domain.DTrack entity
	 * @return an Iterable of DClasss belonging to the many-to-one relation
	 */
	Iterable<DClass> queryByTrack(se.bassac.roster.domain.DTrack track);

	/**
	 * query-page-by method for many-to-one field track
	 * @param track the related se.bassac.roster.domain.DTrack entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DClasss belonging to the many-to-one relation
	 */
	CursorPage<DClass, java.lang.Long> queryPageByTrack(se.bassac.roster.domain.DTrack track,
            int pageSize, String cursorString);

	/**
	 * query-key-by method for many-to-one field track
	 * @param track the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DClasss with the specified attribute
	 */
	Iterable<java.lang.Long> queryKeysByTrack(se.bassac.roster.domain.DTrack track);

	/**
	 * query-by method for many-to-one field track
	 * @param id the related se.bassac.roster.domain.DTrack entity's simple key
	 * @return an Iterable of DClasss belonging to the many-to-one relation
	 */
	Iterable<DClass> queryByTrackId(java.lang.Long id);

	/**
	 * query-keys-by method for many-to-one field track
	 * @param id the related se.bassac.roster.domain.DTrack entity's simple key
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	Iterable<java.lang.Long> queryKeysByTrackId(java.lang.Long id);
	
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DClass persist(Object raceKey,  	
		java.lang.Long id, 
		java.util.Date actualStart, 
		java.lang.String name, 
		java.util.Date scheduledStart, 
		se.bassac.roster.domain.DTrack track);	

}
