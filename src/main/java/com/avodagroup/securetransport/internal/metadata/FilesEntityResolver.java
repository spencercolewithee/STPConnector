package com.avodagroup.securetransport.internal.metadata;

import com.avodagroup.securetransport.api.model.FileObject;
import com.avodagroup.securetransport.api.model.Files;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;
import org.mule.runtime.api.metadata.resolving.FailureCode;


public class FilesEntityResolver implements InputTypeResolver<String>, OutputTypeResolver<String> {
    @Override
    public String getResolverName() {
        return "FilesEntityResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Files_In_Home_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Upload_File":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Files_In_Home_Sub_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Update_File":
    			return metadataContext.getTypeLoader().load(FileObject.class);
    		case "Create_File_Or_Folder":
    			return metadataContext.getTypeLoader().load(FileObject.class);
    		case "Delete_File_Or_Directory":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Files_In_Home_Folder":
    			return metadataContext.getTypeLoader().load(Files.class);
    		case "Upload_File":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Files_In_Home_Sub_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Update_File":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Create_File_Or_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Delete_File_Or_Directory":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}   
    }

    @Override
    public String getCategoryName() {
        return "Files";
    }

}
