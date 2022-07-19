package com.avodagroup.securetransport.internal.metadata;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.metadata.MetadataContext;
import org.mule.runtime.api.metadata.MetadataKeyBuilder;
import org.mule.runtime.api.metadata.MetadataResolvingException;
import org.mule.runtime.api.metadata.resolving.TypeKeysResolver;
import org.mule.runtime.api.metadata.MetadataKey;

public class MailboxKeysResolver implements TypeKeysResolver {
	@Override
	  public String getCategoryName() {
	    return "Mailbox";
	  }

	  @Override
	  public Set<MetadataKey> getKeys(MetadataContext context) throws MetadataResolvingException, ConnectionException {
		// First we need to obtain the key IDs that will be used.
		     // This is where you'd normally use `context.getConfig()`
		     // or `context.getConnection()` to obtain the entity id's
		     // from a remote service, for this demo the keys will be fixed
			  Set<MetadataKey> mdkSet = new HashSet<>();

		        HashMap<String, String> myKeys = new HashMap<String, String>();
		        myKeys.put("Get_Mailbox_Global_Settings","Get Mailbox Global Settings");
		        myKeys.put("Get_Mailbox_User_Language","Get Mailbox User Language");
		        myKeys.put("Register_User","RegisterUser");
		        myKeys.put("Get_Mailbox_Register_User_Data","Get Mailbox Register User Data");
		        myKeys.put("Get_Mailbox_User_Login_Image","Get Mailbox User Login Image");
		        myKeys.put("Request_Password_Hint","Request Password Hint");
		        myKeys.put("Request_Password_Reset","Request Password Reset");
		        myKeys.put("Reset_User_Password","Reset User Password");
		        myKeys.put("Get_Mailbox_Folders","Get Mailbox Folders");
		        myKeys.put("Create_Mailbox_New_Folder","Create Mailbox New Folder");
		        myKeys.put("Get_Mailbox_Folder_Name","Get Mailbox Folder Name");
		        myKeys.put("Get_Mailbox_Folder","Get Mailbox Folder");
		        myKeys.put("Delete_Mailbox_Folder","Delete Mailbox Folder");
		        myKeys.put("Rename_Mailbox_Folder","Rename Mailbox Folder");
		        myKeys.put("Get_Message_Download_History","Get Message Download History");
		        myKeys.put("Get_Message_History_First_Access","Get Message Histor First Access");
		        myKeys.put("Create_Draft_Message","Create Draft Message");
		        myKeys.put("Get_Anonymous_Message_By_Get","Get Anonymous Message By Get");
		        myKeys.put("Get_Anonymous_Message_By_Post","Get Anonymous Message By Post");
		        myKeys.put("Get_Message_Information","Get Message Informationt");
		        myKeys.put("Update_Draft","Update Draft");
		        myKeys.put("Delete_Message_Or_Draft","Delete Message Or Draft");
		        myKeys.put("Add_Attachment_To_Draft_Message","Add Attachment To Draft Message");
		        myKeys.put("Abort_Item_Transfer","Abort Item Transfer");
		        myKeys.put("Abort_Package_Transfer","Abort Package Transfer");
		        myKeys.put("Get_Message_Attachments_Zipped","Get Message Attachments Zipped");
		        myKeys.put("Resume_Attachment","Resume Attachment");
		        myKeys.put("Get_Message_Attachment","Get Message Attachment");
		        myKeys.put("Delete_Message_Attachment","Delete Message Attachment");
		        myKeys.put("Get_Message_Content","Get Message Content");
		        myKeys.put("Get_Message_Text_Unsanitized_Html","Get Message Text Unsanitized Html");
		        myKeys.put("Get_Message_Custom_Properties","Get Message Custom Properties");
		        myKeys.put("Set_Custom_Properties","Set Custom Properties");
		        myKeys.put("Move_Message_To_Folder","Move Message To Folder");
		        myKeys.put("Forward_Message","Forward Message");
		        myKeys.put("Recall_Message","Recall Message");
		        myKeys.put("Request_Password_Reset","Request Password Reset");
		        myKeys.put("Post_Reply","Post Reply");
		        myKeys.put("Send_Draft_Message","Send Draft Message");
		        myKeys.put("Get_Mailbox_Myself_Info","Get Mailbox Myself Info");
		        myKeys.put("Mailbox_Logout_User","Mailbox Logout User");
		        myKeys.put("Get_Mailbox_Preferences","Get Mailbox Preferences");
		        myKeys.put("Update_Preferences","Update Preferences");
		        myKeys.put("Get_Purls","Get Purls");
		        myKeys.put("Get_Message_Purls","Get Message Purls");
		        myKeys.put("Search_For_Message","Search For Message");



		        for(Map.Entry<String, String> entry : myKeys.entrySet()){
//		            MetadataKeyBuilder key = MetadataKeyBuilder.newKey(entry.getKey()).withDisplayName(entry.getValue());
		            MetadataKeyBuilder key = MetadataKeyBuilder.newKey(entry.getKey());
		            mdkSet.add(key.build());
		        }
		        return mdkSet;
		   }

}
