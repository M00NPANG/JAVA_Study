package CodingTest.Programmers.LV0;

public class Lessons120802 {
    public static void main(String[] args) {
        Solution sc = new Solution();
        sc.solution(2,3);
        System.out.println(sc.solution(2,3));

    }
}

class Solution {
    public int solution(int num1, int num2)
    {
        int answer = -1;
        if (num1 >= -50000 && num1 <= 50000)
        {
            if(num2 >= -50000 && num2 <= 50000)
            {
              answer = num1 + num2;
            }
        }
        return answer;
    }
}