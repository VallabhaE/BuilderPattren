public class Student {
    int id;
    String name;
    int age;
    public Student(StudentBuilder a){
        id = a.id;
        name = a.name;
        age = a.age;
    }
    public String S(){
        return id + " " + name + " " + age;
    }

}
