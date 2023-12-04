
        // задача номер 1 присвоить переменным значения и вывести на консоль
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача N1");
        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);

        //  Задача номер 2 увеличить переменные на 4
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача N2");
        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);

        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;
        System.out.println("Задача N3");
        System.out.println("dog=" + dog);
        System.out.println("cat=" + cat);
        System.out.println("paper=" + paper);

        //Задача 4
        //Инициализируйте (присвойте значение) переменную friend значением 19.
        //Увеличьте значение переменной на 2, после чего поделите значение на 7.
        var friend=19;
        System.out.println("Задача N4");
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        //Задача 5
        //Инициализируйте переменную frog значением 3.5.
        //Увеличьте переменную в 10 раз и поделите на 3.5.
        // Добавьте к последнему значению переменной 4.

        System.out.println("Задача N5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        //Задача 6
        //В боксе перед каждым боем спортсменов взвешивают,
        // Это делают для того, чтобы убедиться, что боксеры соответствуют
        // своей весовой категории и бой будет честным.
        //Масса одного боксера — 78.2 кг.
        //Масса второго боксера — 82.7 кг.
        //Подсчитайте и выведите в консоль общую массу двух бойцов.
        //Подсчитайте и выведите в консоль разницу между массами бойцов.
        // Для решения этой задачи используйте тип переменной var.
        System.out.println("Задача N6");
        var weight1= 78.2;
        var weight2= 82.7;
        var sum= weight1+weight2;
        var subtraction=weight2-weight1;;

        System.out.println(sum);
        System.out.println(subtraction);

        //Задача 7
        //Вычислите разницу масс спортсменов, используйте 2 способа:
        // Вычитание из большей массы меньшей.
        // С помощь функции остаток от деления.

        System.out.println("Задача N7");

        subtraction = weight2 - weight1;;
        var remainder = weight2 % weight1;;

        System.out.println(sum);
        System.out.println(remainder);

        /*Задача 8
        1.Решите задачу с помощью функций сложения, вычитания, умножения и деления.
        640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
        то сколько всего работников в компании? Выведите результат задачи в консоль в формате:
        «Всего работников в компании — … человек».
        2.Посчитайте, сколько часов работы должно быть поделено между сотрудниками
        если в компании работает на 94 человека больше. Выведите результат задачи в
        консоль в формате: «Если в компании работает … человек, то всего … часов
        работы может быть поделено между сотрудниками».*/

        System.out.println("Задача N8");
        var generalTime = 640;
        var individualTime = 8;
        var humanCount  = generalTime/individualTime;
        System.out.println("Всего работников в компании — "+ humanCount  +" человек");
        humanCount  = humanCount  + 94;
        individualTime =humanCount *individualTime;


        System.out.println("Если в компании работает "+humanCount +" человек, то всего "+ individualTime + " часов\n" +
                "        работы может быть поделено между сотрудниками" );





    }
}
