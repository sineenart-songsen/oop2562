
public class Employee {

    public String prefix, name, sex;
    public int age;

    public void checkStok() {
        System.out.println("checkstok");
    }

    public void sellProduct() {
        System.out.println("sellproduc");
    }

    public void purchasingProduets() {
        System.out.println("purchasingproduets");
    }

    public void showData() {
        System.out.println("Prefix" + prefix);
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Sex" + sex);
    }

    public static void main(String[] args) {
        Employee k1 = new Employee();
        k1.prefix = "Mr";
        k1.name = "susat chayan";
        k1.age = 21;
        k1.sex = "male";
        k1.showData();
        k1.checkStok();

    }

}
