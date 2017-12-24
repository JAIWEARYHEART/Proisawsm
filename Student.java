class Student
{
      int rollno,marks, id;
      void rollno(int rollno)
      {
        this.rollno=rollno;
      }
      void marks(int marks)
      {
       this.marks=marks;
      }
      void id(int id)
      {
        this.id=id;
      }
   public static void main(String s[])
   {
     Student st;
     st=new Student();
     st.rollno(110);
     st.marks(50);
     st.id(100)    
   }

}
