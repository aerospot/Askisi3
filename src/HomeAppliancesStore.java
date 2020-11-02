public class HomeAppliancesStore {
    static String name;
    static String address;
    static int employee;

    public static void main(String[] args){
        name = args[0];
        address = args[1];

        System.out.printf("To onoma tis eterias einai: %s\n", name);
        System.out.printf("I diefthinsi tis eterias einai: %s\n", address);
        System.out.printf("I ipalili tis eterias einai: %d\n\n", employee);

        if (name == null){
            System.out.println("Ipirje lathos me tin metavliti 'name' dioti eihe tin timi null");
        }
        if (address == null){
            System.out.println("Ipirje lathos me tin metavliti 'address' dioti eihe tin timi null\n");
        }

    }
}

