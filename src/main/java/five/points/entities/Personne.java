package five.points.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Personne {

	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 80)
	private String name;
	@Column(length = 80)
	private String lasname;
	private String email;
	private String password;

	@OneToMany(mappedBy="person")
	private List<Participant> participants;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLasname() {
		return lasname;
	}

	public void setLasname(String lasname) {
		this.lasname = lasname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Personne() {
		super();
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public Personne(String name, String lasname, String email, String password) {
		super();
		this.name = name;
		this.lasname = lasname;
		this.email = email;
		this.password = password;
	}

}
