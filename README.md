Pocket-Roster backend
============

API
------------

All methods require authentication via OAuth2 unless stated otherwise. 
See [registerFederated](#registerfederated) on how to sign in


createOrganizer
---------------
    
    POST /api/prod/org?name=STRING
    
createSeries
------------

    

registerFederated
-----------------
    
    GET|POST /api/prod/federated/v11?
        providerId=facebook&
        providerUserId=FACEBOOK_ID&
        access_token=ACCESS_TOKEN&
        expires_in=TTL_SECONDS&
        
