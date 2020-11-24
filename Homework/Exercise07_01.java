import java.util.Scanner;

public class Exercise07_01 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] scoresList = new int[numStudents];

        System.out.print("Enter " + numStudents +  " scores: ");
        for (int i = 0; i < scoresList.length; i++){
           scoresList[i] = input.nextInt();
        }

        int max = sort(scoresList);

        for (int i = 0; i < scoresList.length; i++){
            String grade = assign(scoresList[i], max);
            System.out.println("Student " + i + " score is " + scoresList[i] + " and grade is " + grade);
        }
    }

    public static int sort(int[] scoresList){
        int max = scoresList[0];
        for(int i = 0; i < scoresList.length - 1; i++){
            if (scoresList[i] > max){
                max = scoresList[i];
            }
        }
        return max;
    }

    public static String assign(int score, int max){
        String result = "";

            if (score >= (max - 10)){
                result = "A";
            }
            else if (score >= (max - 20)){
                result = "B";
            }
            else if (score >= (max - 30)){
                result = "C";
            }
            else if (score >= (max - 40)){
                result = "D";
            }
            else {
                result = "F";
            }

        return result;
    }
}
