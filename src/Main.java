public class Main {
    public static void main(String[] args){
        Phone ph1 = new Phone();
        Phone ph2 = new Phone("+79272796333", "Samsung") ;
        Phone ph3 = new Phone("89277894554","Nokia", 123);

        System.out.println("number: " + ph1.number + " model: " + ph1.model + " weight: "+ph1.weight );
        System.out.println("number: " + ph2.number + " model: " + ph2.model + " weight: "+ph2.weight );
        System.out.println("number: " + ph3.number + " model: " + ph3.model + " weight: "+ph3.weight );

        ph1.receiveCall("Andrey") ;
        ph2.receiveCall("Alex") ;
        ph3.receiveCall("Jon") ;

        System.out.println(ph1.getNumber() );
        System.out.println(ph2.getNumber() );
        System.out.println(ph3.getNumber() );

    }
}