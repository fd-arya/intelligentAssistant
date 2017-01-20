package com.naderaria.intelligentAssistant.entities.scrum;

import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.enums.PriorityType;
import com.naderaria.intelligentAssistant.entities.enums.StateType;
import com.naderaria.intelligentAssistant.entities.enums.TaskType;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.EnumType;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="TASKS",uniqueConstraints = @UniqueConstraint(columnNames = "TITLE"))
@NamedQueries({
		@NamedQuery( name = IQueryNames.TASK_SELECT_ALL_KEY , query = IQueryNames.TASK_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.TASK_SELECT_BY_SPRINT_KEY , query = IQueryNames.TASK_SELECT_BY_SPRINT_VALUE ) ,
		@NamedQuery( name = IQueryNames.TASK_SELECT_BY_TITLE_KEY , query = IQueryNames.TASK_SELECT_BY_TITLE_VALUE ) ,
		@NamedQuery( name = IQueryNames.TASK_SELECT_BY_CODE_KEY , query = IQueryNames.TASK_SELECT_BY_CODE_VALUE ) ,
		@NamedQuery( name = IQueryNames.TASK_SELECT_ALL_BY_PRIORITY_TYPE_KEY , query = IQueryNames.TASK_SELECT_ALL_BY_PRIORITY_TYPE_VALUE ) ,
		@NamedQuery( name = IQueryNames.TASK_SELECT_ALL_BY_TASK_TYPE_KEY , query = IQueryNames.TASK_SELECT_ALL_BY_TASK_TYPE_VALUE ) ,
		@NamedQuery( name = IQueryNames.TASK_SELECT_ALL_BY_STATE_TYPE_KEY , query = IQueryNames.TASK_SELECT_ALL_BY_STATE_TYPE_VALUE )
})
public class Task extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne( cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch = FetchType.EAGER)
	@JoinColumn(name="SPRINT_ID")
	private Sprint sprint;

	@Column(name="TITLE")
	private String title;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="DESCRIPTION")	
	private String description;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TASK_PRIORITY_TYPE")
	private PriorityType taskPriorityType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TASK_TYPE")
	private TaskType taskType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="STATE_TYPE")
	private StateType stateType;
	
	public Sprint getSprint(){ return sprint; }
	public void setSprint( Sprint sprint ){ this.sprint = sprint; }
	
	public String getTitle(){ return title;}
	public void setTitle( String title ){ this.title = title; }
	
	public String getCode(){ return code; }
	public void setNo( String code ){ this.code = code; }
	
	public String getDescription(){ return description; }
	public void setDescription( String description ){ this.description = description; }
	
	public PriorityType getTaskPriorityType(){ return taskPriorityType; }
	public void setTaskPriorityType( PriorityType taskPriorityType ){ this.taskPriorityType = taskPriorityType; }
	
	public TaskType getTaskType(){ return taskType; }
	public void setTaskType( TaskType taskType ){ this.taskType = taskType; }
	
	public StateType getStateType(){ return stateType; }
	public void setStateType( StateType stateType ){ this.stateType = stateType; }
	
	
	
}
