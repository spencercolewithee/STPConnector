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
//.client.model.CustomProperty;
//.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PackageCustomProperties
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-04T10:29:31.230-04:00[America/New_York]")public class PackageCustomProperties {

  @SerializedName("packageCustomProperties")
  private List<CustomProperty> packageCustomProperties = null;
  public PackageCustomProperties packageCustomProperties(List<CustomProperty> packageCustomProperties) {
    this.packageCustomProperties = packageCustomProperties;
    return this;
  }

  public PackageCustomProperties addPackageCustomPropertiesItem(CustomProperty packageCustomPropertiesItem) {
    if (this.packageCustomProperties == null) {
      this.packageCustomProperties = new ArrayList<CustomProperty>();
    }
    this.packageCustomProperties.add(packageCustomPropertiesItem);
    return this;
  }

  /**
  * Collection of customProperty entities.
  * @return packageCustomProperties
  **/
  //(description = "Collection of customProperty entities.")
  public List<CustomProperty> getPackageCustomProperties() {
    return packageCustomProperties;
  }
  public void setPackageCustomProperties(List<CustomProperty> packageCustomProperties) {
    this.packageCustomProperties = packageCustomProperties;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageCustomProperties packageCustomProperties = (PackageCustomProperties) o;
    return Objects.equals(this.packageCustomProperties, packageCustomProperties.packageCustomProperties);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(packageCustomProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageCustomProperties {\n");
    
    sb.append("    packageCustomProperties: ").append(toIndentedString(packageCustomProperties)).append("\n");
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
