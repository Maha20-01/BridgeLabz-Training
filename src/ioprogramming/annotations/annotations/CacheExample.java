package ioprogramming.annotations.annotations;
import java.lang.annotation.*;   // Import annotation classes
import java.lang.reflect.*;     // Import reflection classes like Method
import java.util.HashMap;       // Import HashMap for caching results

@Retention(RetentionPolicy.RUNTIME)   // Annotation available at runtime
@Target(ElementType.METHOD)           // Annotation can only be applied to methods
@interface CacheResult{}



class Calculator{

    // Apply caching annotation
    @CacheResult
    public int square(int n){

        // Message to show when computation actually happens
        System.out.println("Computing...");

        // Return square of the number
        return n*n;
    }
}

public class CacheExample{

    static HashMap<Integer,Integer> cache = new HashMap<>();

    public static void main(String[] args) throws Exception{

        Calculator calc = new Calculator();

        Method m = Calculator.class.getMethod("square",int.class);

        // Input value whose square needs to be computed
        int input = 5;

        /*
           Check if result already exists in cache
        */
        if(cache.containsKey(input)){

            // If present, return cached result
            System.out.println("Cached Result: " + cache.get(input));

        }else{

            /*
               If not present, invoke method dynamically
               using reflection
            */
            int result = (int)m.invoke(calc,input);

            // Store computed result in cache
            cache.put(input,result);

            // Print computed result
            System.out.println("Computed Result: " + result);
        }
    }
}
