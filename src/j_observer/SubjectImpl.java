package j_observer;

/**
 * @author Tang
 * @Date 2022-12-30-11:16
 */
public class SubjectImpl extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
