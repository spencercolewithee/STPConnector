package com.avodagroup.securetransport.internal;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * This class represents an extension connection just as example (there is no real connection with anything here c:).
 */
public final class SecureTransportEndUserConnection {

  private final String serverUrl;
  private Client client;

  public SecureTransportEndUserConnection(String serverUrl)
  {
    this.serverUrl = serverUrl;
    this.client = Client.create();
  }

  public String getServerUrl()
  {
    return serverUrl;
  }

  public void invalidate() {
    // do something to invalidate this connection!
  }

  public Client getClient()
  {
    return client;
  }

  public void setClient(Client client)
  {
    this.client = client;
  }
}
