package com.avodagroup.securetransport.internal;

import com.avodagroup.securetransport.internal.operation.AddressBook;
import com.avodagroup.securetransport.internal.operation.FileOps;
import com.avodagroup.securetransport.internal.operation.Files;
import com.avodagroup.securetransport.internal.operation.Mailbox;
import com.avodagroup.securetransport.internal.operation.Myself;
import com.avodagroup.securetransport.internal.operation.Password;
import com.avodagroup.securetransport.internal.operation.Shares;
import com.avodagroup.securetransport.internal.operation.Transfers;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations({
        AddressBook.class,
        FileOps.class,
        Files.class,
        Mailbox.class,
        Myself.class,
        Password.class,
        Shares.class,
        Transfers.class
})
@ConnectionProviders(SecureTransportEndUserConnectionProvider.class)
public class SecureTransportEndUserConfiguration {

  @Parameter
  private String configId;

  public String getConfigId(){
    return configId;
  }
}
