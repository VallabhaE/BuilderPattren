public abstract class StudentBuilder {
    int id;
    String name;
    int age;
    public StudentBuilder addId(int i){
        id=i;
        return this;
    }
    public StudentBuilder addName(String name){
        this.name=name;
        return this;
    }
    public StudentBuilder addAge(int age){
        this.age=age;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}
