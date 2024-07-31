package in.naresh.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student_tble_info")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;
	private Integer age;
	private String gender;
	private String studentBranch;
	private Integer hallticketNum;

	@CreationTimestamp
	@Column(name = "date_created", updatable = false)
	private LocalDate dateCreated;
	
	
	@UpdateTimestamp
	@Column(name = "last_created" , insertable = false)
	private LocalDate lastUpdated;
}


















