package edu.epam.day2.task3.service.random;

public class RandomNumbers {

    public int[] GenerateRandomNumbers(int howMany){
        int[] result = new int[howMany];
        for (int i = 0; i<howMany; i++){
            result [i] = (int) (Math.random()*10);
        }
        return result;
    }
}
