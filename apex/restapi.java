public class MyFirst {
    public static void ApexMethod(){
      system.debug('Test');
         Http http = new Http();
HttpRequest request = new HttpRequest();

request.setMethod('GET');
request.setEndpoint('https://reqres.in//api/users?page=2');

HttpResponse response = http.send(request);
         system.debug(response);
    }
    
   
}