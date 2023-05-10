package no.restaff.schoolmanagement.service;

import no.restaff.schoolmanagement.entity.Classes;

import java.util.List;

public interface MajorService {
    List<Classes> getAllMajor();

    Classes saveMajor(Classes classes);
}
