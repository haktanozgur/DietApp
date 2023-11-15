package com.haktanozgur.DietApp.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import com.haktanozgur.DietApp.Enums.Sex;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table (name = "user_information")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInformation {
	
	@Column(name = "first_name") 
	private String name;
	@Column(name = "sur_name") 
	private String surname;
	@Enumerated(EnumType.STRING)	
	private Sex sex;
	@Column(name = "age") 
	private int age;
	@Column(name = "height") 
	private float height;
	@Column(name = "weight") 
	private float weight;
	@Column(name = "bodyMass") 
	private float bodyMass;
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private User userId;

}
