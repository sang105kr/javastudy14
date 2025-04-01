package day9.question.q2;

public class SumOfSquares {
  int sumWhile(int N) {
    int i;  //반복 제어 변수
    int result; // 결과값

    i = 0;
    result = 0;

    if(N > 0) {
      while (i <= N) {
        result = result + i * i;
        i++;
      }
    }
    return result;
  }

  int sumRecursive(int N){
    if(N == 1) return 1;
    return sumRecursive(N - 1) + N * N;
  }

}
