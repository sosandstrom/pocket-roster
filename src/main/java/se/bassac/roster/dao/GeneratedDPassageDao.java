package se.bassac.roster.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import se.bassac.roster.domain.DPassage;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DPassage entities.
 *
 * Generated on 2013-06-21T13:19:20.220+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDPassageDao extends Dao<DPassage, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";

	/** Column name for parent timingsKey is "timingsKey" */
	static final String COLUMN_NAME_TIMINGSKEY = "timingsKey";


	/** Column name for field checkpoint is "checkpoint" */
	static final String COLUMN_NAME_CHECKPOINT = "checkpoint";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field passageTime is "passageTime" */
	static final String COLUMN_NAME_PASSAGETIME = "passageTime";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_CHECKPOINT,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_PASSAGETIME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_PASSAGETIME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList(		COLUMN_NAME_CHECKPOINT);


	// ----------------------- parent finder -------------------------------
	/**
	 * query-by method for parent field timingsKey
	 * @param timingsKey the specified attribute
	 * @return an Iterable of DPassages with the specified parent
	 */
	Iterable<DPassage> queryByTimingsKey(Object timingsKey);
		
	/**
	 * query-keys-by method for parent field timingsKey
	 * @param timingsKey the specified attribute
	 * @return an Iterable of DPassages with the specified parent
	 */
	Iterable<java.lang.Long> queryKeysByTimingsKey(Object timingsKey);

	/**
	 * query-page-by method for parent field timingsKey
	 * @param timingsKey the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DPassages for the specified timingsKey (parent)
	 */
	CursorPage<DPassage, java.lang.Long> queryPageByTimingsKey(java.lang.Object timingsKey,
            int pageSize, String cursorString);

	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DPassages for the specified createdBy
	 */
	Iterable<DPassage> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DPassages for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DPassages for the specified createdBy
	 */
	CursorPage<DPassage, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DPassages for the specified createdDate
	 */
	Iterable<DPassage> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DPassages for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DPassages for the specified createdDate
	 */
	CursorPage<DPassage, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field passageTime
	 * @param passageTime the specified attribute
	 * @return an Iterable of DPassages for the specified passageTime
	 */
	Iterable<DPassage> queryByPassageTime(java.util.Date passageTime);
		
	/**
	 * query-keys-by method for field passageTime
	 * @param passageTime the specified attribute
	 * @return an Iterable of DPassages for the specified passageTime
	 */
	Iterable<java.lang.Long> queryKeysByPassageTime(java.util.Date passageTime);

	/**
	 * query-page-by method for field passageTime
	 * @param passageTime the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DPassages for the specified passageTime
	 */
	CursorPage<DPassage, java.lang.Long> queryPageByPassageTime(java.util.Date passageTime,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DPassages for the specified updatedBy
	 */
	Iterable<DPassage> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DPassages for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DPassages for the specified updatedBy
	 */
	CursorPage<DPassage, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DPassages for the specified updatedDate
	 */
	Iterable<DPassage> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DPassages for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DPassages for the specified updatedDate
	 */
	CursorPage<DPassage, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field checkpoint
	 * @param checkpoint the id of the related se.bassac.roster.domain.DCheckpoint entity
	 * @return an Iterable of DPassages belonging to the many-to-one relation
	 */
	Iterable<DPassage> queryByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint);

	/**
	 * query-page-by method for many-to-one field checkpoint
	 * @param checkpoint the related se.bassac.roster.domain.DCheckpoint entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DPassages belonging to the many-to-one relation
	 */
	CursorPage<DPassage, java.lang.Long> queryPageByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint,
            int pageSize, String cursorString);

	/**
	 * query-key-by method for many-to-one field checkpoint
	 * @param checkpoint the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DPassages with the specified attribute
	 */
	Iterable<java.lang.Long> queryKeysByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint);

	/**
	 * query-by method for many-to-one field checkpoint
	 * @param id the related se.bassac.roster.domain.DCheckpoint entity's simple key
	 * @return an Iterable of DPassages belonging to the many-to-one relation
	 */
	Iterable<DPassage> queryByCheckpointId(java.lang.Long id);

	/**
	 * query-keys-by method for many-to-one field checkpoint
	 * @param id the related se.bassac.roster.domain.DCheckpoint entity's simple key
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	Iterable<java.lang.Long> queryKeysByCheckpointId(java.lang.Long id);
	

	/**
	 * query-by method for many-to-one field checkpoint
	 * @param checkpointKey the related se.bassac.roster.domain.DCheckpoint entity's primary key
         * @since 2.3.3
	 * @return an Iterable of DPassages belonging to the many-to-one relation
	 */
	Iterable<DPassage> queryByCheckpointKey(Object checkpointKey);

	/**
	 * query-keys-by method for many-to-one field checkpoint
	 * @param checkpointKey the related se.bassac.roster.domain.DCheckpoint entity's primary key
         * @since 2.3.3
	 * @return an Iterable of java.lang.Long keys belonging to the many-to-one relation
	 */
	Iterable<java.lang.Long> queryKeysByCheckpointKey(Object checkpointKey);

	/**
	 * query-page-by method for many-to-one field checkpoint
	 * @param checkpointKey the related se.bassac.roster.domain.DCheckpoint primary key
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
         * @since 2.3.3
	 * @return a CursorPage of DPassages belonging to the many-to-one relation
	 */
	CursorPage<DPassage, java.lang.Long> queryPageByCheckpointKey(Object checkpointKey,
                int pageSize, String cursorString);

	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DPassage persist(Object timingsKey,  	
		java.lang.Long id, 
		java.util.Date passageTime, 
		se.bassac.roster.domain.DCheckpoint checkpoint);	

}
