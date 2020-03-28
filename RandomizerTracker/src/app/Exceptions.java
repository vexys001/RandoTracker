public class Exceptions{
    public class InvalidNameException extends Exception{
        static final long serialVersionUID;

        public InvalidNameException(){
            super("Name of invalid format");
        }
    }

    public class InvalidOccuException extends Exception{
        static final long serialVersionUID;

        public InvalidOccuException(){
            super("Invalid Occurences");
        }
    }
}
