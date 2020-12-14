public class InstanceVariable {
    //instance variable is exist on class.
    String name = "阿鹏";
    public void inputName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        InstanceVariable instanceName = new InstanceVariable();
        System.out.println(instanceName.name);
        instanceName.inputName("阿鹏");
    }
}
