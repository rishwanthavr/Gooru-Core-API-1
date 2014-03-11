/*******************************************************************************
 * GooruOperationConstants.java
 *  gooru-core
 *  Created by Gooru on 2014
 *  Copyright (c) 2014 Gooru. All rights reserved.
 *  http://www.goorulearning.org/
 *       
 *  Permission is hereby granted, free of charge, to any 
 *  person obtaining a copy of this software and associated 
 *  documentation. Any one can use this software without any 
 *  restriction and can use without any limitation rights 
 *  like copy,modify,merge,publish,distribute,sub-license or 
 *  sell copies of the software.
 *  
 *  The seller can sell based on the following conditions:
 *  
 *  The above copyright notice and this permission notice shall be   
 *  included in all copies or substantial portions of the Software. 
 * 
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY    
 *   KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE  
 *   WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR   
 *   PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE       AUTHORS 
 *   OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR 
 *   OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT 
 *   OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION 
 *   WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN 
 *   THE SOFTWARE.
 ******************************************************************************/
package org.ednovo.gooru.core.constant;

public class GooruOperationConstants {

	// Operations

	public static final String ENTITY_COLLECTION = "Collection";
	
	public static final String ENTITY_ASSIGNMENT = "Assignment";

	public static final String ENTITY_REVISION_HISTORY = "RevisionHistory";
	
	public static final String ENTITY_RESOURCE = "Resource";

	public static final String ENTITY_QUIZ = "Quiz";

	public static final String ENTITY_QUESTION = "Question";

	public static final String ENTITY_ACTIVITY = "Activity";
	
	public static final String ENTITY_ACCOUNT = "Account";

	public static final String ENTITY_CLASSBOOK = "Classbook";

	public static final String ENTITY_COMMENT = "Comment";

	public static final String ENTITY_INVITE = "Invite";

	public static final String ENTITY_LOG = "Log";

	public static final String ENTITY_MEDIA = "Media";

	public static final String ENTITY_NETWORK = "Network";

	public static final String ENTITY_NOTE = "Note";

	public static final String ENTITY_NOTEBOOK = "NoteBook";

	public static final String ENTITY_QB = "QuestionBoard";

	public static final String ENTITY_QUOTE = "Quote";

	public static final String ENTITY_RATING = "Rating";

	public static final String ENTITY_RESPONSE = "Response";

	public static final String ENTITY_STUDYSHELF = "StudyShelf";

	public static final String ENTITY_SUBSCRIPTION = "Subscription";

	public static final String ENTITY_TASK = "Task";

	public static final String ENTITY_TAXONOMY = "Taxonomy";

	public static final String ENTITY_USER = "User";

	public static final String ENTITY_CONFIG = "Config";

	public static final String ENTITY_PORTAL = "Portal";

	public static final String ENTITY_SESSION = "Session";

	public static final String ENTITY_BADGE = "Badge";

	public static final String ENTITY_SHELF = "Shelf";
	
	public static final String ENTITY_TAG = "Tag";
	
	public static final String ENTITY_ANY = "Any";
	
	public static final String ENTITY_SESSION_ACTIVITY = "SessionActivity";
	
	public static final String ENTITY_ROLE = "Role";
	
	public static final String ENTITY_CONTENT = "Content";
	
	public static final String ENTITY_SEARCH = "Search";
	
	public static final String ENTITY_RESPONSE_FIELD = "ResponseField";
	
	public static final String ENTITY_SCOLLECTION = "SCollection"; 
	
	public static final String ENTITY_CLASSPAGE = "Classpage";
	
	public static final String ENTITY_PARTY_CUSTOM_FIELD = "PartyCustomField";
	
	public static final String ENTITY_QUIZ_ITEM = "QuizItem";
	
	public static final String ENTITY_SCOLLECTION_ITEM = "SCollectionItem";
	
	public static final String ENTITY_CLASSPAGE_ITEM = "ClasspageItem"; 
	
	public static final String ENTITY_ASSIGNMENT_ITEM = "AssignmentItem"; 
	
	public static final String ENTITY_SEARCH_QUERY = "SearchQuery";
	
	public static final String ENTITY_SEARCH_RESULT = "SearchResult";
	
	public static final String ENTITY_SEARCH_RESULT_ACTIVITY = "SearchResultActivity";
	
	public static final String ENTITY_CUSTOM_SETTING = "CustomSetting";
	
	public static final String ENTITY_TASK_MANAGEMENT = "TaskManagement";
	
	public static final String ENTITY_V2_SESSION = "Session";

	public static final String ENTITY_POST="Post";	

	public static final String ENTITY_FEEDBACK="Feedback";
	
	public static final String ENTITY_TEMPLATE = "Template";
	
	public static final String ENTITY_EVENT = "Event";
	
	public static final String ENTITY_APIKEY = "ApiKey";
	
	public static final String ENTITY_ORGANIZATION = "Organization";
	
	public static final String ENTITY_OAUTH = "Oauth";
	
	// Actions

	public static final String ACTION_READ = "Read";
	
	public static final String ACTION_MAIL = "Mail";

	public static final String ACTION_DELETE = "Delete";

	public static final String ACTION_ADD = "Add";
	
	public static final String ACTION_HTMLTOPDF = "Htmltopdf";

	public static final String ACTION_UPDATE = "Update";

	public static final String ACTION_UPDATE_PASSWORD = "UpdatePassword";

	public static final String ACTION_UPDATE_VIEW = "UpdateView";

	public static final String ACTION_LIST = "List";

	public static final String ACTION_ATTEMPT = "Attempt";

	public static final String CONFIRM_MAIL = "ConfirmMail";

	public static final String ACTION_INFO = "Info";

	public static final String ACTION_SEARCH = "Search";

	public static final String ACTION_PUBLISH = "Publish";

	public static final String ACTION_MIGRATE = "Migrate";

	public static final String ACTION_COPY = "Copy";

	public static final String ACTION_INDEX = "Index";

	public static final String ACTION_SHARE = "Share";

	public static final String ACTION_PLAY = "Play";
	
	public static final String ACTION_UNRESTRICTED = "Unrestricted";

	public static final String ACTION_ALL = "All";

	public static final String ACTION_CHECK = "Check";

    public static final String ACTION_SIGNIN = "SignIn";

	public static final String ACTION_SIGNOUT = "SignOut";

	public static final String ACTION_RESET = "Reset";
	
	public static final String ENTITY_USER_GROUP="UserGroup";

	public static final String ACTION_SEARCH_ANY = "SearchAny";

	public static final String ACTION_SUGGEST = "Suggest";

	public static final String ACTION_SEARCH_ADMIN = "AdminSearch";

	public static final String ENTITY_ANONYMOUS_USER = "AnonymousUser";
	
	public static final String ACTION_IMPORT = "Import";

	public static final String ENTITY_ACTION_SEPARATOR = "___";
	
	public static final String ACTION_COLLECTION_RESOURCE_READ = "collectionResources";
	
	public static final String ENTITY_SHORTEN = "Shorten";
	
	public static final String ENTITY_SHARE = "Share";
	
	public static final String BULK_UPDATE_VIEW = "BulkUpdateView";
	
	// Entity Operations

	// Content Group

	public static final String OPERATION_ACCOUNT_ADD = ENTITY_ACCOUNT + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_ACCOUNT_LIST = ENTITY_ACCOUNT + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_ACCOUNT_READ = ENTITY_ACCOUNT + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_ACCOUNT_UPDATE = ENTITY_ACCOUNT + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	//User Group
	
	public static final String OPERATION_USER_GROUP_ADD = ENTITY_USER_GROUP + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_USER_GROUP_DELETE = ENTITY_USER_GROUP + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_USER_GROUP_UPDATE = ENTITY_USER_GROUP + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_USER_GROUP_LIST = ENTITY_USER_GROUP + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	//CustomSetting
	
	public static final String OPERATION_CUSTOM_SETTING_ADD = ENTITY_CUSTOM_SETTING + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	// Activity

	public static final String OPERATION_ACTIVITY_LIST = ENTITY_ACTIVITY + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_ACTIVITY_READ = ENTITY_ACTIVITY + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_ACTIVITY_UPDATE = ENTITY_ACTIVITY + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// Collection

	public static final String OPERATION_CLASSBOOK_DELETE = ENTITY_CLASSBOOK + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_COLLECTION_ADD = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_COLLECTION_COPY = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_COPY;

	public static final String OPERATION_COLLECTION_DELETE = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_COLLECTION_INDEX = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_INDEX;

	public static final String OPERATION_COLLECTION_LIST = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_COLLECTION_MIGRATE = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_MIGRATE;

	public static final String OPERATION_COLLECTION_PLAY = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_PLAY;

	public static final String OPERATION_COLLECTION_PUBLISH_LIST = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_PUBLISH + ACTION_LIST;

	public static final String OPERATION_COLLECTION_READ = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_COLLECTION_SEARCH = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_SEARCH;

	public static final String OPERATION_COLLECTION_UPDATE = ENTITY_COLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// Comment

	public static final String OPERATION_COMMENT_ADD = ENTITY_COMMENT + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_COMMENT_DELETE = ENTITY_COMMENT + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_COMMENT_LIST = ENTITY_COMMENT + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_COMMENT_READ = ENTITY_COMMENT + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_COMMENT_UPDATE = ENTITY_COMMENT + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// Cofig

	public static final String OPERATION_CONFIG_SETTINGS_READ = ENTITY_CONFIG + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_CONFIG_SETTINGS_UPDATE = ENTITY_CONFIG + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// Invite

	public static final String OPERATION_INVITE_CODE_ADD = ENTITY_INVITE + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_INVITE_CODE_DELETE = ENTITY_INVITE + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_INVITE_CODE_LIST = ENTITY_INVITE + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_INVITE_CODE_UPDATE = ENTITY_INVITE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// Portal

	public static final String OPERATION_ISSUE_ADD = ENTITY_PORTAL + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	// Log

	public static final String OPERATION_LOG_ACTIVITY_READ = ENTITY_LOG + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_LOG_ACTIVITY_UPDATE = ENTITY_LOG + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// Media

	public static final String OPERATION_MEDIA_ADD = ENTITY_MEDIA + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_MEDIA_UPDATE = ENTITY_MEDIA + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_MEDIA_HTMLTOPDF = ENTITY_MEDIA + ENTITY_ACTION_SEPARATOR + ACTION_HTMLTOPDF;

	// Network

	public static final String OPERATION_NETWORK_ADD = ENTITY_NETWORK + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_NETWORK_SEARCH = ENTITY_NETWORK + ENTITY_ACTION_SEPARATOR + ACTION_SEARCH;

	// Note

	public static final String OPERATION_NOTE_ADD = ENTITY_NOTE + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_NOTE_COPY = ENTITY_NOTE + ENTITY_ACTION_SEPARATOR + ACTION_COPY;

	public static final String OPERATION_NOTE_DELETE = ENTITY_NOTE + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_NOTE_LIST = ENTITY_NOTE + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_NOTE_READ = ENTITY_NOTE + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_NOTE_SEARCH = ENTITY_NOTE + ENTITY_ACTION_SEPARATOR + ACTION_SEARCH;

	public static final String OPERATION_NOTE_SHARE = ENTITY_NOTE + ENTITY_ACTION_SEPARATOR + ACTION_SHARE;

	public static final String OPERATION_NOTE_UPDATE = ENTITY_NOTE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// NoteBook

	public static final String OPERATION_NOTEBOOK_LIST = ENTITY_NOTEBOOK + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_NOTEBOOK_READ = ENTITY_NOTEBOOK + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_NOTEBOOK_SHARE = ENTITY_NOTEBOOK + ENTITY_ACTION_SEPARATOR + ACTION_SHARE;

	// Question Broad

	public static final String OPERATION_QB_QUESTION_INDEX = ENTITY_QB + ENTITY_ACTION_SEPARATOR + ACTION_INDEX;

	public static final String OPERATION_QB_QUESTION_SEARCH = ENTITY_QB + ENTITY_ACTION_SEPARATOR + ACTION_SEARCH;

	// Question

	public static final String OPERATION_QUESTION_ADD = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_QUESTION_COPY = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_COPY;

	public static final String OPERATION_QUESTION_DELETE = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_QUESTION_IMPORT = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_IMPORT;

	public static final String OPERATION_QUESTION_INDEX = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_INDEX;

	public static final String OPERATION_QUESTION_LIST = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_QUESTION_READ = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_QUESTION_UPDATE = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	public static final String OPERATION_QUESTIONS_INDEX_ALL = ENTITY_QUESTION + ENTITY_ACTION_SEPARATOR + ACTION_INDEX + ACTION_ALL;

	// Quiz

	public static final String OPERATION_QUIZ_ADD = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_QUIZ_ATTEMPT_LIST = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_ATTEMPT + ACTION_LIST;

	public static final String OPERATION_QUIZ_ATTEMPT_READ = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_ATTEMPT + ACTION_READ;

	public static final String OPERATION_QUIZ_ATTEMPT_UPDATE = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_ATTEMPT + ACTION_UPDATE;

	public static final String OPERATION_QUIZ_COPY = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_COPY;

	public static final String OPERATION_QUIZ_DELETE = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_QUIZ_IMPORT = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_IMPORT;

	public static final String OPERATION_QUIZ_INDEX = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_INDEX;

	public static final String OPERATION_QUIZ_INDEX_ALL = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_INDEX + ACTION_ALL;

	public static final String OPERATION_QUIZ_LIST = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_QUIZ_PUBLISH = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_PUBLISH;

	public static final String OPERATION_QUIZ_READ = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_QUIZ_SEARCH = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_SEARCH;

	public static final String OPERATION_QUIZ_UPDATE = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// Quote

	public static final String OPERATION_QUOTE_ADD = ENTITY_QUOTE + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_QUOTE_READ = ENTITY_QUOTE + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	// Rating

	public static final String OPERATION_RATING_ADD = ENTITY_RATING + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_RATING_READ = ENTITY_RATING + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	//Revision History
	
	public static final String OPERATION_REVISION_HISTORY_ADD = ENTITY_REVISION_HISTORY + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_REVISION_HISTORY_READ = ENTITY_REVISION_HISTORY + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_REVISION_HISTORY_LIST = ENTITY_REVISION_HISTORY + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	// Resource

	public static final String OPERATION_RESET_INDEX = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_INDEX + ACTION_RESET;

	public static final String OPERATION_RESOURCE_ADD = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_RESOURCE_DELETE = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_RESOURCE_INDEX = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_INDEX;

	public static final String OPERATION_RESOURCE_LIST = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_RESOURCE_READ = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_RESOURCE_UPDATE = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_RESOURCE_UPDATE_VIEW = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE_VIEW;
	
	public static final String OPERATION_BULK_UPDATE_VIEW = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + BULK_UPDATE_VIEW;

	public static final String OPERATION_RESOURCE_VALIDATE = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_CHECK;

	public static final String OPERATION_RESOURCE_SUGGEST = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_SUGGEST;

	public static final String OPERATION_RESOURCE_INDEXER_STATUS = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_INDEX + ACTION_READ;

	public static final String OPERATION_COLLECTION_RESOURCE_READ = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_COLLECTION_RESOURCE_READ ;
	
	// Response

	public static final String OPERATION_RESPONSE_DELETE = ENTITY_RESPONSE + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_RESPONSE_READ = ENTITY_RESPONSE + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_RESPONSE_UPDATE = ENTITY_RESPONSE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	public static final String OPERATION_SEARCH_GOORU = ENTITY_RESOURCE + ENTITY_ACTION_SEPARATOR + ACTION_SEARCH_ANY;

	// Session

	public static final String OPERATION_SESSION_CHECK = ENTITY_SESSION + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	// Study Shelf

	public static final String OPERATION_STUDYSHELF_ADD = ENTITY_STUDYSHELF + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_STUDYSHELF_DELETE = ENTITY_STUDYSHELF + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_STUDYSHELF_READ = ENTITY_STUDYSHELF + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	// Subscription

	public static final String OPERATION_SUBSCRIPTION_ADD = ENTITY_SUBSCRIPTION + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_SUBSCRIPTION_DELETE = ENTITY_SUBSCRIPTION + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_SUBSCRIPTION_LIST = ENTITY_SUBSCRIPTION + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_SUBSCRIPTION_READ = ENTITY_SUBSCRIPTION + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	// Task

	public static final String OPERATION_TASK_GET_THUMBNAIL = ENTITY_TASK + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_TASK_IMPORT_RESOURCE = ENTITY_TASK + ENTITY_ACTION_SEPARATOR + ACTION_IMPORT;

	// Taxonomy

	public static final String OPERATION_TAXONOMY_ADD = ENTITY_TAXONOMY + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_TAXONOMY_DELETE = ENTITY_TAXONOMY + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_TAXONOMY_INDEX = ENTITY_TAXONOMY + ENTITY_ACTION_SEPARATOR + ACTION_INDEX;

	public static final String OPERATION_TAXONOMY_READ = ENTITY_TAXONOMY + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_TAXONOMY_UPDATE = ENTITY_TAXONOMY + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	public static final String OPERATION_TAXONOMY_SUGGEST = ENTITY_TAXONOMY + ENTITY_ACTION_SEPARATOR + ACTION_SUGGEST;

	// User

	public static final String OPERATION_USER_ADD = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_ADD;

	public static final String OPERATION_USER_INDEX = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_INDEX;

	public static final String OPERATION_USER_LIST = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_LIST;

	public static final String OPERATION_USER_READ = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_USER_SIGNIN = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_SIGNIN;

	public static final String OPERATION_USER_SIGNOUT = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_SIGNOUT;

	public static final String OPERATION_USER_UPDATE = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_USER_UPDATE_PASSWORD = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE_PASSWORD;

	public static final String OPERATION_USER_SUGGEST = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_SUGGEST;

	public static final String OPERATION_USER_SEARCH_ADMIN = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_SEARCH_ADMIN;

	public static final String OPERATION_USER_SEARCH = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_SEARCH;

	public static final String OPERATION_CHECK_IF_USER_EXISTS = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_CHECK;
	
	public static final String OPERATION_USER_DELETE = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_USER_IMPORT = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_IMPORT;
	
	public static final String OPERATION_USER_CONFIRM_MAIL = ENTITY_USER + ENTITY_ACTION_SEPARATOR + CONFIRM_MAIL ;

	public static final String OPERATION_USER_INFO = ENTITY_USER + ENTITY_ACTION_SEPARATOR + ACTION_INFO ;

	// Badge

	public static final String OPERATION_BADGE_UPDATE = ENTITY_BADGE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	public static final String OPERATION_BADGE_READ = ENTITY_BADGE + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	// Shelf
	
	public static final String OPERATION_SHELF_ADD = ENTITY_SHELF + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_SHELF_UPDATE = ENTITY_SHELF + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_SHELF_READ = ENTITY_SHELF + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_SHELF_DELETE = ENTITY_SHELF + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	//Tag 
	public static final String OPERATION_TAG_ADD = ENTITY_TAG + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_TAG_UPDATE = ENTITY_TAG + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_TAG_READ = ENTITY_TAG + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_TAG_DELETE = ENTITY_TAG + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	// Any

	public static final String OPERATION_ANY_UPDATE = ENTITY_ANY + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	public static final String OPERATION_INDEX_DELETE = ENTITY_ANY + ENTITY_ACTION_SEPARATOR + ACTION_INDEX + ACTION_DELETE;
	
	// Session Activity

	public static final String OPERATION_SESSION_ACTIVITY_ADD = ENTITY_SESSION_ACTIVITY + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_SESSION_ACTIVITY_READ = ENTITY_SESSION_ACTIVITY + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_SESSION_ACTIVITY_UPDATE = ENTITY_SESSION_ACTIVITY + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	// Role
	
	public static final String OPERATION_ROLE_LIST = ENTITY_ROLE + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	public static final String OPERATION_ROLE_ADD = ENTITY_ROLE + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_ROLE_UPDATE = ENTITY_ROLE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	//Anonymous
	public static final String OPERATION_ANONYMOUS_USER_UPDATE = ENTITY_ANONYMOUS_USER + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
    
	//ResponseField
	
	public static final String OPERATION_RESPONSE_FIELD_SET_ADD = ENTITY_RESPONSE_FIELD + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_RESPONSE_FIELD_SET_UPDATE = ENTITY_RESPONSE_FIELD + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_RESPONSE_FIELD_SET_DELETE = ENTITY_RESPONSE_FIELD + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;

	public static final String OPERATION_RESPONSE_FIELD_SET_LIST = ENTITY_RESPONSE_FIELD + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	//All Operaions
	
	public static final String OPERATION_CONTENT_UNRESTRICTED = ENTITY_CONTENT + ENTITY_ACTION_SEPARATOR + ACTION_UNRESTRICTED ;
	
	public static final String OPERATION_CONTENT_PUBLISH = ENTITY_CONTENT + ENTITY_ACTION_SEPARATOR + ACTION_PUBLISH ;
	
	//simple collection
	public static final String OPERATION_SCOLLECTION_ADD = ENTITY_SCOLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_SCOLLECTION_UPDATE = ENTITY_SCOLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_SCOLLECTION_READ = ENTITY_SCOLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_SCOLLECTION_DELETE = ENTITY_SCOLLECTION + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_SCOLLECTION_ITEM_ADD = ENTITY_SCOLLECTION_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_SCOLLECTION_ITEM_UPDATE = ENTITY_SCOLLECTION_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_SCOLLECTION_ITEM_READ = ENTITY_SCOLLECTION_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_SCOLLECTION_ITEM_DELETE = ENTITY_SCOLLECTION_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_SCOLLECTION_ITEM_LIST = ENTITY_SCOLLECTION_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	//post
	
	public static final String OPERATION_POST_ADD=ENTITY_POST+ENTITY_ACTION_SEPARATOR+ACTION_ADD; 
	public static final String OPERATION_POST_UPDATE=ENTITY_POST+ENTITY_ACTION_SEPARATOR+ACTION_UPDATE;
	public static final String OPERATION_POST_DELETE=ENTITY_POST+ENTITY_ACTION_SEPARATOR+ACTION_DELETE;
	public static final String OPERATION_POST_READ=ENTITY_POST+ENTITY_ACTION_SEPARATOR+ACTION_READ;
	
	// Feedback
	
	
	public static final String OPERATION_FEEDBACK_ADD=ENTITY_FEEDBACK+ ENTITY_ACTION_SEPARATOR +ACTION_ADD;
	public static final String OPERATION_FEEDBACK_UPDATE=ENTITY_FEEDBACK+ ENTITY_ACTION_SEPARATOR +ACTION_UPDATE;
	public static final String OPERATION_FEEDBACK_DELETE=ENTITY_FEEDBACK+ ENTITY_ACTION_SEPARATOR +ACTION_DELETE;
	public static final String OPERATION_FEEDBACK_READ=ENTITY_FEEDBACK+ ENTITY_ACTION_SEPARATOR +ACTION_READ;
	
	//classpage
	public static final String OPERATION_CLASSPAGE_ADD = ENTITY_CLASSPAGE + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_CLASSPAGE_UPDATE = ENTITY_CLASSPAGE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_CLASSPAGE_READ = ENTITY_CLASSPAGE + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_CLASSPAGE_DELETE = ENTITY_CLASSPAGE + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_CLASSPAGE_ITEM_ADD = ENTITY_CLASSPAGE_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_CLASSPAGE_ITEM_UPDATE = ENTITY_CLASSPAGE_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_CLASSPAGE_ITEM_READ = ENTITY_CLASSPAGE_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_CLASSPAGE_ITEM_DELETE = ENTITY_CLASSPAGE_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_CLASSPAGE_ITEM_LIST = ENTITY_CLASSPAGE_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	//assignment
	public static final String OPERATION_ASSIGNMENT_ADD = ENTITY_ASSIGNMENT + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_ASSIGNMENT_UPDATE = ENTITY_ASSIGNMENT + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_ASSIGNMENT_READ = ENTITY_ASSIGNMENT + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_ASSIGNMENT_DELETE = ENTITY_ASSIGNMENT + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_ASSIGNMENT_ITEM_ADD = ENTITY_ASSIGNMENT_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_ASSIGNMENT_ITEM_UPDATE = ENTITY_ASSIGNMENT_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_ASSIGNMENT_ITEM_READ = ENTITY_ASSIGNMENT_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_ASSIGNMENT_ITEM_DELETE = ENTITY_ASSIGNMENT_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_ASSIGNMENT_ITEM_LIST = ENTITY_ASSIGNMENT_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	//shorten url
	public static final String OPERATION_URL_SHORTEN = ENTITY_SHORTEN + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	//share 
	public static final String OPERATION_SHARE_MAIL = ENTITY_SHARE + ENTITY_ACTION_SEPARATOR + ACTION_MAIL;
	
	//search query
	public static final String OPERATION_SEARCH_QUERY_ADD = ENTITY_SEARCH_QUERY + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_SEARCH_RESULT_ADD = ENTITY_SEARCH_RESULT + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_SEARCH_RESULT_ACTIVITY_ADD = ENTITY_SEARCH_RESULT_ACTIVITY + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	
	// party access
	
	public static final String ORG_ADMIN = "organizationadmin" ;
	
	public static final String GROUP_ADMIN = "groupadmin" ;
	
	//party_custom_field
	
	public static final String OPERATION_PARTY_CUSTOM_FIELD_ADD = ENTITY_PARTY_CUSTOM_FIELD + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_PARTY_CUSTOM_FIELD_UPDATE = ENTITY_PARTY_CUSTOM_FIELD + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_PARTY_CUSTOM_FIELD_READ = ENTITY_PARTY_CUSTOM_FIELD + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_PARTY_CUSTOM_FIELD_DELETE = ENTITY_PARTY_CUSTOM_FIELD + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	//Session
	
	public static final String OPERATION_SESSION_ADD = ENTITY_SESSION + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_SESSION_READ = ENTITY_SESSION + ENTITY_ACTION_SEPARATOR + ACTION_READ;

	public static final String OPERATION_SESSION_UPDATE = ENTITY_SESSION + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	// QUIZ
	
	public static final String OPERATION_QUIZ_V2_ADD = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_QUIZ_V2_UPDATE = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_QUIZ_V2_READ = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_QUIZ_V2_DELETE = ENTITY_QUIZ + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_QUIZ_V2_ITEM_ADD = ENTITY_QUIZ_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_QUIZ_V2_ITEM_UPDATE = ENTITY_QUIZ_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_QUIZ_V2_ITEM_READ = ENTITY_QUIZ_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_QUIZ_V2_ITEM_DELETE = ENTITY_QUIZ_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_QUIZ_V2_ITEM_LIST = ENTITY_QUIZ_ITEM + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	// TASK_MANAGEMENT
	
	public static final String OPERATION_TASK_MANAGEMENT_ADD = ENTITY_TASK_MANAGEMENT + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_TASK_MANAGEMENT_UPDATE = ENTITY_TASK_MANAGEMENT + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_TASK_MANAGEMENT_READ = ENTITY_TASK_MANAGEMENT + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_TASK_MANAGEMENT_DELETE = ENTITY_TASK_MANAGEMENT + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	// V2_SESSION
	
	public static final String OPERATION_V2_SESSION_ADD = ENTITY_V2_SESSION + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_V2_SESSION_UPDATE = ENTITY_V2_SESSION + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_V2_SESSION_READ = ENTITY_V2_SESSION + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_V2_SESSION_DELETE = ENTITY_V2_SESSION + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	// V2_TEMPLATE
	
	public static final String OPERATION_TEMPLATE_ADD = ENTITY_TEMPLATE + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_TEMPLATE_UPDATE = ENTITY_TEMPLATE + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_TEMPLATE_READ = ENTITY_TEMPLATE + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_TEMPLATE_LIST = ENTITY_TEMPLATE + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	// V2_EVENT
	
	public static final String OPERATION_EVENT_ADD = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_EVENT_UPDATE = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_EVENT_READ = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_EVENT_LIST = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	public static final String OPERATION_EVENT_MAPPING_ADD = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_EVENT_MAPPING_UPDATE = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	public static final String OPERATION_EVENT_MAPPING_READ = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_EVENT_MAPPING_DELETE = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_DELETE;
	
	public static final String OPERATION_EVENT_MAIL_TRIGGER = ENTITY_EVENT + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	// API Key
	
	public static final String OPERATION_APIKEY_ADD = ENTITY_APIKEY + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_APIKEY_LIST = ENTITY_APIKEY + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	public static final String OPERATION_APIKEY_UPDATE = ENTITY_APIKEY + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;;

	// Organization
	
	public static final String OPERATION_ORGANIZATION_ADD = ENTITY_ORGANIZATION + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
	
	public static final String OPERATION_ORGANIZATION_LIST = ENTITY_ORGANIZATION + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
	
	public static final String OPERATION_ORGANIZATION_READ = ENTITY_ORGANIZATION + ENTITY_ACTION_SEPARATOR + ACTION_READ;
	
	public static final String OPERATION_ORGANIZATION_UPDATE = ENTITY_ORGANIZATION + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;
	
	// Oauth
	
		public static final String OPERATION_OAUTH_ADD = ENTITY_OAUTH + ENTITY_ACTION_SEPARATOR + ACTION_ADD;
		
		public static final String OPERATION_OAUTH_LIST = ENTITY_OAUTH + ENTITY_ACTION_SEPARATOR + ACTION_LIST;
		
		public static final String OPERATION_OAUTH_READ = ENTITY_OAUTH + ENTITY_ACTION_SEPARATOR + ACTION_READ;
		
		public static final String OPERATION_OAUTH_UPDATE = ENTITY_OAUTH + ENTITY_ACTION_SEPARATOR + ACTION_UPDATE;

	
	
	
	
}
