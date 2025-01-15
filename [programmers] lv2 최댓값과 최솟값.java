import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        
        //정수 리스트에 데이터 담기
        String[] numsArray = s.split(" ");
        List<Integer> numsList = Arrays.stream(numsArray)
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        
        //최댓값, 최솟값
        String answer = String.format("%d %d", Collections.min(numsList), Collections.max(numsList));
        return answer;
    }
}