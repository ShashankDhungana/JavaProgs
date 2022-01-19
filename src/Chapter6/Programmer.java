package Chapter6;
//Child
class Programmer extends Employee {
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: "+ p.salary);
        System.out.println("Bonus of Programmer is: "+ p.bonus);
        System.out.println("Total Salary for this month is: "+ p.salary + p.bonus + p.dashainbonus);
    }

}
