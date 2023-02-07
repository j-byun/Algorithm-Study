package solved;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean[] isPrime = new boolean[b+1];   // 배열 만들기

        isPrime[0] = true;      // 0과 1은 제외
        isPrime[1] = true;

        for(int i=2;i<=Math.sqrt(b+1);i++){     // i의 제곱부터 탐색
            for(int j=i*i; j<b+1; j+=i){         // 2의 배수 제거 다음은 3의 배수 제거 ~~
                isPrime[j] = true;              // 소수 아니면 true
            }
        }

        for(int i=a; i<b+1; i++){               // false 인덱스만 출력
            if(isPrime[i] == false)
                System.out.println(i);
        }

    }
}