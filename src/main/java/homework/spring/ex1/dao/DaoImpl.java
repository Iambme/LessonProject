package homework.spring.ex1.dao;

import homework.spring.ex1.model.Human;
import homework.spring.ex1.model.License;
import homework.spring.ex1.repo.HumanRepo;
import homework.spring.ex1.repo.LicenseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaoImpl implements Dao {
    private HumanRepo humanRepo;
    private LicenseRepo licenseRepo;

    public DaoImpl(HumanRepo humanRepo, LicenseRepo licenseRepo) {
        this.humanRepo = humanRepo;
        this.licenseRepo = licenseRepo;
    }

    @Autowired
    public void setHumanRepo(HumanRepo humanRepo) {
        this.humanRepo = humanRepo;
    }
    @Autowired
    public void setLicenseRepo(LicenseRepo licenseRepo) {
        this.licenseRepo = licenseRepo;
    }

    @Override
    public void saveHuman(Human human) {
        humanRepo.save(human);
    }

    @Override
    public Human readHuman(int id) {
        return humanRepo.findById(id).get();
    }

    @Override
    public void saveLicense(int id, License license) {
        Human human = humanRepo.findById(id).get();

        licenseRepo.save(license);
        license.setHuman(human);
        human.setLicense(license);

        humanRepo.save(human);

    }

    @Override
    public void updateLicense(int id) {
        Human human = humanRepo.findById(id).get();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            human.getLicense().setNumber(Integer.parseInt(reader.readLine()));
            humanRepo.save(human);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteHuman(int id) {
        humanRepo.deleteById(id);
    }
}
