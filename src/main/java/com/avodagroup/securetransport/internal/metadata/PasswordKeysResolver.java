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

public class PasswordKeysResolver implements TypeKeysResolver {
	@Override
	  public String getCategoryName() {
	    return "Password";
	  }

	  @Override
	  public Set<MetadataKey> getKeys(MetadataContext context) throws MetadataResolvingException, ConnectionException {
		// First we need to obtain the key IDs that will be used.
		     // This is where you'd normally use `context.getConfig()`
		     // or `context.getConnection()` to obtain the entity id's
		     // from a remote service, for this demo the keys will be fixed
			  Set<MetadataKey> mdkSet = new HashSet<>();

		        HashMap<String, String> myKeys = new HashMap<String, String>();
		        myKeys.put("Get_Password_Policy","Get Password Policy");
		        myKeys.put("Reset_Password","Reset Password");
		        myKeys.put("Request_Link","Request Link");
		        myKeys.put("Get_Secret_Question","Get Secret Question");
		        myKeys.put("Set_Secret_Question","Set Secret Question");
		        myKeys.put("Get_Secret_Questions","Get Secret Questions");

		        for(Map.Entry<String, String> entry : myKeys.entrySet()){
//		            MetadataKeyBuilder key = MetadataKeyBuilder.newKey(entry.getKey()).withDisplayName(entry.getValue());
		            MetadataKeyBuilder key = MetadataKeyBuilder.newKey(entry.getKey());
		            mdkSet.add(key.build());
		        }
		        return mdkSet;
		   }

}
