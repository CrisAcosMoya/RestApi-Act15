package controller;

import model.MedicalAppointment;
import repositories.MedicalAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/medical-appointments")
public class MedicalAppointmentController {
    @Autowired
    private MedicalAppointmentRepository medicalAppointmentRepository;

    @PostMapping
    public MedicalAppointment createMedicalAppointment(@Valid @RequestBody MedicalAppointment medicalAppointment) {
        return medicalAppointmentRepository.save(medicalAppointment);
    }

    @GetMapping
    public List<MedicalAppointment> getAllMedicalAppointments() {
        return medicalAppointmentRepository.findAll();
    }
}
