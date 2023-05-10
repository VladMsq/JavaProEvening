package homeworkLesson3;

public class HWLesson3 {
    /*
    Создать классы Cat и Dog с наследованием от класса Animal.
    Все животные могут бежать run() и плыть swim(). В качестве параметра каждому методу передается длина препятствия.
    Результатом выполнения действия будет печать в консоль. (Например, метод dog.run(150) сообщает 'Собака пробежала
    150 м.' или 'Собака не может пробежать 150 м.');
    У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
    собака 10 м.). Для этого необходимо использовать соответствующие поля, которые инициализируются через конструктор.
    Кота и собаку необходимо добавить в массив и использовать цикл.
    * Добавить подсчет созданных котов, собак и животных (используя статическое поле).

    поля - это ограничители
     */
    public static void main(String[] args) {
        // add animals to array
        Animals[] animals = {new Dog("Jora"),new Cat("Mars"),new Cat("Mara"),new Dog("Tuzik")};
        // loop them out through the object and call methods
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(300);
            animals[i].swim(800);
            animals[i].run(100);
            animals[i].swim(5);

            System.out.println("Total animals created: " + Animals.getCountAnimals());
            System.out.println("Total cats created: " + Animals.getCountCats());
            System.out.println("Total dogs created: " + Animals.getCountDogs());

        }

    }
}
