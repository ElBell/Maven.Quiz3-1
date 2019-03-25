package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs = new ArrayList<>();
    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab;
            }
        }
        throw new UnsupportedOperationException();
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Collections.sort(labs);
        for (Lab lab : labs) {
            string.append(lab.getName()).append(" > ").append(lab.getStatus()).append("\n");
        }
        return string.toString().substring(0, string.toString().length() -1);
    }
}
