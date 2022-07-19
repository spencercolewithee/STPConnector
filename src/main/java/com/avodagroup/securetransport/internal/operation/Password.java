package com.avodagroup.securetransport.internal.operation;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import com.avodagroup.securetransport.internal.metadata.PasswordEntityResolver;
import com.avodagroup.securetransport.internal.metadata.PasswordKeysResolver;

public class Password {
	@MediaType(MediaType.APPLICATION_JSON)
	@OutputResolver(output = PasswordEntityResolver.class)
	public String password(@MetadataKeyId(PasswordKeysResolver.class) String type,
	    					  @Content @TypeResolver(PasswordEntityResolver.class) String entity)
	{
	    return "";
	}
}
