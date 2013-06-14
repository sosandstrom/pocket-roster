package se.bassac.roster.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import se.bassac.roster.domain.DParticipant;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DParticipant entities.
 *
 * Generated on 2013-06-14T20:04:52.499+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDParticipantDao extends Dao<DParticipant, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";

	/** Column name for parent athleteKey is "athleteKey" */
	static final String COLUMN_NAME_ATHLETEKEY = "athleteKey";


	/** Column name for field bibNumber is "bibNumber" */
	static final String COLUMN_NAME_BIBNUMBER = "bibNumber";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field raceClass is "raceClass" */
	static final String COLUMN_NAME_RACECLASS = "raceClass";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_BIBNUMBER,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_RACECLASS,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_BIBNUMBER,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList(		COLUMN_NAME_RACECLASS);


	// ----------------------- parent finder -------------------------------
	/**
	 * query-by method for parent field athleteKey
	 * @param athleteKey the specified attribute
	 * @return an Iterable of DParticipants with the specified parent
	 */
	Iterable<DParticipant> queryByAthleteKey(Object athleteKey);
		
	/**
	 * query-keys-by method for parent field athleteKey
	 * @param athleteKey the specified attribute
	 * @return an Iterable of DParticipants with the specified parent
	 */
	Iterable<java.lang.Long> queryKeysByAthleteKey(Object athleteKey);

	/**
	 * query-page-by method for parent field athleteKey
	 * @param athleteKey the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DParticipants for the specified athleteKey (parent)
	 */
	CursorPage<DParticipant, java.lang.Long> queryPageByAthleteKey(java.lang.Object athleteKey,
            int pageSize, String cursorString);

	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field bibNumber
	 * @param bibNumber the specified attribute
	 * @return an Iterable of DParticipants for the specified bibNumber
	 */
	Iterable<DParticipant> queryByBibNumber(java.lang.String bibNumber);
		
	/**
	 * query-keys-by method for field bibNumber
	 * @param bibNumber the specified attribute
	 * @return an Iterable of DParticipants for the specified bibNumber
	 */
	Iterable<java.lang.Long> queryKeysByBibNumber(java.lang.String bibNumber);

	/**
	 * query-page-by method for field bibNumber
	 * @param bibNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DParticipants for the specified bibNumber
	 */
	CursorPage<DParticipant, java.lang.Long> queryPageByBibNumber(java.lang.String bibNumber,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DParticipants for the specified createdBy
	 */
	Iterable<DParticipant> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DParticipants for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DParticipants for the specified createdBy
	 */
	CursorPage<DParticipant, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DParticipants for the specified createdDate
	 */
	Iterable<DParticipant> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DParticipants for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DParticipants for the specified createdDate
	 */
	CursorPage<DParticipant, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DParticipants for the specified updatedBy
	 */
	Iterable<DParticipant> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DParticipants for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DParticipants for the specified updatedBy
	 */
	CursorPage<DParticipant, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DParticipants for the specified updatedDate
	 */
	Iterable<DParticipant> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DParticipants for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DParticipants for the specified updatedDate
	 */
	CursorPage<DParticipant, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field raceClass
	 * @param raceClass the id of the related se.bassac.roster.domain.DClass entity
	 * @return an Iterable of DParticipants belonging to the many-to-one relation
	 */
	Iterable<DParticipant> queryByRaceClass(se.bassac.roster.domain.DClass raceClass);

	/**
	 * query-page-by method for many-to-one field raceClass
	 * @param raceClass the related se.bassac.roster.domain.DClass entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DParticipants belonging to the many-to-one relation
	 */
	CursorPage<DParticipant, java.lang.Long> queryPageByRaceClass(se.bassac.roster.domain.DClass raceClass,
            int pageSize, String cursorString);

	/**
	 * query-key-by method for many-to-one field raceClass
	 * @param raceClass the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DParticipants with the specified attribute
	 */
	Iterable<java.lang.Long> queryKeysByRaceClass(se.bassac.roster.domain.DClass raceClass);

	/**
	 * query-by method for many-to-one field raceClass
	 * @param id the related se.bassac.roster.domain.DClass entity's simple key
	 * @return an Iterable of DParticipants belonging to the many-to-one relation
	 */
	Iterable<DParticipant> queryByRaceClassId(java.lang.Long id);

	/**
	 * query-keys-by method for many-to-one field raceClass
	 * @param id the related se.bassac.roster.domain.DClass entity's simple key
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	Iterable<java.lang.Long> queryKeysByRaceClassId(java.lang.Long id);
	
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	/**
	 * find-by method for unique fields
	 * @param bibNumber the specified bibNumber
	 * @param raceClass the specified raceClass
	 * @return the unique DParticipant for the specified fields
	 */
	DParticipant findByBibNumberRaceClass(java.lang.String bibNumber, se.bassac.roster.domain.DClass raceClass);

	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DParticipant persist(Object athleteKey,  	
		java.lang.Long id, 
		java.lang.String bibNumber, 
		se.bassac.roster.domain.DClass raceClass);	

}
