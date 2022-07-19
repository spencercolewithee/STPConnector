package com.avodagroup.securetransport.internal.operation;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import com.avodagroup.securetransport.internal.metadata.SharesEntityResolver;
import com.avodagroup.securetransport.internal.metadata.SharesKeysResolver;

public class Shares {
	@MediaType(MediaType.APPLICATION_JSON)
	@OutputResolver(output = SharesEntityResolver.class)
	public String shares(@MetadataKeyId(SharesKeysResolver.class) String type,
	    					  @Content @TypeResolver(SharesEntityResolver.class) String entity)
	{
	    return "";
	}
}
