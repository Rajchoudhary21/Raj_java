class StudentTest {

    String name;
    int age;
     StudentTest()
     {
        this("Raj",19);
     }
     StudentTest(String name,int age)
     {
        this.name = name;
        this.age = age;
     }
      void display()
      {
        System.out.println("Student Name : "+name);
        System.out.println("Age : "+age);
      }
      public static void main(String[] args)
      {
        StudentTest s1,s2;
        s1 = new StudentTest();
        s2 = new StudentTest("gourav",19);
        s1.display();
        System.out.println("------------------------");
        s2.display();
      }

    
}
