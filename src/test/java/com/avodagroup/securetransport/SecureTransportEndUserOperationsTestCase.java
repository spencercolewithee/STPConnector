package com.avodagroup.securetransport;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.junit.Test;

import com.avodagroup.securetransport.api.model.AddressBookEntry;

public class SecureTransportEndUserOperationsTestCase extends MuleArtifactFunctionalTestCase {

  /**
   * Specifies the mule config xml with the flows that are going to be executed in the tests, this file lives in the test resources.
   */
  @Override
  protected String getConfigFile() {
    return "test-mule-config.xml";
  }

  @Test
  public void executeGetAddressBookEntryOperation() throws Exception {
    AddressBookEntry payloadValue = ((AddressBookEntry) flowRunner("getAddressBookEntryFlow").run()
            .getMessage()
            .getPayload()
            .getValue());
    System.out.println(payloadValue.toString());
    System.err.println(payloadValue.toString());
    assertThat(payloadValue.getId(), is("200"));
  }
}
