package _01_trianing.model.exceptoons;

import lombok.Getter;

public class TxtLineException extends Exception{


    @Getter
    private String errorLine;

    public TxtLineException(String errorLine, Throwable cause){
        super(cause);
        this.errorLine = errorLine;
    }
    @Override
    public String toString(){
        return "Error Line: " +errorLine;
    }

}
