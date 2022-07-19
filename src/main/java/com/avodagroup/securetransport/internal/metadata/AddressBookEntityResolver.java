package com.avodagroup.securetransport.internal.metadata;

import com.avodagroup.securetransport.api.model.AddressBookEntries;
import com.avodagroup.securetransport.api.model.AddressBookEntry;
import com.avodagroup.securetransport.api.model.AddressBookSettings;
import com.avodagroup.securetransport.api.model.CollectionCount;
import com.avodagroup.securetransport.api.param.getAddressBookEntryByIdInput;

import org.mule.metadata.api.model.MetadataType;
import org.mule.metadata.api.model.AnyType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;
import org.mule.runtime.api.metadata.resolving.FailureCode;


public class AddressBookEntityResolver implements InputTypeResolver<String>, OutputTypeResolver<String> {
    @Override
    public String getResolverName() {
        return "AddressBookEntityResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Address_Book_Entry":
    			return metadataContext.getTypeLoader().load(getAddressBookEntryByIdInput.class);
    		case "Get_Address_Book_Entries":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Create_Address_Book_Entry":
    			return metadataContext.getTypeLoader().load(AddressBookEntry.class);
    		case "Update_Address_Book_Entry":
    			return metadataContext.getTypeLoader().load(AddressBookEntry.class);
    		case "Delete_Address_Book_Entry":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Address_Book_Entries_Count":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Address_Book_Settings":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Address_Book_Entry":
    			return metadataContext.getTypeLoader().load(AddressBookEntry.class);
    		case "Get_Address_Book_Entries":
    			return metadataContext.getTypeLoader().load(AddressBookEntries.class);
    		case "Create_Address_Book_Entry":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Update_Address_Book_Entry":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Delete_Address_Book_Entry":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Address_Book_Entries_Count":
    			return metadataContext.getTypeLoader().load(CollectionCount.class);
    		case "Get_Address_Book_Settings":
    			return metadataContext.getTypeLoader().load(AddressBookSettings.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}
    }
    	
    @Override
    public String getCategoryName() {
        return "AddressBook";
    }

}
