public class Main {
    public static void main(String[] args) {
        var dog = 3.0;
        dog = dog + 2;
        dog = dog - 1.5;
        var cat = 4;
        cat = cat + 2;
        cat = cat - 1;
        var paper = 5;
        paper = paper + 2;
        paper = paper - 1;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var theirWeight = boxer1 + boxer2;
        System.out.println("Вес двух боксеров " + theirWeight);

        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница двух боксеров составляет " + weightDifference + " кг");
        var weightDifference1 = boxer2 % boxer1;
        System.out.println("Разница двух боксеров составляет " + weightDifference1 + " кг");

        var allOurs = 640;
        var oursForOnePerson = 8;
        var allMembers = allOurs / oursForOnePerson;
        System.out.println("Всего работников в компании - " + allMembers + " человек");

        allMembers = allMembers + 94;
        allOurs = allMembers * 8;
        System.out.println("Если в компании работает " + allMembers + " человека, то всего " + allOurs + " часов должно быть поделено между сотрудниками" );

    }
}