package com.avodagroup.securetransport.internal.metadata;

import com.avodagroup.securetransport.api.model.MonitoredFolder;
import com.avodagroup.securetransport.api.model.ReceiptVerificationResult;
import com.avodagroup.securetransport.api.model.TransferData;
import com.avodagroup.securetransport.api.model.TransferDataEntries;
import com.avodagroup.securetransport.api.model.TransferEntries;
import com.avodagroup.securetransport.api.model.TransferLogDetails;
import com.avodagroup.securetransport.api.model.TransferPull;
import com.avodagroup.securetransport.api.model.TransferPush;
import com.avodagroup.securetransport.api.model.TransferResult;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;
import org.mule.runtime.api.metadata.resolving.FailureCode;


public class TransfersEntityResolver implements InputTypeResolver<String>, OutputTypeResolver<String> {
    @Override
    public String getResolverName() {
        return "TransfersEntityResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Transfers":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Create_Folder_Monitor_Transfer":
    			return metadataContext.getTypeLoader().load(MonitoredFolder.class);
    		case "Pull_Files":
    			return metadataContext.getTypeLoader().load(TransferPull.class);
    		case "Push_File":
    			return metadataContext.getTypeLoader().load(TransferPush.class);
    		case "Get_Transfer":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Transfer_Mdn":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Verify_Receipt":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Transfer_Data":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Transfers":
    			return metadataContext.getTypeLoader().load(TransferEntries.class);
    		case "Create_Folder_Monitor_Transfer":
    			return metadataContext.getTypeLoader().load(TransferResult.class);
    		case "Pull_Files":
    			return metadataContext.getTypeLoader().load(TransferResult.class);
    		case "Push_File":
    			return metadataContext.getTypeLoader().load(TransferResult.class);
    		case "Get_Transfer":
    			return metadataContext.getTypeLoader().load(TransferLogDetails.class);
    		case "Get_Transfer_Mdn":
    			return metadataContext.getTypeLoader().load(TransferData.class);
    		case "Verify_Receipt":
    			return metadataContext.getTypeLoader().load(ReceiptVerificationResult.class);
    		case "Get_Transfer_Data":
    			return metadataContext.getTypeLoader().load(TransferDataEntries.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}   
    }

    @Override
    public String getCategoryName() {
        return "Transfers";
    }

}
