package com.avodagroup.securetransport.internal.metadata;

import com.avodagroup.securetransport.api.model.FolderSharingOptions;
import com.avodagroup.securetransport.api.model.SharedFolders;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;
import org.mule.runtime.api.metadata.resolving.FailureCode;


public class SharesEntityResolver implements InputTypeResolver<String>, OutputTypeResolver<String> {
    @Override
    public String getResolverName() {
        return "SharesEntityResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Home_Shared_Folder_Metadata":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Shared_Folder_Metadata":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Share_Or_Update_Folder":
    			return metadataContext.getTypeLoader().load(FolderSharingOptions.class);
    		case "Unshare_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Home_Shared_Folder_Metadata":
    			return metadataContext.getTypeLoader().load(SharedFolders.class);
    		case "Get_Shared_Folder_Metadata":
    			return metadataContext.getTypeLoader().load(SharedFolders.class);
    		case "Share_Or_Update_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Unshare_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public String getCategoryName() {
        return "Shares";
    }

}
