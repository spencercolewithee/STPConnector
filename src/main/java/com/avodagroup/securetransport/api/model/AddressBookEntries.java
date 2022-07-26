/*
 * SecureTransport End-User API v1.4
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.4.1
 * Contact: support@axway.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.avodagroup.securetransport.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AddressBookEntries
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-04T10:29:31.230-04:00[America/New_York]")public class AddressBookEntries {

  @SerializedName("addressBookEntries")
  private List<AddressBookEntry> addressBookEntries = null;
  public AddressBookEntries addressBookEntries(List<AddressBookEntry> addressBookEntries) {
    this.addressBookEntries = addressBookEntries;
    return this;
  }

  public AddressBookEntries addAddressBookEntriesItem(AddressBookEntry addressBookEntriesItem) {
    if (this.addressBookEntries == null) {
      this.addressBookEntries = new ArrayList<AddressBookEntry>();
    }
    this.addressBookEntries.add(addressBookEntriesItem);
    return this;
  }

  /**
  * Get addressBookEntries
  * @return addressBookEntries
  **/
  //(description = "")
  public List<AddressBookEntry> getAddressBookEntries() {
    return addressBookEntries;
  }
  public void setAddressBookEntries(List<AddressBookEntry> addressBookEntries) {
    this.addressBookEntries = addressBookEntries;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressBookEntries addressBookEntries = (AddressBookEntries) o;
    return Objects.equals(this.addressBookEntries, addressBookEntries.addressBookEntries);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(addressBookEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressBookEntries {\n");
    
    sb.append("    addressBookEntries: ").append(toIndentedString(addressBookEntries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
