public class HomeAppliancesStore {

    public static String name;
    public static String address;
    public static int employee;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setEmployee(int employee){
        this.employee = employee;
    }

    public Integer getEmployee(){
        return employee;
    }

    public static void main(String[] args){


        HomeAppliancesStore Alpha = new HomeAppliancesStore();
        Alpha.setName(args[0]);
        Alpha.setAddress(args[1]);
        Alpha.setEmployee(Integer.parseInt(args[2]));


        System.out.println("Name:"+ name +"\tAddress:"+address+"\tEmployee:"+employee);

    }
}
