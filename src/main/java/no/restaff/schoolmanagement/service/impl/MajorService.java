package no.restaff.schoolmanagement.service.impl;

import no.restaff.schoolmanagement.entity.Classes;
import no.restaff.schoolmanagement.repository.MajorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorService implements no.restaff.schoolmanagement.service.MajorService {
    private MajorRepository majorRepository;
    public MajorService(MajorRepository majorRepository) {
        super();
        this.majorRepository = majorRepository;
    }
    @Override
    public List<Classes> getAllMajor() {
        return majorRepository.findAll();
    }
    @Override
    public Classes saveMajor(Classes classes) {
        return majorRepository.save(classes);
    }
}
