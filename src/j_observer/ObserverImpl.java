package j_observer;

/**
 * @author Tang
 * @Date 2022-12-30-11:18
 */
public class ObserverImpl extends Observer {

    private String name;
    private SubjectImpl subject;

    public ObserverImpl(String name, SubjectImpl subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {

        System.out.println("观察者" + this.name + "观察到的新状态：" + subject.getSubjectState());
    }
}
