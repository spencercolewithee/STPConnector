package com.avodagroup.securetransport.internal.operation;


import com.avodagroup.securetransport.internal.SecureTransportEndUserConnection;
import com.avodagroup.securetransport.internal.metadata.AddressBookEntityResolver;
import com.avodagroup.securetransport.internal.metadata.AddressBookKeysResolver;
import com.avodagroup.securetransport.api.model.AddressBookEntry;
import com.avodagroup.securetransport.api.model.AddressBookEntries;

import org.mule.runtime.extension.api.annotation.metadata.MetadataKeyId;
import org.mule.runtime.extension.api.annotation.metadata.OutputResolver;
import org.mule.runtime.extension.api.annotation.metadata.TypeResolver;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.representation.Form;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;
import com.sun.jersey.multipart.impl.MultiPartWriter;

import java.util.*;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

// This class provides access to AddressBook Operations in the SecureTransport End-User API

public class AddressBook {
	private final Logger logger = LoggerFactory.getLogger(AddressBook.class);

	@MediaType(MediaType.APPLICATION_JSON)
	@OutputResolver(output = AddressBookEntityResolver.class)
	public Object addressBook(@Connection SecureTransportEndUserConnection stConnection,
								@MetadataKeyId(AddressBookKeysResolver.class) String operation,
	    					  	@Content @TypeResolver(AddressBookEntityResolver.class) Object content)
	{
		switch(operation){
			case "Get_Address_Book_Entry":
				return getAddressBookEntry(stConnection, content);
			case "Get_Address_Book_Entries":
				return getAddressBookEntries(stConnection, content);
			default:
		}

	    return "";
	}

	private AddressBookEntry getAddressBookEntry(SecureTransportEndUserConnection stConnection, Object content)
	{
		AddressBookEntry abe = null;

		try {
			URI uri = UriBuilder.fromPath(stConnection.getServerUrl()).path("addressBook")
					.path(content.toString())
					.build();
			WebResource web = stConnection.getClient().resource(uri);

			final String jsonResponse = web.get(String.class);
			abe = new ObjectMapper().readValue(jsonResponse, AddressBookEntry.class);
		} catch (Exception e)
		{
			logger.error("Exception thrown " + e.toString());
		}
		return abe;
	}

	private AddressBookEntries getAddressBookEntries(SecureTransportEndUserConnection stConnection, Object content)
	{
		AddressBookEntries abe = null;

		try {
			URI uri = UriBuilder.fromPath(stConnection.getServerUrl()).path("addressBook").build();
			WebResource web = stConnection.getClient().resource(uri);

			final String jsonResponse = web.get(String.class);
			abe = new ObjectMapper().readValue(jsonResponse, AddressBookEntries.class);
		} catch (Exception e)
		{
			logger.error("Exception thrown " + e.toString());
		}
		return abe;
	}

}
