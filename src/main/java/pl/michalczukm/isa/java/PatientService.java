package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private final List<Patient> patients;

    public PatientService() {
        patients = new ArrayList<>();

        patients.add(new Patient("Jan", "Kowalski"));
    }

    public List<Patient> getAll() {
        return patients;
    }

    public void Add(Patient patient) {
        patients.add(patient);
    }
}
