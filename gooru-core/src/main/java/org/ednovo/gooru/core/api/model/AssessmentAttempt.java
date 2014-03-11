/*******************************************************************************
 * AssessmentAttempt.java
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
package org.ednovo.gooru.core.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.ednovo.gooru.core.api.model.User;



public class AssessmentAttempt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6874173021499949222L;


	public static enum STATUS {

		INPROGRESS("In Progress", 1), COMPLETED("Completed", 2), CANCELLED("Cancelled", 3);

		private String status;
		private int id;

		STATUS(String status, int id) {
			this.status = status;
			this.id = id;
		}

		public String getStatus() {
			return status;
		}

		public int getId() {
			return id;
		}
	}

	public static enum MODE {

		TEST("Test", 1), PRACTICE("Practice", 2);

		private String mode;
		private int id;

		MODE(String mode, int id) {
			this.mode = mode;
			this.id = id;
		}

		public String getMode() {
			return mode;
		}

		public int getId() {
			return id;
		}
	}

	private Integer attemptId;

	private User student;

	private Integer status;

	private String statusName;

	private Integer score;

	private Integer mode;

	private String modeName;

	private Date startTime;

	private Date endTime;

	private Set<AssessmentAttemptItem> attemptItems;
	
	private Assessment assessment; 

	public AssessmentAttempt() {
		student = new User();
	}

	public Integer getAttemptId() {
		return attemptId;
	}

	public void setAttemptId(Integer attemptId) {
		this.attemptId = attemptId;
	}

	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if (status != null) {
			if (status == STATUS.INPROGRESS.getId()) {
				statusName = STATUS.INPROGRESS.getStatus();
			} else if (status == STATUS.COMPLETED.getId()) {
				statusName = STATUS.COMPLETED.getStatus();
			} else if (status == STATUS.CANCELLED.getId()) {
				statusName = STATUS.CANCELLED.getStatus();
			}
		}
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Set<AssessmentAttemptItem> getAttemptItems() {
		return attemptItems;
	}

	public void setAttemptItems(Set<AssessmentAttemptItem> attemptItems) {
		this.attemptItems = attemptItems;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
		if (statusName != null) {
			if (statusName.equals(STATUS.INPROGRESS.getStatus())) {
				status = STATUS.INPROGRESS.getId();
			} else if (statusName.equals(STATUS.COMPLETED.getStatus())) {
				status = STATUS.COMPLETED.getId();
			} else if (statusName.equals(STATUS.CANCELLED.getStatus())) {
				status = STATUS.CANCELLED.getId();
			}
		}
	}

	public String getStatusName() {
		return statusName;
	}

	public Integer getMode() {
		return mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
		if (mode != null) {
			if (mode == MODE.TEST.getId()) {
				modeName = MODE.TEST.getMode();
			} else if (mode == MODE.PRACTICE.getId()) {
				modeName = MODE.PRACTICE.getMode();
			}
		}
	}

	public String getModeName() {
		return modeName;
	}

	public void setModeName(String modeName) {
		this.modeName = modeName;

		if (modeName != null) {
			if (modeName.equals(MODE.PRACTICE.getMode())) {
				mode = MODE.PRACTICE.getId();
			} else if (modeName.equals(MODE.TEST.getMode())) {
				mode = MODE.TEST.getId();
			}
		}
		if (mode == null) {
			this.modeName = MODE.TEST.getMode();
			mode = MODE.TEST.getId();
		}
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public Assessment getAssessment() {
		return assessment;
	}

}
