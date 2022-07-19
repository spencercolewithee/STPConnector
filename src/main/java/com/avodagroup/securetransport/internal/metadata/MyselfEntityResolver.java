package com.avodagroup.securetransport.internal.metadata;

import com.avodagroup.securetransport.api.model.Account;
import com.avodagroup.securetransport.api.model.AuthenticationActionResult;
import com.avodagroup.securetransport.api.model.ChangePassword;
import com.avodagroup.securetransport.api.model.PasswordExpired;
import com.avodagroup.securetransport.api.model.ResetPassword;
import com.avodagroup.securetransport.api.model.ServerTime;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;
import org.mule.runtime.api.metadata.resolving.FailureCode;


public class MyselfEntityResolver implements InputTypeResolver<String>, OutputTypeResolver<String> {
    @Override
    public String getResolverName() {
        return "MyselfEntityResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Myself_Info":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Login_User":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Logout_User":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Change_Password":
    			return metadataContext.getTypeLoader().load(ChangePassword.class);
    		case "Get_Myself_Password_Expired":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Current_Server_Time":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Send_New_Password":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Reset_Password_By_Email":
    			return metadataContext.getTypeLoader().load(ResetPassword.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Myself_Info":
    			return metadataContext.getTypeLoader().load(Account.class);
    		case "Login_User":
    			return metadataContext.getTypeLoader().load(AuthenticationActionResult.class);
    		case "Logout_User":
    			return metadataContext.getTypeLoader().load(AuthenticationActionResult.class);
    		case "Change_Password":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Myself_Password_Expired":
    			return metadataContext.getTypeLoader().load(PasswordExpired.class);
    		case "Get_Current_Server_Time":
    			return metadataContext.getTypeLoader().load(ServerTime.class);
    		case "Send_New_Password":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Reset_Password_By_Email":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}
    }

    @Override
    public String getCategoryName() {
        return "Myself";
    }

}
