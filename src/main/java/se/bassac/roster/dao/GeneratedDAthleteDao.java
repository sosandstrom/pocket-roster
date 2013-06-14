package se.bassac.roster.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import se.bassac.roster.domain.DAthlete;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DAthlete entities.
 *
 * Generated on 2013-06-14T20:04:52.499+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDAthleteDao extends Dao<DAthlete, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";


	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field dateOfBirth is "dateOfBirth" */
	static final String COLUMN_NAME_DATEOFBIRTH = "dateOfBirth";
	/** Column name for field displayName is "displayName" */
	static final String COLUMN_NAME_DISPLAYNAME = "displayName";
	/** Column name for field email is "email" */
	static final String COLUMN_NAME_EMAIL = "email";
	/** Column name for field phoneNumber is "phoneNumber" */
	static final String COLUMN_NAME_PHONENUMBER = "phoneNumber";
	/** Column name for field profileLink is "profileLink" */
	static final String COLUMN_NAME_PROFILELINK = "profileLink";
	/** Column name for field roles is "roles" */
	static final String COLUMN_NAME_ROLES = "roles";
	/** Column name for field thumbnailUrl is "thumbnailUrl" */
	static final String COLUMN_NAME_THUMBNAILURL = "thumbnailUrl";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";
	/** Column name for field username is "username" */
	static final String COLUMN_NAME_USERNAME = "username";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_DATEOFBIRTH,
		COLUMN_NAME_DISPLAYNAME,
		COLUMN_NAME_EMAIL,
		COLUMN_NAME_PHONENUMBER,
		COLUMN_NAME_PROFILELINK,
		COLUMN_NAME_ROLES,
		COLUMN_NAME_THUMBNAILURL,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE,
		COLUMN_NAME_USERNAME);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_DATEOFBIRTH,
		COLUMN_NAME_DISPLAYNAME,
		COLUMN_NAME_EMAIL,
		COLUMN_NAME_PHONENUMBER,
		COLUMN_NAME_PROFILELINK,
		COLUMN_NAME_ROLES,
		COLUMN_NAME_THUMBNAILURL,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE,
		COLUMN_NAME_USERNAME);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList();


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DAthletes for the specified createdBy
	 */
	Iterable<DAthlete> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DAthletes for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified createdBy
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DAthletes for the specified createdDate
	 */
	Iterable<DAthlete> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DAthletes for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified createdDate
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field dateOfBirth
	 * @param dateOfBirth the specified attribute
	 * @return an Iterable of DAthletes for the specified dateOfBirth
	 */
	Iterable<DAthlete> queryByDateOfBirth(java.util.Date dateOfBirth);
		
	/**
	 * query-keys-by method for field dateOfBirth
	 * @param dateOfBirth the specified attribute
	 * @return an Iterable of DAthletes for the specified dateOfBirth
	 */
	Iterable<java.lang.Long> queryKeysByDateOfBirth(java.util.Date dateOfBirth);

	/**
	 * query-page-by method for field dateOfBirth
	 * @param dateOfBirth the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified dateOfBirth
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByDateOfBirth(java.util.Date dateOfBirth,
            int pageSize, String cursorString);


	/**
	 * query-by method for field displayName
	 * @param displayName the specified attribute
	 * @return an Iterable of DAthletes for the specified displayName
	 */
	Iterable<DAthlete> queryByDisplayName(java.lang.String displayName);
		
	/**
	 * query-keys-by method for field displayName
	 * @param displayName the specified attribute
	 * @return an Iterable of DAthletes for the specified displayName
	 */
	Iterable<java.lang.Long> queryKeysByDisplayName(java.lang.String displayName);

	/**
	 * query-page-by method for field displayName
	 * @param displayName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified displayName
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByDisplayName(java.lang.String displayName,
            int pageSize, String cursorString);


	/**
	 * find-by method for unique field email
	 * @param email the unique attribute
	 * @return the unique DAthlete for the specified email
	 */
	DAthlete findByEmail(java.lang.String email);

        /**
	 * find-key-by method for unique attribute field email
	 * @param email the unique attribute
	 * @return the unique DAthlete for the specified attribute
	 */
	java.lang.Long findKeyByEmail(java.lang.String email);

	/**
	 * query-by method for field phoneNumber
	 * @param phoneNumber the specified attribute
	 * @return an Iterable of DAthletes for the specified phoneNumber
	 */
	Iterable<DAthlete> queryByPhoneNumber(java.lang.String phoneNumber);
		
	/**
	 * query-keys-by method for field phoneNumber
	 * @param phoneNumber the specified attribute
	 * @return an Iterable of DAthletes for the specified phoneNumber
	 */
	Iterable<java.lang.Long> queryKeysByPhoneNumber(java.lang.String phoneNumber);

	/**
	 * query-page-by method for field phoneNumber
	 * @param phoneNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified phoneNumber
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByPhoneNumber(java.lang.String phoneNumber,
            int pageSize, String cursorString);


	/**
	 * query-by method for field profileLink
	 * @param profileLink the specified attribute
	 * @return an Iterable of DAthletes for the specified profileLink
	 */
	Iterable<DAthlete> queryByProfileLink(java.lang.String profileLink);
		
	/**
	 * query-keys-by method for field profileLink
	 * @param profileLink the specified attribute
	 * @return an Iterable of DAthletes for the specified profileLink
	 */
	Iterable<java.lang.Long> queryKeysByProfileLink(java.lang.String profileLink);

	/**
	 * query-page-by method for field profileLink
	 * @param profileLink the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified profileLink
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByProfileLink(java.lang.String profileLink,
            int pageSize, String cursorString);


	/**
	 * query-by method for field roles
	 * @param roles the specified attribute
	 * @return an Iterable of DAthletes for the specified roles
	 */
	Iterable<DAthlete> queryByRoles(java.lang.Object roles);
		
	/**
	 * query-keys-by method for field roles
	 * @param roles the specified attribute
	 * @return an Iterable of DAthletes for the specified roles
	 */
	Iterable<java.lang.Long> queryKeysByRoles(java.lang.Object roles);

	/**
	 * query-page-by method for field roles
	 * @param roles the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified roles
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByRoles(java.lang.Object roles,
            int pageSize, String cursorString);


	/**
	 * query-by method for field thumbnailUrl
	 * @param thumbnailUrl the specified attribute
	 * @return an Iterable of DAthletes for the specified thumbnailUrl
	 */
	Iterable<DAthlete> queryByThumbnailUrl(java.lang.String thumbnailUrl);
		
	/**
	 * query-keys-by method for field thumbnailUrl
	 * @param thumbnailUrl the specified attribute
	 * @return an Iterable of DAthletes for the specified thumbnailUrl
	 */
	Iterable<java.lang.Long> queryKeysByThumbnailUrl(java.lang.String thumbnailUrl);

	/**
	 * query-page-by method for field thumbnailUrl
	 * @param thumbnailUrl the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified thumbnailUrl
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByThumbnailUrl(java.lang.String thumbnailUrl,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DAthletes for the specified updatedBy
	 */
	Iterable<DAthlete> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DAthletes for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified updatedBy
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DAthletes for the specified updatedDate
	 */
	Iterable<DAthlete> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DAthletes for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DAthletes for the specified updatedDate
	 */
	CursorPage<DAthlete, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


	/**
	 * find-by method for unique field username
	 * @param username the unique attribute
	 * @return the unique DAthlete for the specified username
	 */
	DAthlete findByUsername(java.lang.String username);

        /**
	 * find-key-by method for unique attribute field username
	 * @param username the unique attribute
	 * @return the unique DAthlete for the specified attribute
	 */
	java.lang.Long findKeyByUsername(java.lang.String username);

		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DAthlete persist(		java.lang.Long id, 
		java.util.Date dateOfBirth, 
		java.lang.String displayName, 
		java.lang.String email, 
		java.lang.String phoneNumber, 
		java.lang.String profileLink, 
		java.util.Collection roles, 
		java.lang.String thumbnailUrl, 
		java.lang.String username);	

	/**
	 * Persists an entity unless it already exists
	 */
	 DAthlete persist(java.lang.String email, 
                java.util.Date dateOfBirth, 
                java.lang.String displayName, 
                java.lang.String phoneNumber, 
                java.lang.String profileLink, 
                java.util.Collection roles, 
                java.lang.String thumbnailUrl, 
                java.lang.String username);

}
