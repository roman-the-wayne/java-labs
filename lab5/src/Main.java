//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String tree = "ДЕрево";
    RoundTable t1 = new RoundTable(15.0, tree);
    t1.area();
//-------------------------------------------------------------------------------
    Planet[] Galaxy = new Planet[6];

    Galaxy[0] = new Planet("Меркурий", 4879, 57.9);
    Galaxy[1] = new Planet("Венера", 12104, 108.2);
    Galaxy[2] = new Planet("Земля", 12742, 149.6);
    Galaxy[3] = new Planet("Марс", 6779, 227.9);
    Galaxy[4] = new Planet("Jupiter", 139820, 778.5);
    Galaxy[5] = new Planet("Сатурн", 116460, 1434.0);

    int maxDiameterPlanetId = 0;

    for (int i = 1; i < 6; i++) {
        if (Galaxy[i].diameter > Galaxy[maxDiameterPlanetId].diameter) {
            maxDiameterPlanetId = i;
        }
    }
    int maxDistanceFromSunId = 0;


    for (int i = 1; i < 6; i++) {
        if (Galaxy[i].distanceFromSun > Galaxy[maxDistanceFromSunId].distanceFromSun) {
            maxDistanceFromSunId = i;
        }
    }

    System.out.print("\n" + Galaxy[maxDiameterPlanetId].name);
    System.out.print("\n" + Galaxy[maxDistanceFromSunId].name);


//-------------------------------------------------------------------



    Employee[] employees = new Employee[5];

    employees[0] = new Employee("Roman", Education.BACHELOR);
    employees[1] = new Employee("Roman1", Education.MASTER);
    employees[2] = new Employee("Roman2", Education.PHD);
    employees[3] = new Employee("Roman3", Education.SCHOOL);
    employees[4] = new Employee("Roman4", Education.PHD);


    for (Employee emp : employees) {
        if (emp.education == Education.PHD) {
            System.out.print("\n" + emp.name);
        }
    }

}



























