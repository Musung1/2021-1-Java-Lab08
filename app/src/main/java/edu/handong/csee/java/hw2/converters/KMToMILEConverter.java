package edu.handong.csee.java.hw2.converters;
/**
 * /convert km to mile
 */

public class KMToMILEConverter implements Convertible { //convert km to mile

    
    private double value;
    private double convertedValue;
        /**
    * save fromvalue(arg[0]) in int variable
    *@param fromValue is arg[0]
    */
    public void setFromValue(double fromValue){
        value = fromValue;
    };
        /**
    * save conteredValue in other variavle
    * @return return convertedValue
    */
    public double getConvertedValue(){
        return convertedValue;

    };
        /**
     * convert value in other unit 
     */
    public void convert(){
        convertedValue = value/1.6;

    };
}

    
