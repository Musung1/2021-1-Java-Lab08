package edu.handong.csee.java.hw2.converters;
    /**
    * interface of converters
    */
public interface Convertible { 
    /**
    * save fromvalue(arg[0]) in int variable
    *@param fromValue is arg[0]
    */
    public void setFromValue(double fromValue);
    /**
    * save conteredValue in other variavle
    * @return return convertedValue
    */
    public double getConvertedValue();
    /**
     * convert value in other unit 
     */
    public void convert();

}