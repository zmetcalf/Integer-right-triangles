public class IntegerRightTrianglesTest
{
    public static void main (String[] args)
    {
        IntegerRightTriangles irt = new IntegerRightTriangles();
        System.out.printf("The most right triangle solutions are %d.\n",
                            irt.findMaxSolutions(1000));
    }
}
