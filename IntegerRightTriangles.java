import java.lang.Math;

public class IntegerRightTriangles
{
    public IntegerRightTriangles() {
    }

    public int findMaxSolutions(int upperValue) {
        int mostSolutions = 0;
        int maximizedNum = 0;
        int solutionCounter = 0;

        for(int i = 3; i <= upperValue; i++) {
            for(int a = 1; a < (i / 2); a++) {
                for(int b = 1; b < (i / 2); b++) {
                    for(int c = 1; c < (i / 2); c++) {
                        if(checkSum(a, b, c, i)) {
                            if(checkIfRightTriangle(a, b, c)) {
                                solutionCounter++;
                            }
                        }
                    }
                }
            }
            if(solutionCounter > mostSolutions) {
                mostSolutions = solutionCounter;
                maximizedNum = i;
            }
            solutionCounter = 0;
        }
        return maximizedNum;
    }

    private boolean checkSum(int a, int b, int c, int checkVal) {
        if(a + b + c == checkVal) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean checkIfRightTriangle(int a, int b, int c) {
        double testC = Math.pow((double) a, 2) + Math.pow((double) b, 2);
        if(Math.sqrt(Math.round(testC)) == c) {
            return true;
        }
        else {
            return false;
        }
    }
}
