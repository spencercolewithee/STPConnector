package com.avodagroup.securetransport.internal.metadata;

import com.avodagroup.securetransport.api.model.Folder;
import com.avodagroup.securetransport.api.model.MapStringToObject;
import com.avodagroup.securetransport.api.model.MapStringToString;
import com.avodagroup.securetransport.api.model.Message;
import com.avodagroup.securetransport.api.model.MyselfObject;
import com.avodagroup.securetransport.api.model.PackageCustomProperties;
import com.avodagroup.securetransport.api.model.RecipientsAccessHistory;
import com.avodagroup.securetransport.api.model.RecipientsDownloadHistory;
import com.avodagroup.securetransport.api.model.Search;

import org.mule.metadata.api.model.MetadataType;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.InputTypeResolver;
import org.mule.runtime.api.metadata.resolving.OutputTypeResolver;
import org.mule.runtime.api.metadata.resolving.FailureCode;


public class MailboxEntityResolver implements InputTypeResolver<String>, OutputTypeResolver<String> {
    @Override
    public String getResolverName() {
        return "MailboxEntityResolver";
    }

    @Override
    public MetadataType getInputMetadata(MetadataContext metadataContext, String key)
    		throws MetadataResolvingException, ConnectionException {
    	switch(key){
    		case "Get_Mailbox_Global_Settings":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_User_Language":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Register_User":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Register_User_Data":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_User_Login_Image":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Request_Password_Hint":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Request_Password_Reset":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Reset_User_Password":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Folders":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Create_Mailbox_New_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Folder_Name":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Delete_Mailbox_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Rename_Mailbox_Folder":
    			return metadataContext.getTypeLoader().load(String.class);		
    		case "Get_Message_Download_History":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_History_First_Access":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Create_Draft_Message":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Anonymous_Message_By_Get":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Anonymous_Message_By_Post":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Information":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Update_Draft":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Delete_Message_Or_Draft":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Add_Attachment_To_Draft_Message":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Abort_Item_Transfer":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Abort_Package_Transfer":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Attachments_Zipped":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Resume_Attachment":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Attachment":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Delete_Message_Attachment":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Content":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Text_Unsanitized_Html":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Custom_Properties":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Set_Custom_Properties":
    			return metadataContext.getTypeLoader().load(PackageCustomProperties.class);
    		case "Move_Message_To_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Forward_Message":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Recall_Message":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Post_Reply":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Send_Draft_Message":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Myself_Info":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Mailbox_Logout_User":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Preferences":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Update_Preferences":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Purls":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Purls":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Search_For_Message":
    			return metadataContext.getTypeLoader().load(Search.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    	}  
    }

    @Override
    public MetadataType getOutputType(MetadataContext metadataContext, String key)
    			throws MetadataResolvingException, ConnectionException {
    		switch(key){
    		case "Get_Mailbox_Global_Settings":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Get_Mailbox_User_Language":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Register_User":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Get_Mailbox_Register_User_Data":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Get_Mailbox_User_Login_Image":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Request_Password_Hint":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Request_Password_Reset":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Reset_User_Password":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Get_Mailbox_Folders":
    			return metadataContext.getTypeLoader().load(Folder.class);
    		case "Create_Mailbox_New_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Folder_Name":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Folder":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Delete_Mailbox_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Rename_Mailbox_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Download_History":
    			return metadataContext.getTypeLoader().load(RecipientsDownloadHistory.class);
    		case "Get_Message_History_First_Access":
    			return metadataContext.getTypeLoader().load(RecipientsAccessHistory.class);
    		case "Create_Draft_Message":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Get_Anonymous_Message_By_Get":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Anonymous_Message_By_Post":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Get_Message_Information":
    			return metadataContext.getTypeLoader().load(Message.class);
    		case "Update_Draft":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Delete_Message_Or_Draft":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Add_Attachment_To_Draft_Message":
    			return metadataContext.getTypeLoader().load(MapStringToString.class);
    		case "Abort_Item_Transfer":
    			return metadataContext.getTypeLoader().load(MapStringToString.class);
    		case "Abort_Package_Transfer":
    			return metadataContext.getTypeLoader().load(MapStringToString.class);
    		case "Get_Message_Attachments_Zipped":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Resume_Attachment":
    			return metadataContext.getTypeLoader().load(MapStringToString.class);
    		case "Get_Message_Attachment":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Delete_Message_Attachment":
    			return metadataContext.getTypeLoader().load(MapStringToString.class);
    		case "Get_Message_Content":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Text_Unsanitized_Html":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Message_Custom_Properties":
    			return metadataContext.getTypeLoader().load(PackageCustomProperties.class);
    		case "Set_Custom_Properties":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Move_Message_To_Folder":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Forward_Message":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Recall_Message":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Post_Reply":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Send_Draft_Message":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Get_Mailbox_Myself_Info":
    			return metadataContext.getTypeLoader().load(MyselfObject.class);
    		case "Mailbox_Logout_User":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Mailbox_Preferences":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Update_Preferences":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Get_Purls":
    			return metadataContext.getTypeLoader().load(MapStringToObject.class);
    		case "Get_Message_Purls":
    			return metadataContext.getTypeLoader().load(String.class);
    		case "Search_For_Message":
    			return metadataContext.getTypeLoader().load(Search.class);
    		default:
    			throw new MetadataResolvingException("Unknown key:" + key, FailureCode.INVALID_METADATA_KEY);
    		}
    }

    @Override
    public String getCategoryName() {
        return "Mailbox";
    }

}
