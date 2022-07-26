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

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
//.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * TransferResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-04T10:29:31.230-04:00[America/New_York]")public class TransferResult {

  @Parameter
  @SerializedName("message")
  private String message = null;

  @Parameter
  @Optional
  @SerializedName("link")
  private String link = null;
  public TransferResult message(String message) {
    this.message = message;
    return this;
  }

  

  /**
  * The transfer result message
  * @return message
  **/
  //(required = true, description = "The transfer result message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public TransferResult link(String link) {
    this.link = link;
    return this;
  }

  

  /**
  * The transfer log link.
  * @return link
  **/
  //(description = "The transfer log link.")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferResult transferResult = (TransferResult) o;
    return Objects.equals(this.message, transferResult.message) &&
        Objects.equals(this.link, transferResult.link);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(message, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferResult {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
