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

/**
 * Specifies the transfer mode of the operation. It can be &#x27;BINARY&#x27; or &#x27;ASCII&#x27;.
 */
//(description = "Specifies the transfer mode of the operation. It can be 'BINARY' or 'ASCII'.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-04T10:29:31.230-04:00[America/New_York]")public class AsyncOperationCustomAttributes {

  @SerializedName("transferMode")
  private String transferMode = null;
  public AsyncOperationCustomAttributes transferMode(String transferMode) {
    this.transferMode = transferMode;
    return this;
  }

  

  /**
  * Get transferMode
  * @return transferMode
  **/
  //(description = "")
  public String getTransferMode() {
    return transferMode;
  }
  public void setTransferMode(String transferMode) {
    this.transferMode = transferMode;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncOperationCustomAttributes asyncOperationCustomAttributes = (AsyncOperationCustomAttributes) o;
    return Objects.equals(this.transferMode, asyncOperationCustomAttributes.transferMode);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(transferMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncOperationCustomAttributes {\n");
    
    sb.append("    transferMode: ").append(toIndentedString(transferMode)).append("\n");
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