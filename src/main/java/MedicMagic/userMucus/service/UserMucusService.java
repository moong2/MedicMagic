package MedicMagic.userMucus.service;

import MedicMagic.userCalender.domain.UserCalender;
import MedicMagic.userMucus.domain.UserMucus;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserMucusService {
    void add(UserMucus userMucus);
    @Transactional(readOnly = true)
    UserMucus get(String id, String date);
    @Transactional(readOnly = true)
    List<UserMucus> getAll();
    @Transactional(readOnly = true)
    List<UserMucus> getEachId(String id);
    @Transactional(readOnly = true)
    List<String> getMucusTrue(UserMucus userMucus);
    void deleteAll();
    void deleteEachIdAndDate(String id, String date);
    void update(UserMucus userMucus, String column, boolean object);
    void updateUserCalenderIfMucusIsFalse(UserMucus userMucus, UserCalender userCalender);
}
