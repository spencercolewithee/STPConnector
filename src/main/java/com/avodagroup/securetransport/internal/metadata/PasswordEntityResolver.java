package com.avodagroup.securetransport.internal.metadata;

import com.avodagroup.securetransport.api.model.ForgottenPassword;
import com.avodagroup.securetransport.api.model.PasswordPolicy;
import com.avodagroup.securetransport.api.model.ResetPassword;
import com.avodagroup.securetransport.api.model.SecretQuestion;
import com.avodagroup.securetransport.api.model.SecretQuestionResponse;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;
import org.mule.runtime.api.metadata.resolving.FailureCode;


public class PasswordEntityResolver implements InputTypeResolver<String>, OutputTypeResolver<String> {
    @Override
    public String getResolverName() {
        return "PasswordEntityResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Password_Policy":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Reset_Password":
    			return metadataContext.getTypeLoader().load(ForgottenPassword.class);
    		case "Request_Link":
    			return metadataContext.getTypeLoader().load(ResetPassword.class);
    		case "Get_Secret_Question":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Set_Secret_Question":
    			return metadataContext.getTypeLoader().load(SecretQuestion.class);
    		case "Get_Secret_Questions":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Password_Policy":
    			return metadataContext.getTypeLoader().load(PasswordPolicy.class);
    		case "Reset_Password":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Request_Link":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Secret_Question":
    			return metadataContext.getTypeLoader().load(SecretQuestionResponse.class);
    		case "Set_Secret_Question":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Secret_Questions":
    			return metadataContext.getTypeLoader().load(String.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public String getCategoryName() {
        return "Password";
    }

}
