public class Director
{
    StudentBuilder a;
    public Director(StudentBuilder a)
    {
        this.a = a;
    }

    public Student create(){
        return a.addName("Eswar").addId(121).build();
    }
}
