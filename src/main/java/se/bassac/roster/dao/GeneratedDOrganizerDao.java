package se.bassac.roster.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import se.bassac.roster.domain.DOrganizer;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DOrganizer entities.
 *
 * Generated on 2013-06-20T14:52:45.890+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDOrganizerDao extends Dao<DOrganizer, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";


	/** Column name for field adminIds is "adminIds" */
	static final String COLUMN_NAME_ADMINIDS = "adminIds";
	/** Column name for field athleteIds is "athleteIds" */
	static final String COLUMN_NAME_ATHLETEIDS = "athleteIds";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field name is "name" */
	static final String COLUMN_NAME_NAME = "name";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_ADMINIDS,
		COLUMN_NAME_ATHLETEIDS,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_ADMINIDS,
		COLUMN_NAME_ATHLETEIDS,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList();


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field adminIds
	 * @param adminIds the specified attribute
	 * @return an Iterable of DOrganizers for the specified adminIds
	 */
	Iterable<DOrganizer> queryByAdminIds(java.lang.Object adminIds);
		
	/**
	 * query-keys-by method for field adminIds
	 * @param adminIds the specified attribute
	 * @return an Iterable of DOrganizers for the specified adminIds
	 */
	Iterable<java.lang.Long> queryKeysByAdminIds(java.lang.Object adminIds);

	/**
	 * query-page-by method for field adminIds
	 * @param adminIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DOrganizers for the specified adminIds
	 */
	CursorPage<DOrganizer, java.lang.Long> queryPageByAdminIds(java.lang.Object adminIds,
            int pageSize, String cursorString);


	/**
	 * query-by method for field athleteIds
	 * @param athleteIds the specified attribute
	 * @return an Iterable of DOrganizers for the specified athleteIds
	 */
	Iterable<DOrganizer> queryByAthleteIds(java.lang.Object athleteIds);
		
	/**
	 * query-keys-by method for field athleteIds
	 * @param athleteIds the specified attribute
	 * @return an Iterable of DOrganizers for the specified athleteIds
	 */
	Iterable<java.lang.Long> queryKeysByAthleteIds(java.lang.Object athleteIds);

	/**
	 * query-page-by method for field athleteIds
	 * @param athleteIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DOrganizers for the specified athleteIds
	 */
	CursorPage<DOrganizer, java.lang.Long> queryPageByAthleteIds(java.lang.Object athleteIds,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DOrganizers for the specified createdBy
	 */
	Iterable<DOrganizer> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DOrganizers for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DOrganizers for the specified createdBy
	 */
	CursorPage<DOrganizer, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DOrganizers for the specified createdDate
	 */
	Iterable<DOrganizer> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DOrganizers for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DOrganizers for the specified createdDate
	 */
	CursorPage<DOrganizer, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * find-by method for unique field name
	 * @param name the unique attribute
	 * @return the unique DOrganizer for the specified name
	 */
	DOrganizer findByName(java.lang.String name);

        /**
	 * find-key-by method for unique attribute field name
	 * @param name the unique attribute
	 * @return the unique DOrganizer for the specified attribute
	 */
	java.lang.Long findKeyByName(java.lang.String name);

	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DOrganizers for the specified updatedBy
	 */
	Iterable<DOrganizer> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DOrganizers for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DOrganizers for the specified updatedBy
	 */
	CursorPage<DOrganizer, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DOrganizers for the specified updatedDate
	 */
	Iterable<DOrganizer> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DOrganizers for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DOrganizers for the specified updatedDate
	 */
	CursorPage<DOrganizer, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DOrganizer persist(		java.lang.Long id, 
		java.util.Collection adminIds, 
		java.util.Collection athleteIds, 
		java.lang.String name);	

	/**
	 * Persists an entity unless it already exists
	 */
	 DOrganizer persist(java.lang.String name, 
                java.util.Collection adminIds, 
                java.util.Collection athleteIds);

}
