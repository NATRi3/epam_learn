package edu.epam.ball.exeption;

public class FileWayException extends Exception {

    public FileWayException(){

    }

    public FileWayException(String massage){
        super(massage);
    }

    public FileWayException(String massage, Throwable throwable){
        super(massage, throwable);
    }

    public FileWayException(Throwable throwable){
        super(throwable);
    }
}
