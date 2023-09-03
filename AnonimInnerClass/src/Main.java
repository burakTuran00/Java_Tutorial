public class Main
{
    public static void main(String[] args)
    {
        IStudent student = new IStudent()
        {
            @Override
            public void Study() {
                System.out.println("I'm studying");
            }

            @Override
            public void EnterLecture() {
                System.out.println("I'm entering lecture");
            }
        };

        student.Study();
        student.EnterLecture();
        //------------------------------------------------------

        AStudent aStudent = new AStudent("Burak",32)
        {
            @Override
            void toRegister( )
            {
                System.out.println(getName() + " is registering with no of "+getNo());
            }
        };

        aStudent.toRegister();
        aStudent.SayHello();
    }

    public static abstract class AStudent
    {
        private String name;
        private int no;
        public AStudent(String name, int no) {
            this.name = name;
            this.no = no;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        abstract void toRegister();
        public void SayHello()
        {
            System.out.println("Hello...");
        }
    }

    public interface IStudent
    {
        void Study();
        void  EnterLecture();

    }
}