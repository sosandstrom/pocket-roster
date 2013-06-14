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
 * Generated on 2013-06-14T20:04:52.499+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDOrganizerDao extends Dao<DOrganizer, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";


	/** Column name for field admins is "admins" */
	static final String COLUMN_NAME_ADMINS = "admins";
	/** Column name for field athletes is "athletes" */
	static final String COLUMN_NAME_ATHLETES = "athletes";
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
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_ADMINS,
		COLUMN_NAME_ATHLETES,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_ADMINS,
		COLUMN_NAME_ATHLETES,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList();


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field admins
	 * @param admins the specified attribute
	 * @return an Iterable of DOrganizers for the specified admins
	 */
	Iterable<DOrganizer> queryByAdmins(java.lang.Object admins);
		
	/**
	 * query-keys-by method for field admins
	 * @param admins the specified attribute
	 * @return an Iterable of DOrganizers for the specified admins
	 */
	Iterable<java.lang.Long> queryKeysByAdmins(java.lang.Object admins);

	/**
	 * query-page-by method for field admins
	 * @param admins the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DOrganizers for the specified admins
	 */
	CursorPage<DOrganizer, java.lang.Long> queryPageByAdmins(java.lang.Object admins,
            int pageSize, String cursorString);


	/**
	 * query-by method for field athletes
	 * @param athletes the specified attribute
	 * @return an Iterable of DOrganizers for the specified athletes
	 */
	Iterable<DOrganizer> queryByAthletes(java.lang.Object athletes);
		
	/**
	 * query-keys-by method for field athletes
	 * @param athletes the specified attribute
	 * @return an Iterable of DOrganizers for the specified athletes
	 */
	Iterable<java.lang.Long> queryKeysByAthletes(java.lang.Object athletes);

	/**
	 * query-page-by method for field athletes
	 * @param athletes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DOrganizers for the specified athletes
	 */
	CursorPage<DOrganizer, java.lang.Long> queryPageByAthletes(java.lang.Object athletes,
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
		java.util.Collection admins, 
		java.util.Collection athletes, 
		java.lang.String name);	

	/**
	 * Persists an entity unless it already exists
	 */
	 DOrganizer persist(java.lang.String name, 
                java.util.Collection admins, 
                java.util.Collection athletes);

}
