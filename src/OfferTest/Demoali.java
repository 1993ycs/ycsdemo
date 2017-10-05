package OfferTest;

        import java.util.Scanner;


public class Demoali {
    static int maxScore(int[] score) {
        int total = 0;
        if (score.length <= 1) {
            return total;
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] == 0) {
//分数为0的时候
                continue;
            } else {
                if (i == 0)
                { //左边不存在的时候
                    total += score[i] * score[i + 1];
                } else if (i == score.length - 1) {
//右边不存在的时候
                    total += score[i] * score[0];
                } else {
                    total += score[i - 1] * score[i] * score[i + 1];
                }   }  }
        return total;
    }
    public static void main(String[] args)
    {  Scanner in = new Scanner(System.in);
        int res;
        int _score_size = 0;
        _score_size = Integer.parseInt(in.next().trim());
        int[] _score = new int[_score_size];
        int _score_item;
        for (int _score_i = 0; _score_i < _score_size; _score_i++)
        {  _score_item = Integer.parseInt(in.next().trim());
            _score[_score_i] = _score_item;  }
        res = maxScore(_score);
        System.out.println(String.valueOf(res));
    }
}