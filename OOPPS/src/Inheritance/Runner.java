package Inheritance;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		LeadTest_class	leads=new LeadTest_class();
		leads.common();
		leads.createLead();
		leads.logout();
		OrgTestt	org=new OrgTestt();
		org.common();
		org.createOrganization();
		org.logout();
		ContactTes	contact=new ContactTes();
		contact.common();
		contact.createContac();
		contact.logout();

	}

}
