public class DemoIncDecr {
    public static void main(String[] args) {
        int number = 8;
        //инкрементация -> увеличаване на стойност
        //+= -> увеличаваме с колкото искаме стойността на дадена променлива
        number += 9; //number = number + 9;
        //++ -> увеличаваме стойността на променливата с 1
        //пост-инкрементация с 1 -> number++
        //пре-инкрементация с 1 -> ++number

        //декрементация -> намаляване на стойност
        //-= -> намялваме с колкото искаме стойността на дадена променлива
        number -= 500; //number = number - 500;
        //-- -> намаляваме стойността на променливата с 1
        //пост-декрементация с 1 -> number--
        //пре-декрементация с 1 -> --number

        //пример за инкрементация с 1
        int age = 26;
        System.out.println(++age);
        System.out.println(age++);
        System.out.println(age);

        //пример за декрементация с 1
        int count = 9;
        System.out.println(--count);
        System.out.println(count--);
        System.out.println(count);
    }
}
