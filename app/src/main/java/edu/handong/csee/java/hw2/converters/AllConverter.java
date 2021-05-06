package edu.handong.csee.java.hw2.converters;
/**
 *  convert km to m, km to mile, ton to g, ton to kg
 */

public class AllConverter{


    private double value;
    private String originalMeasure;
    private double convertedValue1,convertedValue2,convertedValue3,convertedValue4;

    /**
     * save fromvalue in this.value
     * @param fromValue is arg[0]
     * @return return fromValue
     */

    public AllConverter setFromValue(double fromValue){
        this.value = fromValue;
        return this;
    };
    /**
     * save originalMEasure[arg2[1]] 
     * @param originalMeasure is arg2[1]
     * @return return originalMeasure
     */

    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;
        return this;
    };

    /**
     * convert value and print out 
     */
    public void convertAndPrintOut(){

        convertedValue1 = 1000*value; // km to m
        convertedValue2 = value/1.6; // km to mile
        convertedValue3 = 1000000*value; // ton to g
        convertedValue4 = 1000*value; // ton to kg

        if(originalMeasure.equals("KM")){
            System.out.println(value +" KM to " + convertedValue1 + " M" );
            System.out.println(value +" KM to " + convertedValue2 + " MILE" );

        }

        else{
            if(originalMeasure.equals("TON")){
                System.out.println(value +" TON to " + convertedValue4 + " KG" );
                System.out.println(value +" TON to " + convertedValue3 + " G" );
    
            }
            else{
                System.out.println("AllConverter cannot support the measure!");
            }
        }
    };
}

