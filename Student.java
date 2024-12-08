public class Student {
        private static String universityName="mec";
        private String name;
        private int regno;
        private int marks;
        private long phonenumber;
        public String getName() {
            return name;
        }
        public void setName(String name) throws Exception
        {
            if(name.equals("-------")) throw new Exception();
            this.name = name;
        }
        public int getRegno() {
            return regno;
        }
        public void setRegno(int regno) throws Exception
        {
        if(regno<1) throw new ValidateRegNumberException(regno);
            this.regno = regno;
        }
        public int getMarks()
        {
            return marks;
        }
        public void setMarks(int marks) throws Exception 
        {
            if(marks<0) throw new ValidMarksException(marks);
            this.marks = marks;
        }
        public long getPhonenumber() 
        {
            return phonenumber;
        }
        public void setPhonenumber(long phonenumber) throws Exception
        {
            String s=""+phonenumber;
            if(s.length()<10) throw new ValidPhoneNumberException(phonenumber);
            this.phonenumber = phonenumber;
        }
        
        
    
    }
    class ValidateRegNumberException extends Exception
    {
        public ValidateRegNumberException(int id)
        {
            System.out.println("invalid id "+id);
        }
    }
    //another class
    class ValidMarksException extends Exception
    {
        public ValidMarksException(int marks)
        {
            System.out.println("invalid mark "+marks);
        }
    
    }
    
    class ValidPhoneNumberException extends Exception
    {
    public ValidPhoneNumberException(long phonenumber)
    {
        String s=""+phonenumber;
    System.out.println("Phone number should be in 10 digits and the curren length is "+s.length());
    }
}