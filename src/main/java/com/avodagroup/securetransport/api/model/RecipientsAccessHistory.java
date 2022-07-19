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
//.client.model.AccessHistory;
//.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RecipientsAccessHistory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-04T10:29:31.230-04:00[America/New_York]")public class RecipientsAccessHistory {

  @SerializedName("recipientsAccessHistory")
  private List<AccessHistory> recipientsAccessHistory = null;
  public RecipientsAccessHistory recipientsAccessHistory(List<AccessHistory> recipientsAccessHistory) {
    this.recipientsAccessHistory = recipientsAccessHistory;
    return this;
  }

  public RecipientsAccessHistory addRecipientsAccessHistoryItem(AccessHistory recipientsAccessHistoryItem) {
    if (this.recipientsAccessHistory == null) {
      this.recipientsAccessHistory = new ArrayList<AccessHistory>();
    }
    this.recipientsAccessHistory.add(recipientsAccessHistoryItem);
    return this;
  }

  /**
  * Collection of accessHistory entities.
  * @return recipientsAccessHistory
  **/
  //(description = "Collection of accessHistory entities.")
  public List<AccessHistory> getRecipientsAccessHistory() {
    return recipientsAccessHistory;
  }
  public void setRecipientsAccessHistory(List<AccessHistory> recipientsAccessHistory) {
    this.recipientsAccessHistory = recipientsAccessHistory;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientsAccessHistory recipientsAccessHistory = (RecipientsAccessHistory) o;
    return Objects.equals(this.recipientsAccessHistory, recipientsAccessHistory.recipientsAccessHistory);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(recipientsAccessHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientsAccessHistory {\n");
    
    sb.append("    recipientsAccessHistory: ").append(toIndentedString(recipientsAccessHistory)).append("\n");
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
