public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }
public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
}
public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

}
public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
}
public static void task4 () {
            System.out.println("Задача 4");
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
}

public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
}
public static void task6 () {
        System.out.println("Задача 6");
        var boxerWheight1 = 78.2;
        var boxerWheight2 = 82.7;
        var totalWheightBoxer = boxerWheight1 + boxerWheight2;
        System.out.println("Общий вес двух бойцов " + totalWheightBoxer + " кг");
        var differenceWheight = boxerWheight1 - boxerWheight2;
        System.out.println("Разница в весе между двумя бойцами " + differenceWheight + " кг");
}
public static void task7 () {
        System.out.println("Задача 7");
        var boxerWheight1 = 78.2;
        var boxerWheight2 = 82.7;
        var differenceWheight = boxerWheight2 - boxerWheight1;
        System.out.println("Разница веса бойцов " + differenceWheight + " кг!");
        var differenc = boxerWheight2 % boxerWheight1;
        System.out.println("Разница веса спортсменов " + differenc + " кг!");
}
public static void task8 () {
        System.out.println("Задача 8");
        var openingHours = 640;
        var workingHours = 8;
        var employeeCompany = openingHours / workingHours;
        System.out.println("Всего работников в компании " + employeeCompany + " человек");
        var additionalEmployees = 94;
        var totalEmployees = employeeCompany + additionalEmployees;
        var timeEmployee = openingHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + timeEmployee + " часа работы может быть поделено между сотрудниками");


}
}