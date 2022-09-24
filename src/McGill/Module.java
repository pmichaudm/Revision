package McGill;

public class Module extends Main{
    protected String module_title;
    protected String module_objective;
    static Double module_grade;
    static Double module_points = 0.0;
    static Double module_questions = 0.0;
    public static void Module_Grade() {
        module_grade = (module_points * 100) / module_questions;
        System.out.println("Your grade for this module is: " + module_grade + "%");;
    }
    public static void Timer(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
