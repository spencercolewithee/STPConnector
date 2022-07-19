package com.avodagroup.securetransport.internal.operation;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.MediaType;

import com.avodagroup.securetransport.internal.metadata.MailboxEntityResolver;
import com.avodagroup.securetransport.internal.metadata.MailboxKeysResolver;

public class Mailbox {
	@MediaType(MediaType.APPLICATION_JSON)
	@OutputResolver(output = MailboxEntityResolver.class)
	public String mailbox(@MetadataKeyId(MailboxKeysResolver.class) String type,
	    					  @Content @TypeResolver(MailboxEntityResolver.class) String entity)
	{
	    return "";
	}
}
