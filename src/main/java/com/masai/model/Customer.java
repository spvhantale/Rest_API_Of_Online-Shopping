package com.masai.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	@Size(min = 3, max = 15, message = "First Name should be min 3 and max 15 Characters!")
	private String firstName;
	
	@Size(min = 1, max = 15, message = "Last Name should be min 1 and max 15 Characters!")
	private String lastName;
	
	@Size(min = 10, max = 10, message = "Mobile Number should contain 10 digit only!")
	private String mobileNumber;
	

	@Size(min = 8, max = 16, message = "Password must contain min 8 and max 16 digits!")
	private String password;
	
	@Email(message = "Please enter a valid email...")
	private String email;
	
	@NotBlank(message = "role should not be blank...")
	@NotNull(message = "roll should not be null...")
	@NotEmpty(message = "roll should not be empty...")
	private String role;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses=new ArrayList<>();
	

}
