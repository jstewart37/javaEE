package Entitys;
import javax.persistence.*;
import javax.validation.constraints.*;


public class LoginIMS {

	@Id
	@Column(name = "username", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	@Column(name = "password", nullable = false, length = 100)
	@Size(max = 100)
	@NotNull
	private String password;
	
	
}
