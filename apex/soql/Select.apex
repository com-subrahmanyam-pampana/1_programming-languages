public class MySecondClass {
public  void ApexMethod(){
     List<Course__c> cources=[SELECT Name,Course_Completed__c FROM Course__c];
         for(Course__c cource:cources){
             System.debug('cource :' +cource.Name);
         }
    }
}