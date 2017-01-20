package com.naderaria.intelligentAssistant.entities.financial;

import com.naderaria.intelligentAssistant.entities.abstracts.Fund;
import com.naderaria.intelligentAssistant.dao.interfaces.IQueryNames;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.DiscriminatorValue;


@Entity
@Table(name="REVERS_FUND")
@DiscriminatorValue("REVERS_FUND")
@NamedQueries({
		@NamedQuery( name = IQueryNames.REVERS_FUND_SELECT_ALL_KEY , query = IQueryNames.REVERS_FUND_SELECT_ALL_VALUE )
})
public class ReversFund extends Fund {

	private static final long serialVersionUID = 1L;

}
