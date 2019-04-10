package method.references;

public class MethodReferenceTest {
    public static void main(String[] a){
        GreetingService service;
        service = new HelloService()::sayHello;
        System.out.println(service.sayGreeting("James"));
        service = new HelloService()::sayHello;
        System.out.println(service.sayGreeting("James1"));
        service = WelcomeService::sayWelcome;
        System.out.println(service.sayGreeting("James2"));
        service = String::new;

        getGreetingService(new HelloService()::sayHello,"James3");
        getGreetingService(WelcomeService::sayWelcome,"James4");
        getGreetingService(String::new,"James5");

    }

    public static void getGreetingService(GreetingService service,String name){
        System.out.println(service.sayGreeting(name));
    }
}
