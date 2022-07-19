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

public class FilesKeysResolver implements TypeKeysResolver {
	@Override
	  public String getCategoryName() {
	    return "Files";
	  }

	  @Override
	  public Set<MetadataKey> getKeys(MetadataContext context) throws MetadataResolvingException, ConnectionException {
		// First we need to obtain the key IDs that will be used.
		     // This is where you'd normally use `context.getConfig()`
		     // or `context.getConnection()` to obtain the entity id's
		     // from a remote service, for this demo the keys will be fixed
			  Set<MetadataKey> mdkSet = new HashSet<>();

		        HashMap<String, String> myKeys = new HashMap<String, String>();
		        myKeys.put("Get_Files_In_Home_Folder","Get Files In Home Folder");
		        myKeys.put("Upload_File","Upload File");
		        myKeys.put("Get_Files_In_Home_Sub_Folder","Get Files In Home Sub Folder");
		        myKeys.put("Update_File","Update File");
		        myKeys.put("Create_File_Or_Folder","Create File Or Folder");
		        myKeys.put("Delete_File_Or_Directory","Delete File Or Directory");
		        
		        for(Map.Entry<String, String> entry : myKeys.entrySet()){
//		            MetadataKeyBuilder key = MetadataKeyBuilder.newKey(entry.getKey()).withDisplayName(entry.getValue());
		            MetadataKeyBuilder key = MetadataKeyBuilder.newKey(entry.getKey());
		            mdkSet.add(key.build());
		        }
		        return mdkSet;
		   }

}
