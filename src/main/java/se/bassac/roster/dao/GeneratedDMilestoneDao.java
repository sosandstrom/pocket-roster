package se.bassac.roster.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import se.bassac.roster.domain.DMilestone;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DMilestone entities.
 *
 * Generated on 2013-06-21T13:19:20.220+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDMilestoneDao extends Dao<DMilestone, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";

	/** Column name for parent trackKey is "trackKey" */
	static final String COLUMN_NAME_TRACKKEY = "trackKey";


	/** Column name for field checkpoint is "checkpoint" */
	static final String COLUMN_NAME_CHECKPOINT = "checkpoint";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field distance is "distance" */
	static final String COLUMN_NAME_DISTANCE = "distance";
	/** Column name for field lapNumber is "lapNumber" */
	static final String COLUMN_NAME_LAPNUMBER = "lapNumber";
	/** Column name for field name is "name" */
	static final String COLUMN_NAME_NAME = "name";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_CHECKPOINT,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_DISTANCE,
		COLUMN_NAME_LAPNUMBER,
		COLUMN_NAME_NAME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_DISTANCE,
		COLUMN_NAME_LAPNUMBER,
		COLUMN_NAME_NAME,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList(		COLUMN_NAME_CHECKPOINT);


	// ----------------------- parent finder -------------------------------
	/**
	 * query-by method for parent field trackKey
	 * @param trackKey the specified attribute
	 * @return an Iterable of DMilestones with the specified parent
	 */
	Iterable<DMilestone> queryByTrackKey(Object trackKey);
		
	/**
	 * query-keys-by method for parent field trackKey
	 * @param trackKey the specified attribute
	 * @return an Iterable of DMilestones with the specified parent
	 */
	Iterable<java.lang.Long> queryKeysByTrackKey(Object trackKey);

	/**
	 * query-page-by method for parent field trackKey
	 * @param trackKey the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified trackKey (parent)
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByTrackKey(java.lang.Object trackKey,
            int pageSize, String cursorString);

	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DMilestones for the specified createdBy
	 */
	Iterable<DMilestone> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DMilestones for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified createdBy
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DMilestones for the specified createdDate
	 */
	Iterable<DMilestone> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DMilestones for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified createdDate
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field distance
	 * @param distance the specified attribute
	 * @return an Iterable of DMilestones for the specified distance
	 */
	Iterable<DMilestone> queryByDistance(java.lang.Integer distance);
		
	/**
	 * query-keys-by method for field distance
	 * @param distance the specified attribute
	 * @return an Iterable of DMilestones for the specified distance
	 */
	Iterable<java.lang.Long> queryKeysByDistance(java.lang.Integer distance);

	/**
	 * query-page-by method for field distance
	 * @param distance the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified distance
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByDistance(java.lang.Integer distance,
            int pageSize, String cursorString);


	/**
	 * query-by method for field lapNumber
	 * @param lapNumber the specified attribute
	 * @return an Iterable of DMilestones for the specified lapNumber
	 */
	Iterable<DMilestone> queryByLapNumber(java.lang.Integer lapNumber);
		
	/**
	 * query-keys-by method for field lapNumber
	 * @param lapNumber the specified attribute
	 * @return an Iterable of DMilestones for the specified lapNumber
	 */
	Iterable<java.lang.Long> queryKeysByLapNumber(java.lang.Integer lapNumber);

	/**
	 * query-page-by method for field lapNumber
	 * @param lapNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified lapNumber
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByLapNumber(java.lang.Integer lapNumber,
            int pageSize, String cursorString);


	/**
	 * query-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DMilestones for the specified name
	 */
	Iterable<DMilestone> queryByName(java.lang.String name);
		
	/**
	 * query-keys-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DMilestones for the specified name
	 */
	Iterable<java.lang.Long> queryKeysByName(java.lang.String name);

	/**
	 * query-page-by method for field name
	 * @param name the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified name
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByName(java.lang.String name,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DMilestones for the specified updatedBy
	 */
	Iterable<DMilestone> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DMilestones for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified updatedBy
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DMilestones for the specified updatedDate
	 */
	Iterable<DMilestone> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DMilestones for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DMilestones for the specified updatedDate
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	/**
	 * query-by method for many-to-one field checkpoint
	 * @param checkpoint the id of the related se.bassac.roster.domain.DCheckpoint entity
	 * @return an Iterable of DMilestones belonging to the many-to-one relation
	 */
	Iterable<DMilestone> queryByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint);

	/**
	 * query-page-by method for many-to-one field checkpoint
	 * @param checkpoint the related se.bassac.roster.domain.DCheckpoint entity
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a CursorPage of DMilestones belonging to the many-to-one relation
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint,
            int pageSize, String cursorString);

	/**
	 * query-key-by method for many-to-one field checkpoint
	 * @param checkpoint the specified attribute
         * @since 2.3.2
	 * @return an Iterable of keys to the DMilestones with the specified attribute
	 */
	Iterable<java.lang.Long> queryKeysByCheckpoint(se.bassac.roster.domain.DCheckpoint checkpoint);

	/**
	 * query-by method for many-to-one field checkpoint
	 * @param id the related se.bassac.roster.domain.DCheckpoint entity's simple key
	 * @return an Iterable of DMilestones belonging to the many-to-one relation
	 */
	Iterable<DMilestone> queryByCheckpointId(java.lang.Long id);

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
	 * @return an Iterable of DMilestones belonging to the many-to-one relation
	 */
	Iterable<DMilestone> queryByCheckpointKey(Object checkpointKey);

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
	 * @return a CursorPage of DMilestones belonging to the many-to-one relation
	 */
	CursorPage<DMilestone, java.lang.Long> queryPageByCheckpointKey(Object checkpointKey,
                int pageSize, String cursorString);

	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DMilestone persist(Object trackKey,  	
		java.lang.Long id, 
		java.lang.Integer distance, 
		java.lang.Integer lapNumber, 
		java.lang.String name, 
		se.bassac.roster.domain.DCheckpoint checkpoint);	

}
