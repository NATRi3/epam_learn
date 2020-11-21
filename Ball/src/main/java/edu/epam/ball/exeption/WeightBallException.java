package edu.epam.ball.exeption;

public class WeightBallException extends Exception {

    public WeightBallException(){

    }

    public WeightBallException(String massage){
        super(massage);
    }

    public WeightBallException(String massage, Throwable throwable){
        super(massage,throwable);
    }

    public WeightBallException(Throwable throwable){
        super(throwable);
    }
}
