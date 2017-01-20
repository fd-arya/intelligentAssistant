package com.naderaria.intelligentAssistant.dao.interfaces;

public interface IQueryNames {
	
	public static final String BASE_SALARY_SELECT_ALL_KEY = "baseSalary.SelectAll";
    public static final String BASE_SALARY_SELECT_ALL_VALUE = "select b from BaseSalary b ";
    public static final String BASE_SALARY_SELECT_BY_TITLE_KEY = "baseSalary.SelectByTitle";
    public static final String BASE_SALARY_SELECT_BY_TITLE_VALUE = "select b from BaseSalary b where b.title = :title ";
    public static final String BASE_SALARY_SELECT_ALL_RECEIVED_KEY = "baseSalary.SelectAllReceived";
    public static final String BASE_SALARY_SELECT_ALL_RECEIVED_VALUE = "select b from BaseSalary b where b.received = :received ";
    public static final String BASE_SALARY_SELECT_ALL_FINANCE_TYPE_KEY = "baseSalary.SelectAllFinanceType";
    public static final String BASE_SALARY_SELECT_ALL_FINANCE_TYPE_VALUE = "select b from BaseSalary b where b.financeType = :financeType";

    public static final String FUND_SELECT_ALL_KEY = "fund.SelectAll";
    public static final String FUND_SELECT_ALL_VALUE = "select f from Fund f ";
    public static final String FUND_SELECT_BY_FUND_MANAGER_KEY = "fund.SelectByFundManager";
    public static final String FUND_SELECT_BY_FUND_MANAGER_VALUE = "select f from Fund  f where f.fundManager = :fundManager ";
    public static final String FUND_SELECT_ALL_BY_MIN_STOCK_KEY = "fund.SelectAllByMinStock";
    public static final String FUND_SELECT_ALL_BY_MIN_STOCK_VALUE = "select f from Fund f where f.minStock = :minStock ";
    public static final String FUND_SELECT_ALL_BY_MAX_STOCK_KEY = "fund.SelectAllByMaxStock";
    public static final String FUND_SELECT_ALL_BY_MAX_STOCK_VALUE = "select f from Fund f where f.maxStock = :maxStock ";
    public static final String FUND_SELECT_ALL_BY_CURRENT_STOCK_KEY = "fund.SelectAllByCurrentStock";
    public static final String FUND_SELECT_ALL_BY_CURRENT_STOCK_VALUE ="select f from Fund f where f.currentStock = :currentStock ";
    public static final String FUND_SELECT_ALL_BY_BETWEEN_KEY = "fund.SelectAllByBetween";
    public static final String FUND_SELECT_ALL_BY_BETWEEN_VALUE = "select f from Fund f where f.minStock >= :minStock and f.maxStock <= :maxStock ";

    public static final String USER_SELECT_ALL_KEY ="user.SelectAll";
    public static final String USER_SELECT_ALL_VALUE ="select u from User u ";
    public static final String USER_SELECT_ALL_BY_GENDER_KEY = "user.SelectAllByGender";
    public static final String USER_SELECT_ALL_BY_GENDER_VALUE = "select u from User u where u.gender = :gender ";
    public static final String USER_SELECT_ALL_BY_BIRTH_CITY_KEY = "user.SelectAllByBirthCity";
    public static final String USER_SELECT_ALL_BY_BIRTH_CITY_VALUE = "select u from User u where u.birthCity = :birthCity ";
    public static final String USER_SELECT_ALL_BY_BIRTH_DATE_KEY = "user.SelectAllByBirthDate";
    public static final String USER_SELECT_ALL_BY_BIRTH_DATE_VALUE = "select u from User u where u.birthDate = :birthDate ";
    public static final String USER_SELECT_ALL_BY_ADDRESS_KEY = "user.SelectAllByAddress";
    public static final String USER_SELECT_ALL_BY_ADDRESS_VALUE = "select u from User u where u.address = :address ";
    public static final String USER_SELECT_ALL_BY_CALL_INFO_KEY = "user.SelectAllByCallInfo";
    public static final String USER_SELECT_ALL_BY_CALL_INFO_VALUE = "select u from User u where u.callInfo = :callInfo ";
    public static final String USER_SELECT_EXISTS_USER_KEY = "user.SelectExistsUser";
    public static final String USER_SELECT_EXISTS_USER_VALUE ="select count(*) from User u ";
    



    public static final String ACCESS_LEVEL_SELECT_ALL_KEY = "accessLevel.SelectAll";
    public static final String ACCESS_LEVEL_SELECT_ALL_VALUE = "select a from AccessLevel a ";
    public static final String ACCESS_LEVEL_SELECT_ALL_BY_LOGIN_KEY ="accessLevel.SelectAllByLogin";
    public static final String ACCESS_LEVEL_SELECT_ALL_BY_LOGIN_VALUE = "select a from AccessLevel a where a.login = :login ";
    public static final String ACCESS_LEVEL_SELECT_ALL_BY_MAIN_MENU_KEY = "accessLevel.SelectAllByMainMenu";
    public static final String ACCESS_LEVEL_SELECT_ALL_BY_MAIN_MENU_VALUE = "select a from AccessLevel a where a.mainMenu = :mainMenu ";
    public static final String ACCESS_LEVEL_SELECT_ALL_BY_SUB_MENU_KEY = "accessLevel.SelectAllByManiMenu";
    public static final String ACCESS_LEVEL_SELECT_ALL_BY_SUB_MENU_VALUE = "select a from AccessLevel a where a.mainMenu = :mainMenu ";
    public static final String ACCESS_LEVEL_SELECT_ALL_BY_CRUD_KEY = "accessLevel.SelectAllByCrud";
    public static final String ACCESS_LEVEL_SELECT_ALL_BY_CRUD_VALUE = "select a from AccessLevel a where a.accessCrud = :accessCrud ";

    public static final String ADDRESS_SELECT_ALL_KEY = "address.SelectAll";
    public static final String ADDRESS_SELECT_ALL_VALUE = "select a from Address a ";
    public static final String ADDRESS_SELECT_ALL_BY_COUNTRY_KEY = "address.SelectAllByCountry";
    public static final String ADDRESS_SELECT_ALL_BY_COUNTRY_VALUE = "select a from Address a where a.country = :country ";
    public static final String ADDRESS_SELECT_ALL_BY_CITY_KEY = "address.SelectAllByCity";
    public static final String ADDRESS_SELECT_ALL_BY_CITY_VALUE = "select a from Address a where a.city = :city ";
   
    

    public static final String ADMIN_SELECT_ALL_KEY = "admin.SelectAll";
    public static final String ADMIN_SELECT_ALL_VALUE = "select a from Admin a ";

    public static final String CALL_INFO_SELECT_ALL_KEY = "callInfo.SelectAll";
    public static final String CALL_INFO_SELECT_ALL_VALUE = "select c from CallInfo c ";
    public static final String CALL_INFO_SELECT_BY_PHONE_KEY = "callInfo.SelectByPhone";
    public static final String CALL_INFO_SELECT_BY_PHONE_VALUE = "select c from CallInfo c where c.phone = :phone ";
    public static final String CALL_INFO_SELECT_BY_CELL_KEY = "callInfo.selectByCell";
    public static final String CALL_INFO_SELECT_BY_CELL_VALUE = "select c from CallInfo c where c.cell = :cell ";
    public static final String CALL_INFO_SELECT_BY_EMAIL_KEY = "callInfo.selecByEmail";
    public static final String CALL_INFO_SELECT_BY_EMAIL_VALUE = "select c from CallInfo c where c.email = :email ";

    public static final String LOG_SELECT_ALL_KEY = "log.SelectAll";
    public static final String LOG_SELECT_ALL_VALUE = "select l from Log l ";
    public static final String LOG_SELECT_ALL_BY_LOGIN_KEY = "log.SelectAllByLogin";
    public static final String LOG_SELECT_ALL_BY_LOGIN_VALUE = "select l from Log l where l.login = :login ";
    public static final String LOG_SELECT_ALL_BY_SERVICE_NAME_KEY = "log.SelectAllByServiceName";
    public static final String LOG_SELECT_ALL_BY_SERVICE_NAME_VALUE = "select l from Log l where l.serviceName = :serviceName ";
    public static final String LOG_SELECT_ALL_BY_BETWEEN_CALENDAR_KEY = "log.SelectAllByBetweenCalendar";
    public static final String LOG_SELECT_ALL_BY_BETWEEN_CALENDAR_VALUE = "select l from Log l where l.startLog <= :startLog and l.endLog <= :endLog ";

    public static final String LOGIN_SELECT_ALL_kEY = "login.SelectAll";
    public static final String LOGIN_SELECT_ALL_VALUE = "select l from Login l ";
    public static final String LOGIN_SELECT_ALL_BY_LANGUAGE_KEY = "login.SelectAllByLanguage";
    public static final String LOGIN_SELECT_ALL_BY_LANGUAGE_VALUE = "select l from Login l where l.language = :language ";
    public static final String LOGIN_SELECT_BY_USER_KEY = "login.SelectByUser";
    public static final String LOGIN_SELECT_BY_USER_VALUE = "select l from Login l where l.user = :user ";
    public static final String LOGIN_SELECT_BY_USER_NAME_AND_PASSWORD_KEY = "login.SelectByUserNamePassword";
    public static final String LOGIN_SELECT_BY_USER_NAME_AND_PASSWORD_VALUE ="select l from Login l where l.userNamePassword.userName = :userName and l.userNamePassword.password = :password ";

    public static final String MEMBER_SELECT_ALL_KEY = "member.SelectAll";
    public static final String MEMBER_SELECT_ALL_VALUE = "select m from Member m ";

    public static final String USER_NAME_PASSWORD_SELECT_ALL_KEY = "userNamePassword.SelectAll";
    public static final String USER_NAME_PASSWORD_SELECT_ALL_VALUE = "select u from UserNamePassword u ";
    public static final String USER_NAME_PASSWORD_SELECT_BY_NAME_KEY = "userNamePassword.SelectByName";
    public static final String USER_NAME_PASSWORD_SELECT_BY_NAME_VALUE = "select u from UserNamePassword u where u.userName = :userName ";



    public static final String COST_SELECT_ALL_KEY = "cost.SelectAll";
    public static final String COST_SELECT_ALL_VALUE = "select c from Cost c ";
    public static final String COST_SELECT_ALL_BY_MANAGER_KEY = "cost.SelectAllByManager";
    public static final String COST_SELECT_ALL_BY_MANAGER_VALUE = "select c from Cost c where c.costManager = :costManager ";
    public static final String COST_SELECT_BY_TITLE_KEY = "cost.SelectByTitle";
    public static final String COST_SELECT_BY_TITLE_VALUE = "select c from Cost c where c.title = :title ";
    public static final String COST_SELECT_ALL_BY_PAY_DATE_KEY = "cost.SelectAllByPayDate";
    public static final String COST_SELECT_ALL_BY_PAY_DATE_VALUE = "select c from Cost c where c.payDate = :payDate ";
    public static final String COST_SELECT_ALL_BY_PAID_KEY = "cost.SelectAllByPaid";
    public static final String COST_SELECT_ALL_BY_PAID_VALUE = "select c from Cost c where c.paid = :paid ";
    public static final String COST_SELECT_ALL_BY_COST_TYPE_KEY = "cost.SelectAllByCostType";
    public static final String COST_SELECT_ALL_BY_COST_TYPE_VALUE = "select c from Cost c where c.costType = :costType ";
    public static final String COST_SELECT_ALL_BY_PAY_TYPE_KEY = "cost.SelectAllByPayType";
    public static final String COST_SELECT_ALL_BY_PAY_TYPE_VALUE = "select c from Cost c where c.payType = :payType ";
    public static final String COST_SELECT_ALL_BY_FINANCE_TYPE_KEY = "cost.SelectAllByFinanceType";
    public static final String COST_SELECT_ALL_BY_FINANCE_TYPE_VALUE = "select c from Cost c where c.financeType = :financeType ";

    public static final String COST_MANAGER_SELECT_ALL_KEY = "cost.ManagerSelectAll";
    public static final String COST_MANAGER_SELECT_ALL_VALUE = "select c from CostManager c ";
    public static final String COST_MANAGER_SELECT_BY_LOGIN_KEY  = "cost.ManagerSelectByLogin";
    public static final String COST_MANAGER_SELECT_BY_LOGIN_VALUE = "select c from CostManager c where c.login = :login ";


    public static final String CURRENT_FUND_SELECT_ALL_KEY = "currentFund.SelectAll";
    public static final String CURRENT_FUND_SELECT_ALL_VALUE = "select c from CurrentFund c ";


    public static final String DEMAND_SELECT_ALL_KEY = "demand.SelectAll";
    public static final String DEMAND_SELECT_ALL_VALUE = "select d from Demand d ";
    public static final String DEMAND_SELECT_ALL_BY_DEMAND_MANAGER_KEY = "demand.SelectAllByDemandManager";
    public static final String DEMAND_SELECT_ALL_BY_DEMAND_MANAGER_VALUE = "select d from Demand d where d.demandManager = :demandManager ";
    public static final String DEMAND_SELECT_ALL_BY_DEMAND_TYPE_KEY = "demand.SelectAllByDemandType";
    public static final String DEMAND_SELECT_ALL_BY_PAY_TYPE_VALUE = "select d from Demand d where d.payType = :payType ";

    public static final String DEMAND_MANAGER_SELECT_ALL_KEY = "demandManager.SelectAll";
    public static final String DEMAND_MANAGER_SELECT_ALL_VALUE = "select d from DemandManager d ";
    public static final String DEMAND_MANAGER_SELECT_BY_LOGIN_KEY = "demandManager.SelectByLogin";
    public static final String DEMAND_MANAGER_SELECT_BY_LOGIN_VALUE = "select d from DemandManager d where d.login = :login ";

    public static final String FACTOR_DETAILS_SELECT_ALL_KEY = "factorDetails.SelectAll";
    public static final String FACTOR_DETAILS_SELECT_ALL_VALUE = "select f from FactorDetails f ";
    public static final String FACTOR_DETAILS_SELECT_ALL_BY_COST_KEY = "factorDetails.SelectAllByCost";
    public static final String FACTOR_DETAILS_SELECT_ALL_BY_COST_VALUE = "select f from FactorDetails f where f.cost = :cost ";
    public static final String FACTOR_DETAILS_SELECT_BY_TITLE_KEY = "factorDetails.SelectByTitle";
    public static final String FACTOR_DETAILS_SELECT_BY_TITLE_VALUE = "select f from FactorDetails f where f.title = :title ";

    public static final String FUND_MANAGER_SELECT_ALL_KEY = "fundManager.SelectAll";
    public static final String FUND_MANAGER_SELECT_ALL_VALUE = "select f from FundManager f ";
    public static final String FUND_MANAGER_SELECT_BY_LOGIN_KEY = "fundManager.SelectByLogin";
    public static final String FUND_MANAGER_SELECT_BY_LOGIN_VALUE = "select f from FundManager f where f.login = :login ";

    public static final String REVERS_FUND_SELECT_ALL_KEY = "reversFund.SelectAll";
    public static final String REVERS_FUND_SELECT_ALL_VALUE = "select r from ReversFund r ";

    public static final String SALARY_SELECT_ALL_KEY = "salary.SelectAll";
    public static final String SALARY_SELECT_ALL_VALUE = "select s from Salary s ";
    public static final String SALARY_SELECT_BY_SALARY_MANGER_KEY = "salary.SelectBySalaryManager";
    public static final String SALARY_SELECT_BY_SALARY_MANAGER_VALUE = "select s from Salary s where s.salaryManager = :salaryManager ";

    public static final String SALARY_MANAGER_SELECT_ALL_KEY = "salaryManager.SelectAll";
    public static final String SALARY_MANAGER_SELECT_ALL_VALUE = "select s from SalaryManager s ";
    public static final String SALARY_MANAGER_SELECT_BY_LOGIN_KEY = "salaryManager.SelectByLogin";
    public static final String SALARY_MANAGER_SELECT_BY_LOGIN_VALUE = "select s from SalaryManager s where s.login = :login ";

    public static final String DRUG_SELECT_ALL_KEY = "drug.SelectAll";
    public static final String DRUG_SELECT_ALL_VALUE = "select d from Drug d ";
    public static final String DRUG_SELECT_BY_DRUG_MANAGER_KEY = "drug.SelectByDrugManager";
    public static final String DRUG_SELECT_BY_DRUG_MANAGER_VALUE = "select d from Drug d where d.drugManager = :drugManager ";
    public static final String DRUG_SELECT_BY_TITLE_KEY = "drug.SelectByTitle";
    public static final String DRUG_SELECT_BY_TITLE_VALUE = "select d from Drug d where d.title = :title ";
    public static final String DRUG_SELECT_BY_CONSUMPTION_INSTRUCTION_KEY = "drug.SelectByConsumptionInstruction";
    public static final String DRUG_SELECT_BY_CONSUMPTION_INSTRUCTION_VALUE = "select d from Drug d where d.consumptionInstruction = :consumptionInstruction ";
    //public static final String DRUG_SELECT_ALL_BY_MEMBER_KEY = "drug.SelectByMember";
    //public static final String DRUG_SELECT_ALL_BY_MEMBER_VALUE = "select d from Drug d where d.member = :member ";
    public static final String DRUG_SELECT_ALL_BY_ACTIVE_KEY = "drug.SelectByActive";
    public static final String DRUG_SELECT_ALL_BY_ACTIVE_VALUE = "select d from Drug d where d.active = :active ";

    public static final String DRUG_MANAGER_SELECT_ALL_KEY = "drugManager.SelectAll";
    public static final String DRUG_MANAGER_SELECT_ALL_VALUE = "select d from DrugManager d ";
    public static final String DRUG_MANAGER_SELECT_BY_LOGIN_KEY = "drugManager.SelectByLogin";
    public static final String DRUG_MANAGER_SELECT_BY_LOGIN_VALUE = "select d from DrugManager d where d.login  = :login ";

    public static final String MEDICINE_INFO_SELECT_ALL_KEY = "medicineInfo.SelectAll";
    public static final String MEDICINE_INFO_SELECT_ALL_VALUE = "select m from MedicineInfo m ";
    public static final String MEDICINE_INFO_SELECT_BY_MEDICINE_VISIT_KEY = "medicineInfo.SelectByMedicineVisit";
    public static final String MEDICINE_INFO_SELECT_BY_MEDICINE_VISIT_VALUE = "select m from MedicineInfo m where m.medicineVisit = :medicineVisit ";
    public static final String MEDICINE_INFO_SELECT_BY_TITLE_KEY = "medicineInfo.SelectByTitle";
    public static final String MEDICINE_INFO_SELECT_BY_TITLE_VALUE = "select m from MedicineInfo m where m.title = :title ";
    public static final String MEDICINE_INFO_SELECT_BY_ADDRESS_KEY = "medicineInfo.SelectByAddress";
    public static final String MEDICINE_INFO_SELECT_BY_ADDRESS_VALUE = "select m from MedicineInfo m where m.address = :address ";
    public static final String MEDICINE_INFO_SELECT_BY_CALL_INFO_KEY = "medicineInfo.SelectByCallInfo";
    public static final String MEDICINE_INFO_SELECT_BY_CALL_INFO_VALUE = "select m from MedicineInfo m where m.callInfo = :callInfo ";
    public static final String MEDICINE_INFO_SELECT_All_BY_DATE_KEY = "medicineInfo.SelectAllByDate";
    public static final String MEDICINE_INFO_SELECT_All_BY_DATE_VALUE = "select m from MedicineInfo m where m.date = :date ";
    public static final String MEDICINE_INFO_SELECT_ALL_BY_MEDICINE_TYPE_KEY = "medicineInfo.SelectAllByMedicineType";
    public static final String MEDICINE_INFO_SELECT_ALL_BY_MEDICINE_TYPE_VALUE = "select m from MedicineInfo m where m.medicineType = :medicineType ";

    public static final String MEDICINE_TEST_SELECT_ALL_KEY = "medicineTest.SelectAll";
    public static final String MEDICINE_TEST_SELECT_ALL_VALUE = "select m from MedicineTest m ";
    public static final String MEDICINE_TEST_SELECT_BY_MEDICINE_TEST_MANAGER_KEY = "medicineTest.SelectByMedicineTestManager";
    public static final String MEDICINE_TEST_SELECT_BY_MEDICINE_TEST_MANAGER_VALUE = "select m from MedicineTest m where m.medicineTestManager = :medicineTestManager ";
    public static final String MEDICINE_TEST_SELECT_ALL_BY_MEDICINE_TEST_TYPE_KEY = "medicineTest.SelectMedicineTestType";
    public static final String MEDICINE_TEST_SELECT_ALL_BY_MEDICINE_TEST_TYPE_VALUE = "select m from MedicineTest m where m.medicineTestType = :medicineTestType ";
    public static final String MEDICINE_TEST_SELECT_ALL_BY_DATE_KEY = "medicineTest.SelectAllByDate";
    public static final String MEDICINE_TEST_SELECT_ALL_BY_DATE_VALUE = "select m from MedicineTest m where m.date = :date ";
    public static final String MEDICINE_TEST_SELECT_ALL_BY_RELATED_DISEASES_KEY = "medicineTest.SelectAllByRelatedDiseases";
    public static final String MEDICINE_TEST_SELECT_ALL_BY_RELATED_DISEASES_VALUE = "select m from MedicineTest m where m.relatedDiseases = :relatedDiseases ";

    public static final String MEDICINE_TEST_MANAGER_SELECT_ALL_KEY ="medicineTestManager.SelectAll";
    public static final String MEDICINE_TEST_MANAGER_SELECT_ALL_VALUE = "select m from MedicineTestManager m ";
    public static final String MEDICINE_TEST_MANAGER_SELECT_BY_LOGIN_KEY = "medicineTestManager.SelectByLogin";
    public static final String MEDICINE_TEST_MANAGER_SELECT_BY_LOGIN_VALUE = "select m from MedicineTestManager m where m.login = :login ";

    public static final String MEDICINE_VISIT_SELECT_ALL_KEY = "medicineVisit.SelectAll";
    public static final String MEDICINE_VISIT_SELECT_ALL_VALUE = "select m from MedicineVisit m ";
    public static final String MEDICINE_VISIT_SELECT_BY_LOGIN_KEY = "medicineVisit.SelectByLogin";
    public static final String MEDICINE_VISIT_SELECT_BY_LOGIN_VALUE = "select m from MedicineVisit m where m.login = :login ";

    public static final String REMINDER_SELECT_ALL_KEY = "reminder.SelectAll";
    public static final String REMINDER_SELECT_ALL_VALUE = "select r from Reminder r ";
    public static final String REMINDER_SELECT_BY_REMINDER_MANAGER_KEY = "reminder.SelectByReminderManager";
    public static final String REMINDER_SELECT_BY_REMINDER_MANAGER_VALUE = "select r from Reminder r where r.reminderManager = :reminderManager ";
    public static final String REMINDER_SELECT_BY_TITLE_KEY = "reminder.SelectByTitle";
    public static final String REMINDER_SELECT_BY_TITLE_VALUE = "select r from Reminder r where r.title = :title ";
    public static final String REMINDER_SELECT_ALL_BY_CALENDAR_KEY = "reminder.SelectAllByCalendar";
    public static final String REMINDER_SELECT_ALL_BY_CALENDAR_VALUE = "select r from Reminder r where r.calendar = :calendar ";
    public static final String REMINDER_SELECT_ALL_BY_ACTIVE_KEY = "reminder.SelectAllByActive";
    public static final String REMINDER_SELECT_ALL_BY_ACTIVE_VALUE = "select r from Reminder r where r.active = :active ";
    public static final String REMINDER_SELECT_ALL_BY_REPETITION_TYPE_KEY = "reminder.SelectAllByRepetitionType";
    public static final String REMINDER_SELECT_ALL_BY_REPETITION_TYPE_VALUE = "select r from Reminder r where r.repetitionType = :repetitionType ";
    public static final String REMINDER_SELECT_ALL_BY_PRIORITY_TYPE_KEY = "reminder.SelectAllByPriorityType";
    public static final String REMINDER_SELECT_ALL_BY_PRIORITY_TYPE_VALUE = "select r from Reminder r where r.priorityType = :priorityType ";

    public static final String REMINDER_MANAGER_SELECT_ALL_KEY = "reminderManager.SelectAll";
    public static final String REMINDER_MANAGER_SELECT_ALL_VALUE ="select r from ReminderManager r ";
    public static final String REMINDER_MANAGER_SELECT_BY_LOGIN_KEY = "reminderManager.SelectByLogin";
    public static final String REMINDER_MANAGER_SELECT_BY_LOGIN_VALUE = "select r from ReminderManager r where r.login = :login ";

    public static final String GOAL_SELECT_ALL_KEY = "goal.SelectAll";
    public static final String GOAL_SELECT_ALL_VALUE = "select g from Goal g ";
    public static final String GOAL_SELECT_BY_GOAL_MANAGER_KEY = "goal.SelectByGoalManager";
    public static final String GOAL_SELECT_BY_GOAL_MANAGER_VALUE = "select g from Goal g where g.goalManager = :goalManager ";
    public static final String GOAL_SELECT_BY_TITLE_KEY = "goal.SelectByTitle";
    public static final String GOAL_SELECT_BY_TITLE_VALUE = "select g from Goal g where g.title = :title ";
    public static final String GOAL_SELECT_BY_CODE_KEY = "goal.SelectByCode";
    public static final String GOAL_SELECT_BY_CODE_VALUE = "select g from Goal g where g.code = :code ";
    public static final String GOAL_SELECT_ALL_BY_GOAL_TYPE_KEY = "goal.SelectAllByGoalType";
    public static final String GOAL_SELECT_ALL_BY_GOAL_TYPE_VALUE = "select g from Goal g where g.goalType = :goalType ";
    public static final String GOAL_SELECT_ALL_BY_GOAL_TIME_TYPE_KEY = "goal.SelectAllByGoalTimeType";
    public static final String GOAL_SELECT_ALL_BY_GOAL_TIME_TYPE_VALUE = "select g from Goal g where g.goalTimeType = :goalTimeType ";
    public static final String GOAL_SELECT_ALL_BY_STATE_TYPE_KEY = "goal.SelectAllByStateType";
    public static final String GOAL_SELECT_ALL_BY_STATE_TYPE_VALUE = "select g from Goal g where g.stateType = :stateType ";

    public static final String GOAL_MANAGER_SELECT_ALL_KEY = "goalManager.SelectAll";
    public static final String GOAL_MANAGER_SELECT_ALL_VALUE = "select g from GoalManager g ";
    public static final String GOAL_MANAGER_SELECT_BY_LOGIN_KEY = "goalManager.SelectByLogin";
    public static final String GOAL_MANAGER_SELECT_BY_LOGIN_VALUE = "select g from GoalManager g where g.login = :login ";

    public static final String SPRINT_SELECT_ALL_KEY = "sprint.SelectAll";
    public static final String SPRINT_SELECT_ALL_VALUE = "select s from Sprint s ";
    public static final String SPRINT_SELECT_BY_GOAL_KEY = "sprint.SelectByGoal";
    public static final String SPRINT_SELECT_BY_GOAL_VALUE = "select s from Sprint s where s.goal = :goal ";
    public static final String SPRINT_SELECT_BY_TITLE_KEY = "sprint.SelectByTitle";
    public static final String SPRINT_SELECT_BY_TITLE_VALUE = "select s from Sprint s where s.title = :title ";
    public static final String SPRINT_SELECT_BY_CODE_KEY = "sprint.SelectByCode";
    public static final String SPRINT_SELECT_BY_CODE_VALUE = "select s from Sprint s where s.code = :code ";
    public static final String SPRINT_SELECT_ALL_BY_START_DATE_KEY = "sprint.SelectAllByStartDate";
    public static final String SPRINT_SELECT_ALL_BY_START_DATE_VALUE = "select s from Sprint s where s.startDate = :startDate ";
    public static final String SPRINT_SELECT_ALL_BY_END_DATE_KEY = "sprint.SelectAllByEndDate";
    public static final String SPRINT_SELECT_ALL_BY_END_DATE_VALUE = "select s from Sprint s where s.endDate = :endDate ";
    public static final String SPRINT_SELECT_ALL_BY_BETWEEN_CALENDAR_KEY = "sprint.SelectAllByBetweenCalendar";
    public static final String SPRINT_SELECT_ALL_BY_BETWEEN_CALENDAR_VALUE = "select s from Sprint s where s.startDate <= :startDate and s.endDate <= :endDate ";
    public static final String SPRINT_SELECT_ALL_STATE_TYPE_KEY = "sprint.SelectAllByStateType";
    public static final String SPRINT_SELECT_ALL_STATE_TYPE_VALUE = "select s from Sprint s where s.stateType = :stateType ";

    public static final String TASK_SELECT_ALL_KEY = "task.SelectAll";
    public static final String TASK_SELECT_ALL_VALUE = "select t from Task t ";
    public static final String TASK_SELECT_BY_SPRINT_KEY = "task.SelectBySprint";
    public static final String TASK_SELECT_BY_SPRINT_VALUE = "select t from Task t where t.sprint = :sprint ";
    public static final String TASK_SELECT_BY_TITLE_KEY = "task.SelectByTitle";
    public static final String TASK_SELECT_BY_TITLE_VALUE = "select t from Task t where t.title = :title ";
    public static final String TASK_SELECT_BY_CODE_KEY = "task.SelectByCode";
    public static final String TASK_SELECT_BY_CODE_VALUE = "select t from Task t where t.code = :code ";
    public static final String TASK_SELECT_ALL_BY_PRIORITY_TYPE_KEY = "task.SelectAllByTaskPriorityType";
    public static final String TASK_SELECT_ALL_BY_PRIORITY_TYPE_VALUE = "select t from Task t where t.taskPriorityType = :taskPriorityType ";
    public static final String TASK_SELECT_ALL_BY_TASK_TYPE_KEY = "task.SelectAllByTaskType";
    public static final String TASK_SELECT_ALL_BY_TASK_TYPE_VALUE = "select t from Task t where t.taskType = :taskType ";
    public static final String TASK_SELECT_ALL_BY_STATE_TYPE_KEY = "task.SelectAllByStateType";
    public static final String TASK_SELECT_ALL_BY_STATE_TYPE_VALUE = "select t from Task t where t.stateType = :stateType ";



}
