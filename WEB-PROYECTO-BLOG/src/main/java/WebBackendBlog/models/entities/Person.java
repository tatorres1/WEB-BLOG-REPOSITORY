package WebBackendBlog.models.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
//import javax.persistence.OneToOne;


@MappedSuperclass
public abstract class Person{
	
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Date_Birth")
	private Date Date_Birth;
	
	@Column(name="Nacionality")
	private String Nacionality;
	
	@Column(name="Mail")
	private String Mail;

	//@OneToOne(mappedBy = "Person")
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDate_Birth() {
		return Date_Birth;
	}

	public void setDate_Birth(Date date_Birth) {
		Date_Birth = date_Birth;
	}

	public String getNacionality() {
		return Nacionality;
	}

	public void setNacionality(String nacionality) {
		Nacionality = nacionality;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	
}


















