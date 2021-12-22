두 정수 사이의 합(4)
//나의 풀이

class Solution {
    public long solution(int a, int b) {
    
    long answer = 0;

        if (a>b) {
            for (; b <= a; b++) {
                answer += b;
            }
        }
        else if (a<b) {
            for (; a <= b; a++) {
                answer += a;
            }
        }
        else {return a;}

        return answer;
    }
}

//등차수열을 사용한 풀이

class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
