import java.util.*;
public class Test {
    public static void main(String[] args){
        try{
            System.out.println(doStuff(args));
        }
        catch (Exception e){
            System.out.println("exe");
        }
        doStuff(args);
    }
    static int doStuff(String[] args){
        return Integer.parseInt(args[0]);
    }

}

// Write your code here
// int sum = 0;
// for(int i = 0; i < k; i++){
//     Collections.sort(num);
//     int len = num.size();
//     if(num.get(len-1) % 2 == 0){
//         num.set(len-1, num.get(len-1)/2);
//     }
//     else{
//         num.set(len-1, (int) Math.ceil(num.get(len-1)/2.0));
//     }
// }
// for(int i = 0; i < num.size();i++){
//     sum += num.get(i);
// }
// return sum;


        if(num.isEmpty()) return 0;

                num.sort(Comparator.reverseOrder());
                Queue<Integer> q1 = new LinkedList<>(num);
        Queue<Integer> q2 = new LinkedList<>();
        while(k > 0){
        Integer largest = (q2.isEmpty() || q1.peek() > q2.peek()) ? q1.poll() : q2.poll();
        if(largest == 1L) return num.size();
        if(q1.isEmpty()){
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        }
        q2.add((largest+1)/2);
        k--;
        }
        return q1.stream().mapToInt(Integer::intValue).sum() + q2.stream().mapToInt(Integer::intValue).sum();
        }