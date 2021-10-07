package IllegalTriangleException;

public class Main {
    public static void main(String[] args) {
        try{
            Triangle triangle = new Triangle(5,4,2);
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }

    }

}
