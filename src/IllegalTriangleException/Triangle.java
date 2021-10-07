package IllegalTriangleException;

public class Triangle {
    private int a,b,c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if(a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh không thể là số âm");
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
                throw new IllegalTriangleException("Đây không phải 3 cạnh của tam giác");
        }
        System.out.println("Đây là 1 tam giác");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
