class Employe{
    String name;
    int sal;
    Employe(){
        this("raj Chodhary",0);
    }
    Employe(String name,int sal)
    {
        this.name = name;
        this.sal = sal;
    }
    void display()
    {
        System.out.println("Employe name : "+ name);
        System.out.println("Salary : "+ sal);

    }
    public static void main(String[] args)
    {
        Employe e1,e2;
        e1 = new Employe();
        e2 = new Employe("Gourav Sharma",12000);
        e1.display();
        System.out.println("--------------------------");
        e2.display();
    }

    
}
