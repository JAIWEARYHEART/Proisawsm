class Student
{
      int rollno,marks;
      void rollno(int rollno)
      {
        this.rollno=rollno;
      }
      void marks(int marks)
      {
       this.marks=marks;
      }
   public static void main(String s[])
   {
     Student st;
     st=new Student();
     st.rollno(110);
     st.marks(50);
   }

}
