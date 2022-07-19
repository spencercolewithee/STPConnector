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
 * MonitoredFolder
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-04T10:29:31.230-04:00[America/New_York]")public class MonitoredFolder {

  @Parameter
  @Optional
  @SerializedName("operationIndex")
  private String operationIndex = null;

  @Parameter
  @SerializedName("downloadFolder")
  private String downloadFolder = null;

  @Parameter
  @SerializedName("filePattern")
  private String filePattern = null;
  /**
   * The file pattern type
   */
  @JsonAdapter(FilePatternTypeEnum.Adapter.class)
  public enum FilePatternTypeEnum {
    GLOB("glob"),
    REGEXP("regexp");

    private String value;

    FilePatternTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FilePatternTypeEnum fromValue(String text) {
      for (FilePatternTypeEnum b : FilePatternTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FilePatternTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilePatternTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FilePatternTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FilePatternTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @Parameter
  @SerializedName("filePatternType")
  private FilePatternTypeEnum filePatternType = FilePatternTypeEnum.GLOB;

  @Parameter
  @SerializedName("fileCaseSensitive")
  private Boolean fileCaseSensitive = true;

  @Parameter
  @SerializedName("subFolderPattern")
  private String subFolderPattern = null;
  /**
   * The sub-folder pattern type
   */
  @JsonAdapter(SubFolderPatternTypeEnum.Adapter.class)
  public enum SubFolderPatternTypeEnum {
    GLOB("glob"),
    REGEXP("regexp");

    private String value;

    SubFolderPatternTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SubFolderPatternTypeEnum fromValue(String text) {
      for (SubFolderPatternTypeEnum b : SubFolderPatternTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SubFolderPatternTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubFolderPatternTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubFolderPatternTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubFolderPatternTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @Parameter
  @SerializedName("subFolderPatternType")
  private SubFolderPatternTypeEnum subFolderPatternType = SubFolderPatternTypeEnum.GLOB;

  @Parameter
  @SerializedName("subFolderCaseSensitive")
  private Boolean subFolderCaseSensitive = true;

  @Parameter
  @SerializedName("maxDepth")
  private Integer maxDepth = 1;

  @Parameter
  @SerializedName("uploadFolder")
  private String uploadFolder = null;
  public MonitoredFolder operationIndex(String operationIndex) {
    this.operationIndex = operationIndex;
    return this;
  }

  

  /**
  * The transfer&#x27;s operation index denoting a group file transfer inspired by this monitored folder
  * @return operationIndex
  **/
  //(description = "The transfer's operation index denoting a group file transfer inspired by this monitored folder")
  public String getOperationIndex() {
    return operationIndex;
  }
  public void setOperationIndex(String operationIndex) {
    this.operationIndex = operationIndex;
  }
  public MonitoredFolder downloadFolder(String downloadFolder) {
    this.downloadFolder = downloadFolder;
    return this;
  }

  

  /**
  * The download folder from which files are retrieved
  * @return downloadFolder
  **/
  //(required = true, description = "The download folder from which files are retrieved")
  public String getDownloadFolder() {
    return downloadFolder;
  }
  public void setDownloadFolder(String downloadFolder) {
    this.downloadFolder = downloadFolder;
  }
  public MonitoredFolder filePattern(String filePattern) {
    this.filePattern = filePattern;
    return this;
  }

  

  /**
  * The file selection pattern.
  * @return filePattern
  **/
  //(required = true, description = "The file selection pattern.")
  public String getFilePattern() {
    return filePattern;
  }
  public void setFilePattern(String filePattern) {
    this.filePattern = filePattern;
  }
  public MonitoredFolder filePatternType(FilePatternTypeEnum filePatternType) {
    this.filePatternType = filePatternType;
    return this;
  }

  

  /**
  * The file pattern type
  * @return filePatternType
  **/
  //(required = true, description = "The file pattern type")
  public FilePatternTypeEnum getFilePatternType() {
    return filePatternType;
  }
  public void setFilePatternType(FilePatternTypeEnum filePatternType) {
    this.filePatternType = filePatternType;
  }
  public MonitoredFolder fileCaseSensitive(Boolean fileCaseSensitive) {
    this.fileCaseSensitive = fileCaseSensitive;
    return this;
  }

  

  /**
  * Define whether the file pattern is to take into account case-sensitiveness (true if case-sensitive, false otherwise)
  * @return fileCaseSensitive
  **/
  //(required = true, description = "Define whether the file pattern is to take into account case-sensitiveness (true if case-sensitive, false otherwise)")
  public Boolean isFileCaseSensitive() {
    return fileCaseSensitive;
  }
  public void setFileCaseSensitive(Boolean fileCaseSensitive) {
    this.fileCaseSensitive = fileCaseSensitive;
  }
  public MonitoredFolder subFolderPattern(String subFolderPattern) {
    this.subFolderPattern = subFolderPattern;
    return this;
  }

  

  /**
  * The sub-folder selection pattern
  * @return subFolderPattern
  **/
  //(required = true, description = "The sub-folder selection pattern")
  public String getSubFolderPattern() {
    return subFolderPattern;
  }
  public void setSubFolderPattern(String subFolderPattern) {
    this.subFolderPattern = subFolderPattern;
  }
  public MonitoredFolder subFolderPatternType(SubFolderPatternTypeEnum subFolderPatternType) {
    this.subFolderPatternType = subFolderPatternType;
    return this;
  }

  

  /**
  * The sub-folder pattern type
  * @return subFolderPatternType
  **/
  //(required = true, description = "The sub-folder pattern type")
  public SubFolderPatternTypeEnum getSubFolderPatternType() {
    return subFolderPatternType;
  }
  public void setSubFolderPatternType(SubFolderPatternTypeEnum subFolderPatternType) {
    this.subFolderPatternType = subFolderPatternType;
  }
  public MonitoredFolder subFolderCaseSensitive(Boolean subFolderCaseSensitive) {
    this.subFolderCaseSensitive = subFolderCaseSensitive;
    return this;
  }

  

  /**
  * Define whether the sub-folder pattern is to take into account case-sensitiveness
  * @return subFolderCaseSensitive
  **/
  //(required = true, description = "Define whether the sub-folder pattern is to take into account case-sensitiveness")
  public Boolean isSubFolderCaseSensitive() {
    return subFolderCaseSensitive;
  }
  public void setSubFolderCaseSensitive(Boolean subFolderCaseSensitive) {
    this.subFolderCaseSensitive = subFolderCaseSensitive;
  }
  public MonitoredFolder maxDepth(Integer maxDepth) {
    this.maxDepth = maxDepth;
    return this;
  }

  

  /**
  * The sub-folder traverse maximum depth. If this property is negative then the whole sub-folder tree will be traversed
  * @return maxDepth
  **/
  //(required = true, description = "The sub-folder traverse maximum depth. If this property is negative then the whole sub-folder tree will be traversed")
  public Integer getMaxDepth() {
    return maxDepth;
  }
  public void setMaxDepth(Integer maxDepth) {
    this.maxDepth = maxDepth;
  }
  public MonitoredFolder uploadFolder(String uploadFolder) {
    this.uploadFolder = uploadFolder;
    return this;
  }

  

  /**
  * The upload folder where files are moved.
  * @return uploadFolder
  **/
  //(required = true, description = "The upload folder where files are moved.")
  public String getUploadFolder() {
    return uploadFolder;
  }
  public void setUploadFolder(String uploadFolder) {
    this.uploadFolder = uploadFolder;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoredFolder monitoredFolder = (MonitoredFolder) o;
    return Objects.equals(this.operationIndex, monitoredFolder.operationIndex) &&
        Objects.equals(this.downloadFolder, monitoredFolder.downloadFolder) &&
        Objects.equals(this.filePattern, monitoredFolder.filePattern) &&
        Objects.equals(this.filePatternType, monitoredFolder.filePatternType) &&
        Objects.equals(this.fileCaseSensitive, monitoredFolder.fileCaseSensitive) &&
        Objects.equals(this.subFolderPattern, monitoredFolder.subFolderPattern) &&
        Objects.equals(this.subFolderPatternType, monitoredFolder.subFolderPatternType) &&
        Objects.equals(this.subFolderCaseSensitive, monitoredFolder.subFolderCaseSensitive) &&
        Objects.equals(this.maxDepth, monitoredFolder.maxDepth) &&
        Objects.equals(this.uploadFolder, monitoredFolder.uploadFolder);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(operationIndex, downloadFolder, filePattern, filePatternType, fileCaseSensitive, subFolderPattern, subFolderPatternType, subFolderCaseSensitive, maxDepth, uploadFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoredFolder {\n");
    
    sb.append("    operationIndex: ").append(toIndentedString(operationIndex)).append("\n");
    sb.append("    downloadFolder: ").append(toIndentedString(downloadFolder)).append("\n");
    sb.append("    filePattern: ").append(toIndentedString(filePattern)).append("\n");
    sb.append("    filePatternType: ").append(toIndentedString(filePatternType)).append("\n");
    sb.append("    fileCaseSensitive: ").append(toIndentedString(fileCaseSensitive)).append("\n");
    sb.append("    subFolderPattern: ").append(toIndentedString(subFolderPattern)).append("\n");
    sb.append("    subFolderPatternType: ").append(toIndentedString(subFolderPatternType)).append("\n");
    sb.append("    subFolderCaseSensitive: ").append(toIndentedString(subFolderCaseSensitive)).append("\n");
    sb.append("    maxDepth: ").append(toIndentedString(maxDepth)).append("\n");
    sb.append("    uploadFolder: ").append(toIndentedString(uploadFolder)).append("\n");
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
