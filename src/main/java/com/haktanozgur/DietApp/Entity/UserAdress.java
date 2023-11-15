package com.haktanozgur.DietApp.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name = "user_adress")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAdress {

	@Column(name = "email") 
	private String email;
	@Column(name = "phone_number") 
	private String phonenumber;
	@Column(name = "adress") 
	private String adress;
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private User userId; 
}
