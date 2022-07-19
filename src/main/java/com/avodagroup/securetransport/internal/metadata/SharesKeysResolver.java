package com.avodagroup.securetransport.internal.metadata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataKeyBuilder;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.TypeKeysResolver;
import org.mule.runtime.api.metadata.MetadataKey;

public class SharesKeysResolver implements TypeKeysResolver {
	@Override
	  public String getCategoryName() {
	    return "Shares";
	  }

	  @Override
	  public Set<MetadataKey> getKeys(MetadataContext context) throws MetadataResolvingException, ConnectionException {
		// First we need to obtain the key IDs that will be used.
		     // This is where you'd normally use `context.getConfig()`
		     // or `context.getConnection()` to obtain the entity id's
		     // from a remote service, for this demo the keys will be fixed
			  Set<MetadataKey> mdkSet = new HashSet<>();

		        HashMap<String, String> myKeys = new HashMap<String, String>();
		        myKeys.put("Get_Home_Shared_Folder_Metadata","Get Home Shared Folder Metadata");
		        myKeys.put("Get_Shared_Folder_Metadata","Get Shared Folder Metadata");
		        myKeys.put("Share_Or_Update_Folder","Share Or Update Folder");
		        myKeys.put("Unshare_Folder","Unshare Folder");

		        for(Map.Entry<String, String> entry : myKeys.entrySet()){
//		            MetadataKeyBuilder key = MetadataKeyBuilder.newKey(entry.getKey()).withDisplayName(entry.getValue());
		            MetadataKeyBuilder key = MetadataKeyBuilder.newKey(entry.getKey());
		            mdkSet.add(key.build());
		        }
		        return mdkSet;
		   }

}
