package in.naresh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.naresh.entity.Student;

public interface StudentRepository extends 
                                         JpaRepository<Student, Integer>{

}
