package com.Ankit.Saahariya.hospitalManagement.repositiory;

import com.Ankit.Saahariya.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
