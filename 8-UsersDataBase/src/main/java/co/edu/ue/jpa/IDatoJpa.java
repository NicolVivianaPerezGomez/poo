package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ue.entity.Dato;

public interface IDatoJpa extends JpaRepository<Dato, Integer> {

	Dato findByDatEmail(String datEmail);
	
}
