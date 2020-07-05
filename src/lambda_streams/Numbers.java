package lambda_streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Numbers {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250,
            2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use streams to compute the results wheever possible.
        System.out.println(nums);

        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside the method calls, or defined them first, then pass them into the methods. give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:
        /* e.g.
        
        added(() -> {});
        
        OR
        
        lambdaAdd = () -> {};
        added(lambdaAdd);
        
        isOdd(() -> {});
        
        OR
        
        lambdaOdd = () -> {};
        isOdd(lambdaOdd);
        etc...
        
        */

        //isOdd
    
        BoolInterface isOddLambda = (a) -> {
            if(nums.get(a)%2 != 0) {
                return true;
            } else {
                return false;
            }
    
        };  
    
        System.out.println(isOddLambda.methodOne(7));
        System.out.println(isOddLambda.methodOne(8));

        //isEven
        BoolInterface isEvenLambda = (a) -> {
            if(nums.get(a) % 2 ==0){
                return true;
            } else {
                return false;
            }
        };

        System.out.println(isEvenLambda.methodOne(7));
        System.out.println(isEvenLambda.methodOne(8));

        //isPrime
        BoolInterface isPrimeLambda = (a) -> {
            if (a<2) {
                return false;
            }
            for (int i = 2; i<nums.get(a); i++){
                if(nums.get(a) % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(isPrimeLambda.methodOne(6)); 
        System.out.println(isPrimeLambda.methodOne(7)); 


        // added method
    
        IntInterface addedLambda = () -> {
            Integer sum = nums.stream().reduce(0, Integer::sum);
            return sum;
        };

        System.out.println(addedLambda.methodOne()); 


        // subtracted method
        IntInterface subLambda = () -> {
            Integer result = nums.stream().reduce(0, (a, b) -> a-b);
            return result;
        };

        System.out.println(subLambda.methodOne()); 


        // multiplied method
        IntInterface multLambda = () -> {
            Integer mult = nums.stream().reduce(1, (a, b) -> a*b);
            return mult;
        };
        System.out.println(multLambda.methodOne());


        // divided method
        IntInterface devLambda = () -> {
            Integer dev = nums.stream().reduce(Integer.MAX_VALUE, (a, b) -> a/b);
            return dev;
        };
        System.out.println(devLambda.methodOne());


        // find max
        IntInterface findMaxLambda = () -> {
            Integer max = (int) Collections.max(nums);
            return max;
        };
        System.out.println(findMaxLambda.methodOne()); 


        // find min
        IntInterface findMinLambda = () -> {
            Integer min = (int) Collections.min(nums);
            return min;
        };
        System.out.println(findMinLambda.methodOne()); 


        // compare method
        CompInterface compLambda = (i, j) -> {
            //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
            if ( nums.get(i) > nums.get(j) ) {
                return 1;
            } else if ( nums.get(i) < nums.get(j) ) {
                return -1;
            } else {
                return 0;
            }
        };
        System.out.println(compLambda.methodOne(2, 8)); 
        System.out.println(compLambda.methodOne(1, 8)); 


        // append method
        AppInterface appLambda = (x) -> {
            nums = new ArrayList<>(nums);
            nums.add(x);
            return nums.get(nums.size()-1);
        };
        System.out.println(appLambda.methodOne(999)); 

    }

    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        if (nums.get(i) % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPrime(int i) {
        //determine if the value at the index i is a prime number.  return true if yes, return false if no.
        if (nums.get(i) < 2) {
            return false;
        }
        for (int p = 2; p < nums.get(i); p++) {
            if (i % p == 0) {
                return false;
            }
        }
        return true;
    }

    static int added() {
        //add all the elements in the list.  return the sum.  
        return nums.stream().reduce(0, Integer::sum);
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
        Integer result = nums.stream().reduce(0, (a, b) -> a-b);
            return result; // I'm not sure this makes sense??
    }

    static int multipled() {
        //multiply all the elements in the list. and return the product.
        return nums.stream().reduce(1, (a, b) -> a * b);
    }

    static int divided() {
        //multiply all the elements in the list. and return the product.
        return 0; // again, not sure what we're supposed to do with this??
    }

    static int findMax() {
        //return the maximum value in the list.
        Integer max = (int) Collections.max(nums);
        return max;
    }

    static int findMin() {
        //return the minimum value in the list.
        return (Integer) Collections.min(nums);
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
        if (nums.get(i) > nums.get(j)) {
            return 1;
        } else if (nums.get(i) < nums.get(j)) {
            return -1;
        } else {

            return 0;
        }
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
        nums.add(n);
        return nums.get(nums.size() - 1);
    }

}

interface BoolInterface {
    public boolean methodOne(int i);
}

interface IntInterface {
    public int methodOne();
}

interface LongInterface {
    public Long methodOne();
}

interface CompInterface {
    public int methodOne(int x, int y);
}

interface AppInterface {
    public int methodOne(int a);
}