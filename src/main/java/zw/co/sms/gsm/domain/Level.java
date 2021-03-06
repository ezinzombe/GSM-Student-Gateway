package zw.co.sms.gsm.domain;

import zw.co.sms.gsm.constraint.FieldMatch;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by zinzombe on Oct
 */
@Entity
public class Level extends BaseEntityId {

    private String name;
    private List<Course> courses;


    @OneToMany
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
