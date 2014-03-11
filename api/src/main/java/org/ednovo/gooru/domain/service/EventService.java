/*
*EventService.java
* gooru-api
* Created by Gooru on 2014
* Copyright (c) 2014 Gooru. All rights reserved.
* http://www.goorulearning.org/
*      
* Permission is hereby granted, free of charge, to any 
* person obtaining a copy of this software and associated 
* documentation. Any one can use this software without any 
* restriction and can use without any limitation rights 
* like copy,modify,merge,publish,distribute,sub-license or 
* sell copies of the software.
* The seller can sell based on the following conditions:
* 
* The above copyright notice and this permission notice shall be   
* included in all copies or substantial portions of the Software. 
*
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY    
*  KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE  
*  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR   
*  PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS 
*  OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR 
*  OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT 
*  OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION 
*  WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN 
*  THE SOFTWARE.
*/

package org.ednovo.gooru.domain.service;

import java.util.List;
import java.util.Map;

import org.ednovo.gooru.core.api.model.Event;
import org.ednovo.gooru.core.api.model.EventMapping;
import org.ednovo.gooru.core.api.model.User;

public interface EventService extends BaseService {
	Event createEvent(Event event, User user);

	Event updateEvent(String id, Event newEvent);

	Event getEvent(String id);

	void deleteEvent(String id);

	EventMapping createEventMapping(EventMapping eventMapping, User user);

	EventMapping updateEventMapping(EventMapping eventMapping, User user);

	void deleteEventMapping(String eventUid, String templateUid);

	EventMapping getEventMapping(String eventUid, String templateUid);

	List<Event> getEvents();

	List<EventMapping> getTemplatesByEvent(String id);

	EventMapping getTemplatesByEventName(String name);

	void handleJiraEvent(Map<String, String> fields);
}
