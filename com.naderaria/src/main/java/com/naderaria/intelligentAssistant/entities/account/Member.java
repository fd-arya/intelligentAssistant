package com.naderaria.intelligentAssistant.entities.account;

import com.naderaria.intelligentAssistant.entities.abstracts.User;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.DiscriminatorValue;


@Entity
@DiscriminatorValue("MEMBER")
@Table(name="MEMBERS")
@NamedQueries({
        @NamedQuery( name = IQueryNames.MEMBER_SELECT_ALL_KEY , query = IQueryNames.MEMBER_SELECT_ALL_VALUE ) ,
})
public class Member extends User {

	private static final long serialVersionUID = 1L;

}
