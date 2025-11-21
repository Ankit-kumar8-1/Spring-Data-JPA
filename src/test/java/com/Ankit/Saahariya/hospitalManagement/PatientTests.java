package com.Ankit.Saahariya.hospitalManagement;

import com.Ankit.Saahariya.hospitalManagement.entity.Patient;
import com.Ankit.Saahariya.hospitalManagement.repositiory.PatientRepository;
import com.Ankit.Saahariya.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public  void testPatientRepository(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }

    @Test
    public void testTransactionMethods(){
        Patient patient = patientService.getPatientById(1L);
        System.out.println(patient);


    }
}
