/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhuconvert;

/**
 *
 * @author User
 */
public class SuhuBenda {
    float suhu;
    
    public SuhuBenda(float suhu){
    
        this.suhu = suhu;
    }
    
    public void convert(){
       float reamur, kelvin, farenheit;
       
      reamur = (4 * this.suhu)/5;
      farenheit = (9 * this.suhu)/5 + 32;
      kelvin = 273.15f + this.suhu;
        
        System.out.println("Suhu Dalam Celcius   : " + this.suhu + "°C");
        System.out.println("Dalam Reamur         : " + reamur + "°R");
        System.out.println("Dalam Farenheit      : " + farenheit + "°F");
        System.out.println("Dalam Kelvin         : " + kelvin + "K");
        if(this.suhu < 0 ){
            System.out.println("Dingin cok");
         }else if(this.suhu > 100){
    
            System.out.println("Panas jir");    
    
         }else{
             System.out.println("Pas Mantep");
          }
    
      
      
    }
    
   
    public void edit(float suhu){
    this.suhu = suhu;
    
    }
    
}
