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
//.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * ReceiptVerificationResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-04T10:29:31.230-04:00[America/New_York]")public class ReceiptVerificationResult {

  @SerializedName("fileIntegrityResult")
  private String fileIntegrityResult = null;

  @SerializedName("signatureResult")
  private String signatureResult = null;
  public ReceiptVerificationResult fileIntegrityResult(String fileIntegrityResult) {
    this.fileIntegrityResult = fileIntegrityResult;
    return this;
  }

  

  /**
  * The integrity check result code
  * @return fileIntegrityResult
  **/
  //(description = "The integrity check result code")
  public String getFileIntegrityResult() {
    return fileIntegrityResult;
  }
  public void setFileIntegrityResult(String fileIntegrityResult) {
    this.fileIntegrityResult = fileIntegrityResult;
  }
  public ReceiptVerificationResult signatureResult(String signatureResult) {
    this.signatureResult = signatureResult;
    return this;
  }

  

  /**
  * The signature check result.
  * @return signatureResult
  **/
  //(description = "The signature check result.")
  public String getSignatureResult() {
    return signatureResult;
  }
  public void setSignatureResult(String signatureResult) {
    this.signatureResult = signatureResult;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptVerificationResult receiptVerificationResult = (ReceiptVerificationResult) o;
    return Objects.equals(this.fileIntegrityResult, receiptVerificationResult.fileIntegrityResult) &&
        Objects.equals(this.signatureResult, receiptVerificationResult.signatureResult);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(fileIntegrityResult, signatureResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptVerificationResult {\n");
    
    sb.append("    fileIntegrityResult: ").append(toIndentedString(fileIntegrityResult)).append("\n");
    sb.append("    signatureResult: ").append(toIndentedString(signatureResult)).append("\n");
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