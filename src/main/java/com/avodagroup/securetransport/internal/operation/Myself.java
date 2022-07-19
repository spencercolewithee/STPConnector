package com.avodagroup.securetransport.internal.operation;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import com.avodagroup.securetransport.internal.metadata.MyselfEntityResolver;
import com.avodagroup.securetransport.internal.metadata.MyselfKeysResolver;

public class Myself {
	@MediaType(MediaType.APPLICATION_JSON)
	@OutputResolver(output = MyselfEntityResolver.class)
	public String myself(@MetadataKeyId(MyselfKeysResolver.class) String type,
	    					  @Content @TypeResolver(MyselfEntityResolver.class) String entity)
	{
	    return "";
	}
}
