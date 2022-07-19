package com.avodagroup.securetransport.internal.operation;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import com.avodagroup.securetransport.internal.metadata.FileOpsEntityResolver;
import com.avodagroup.securetransport.internal.metadata.FileOpsKeysResolver;

public class FileOps {
	@MediaType(MediaType.APPLICATION_JSON)
	@OutputResolver(output = FileOpsEntityResolver.class)
	public String fileOps(@MetadataKeyId(FileOpsKeysResolver.class) String type,
	    					  @Content @TypeResolver(FileOpsEntityResolver.class) String entity)
	{
	    return "";
	}
}
