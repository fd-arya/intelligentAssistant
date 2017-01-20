package com.naderaria.intelligentAssistant.entities.scrum;

import java.util.Set;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.enums.GoalTimeType;
import com.naderaria.intelligentAssistant.entities.enums.GoalType;
import com.naderaria.intelligentAssistant.entities.enums.StateType;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Table(name="GOALS",uniqueConstraints = @UniqueConstraint(columnNames = "TITLE"))
@NamedQueries({
		@NamedQuery( name = IQueryNames.GOAL_SELECT_ALL_KEY , query = IQueryNames.GOAL_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.GOAL_SELECT_BY_GOAL_MANAGER_KEY , query = IQueryNames.GOAL_SELECT_BY_GOAL_MANAGER_VALUE ) ,
		@NamedQuery( name = IQueryNames.GOAL_SELECT_BY_TITLE_KEY , query = IQueryNames.GOAL_SELECT_BY_TITLE_VALUE ) ,
		@NamedQuery( name = IQueryNames.GOAL_SELECT_BY_CODE_KEY , query = IQueryNames.GOAL_SELECT_BY_CODE_VALUE ) ,
		@NamedQuery( name = IQueryNames.GOAL_SELECT_ALL_BY_GOAL_TYPE_KEY , query = IQueryNames.GOAL_SELECT_ALL_BY_GOAL_TYPE_VALUE ) ,
		@NamedQuery( name = IQueryNames.GOAL_SELECT_ALL_BY_GOAL_TIME_TYPE_KEY , query = IQueryNames.GOAL_SELECT_ALL_BY_GOAL_TIME_TYPE_VALUE ),
		@NamedQuery( name = IQueryNames.GOAL_SELECT_ALL_BY_STATE_TYPE_KEY , query = IQueryNames.GOAL_SELECT_ALL_BY_STATE_TYPE_VALUE )
})
public class Goal extends BaseEntity {


	private static final long serialVersionUID = 1L;
	
	@ManyToOne( cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch = FetchType.EAGER)
	@JoinColumn(name="GOAL_MANAGER_ID")
	private GoalManager goalManager;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="DESCRIPTION")
	private String description;
	

	@Enumerated(EnumType.STRING)
	@Column(name="GOAL_TYPE")
	private GoalType goalType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="GOAL_TIME_TYPE")
	private GoalTimeType goalTimeType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="STATE_TYPE")
	private StateType stateType;
	
	@OneToMany(cascade={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch=FetchType.LAZY,mappedBy="goal")
	private Set<Sprint> sprints;
	
	public GoalManager getGoalManager(){ return goalManager; }
	public void setGoalManager( GoalManager goalManager ){ this.goalManager = goalManager; }
	
	public String getTitle(){ return title; }
	public void setTitle( String title ){ this.title = title; }
	
	public String getCode(){ return code; }
	public void setCode( String code ){ this.code = code; }
	
	public String getDescription(){ return description; }
	public void setDescription( String description ){ this.description = description; }
	
	public GoalType getGoalType(){ return goalType; }
	public void setGoalType( GoalType goalType ){ this.goalType = goalType;  }
	
	public GoalTimeType getGoalTimeType(){ return goalTimeType; }
	public void setGoalTimeType( GoalTimeType goalTimeType ){ this.goalTimeType = goalTimeType; }
	
	public StateType getStateType(){ return stateType; }
	public void setStateType( StateType stateType ){ this.stateType = stateType; }
	
	public Set<Sprint> getSprints(){ return sprints; }
	public void setSprints( Set<Sprint> sprints ){ this.sprints = sprints; }

	

}
