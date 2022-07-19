package com.avodagroup.securetransport.internal.metadata;

import com.avodagroup.securetransport.api.model.AsyncOperation;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;
import org.mule.runtime.api.metadata.resolving.FailureCode;


public class FileOpsEntityResolver implements InputTypeResolver<String>, OutputTypeResolver<String> {
    @Override
    public String getResolverName() {
        return "FileOpsEntityResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Submit_File_Operation":
    			return metadataContext.getTypeLoader().load(AsyncOperation.class);
    		case "Get_File_Operation":
        		return metadataContext.getTypeLoader().load(String.class);
    		case "Post_File_Content":
        		return metadataContext.getTypeLoader().load(String.class);
    		case "Update_File_Content":
        		return metadataContext.getTypeLoader().load(String.class);
    		case "Delete_File_Operation":
        		return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Submit_File_Operation":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_File_Operation":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Post_File_Content":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Update_File_Content":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Delete_File_Operation":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	} 
    }

    @Override
    public String getCategoryName() {
        return "FileOps";
    }

}
