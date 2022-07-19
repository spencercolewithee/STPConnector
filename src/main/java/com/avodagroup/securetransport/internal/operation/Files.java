package com.avodagroup.securetransport.internal.operation;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import com.avodagroup.securetransport.internal.metadata.FilesEntityResolver;
import com.avodagroup.securetransport.internal.metadata.FilesKeysResolver;

public class Files {
	@MediaType(MediaType.APPLICATION_JSON)
	@OutputResolver(output = FilesEntityResolver.class)
	public String files(@MetadataKeyId(FilesKeysResolver.class) String type,
	    					  @Content @TypeResolver(FilesEntityResolver.class) String entity)
	{
	    return "";
	}
}
