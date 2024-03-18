package Patient;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/Reg")
    private ResponseEntity<Patient> createPatient(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Patient>(PatientService.addPatient(
                payload.get("patientId"),
                payload.get("firstName"),
                payload.get("lastName"),
                payload.get("gender"),
                payload.get("birthDate"),
                payload.get("lastName"),
                payload.get("email"),
                payload.get("password") ), HttpStatus.CREATED);
    }

    @GetMapping("/patient")
    public ResponseEntity<List<Patient>> getAllPatientInfo(){
        return new ResponseEntity<List<Patient>>(patientService.allPatients(), HttpStatus.OK);
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<Optional<Patient>> getSinglePatientByPatientId(@PathVariable String patientId) {
        return new ResponseEntity<Optional<Patient>>(patientService.singlePatientByPatientId(patientId), HttpStatus.OK);
    }
}
