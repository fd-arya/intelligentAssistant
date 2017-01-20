package com.naderaria.intelligentAssistant.entities.reminder;

import java.util.Calendar;
import com.naderaria.intelligentAssistant.entities.abstracts.BaseEntity;
import com.naderaria.intelligentAssistant.entities.enums.PriorityType;
import com.naderaria.intelligentAssistant.entities.enums.RepetitionType;
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
import javax.persistence.EnumType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="REMINDERS")
@NamedQueries({
		@NamedQuery( name = IQueryNames.REMINDER_SELECT_ALL_KEY , query = IQueryNames.REMINDER_SELECT_ALL_VALUE ) ,
		@NamedQuery( name = IQueryNames.REMINDER_SELECT_BY_REMINDER_MANAGER_KEY , query = IQueryNames.REMINDER_SELECT_BY_REMINDER_MANAGER_VALUE ) ,
		@NamedQuery( name = IQueryNames.REMINDER_SELECT_BY_TITLE_KEY , query = IQueryNames.REMINDER_SELECT_BY_TITLE_VALUE ) ,
		@NamedQuery( name = IQueryNames.REMINDER_SELECT_ALL_BY_CALENDAR_KEY , query = IQueryNames.REMINDER_SELECT_ALL_BY_CALENDAR_VALUE ),
		@NamedQuery( name = IQueryNames.REMINDER_SELECT_ALL_BY_ACTIVE_KEY , query = IQueryNames.REMINDER_SELECT_ALL_BY_ACTIVE_VALUE ) ,
		@NamedQuery( name = IQueryNames.REMINDER_SELECT_ALL_BY_REPETITION_TYPE_KEY , query = IQueryNames.REMINDER_SELECT_ALL_BY_REPETITION_TYPE_VALUE ) ,
		@NamedQuery( name = IQueryNames.REMINDER_SELECT_ALL_BY_PRIORITY_TYPE_KEY , query = IQueryNames.REMINDER_SELECT_ALL_BY_PRIORITY_TYPE_VALUE )
})
public class Reminder extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade ={CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH,CascadeType.PERSIST},
				fetch = FetchType.EAGER)
	@JoinColumn(name="REMINDER_MANAGER_ID")
	private ReminderManager reminderManager;
	
	@Column(name="TITLE")
	private String title;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CALENDAR")
	private Calendar calendar;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="WARNING_MESSAGE")
	private String warningMessage;
	
	@Column(name="ERROR_MESSAGE")
	private String errorMessage;
	
	@Lob
	@Column(name="IMAGE_MESSAGE")
	private Byte[] imageMessage;
	
	@Column(name="ACTIVE")
	private Boolean active;
	
	@Column(name="REPETITION")
	private Boolean repetition;
	
	@Enumerated(EnumType.STRING)
	@Column(name="REPETITION_TYPE")
	private RepetitionType repetitionType;
	
	@Enumerated(EnumType.STRING)
	@Column(name="PRIORITY_TYPE")
	private PriorityType priorityType;
	
	public ReminderManager getReminderManager(){ return reminderManager; }
	public void setReminderManager( ReminderManager reminderManager ){ this.reminderManager = reminderManager; }
	
	public String getTitle(){ return title; }
	public void setTitle( String title ){ this.title = title; }
	
	public Calendar getCalendar(){ return calendar; }
	public void setCalendar( Calendar calendar ){ this.calendar = calendar; }
	
	public String getDescription(){ return description; }
	public void setDescription( String description ){ this.description = description; }
	
	public String getWarningMessage(){ return warningMessage; }
	public void setWarningMessage( String warningMessage ){ this.warningMessage = warningMessage; }
	
	public String getErrorMessage(){ return errorMessage; }
	public void setErrorMessage( String errorMessage ){ this.errorMessage = errorMessage; }
	
	public Byte[] getImageMessage(){ return imageMessage; }
	public void setImageMessage( Byte[] imageMessage ){ this.imageMessage = imageMessage; }
	
	public Boolean isActive(){ return active; }
	public void setActive( Boolean active ){ this.active = active; }
	
	public Boolean isRepetition(){ return repetition; }
	public void setRepetition( Boolean repetition ){ this.repetition = repetition; }
	
	public RepetitionType getRepetitionType(){ return repetitionType; }
	public void setRepetitionType( RepetitionType repetitionType ){ this.repetitionType = repetitionType; }
	
	public PriorityType getPriorityType(){ return priorityType; }
	public void setPriorityType( PriorityType priorityType ){ this.priorityType = priorityType; }

}
