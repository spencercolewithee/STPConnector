package com.avodagroup.securetransport.api.param;

import java.util.Objects;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getAddressBookEntryByIdInput {
	
	  @Parameter
	  @SerializedName("name")
	  private String name = null;
	  
	  public getAddressBookEntryByIdInput name(String name) {
		    this.name = name;
		    return this;
		  }

		  
		  public String getName() {
		    return name;
		  }
		  public void setName(String name) {
		    this.name = name;
		  }

		  @Override
		  public int hashCode() {
		    return java.util.Objects.hash(name);
		  }

		  @Override
		  public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("class getAddressBookEntryById {\n");
		    
		    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
