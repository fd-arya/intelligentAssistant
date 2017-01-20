package com.naderaria.intelligentAssistant.entities.scrum;

import java.util.Calendar;
import java.util.Set;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.enums.StateType;
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
import javax.persistence.OneToMany;
import javax.persistence.EnumType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="SPRINTS" , uniqueConstraints = @UniqueConstraint(columnNames ="TITLE" ))
@NamedQueries({
		@NamedQuery( name = IQueryNames.SPRINT_SELECT_ALL_KEY , query = IQueryNames.SPRINT_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.SPRINT_SELECT_BY_GOAL_KEY , query = IQueryNames.SPRINT_SELECT_BY_GOAL_VALUE ) ,
		@NamedQuery( name = IQueryNames.SPRINT_SELECT_BY_TITLE_KEY , query = IQueryNames.SPRINT_SELECT_BY_TITLE_VALUE ) ,
		@NamedQuery( name = IQueryNames.SPRINT_SELECT_BY_CODE_KEY , query = IQueryNames.SPRINT_SELECT_BY_CODE_VALUE ) ,
		@NamedQuery( name = IQueryNames.SPRINT_SELECT_ALL_BY_START_DATE_KEY , query = IQueryNames.SPRINT_SELECT_ALL_BY_START_DATE_VALUE ) ,
		@NamedQuery( name = IQueryNames.SPRINT_SELECT_ALL_BY_END_DATE_KEY , query = IQueryNames.SPRINT_SELECT_ALL_BY_END_DATE_VALUE ) ,
		@NamedQuery( name = IQueryNames.SPRINT_SELECT_ALL_BY_BETWEEN_CALENDAR_KEY , query = IQueryNames.SPRINT_SELECT_ALL_BY_BETWEEN_CALENDAR_VALUE ) ,
		@NamedQuery( name = IQueryNames.SPRINT_SELECT_ALL_STATE_TYPE_KEY , query = IQueryNames.SPRINT_SELECT_ALL_STATE_TYPE_VALUE )
})
public class Sprint extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne( cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch = FetchType.EAGER)
	@JoinColumn(name="GOAL_ID")
	private Goal goal;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="CODE")
	private String code;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Calendar startDate;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Calendar endDate;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="STATE_TYPE")
	private StateType stateType;
	
	@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY,mappedBy="sprint")
	private Set<Task> tasks;
	
	
	public Goal getGoal(){ return goal; }
	public void setGoal( Goal goal ){ this.goal = goal; }
	
	public String getTitle(){ return title; }
	public void setTitle( String title ){ this.title = title; }
	
	public String getCode(){ return code; }
	public void setCode( String code ){ this.code = code; }
	
	public Calendar getStartDate(){ return startDate; }
	public void setStartDate( Calendar startDate ){ this.startDate = startDate; }
	
	public Calendar getEndDate(){ return endDate; }
	public void setEndDate( Calendar endDate ){ this.endDate = endDate; }
	
	public StateType getStateType(){ return stateType; }
	public void setStateType( StateType stateType ){ this.stateType = stateType; }
	
	public Set<Task> getTasks(){ return tasks; }
	public void setTasks( Set<Task> tasks ){ this.tasks = tasks; }

}
