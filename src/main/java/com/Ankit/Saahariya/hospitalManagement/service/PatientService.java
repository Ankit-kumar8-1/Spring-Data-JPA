package com.Ankit.Saahariya.hospitalManagement.service;

import com.Ankit.Saahariya.hospitalManagement.entity.Patient;
import com.Ankit.Saahariya.hospitalManagement.repositiory.PatientRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {


    @Autowired
    private final PatientRepository patientRepository;

    @Transactional
    public  Patient getPatientById(Long id){
        Patient p1 = patientRepository.findById(id).orElseThrow();

        Patient p2 = patientRepository.findById(id).orElseThrow();
        System.out.println(p1==p2);

        p1.setName("yoyo");

        return p1;

    }
}
