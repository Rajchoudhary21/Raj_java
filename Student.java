class Student {
    String name;
    Student(String name)
    {
      this.name = name;
    }
    void display()
    {
        System.out.print("Student name : "+name);
    }

public static void main(String[] args)
{
  Student s1 = new Student("Raj");
  s1.display();
  
}
}