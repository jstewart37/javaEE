package Entitys;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginIMS {

	@Id
	@Column(name = "usernameID", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long usernameID;
	@Column(name = "password", nullable = false, length = 100)
	@Size(max = 100)
	@NotNull
	private String password;
	
	
}
