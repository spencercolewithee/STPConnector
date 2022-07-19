package com.avodagroup.securetransport.internal.operation;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import com.avodagroup.securetransport.internal.metadata.TransfersEntityResolver;
import com.avodagroup.securetransport.internal.metadata.TransfersKeysResolver;

public class Transfers {
	@MediaType(MediaType.APPLICATION_JSON)
	@OutputResolver(output = TransfersEntityResolver.class)
	public String transfers(@MetadataKeyId(TransfersKeysResolver.class) String type,
	    					  @Content @TypeResolver(TransfersEntityResolver.class) String entity)
	{
	    return "";
	}
}
