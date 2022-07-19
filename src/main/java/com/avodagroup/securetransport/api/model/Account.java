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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Account
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-04T10:29:31.230-04:00[America/New_York]")public class Account {

  @Parameter
  @SerializedName("name")
  private String name = null;

  @Parameter
  @Optional
  @SerializedName("homeFolder")
  private String homeFolder = null;
  /**
   * The home folder access level
   */
  @JsonAdapter(HomeFolderAccessLevelEnum.Adapter.class)
  public enum HomeFolderAccessLevelEnum {
    PRIVATE("PRIVATE"),
    PUBLIC("PUBLIC"),
    BUSINESS_UNIT("BUSINESS_UNIT");
	
	
    private String value;

    HomeFolderAccessLevelEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HomeFolderAccessLevelEnum fromValue(String text) {
      for (HomeFolderAccessLevelEnum b : HomeFolderAccessLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HomeFolderAccessLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HomeFolderAccessLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HomeFolderAccessLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HomeFolderAccessLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @Parameter
  @Optional
  @SerializedName("homeFolderAccessLevel")
  private HomeFolderAccessLevelEnum homeFolderAccessLevel = null;

  @Parameter
  @SerializedName("uid")
  private String uid = null;

  @Parameter
  @SerializedName("gid")
  private String gid = null;

  @Parameter
  @Optional
  @SerializedName("mappedUser")
  private String mappedUser = null;

  @Parameter
  @Optional
  @SerializedName("disabled")
  private Boolean disabled = false;
  /**
   * The skin templates
   */
  @JsonAdapter(SkinEnum.Adapter.class)
  public enum SkinEnum {
    DEFAULT_HTML_TEMPLATE("Default HTML Template"),
    AXWAY_JELLY_BALL_9("Axway Jelly Ball 9"),
    SECURETRANSPORT_LEGACY_CLIENT("SecureTransport Legacy Client"),
    AXWAY_BOX_AND_STRIPE_IN_BLUE("Axway Box and Stripe in Blue"),
    SECURETRANSPORT_WEB_ACCESS_PLUS("SecureTransport Web Access Plus");

    private String value;

    SkinEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SkinEnum fromValue(String text) {
      for (SkinEnum b : SkinEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SkinEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SkinEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SkinEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SkinEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @Parameter
  @Optional
  @SerializedName("skin")
  private SkinEnum skin = null;

  @Parameter
  @Optional
  @SerializedName("notes")
  private String notes = null;
  /**
   * The account type. Type &#x27;user&#x27; means user account; type &#x27;service&#x27; means service account; type &#x27;template&#x27; means account template 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USER("user"),
    SERVICE("service"),
    TEMPLATE("template");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @Parameter
  @SerializedName("type")
  private TypeEnum type = null;

  @Parameter
  @Optional
  @SerializedName("unlicensed")
  private Boolean unlicensed = false;

  @Parameter
  @Optional
  @SerializedName("authByEmail")
  private Boolean authByEmail = false;

  @Parameter
  @Optional
  @SerializedName("businessUnit")
  private String businessUnit = null;

  @Parameter
  @Optional
  @SerializedName("contact")
  private AccountContact contact = null;
  /**
   * This property defines the delivery method. When deliveryMethod is set to &#x27;Disabled&#x27; then Adhoc is disabled and enrollmentType/implicitEnrollmentType can not be set. When deliveryMethod is set to &#x27;Default&#x27; then it is only available on BU and Account (setting the BU to use the value and account to use the BU value). When deliveryMethod is set to &#x27;Anonymous&#x27; then implicit enrollment types &#x27;Anonymous&#x27; and \&quot;\&quot; (empty string for Select by sender) are enabled. When deliveryMethod is set to &#x27;Account Without Enrollment&#x27; then implicit enrollment types &#x27;Anonymous&#x27;, \&quot;\&quot;  (empty string for Select by sender) and &#x27;Existing Account&#x27; are enabled. When deliveryMethod is set to &#x27;Account With Enrollment&#x27; then implicit enrollment types &#x27;Anonymous&#x27;, \&quot;\&quot; (empty string for Select by sender), &#x27;Enroll unlicensed&#x27;, &#x27;Enroll licensed&#x27; are enabled           
   */
  @JsonAdapter(DeliveryMethodEnum.Adapter.class)
  public enum DeliveryMethodEnum {
    DISABLED("Disabled"),
    DEFAULT("Default"),
    ANONYMOUS("Anonymous"),
    ACCOUNT_WITHOUT_ENROLLMENT("Account Without Enrollment"),
    ACCOUNT_WITH_ENROLLMENT("Account With Enrollment"),
    CUSTOM("Custom");

    private String value;

    DeliveryMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DeliveryMethodEnum fromValue(String text) {
      for (DeliveryMethodEnum b : DeliveryMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DeliveryMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeliveryMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @Parameter
  @Optional
  @SerializedName("deliveryMethod")
  private DeliveryMethodEnum deliveryMethod = null;

  @Parameter
  @Optional
  @SerializedName("enrollmentTypes")
  private List<String> enrollmentTypes = null;
  /**
   * The Implicit Enrollment Type value controls which option Web Access Plus selects initially in the User Access window and which enrollment type is used by the Axway Email Plug-ins. The choices depend on the enrollment types enabled by the Delivery Methods and Enrollment Types fields 
   */
  @JsonAdapter(ImplicitEnrollmentTypeEnum.Adapter.class)
  public enum ImplicitEnrollmentTypeEnum {
    EMPTY(""),
    ANONYMOUS("Anonymous"),
    EXISTING_ACCOUNT("Existing Account"),
    ENROLL_UNLICENSED("Enroll Unlicensed"),
    ENROLL_LICENSED("Enroll Licensed");

    private String value;

    ImplicitEnrollmentTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ImplicitEnrollmentTypeEnum fromValue(String text) {
      for (ImplicitEnrollmentTypeEnum b : ImplicitEnrollmentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ImplicitEnrollmentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImplicitEnrollmentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImplicitEnrollmentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImplicitEnrollmentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @Parameter
  @Optional
  @SerializedName("implicitEnrollmentType")
  private ImplicitEnrollmentTypeEnum implicitEnrollmentType = null;

  @Parameter
  @Optional
  @SerializedName("isUnlicensedUserAllowedToReply")
  private Boolean isUnlicensedUserAllowedToReply = false;

  @Parameter
  @Optional
  @SerializedName("wapAppletEnabled")
  private Boolean wapAppletEnabled = false;
  public Account name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The account name
  * @return name
  **/
  //(required = true, description = "The account name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Account homeFolder(String homeFolder) {
    this.homeFolder = homeFolder;
    return this;
  }

  

  /**
  * The home folder on the local system used for this account. The folder path name must be a valid absolute directory name 
  * @return homeFolder
  **/
  //(description = "The home folder on the local system used for this account. The folder path name must be a valid absolute directory name ")
  public String getHomeFolder() {
    return homeFolder;
  }
  public void setHomeFolder(String homeFolder) {
    this.homeFolder = homeFolder;
  }
  public Account homeFolderAccessLevel(HomeFolderAccessLevelEnum homeFolderAccessLevel) {
    this.homeFolderAccessLevel = homeFolderAccessLevel;
    return this;
  }

  

  /**
  * The home folder access level
  * @return homeFolderAccessLevel
  **/
  //(description = "The home folder access level")
  public HomeFolderAccessLevelEnum getHomeFolderAccessLevel() {
    return homeFolderAccessLevel;
  }
  public void setHomeFolderAccessLevel(HomeFolderAccessLevelEnum homeFolderAccessLevel) {
    this.homeFolderAccessLevel = homeFolderAccessLevel;
  }
  public Account uid(String uid) {
    this.uid = uid;
    return this;
  }

  

  /**
  * The numeric user ID of the account. Required for SecureTransport installation running on UNIX environment.
  * @return uid
  **/
  //(required = true, description = "The numeric user ID of the account. Required for SecureTransport installation running on UNIX environment.")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }
  public Account gid(String gid) {
    this.gid = gid;
    return this;
  }

  

  /**
  * The numeric group ID of the account
  * @return gid
  **/
  //(required = true, description = "The numeric group ID of the account")
  public String getGid() {
    return gid;
  }
  public void setGid(String gid) {
    this.gid = gid;
  }
  public Account mappedUser(String mappedUser) {
    this.mappedUser = mappedUser;
    return this;
  }

  

  /**
  * The name of the real user mapped to this account for SecureTransport installation running on Windows environment.
  * @return mappedUser
  **/
  //(description = "The name of the real user mapped to this account for SecureTransport installation running on Windows environment.")
  public String getMappedUser() {
    return mappedUser;
  }
  public void setMappedUser(String mappedUser) {
    this.mappedUser = mappedUser;
  }
  public Account disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  

  /**
  * This property defines if this account is disabled. If the account is disabled: 1) Subscriptions for the account will not trigger. ; 2) Users associated with the account will not be able to login and perform any transfers 
  * @return disabled
  **/
  //(description = "This property defines if this account is disabled. If the account is disabled: 1) Subscriptions for the account will not trigger. ; 2) Users associated with the account will not be able to login and perform any transfers ")
  public Boolean isDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }
  public Account skin(SkinEnum skin) {
    this.skin = skin;
    return this;
  }

  

  /**
  * The skin templates
  * @return skin
  **/
  //(description = "The skin templates")
  public SkinEnum getSkin() {
    return skin;
  }
  public void setSkin(SkinEnum skin) {
    this.skin = skin;
  }
  public Account notes(String notes) {
    this.notes = notes;
    return this;
  }

  

  /**
  * An unstructured comments to the account
  * @return notes
  **/
  //(description = "An unstructured comments to the account")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }
  public Account type(TypeEnum type) {
    this.type = type;
    return this;
  }

  

  /**
  * The account type. Type &#x27;user&#x27; means user account; type &#x27;service&#x27; means service account; type &#x27;template&#x27; means account template 
  * @return type
  **/
  //(required = true, description = "The account type. Type 'user' means user account; type 'service' means service account; type 'template' means account template ")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
  public Account unlicensed(Boolean unlicensed) {
    this.unlicensed = unlicensed;
    return this;
  }

  

  /**
  * This property defines if the account is an unlicensed account
  * @return unlicensed
  **/
  //(description = "This property defines if the account is an unlicensed account")
  public Boolean isUnlicensed() {
    return unlicensed;
  }
  public void setUnlicensed(Boolean unlicensed) {
    this.unlicensed = unlicensed;
  }
  public Account authByEmail(Boolean authByEmail) {
    this.authByEmail = authByEmail;
    return this;
  }

  

  /**
  * This property defines if authentication by email address is allowed for this account
  * @return authByEmail
  **/
  //(description = "This property defines if authentication by email address is allowed for this account")
  public Boolean isAuthByEmail() {
    return authByEmail;
  }
  public void setAuthByEmail(Boolean authByEmail) {
    this.authByEmail = authByEmail;
  }
  public Account businessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

  

  /**
  * The business unit that account belongs to
  * @return businessUnit
  **/
  //(description = "The business unit that account belongs to")
  public String getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }
  public Account contact(AccountContact contact) {
    this.contact = contact;
    return this;
  }

  

  /**
  * Get contact
  * @return contact
  **/
  //(description = "")
  public AccountContact getContact() {
    return contact;
  }
  public void setContact(AccountContact contact) {
    this.contact = contact;
  }
  public Account deliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  

  /**
  * This property defines the delivery method. When deliveryMethod is set to &#x27;Disabled&#x27; then Adhoc is disabled and enrollmentType/implicitEnrollmentType can not be set. When deliveryMethod is set to &#x27;Default&#x27; then it is only available on BU and Account (setting the BU to use the value and account to use the BU value). When deliveryMethod is set to &#x27;Anonymous&#x27; then implicit enrollment types &#x27;Anonymous&#x27; and \&quot;\&quot; (empty string for Select by sender) are enabled. When deliveryMethod is set to &#x27;Account Without Enrollment&#x27; then implicit enrollment types &#x27;Anonymous&#x27;, \&quot;\&quot;  (empty string for Select by sender) and &#x27;Existing Account&#x27; are enabled. When deliveryMethod is set to &#x27;Account With Enrollment&#x27; then implicit enrollment types &#x27;Anonymous&#x27;, \&quot;\&quot; (empty string for Select by sender), &#x27;Enroll unlicensed&#x27;, &#x27;Enroll licensed&#x27; are enabled           
  * @return deliveryMethod
  **/
  //(description = "This property defines the delivery method. When deliveryMethod is set to 'Disabled' then Adhoc is disabled and enrollmentType/implicitEnrollmentType can not be set. When deliveryMethod is set to 'Default' then it is only available on BU and Account (setting the BU to use the value and account to use the BU value). When deliveryMethod is set to 'Anonymous' then implicit enrollment types 'Anonymous' and \"\" (empty string for Select by sender) are enabled. When deliveryMethod is set to 'Account Without Enrollment' then implicit enrollment types 'Anonymous', \"\"  (empty string for Select by sender) and 'Existing Account' are enabled. When deliveryMethod is set to 'Account With Enrollment' then implicit enrollment types 'Anonymous', \"\" (empty string for Select by sender), 'Enroll unlicensed', 'Enroll licensed' are enabled           ")
  public DeliveryMethodEnum getDeliveryMethod() {
    return deliveryMethod;
  }
  public void setDeliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }
  public Account enrollmentTypes(List<String> enrollmentTypes) {
    this.enrollmentTypes = enrollmentTypes;
    return this;
  }

  public Account addEnrollmentTypesItem(String enrollmentTypesItem) {
    if (this.enrollmentTypes == null) {
      this.enrollmentTypes = new ArrayList<String>();
    }
    this.enrollmentTypes.add(enrollmentTypesItem);
    return this;
  }

  /**
  * This property is used for a custom delivery method and can be set only if deliveryMethod property is set to &#x27;Custom&#x27; 
  * @return enrollmentTypes
  **/
  //(description = "This property is used for a custom delivery method and can be set only if deliveryMethod property is set to 'Custom' ")
  public List<String> getEnrollmentTypes() {
    return enrollmentTypes;
  }
  public void setEnrollmentTypes(List<String> enrollmentTypes) {
    this.enrollmentTypes = enrollmentTypes;
  }
  public Account implicitEnrollmentType(ImplicitEnrollmentTypeEnum implicitEnrollmentType) {
    this.implicitEnrollmentType = implicitEnrollmentType;
    return this;
  }

  

  /**
  * The Implicit Enrollment Type value controls which option Web Access Plus selects initially in the User Access window and which enrollment type is used by the Axway Email Plug-ins. The choices depend on the enrollment types enabled by the Delivery Methods and Enrollment Types fields 
  * @return implicitEnrollmentType
  **/
  //(description = "The Implicit Enrollment Type value controls which option Web Access Plus selects initially in the User Access window and which enrollment type is used by the Axway Email Plug-ins. The choices depend on the enrollment types enabled by the Delivery Methods and Enrollment Types fields ")
  public ImplicitEnrollmentTypeEnum getImplicitEnrollmentType() {
    return implicitEnrollmentType;
  }
  public void setImplicitEnrollmentType(ImplicitEnrollmentTypeEnum implicitEnrollmentType) {
    this.implicitEnrollmentType = implicitEnrollmentType;
  }
  public Account isUnlicensedUserAllowedToReply(Boolean isUnlicensedUserAllowedToReply) {
    this.isUnlicensedUserAllowedToReply = isUnlicensedUserAllowedToReply;
    return this;
  }

  

  /**
  * This property defines if the unlicensed user may reply to packages
  * @return isUnlicensedUserAllowedToReply
  **/
  //(description = "This property defines if the unlicensed user may reply to packages")
  public Boolean isIsUnlicensedUserAllowedToReply() {
    return isUnlicensedUserAllowedToReply;
  }
  public void setIsUnlicensedUserAllowedToReply(Boolean isUnlicensedUserAllowedToReply) {
    this.isUnlicensedUserAllowedToReply = isUnlicensedUserAllowedToReply;
  }
  public Account wapAppletEnabled(Boolean wapAppletEnabled) {
    this.wapAppletEnabled = wapAppletEnabled;
    return this;
  }

  

  /**
  * This property defines if Java WAP applet enabled or not for this account.
  * @return wapAppletEnabled
  **/
  //(description = "This property defines if Java WAP applet enabled or not for this account.")
  public Boolean isWapAppletEnabled() {
    return wapAppletEnabled;
  }
  public void setWapAppletEnabled(Boolean wapAppletEnabled) {
    this.wapAppletEnabled = wapAppletEnabled;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.name, account.name) &&
        Objects.equals(this.homeFolder, account.homeFolder) &&
        Objects.equals(this.homeFolderAccessLevel, account.homeFolderAccessLevel) &&
        Objects.equals(this.uid, account.uid) &&
        Objects.equals(this.gid, account.gid) &&
        Objects.equals(this.mappedUser, account.mappedUser) &&
        Objects.equals(this.disabled, account.disabled) &&
        Objects.equals(this.skin, account.skin) &&
        Objects.equals(this.notes, account.notes) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.unlicensed, account.unlicensed) &&
        Objects.equals(this.authByEmail, account.authByEmail) &&
        Objects.equals(this.businessUnit, account.businessUnit) &&
        Objects.equals(this.contact, account.contact) &&
        Objects.equals(this.deliveryMethod, account.deliveryMethod) &&
        Objects.equals(this.enrollmentTypes, account.enrollmentTypes) &&
        Objects.equals(this.implicitEnrollmentType, account.implicitEnrollmentType) &&
        Objects.equals(this.isUnlicensedUserAllowedToReply, account.isUnlicensedUserAllowedToReply) &&
        Objects.equals(this.wapAppletEnabled, account.wapAppletEnabled);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, homeFolder, homeFolderAccessLevel, uid, gid, mappedUser, disabled, skin, notes, type, unlicensed, authByEmail, businessUnit, contact, deliveryMethod, enrollmentTypes, implicitEnrollmentType, isUnlicensedUserAllowedToReply, wapAppletEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    homeFolder: ").append(toIndentedString(homeFolder)).append("\n");
    sb.append("    homeFolderAccessLevel: ").append(toIndentedString(homeFolderAccessLevel)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    mappedUser: ").append(toIndentedString(mappedUser)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    skin: ").append(toIndentedString(skin)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unlicensed: ").append(toIndentedString(unlicensed)).append("\n");
    sb.append("    authByEmail: ").append(toIndentedString(authByEmail)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    enrollmentTypes: ").append(toIndentedString(enrollmentTypes)).append("\n");
    sb.append("    implicitEnrollmentType: ").append(toIndentedString(implicitEnrollmentType)).append("\n");
    sb.append("    isUnlicensedUserAllowedToReply: ").append(toIndentedString(isUnlicensedUserAllowedToReply)).append("\n");
    sb.append("    wapAppletEnabled: ").append(toIndentedString(wapAppletEnabled)).append("\n");
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