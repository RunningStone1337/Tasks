import java.util.Arrays;

public class Answers {
    public static void main(String[] args) {
        System.out.println("1. Остаток от деления равен " + Tasks.remainder(141, 9));//1 task
        System.out.println("2. Площадь заданного треугольника равна  " + Tasks.area(2, 9));//2 task
        System.out.println("3. Общее число ног в хозяйстве фермера равно " + Tasks.legs(5, 1, 4));//3 task
        System.out.println("4. Ставка может быть прибыльной - " + Tasks.profit(0.9, 5, 1));//4 task
        System.out.println("5. Требуемая операция для получения числа - " + Tasks.operations(60, 5, 12));//5 task
        System.out.println("6. Код введённого символа в таблице - " + Tasks.asci('*'));//6 task
        System.out.println("7. Сумма чисел заданного ряда - " + Tasks.summary(7));//7 task
        System.out.println("8. Максимальная длина третьей стороны треугольника - " + Tasks.maxthird(17, 8));//8 task
        int[] Arr = {1, 2, 7};
        System.out.println("9. Сумма кубов чисел массива - " + Tasks.sumofcubes(Arr));//9 task
        System.out.println("10. Сумма a по b раз + a делится без остатка на c - " + Tasks.abcmath(3, 3, 5));//10 task
        String str = "MILF-man I love frogs";
        System.out.println("11. Преобразованная строка '"+str+"' будет иметь вид " + Tasks.multychars(str, 3));//11 task
        int[] NewArr = {12, 51, 8, 44};
        System.out.println("12. Разница между наибольшим и наименьшим числами массива будет равна " + Tasks.massdiff(NewArr));//12 task
        int[] DivArr = {12, 5, 8, 48, 7};
        System.out.println("13. Среднее значение элементов массива является целым числом - " + Tasks.massdiv(DivArr));//13 task
        int[] CumArr = {12, -3, 4, 8};
        System.out.println("14. Кумулятивный массив из заданного массива - " + Arrays.toString(Tasks.cumsum(CumArr)));//14 task
        System.out.println("15. Количество десятичных значащих цифр в числе - " + Tasks.decnum("535.000"));//15 task
        System.out.println("16. Число Фибоначчи для заданного числа - " + Tasks.fibonacci(25));//16 task
        System.out.println("17. Введённая строка является почтовым индексом - " + Tasks.post("1323"));//17 task
        System.out.println("18. Введённые строки являются странными - " + Tasks.isstrange("sdbdff", "f33bss"));//18 task
        System.out.println("19. Суффиксная функция возвращает " + Tasks.suffix("kitvxtycat", "-cat") + ", а префиксная - " + Tasks.prefix("supercar", "super-"));//19 task
        System.out.println("20. Функция подсчёта полей при заданном ходе вернёт " + Tasks.box(5));//20 task
        System.out.println("21. Квадратное уравнение с заданными коэффициентами имеет " + Tasks.squaresolution(1, -2, 52) + " действительных решений");//21 task
        System.out.println("22. Позиция второго вхождения zip в строку - " + Tasks.zippo("zippo? your father zip zippers looking for you "));//22 task
        System.out.println("23. Число является совершенным - " + Tasks.isperfect(8128));//23 task
        System.out.println("24. Возвращённая строка после преобразования - " + Tasks.strmaker("Каждый охотник желает знать"));//24 task
        System.out.println("25. Введённая строка является допустимым шестнадцатиричным кодом - " + Tasks.ishex("#9Fc24A"));//25 task
        int[] mas1 ={1,5,8,8,6};
        int[] mas2 ={5,9,84,3,3};
        System.out.println("26. Введённые массивы содержат одинаковое число уникальных элементов - " + Tasks.samemas(mas1,mas2));//26 task
        System.out.println("27. Введённое число является числом Капрекара - " + Tasks.kaprekara(45));//27 task
        System.out.println("28. Самая длинная последовательность нулей - " + Tasks.zeros("00110000000010101010"));//28 task
        System.out.println("29. Следующее простое число после заданного - " + Tasks.issimple(85));//29 task
        System.out.println("30. Это прямоугольный треугольник - " + Tasks.istriangle(5, 4, 7));//30 task
        System.out.println("31. Преобразованный текст будет иметь вид - " + Tasks.textmaker(16,"Hi my name is Van and Im an artist Im performance artist"));//31 task
        System.out.println("32. Кластеры будут иметь вид " + Arrays.toString(Tasks.brakets("((()))")));//32 task
        System.out.println("33. Строка после преобразования в \"змею\" будет иметь вид "+ Tasks.snake("getToTheChoppa")+", а в \"верблюда\" - "+ Tasks.camel("if_it_bleeds_we_can_kill_it"));//33 task
        double[] work= {9, 19, 30, 1.8};
        System.out.println("34. Оплата за этот день составит "+ Tasks.payment(work));//34 task
        System.out.println("35. Ваш индекс массы тела составлет "+ Tasks.imt(43, 182));//35 task
        System.out.println("36. Мультипликативное постоянство введённого числа - "+ Tasks.multiplicate(999));//36 task
        System.out.println("37. Звёздная стенография введённой строки - "+ Tasks.starmult("333rrrrffffwf222222"));//37 task
        String punch1="never gonna give you up", punch2="never gonna let you down";
        System.out.println("38. Введённые строки рифмуются - "+ Tasks.ispunch(punch1,punch2));//38 task
        System.out.println("39. Цифра повторяется в первом числе трижды, а во втором дважды - "+ Tasks.repeater(12335, 5483378));//39 task
        System.out.println("40. Число книг в строке - "+ Tasks.books("azywabbcattta",'a'));//40 task
        int[] arr = {105, 8112, -8109, 0};
        System.out.println("41. Зашифрованное послание будет иметь вид - "+ Arrays.toString(Tasks.encrypt("Hello"))+", а расшифрованное - "+ Tasks.decrypt(arr));//41 task
        System.out.println("42. Выбранная фигура может двигаться в указанный квадрат - "+ Tasks.chessmats("ферзь", "f6","q6"));//42 task
        System.out.println("43. Введённое слово может быть завершено - "+ Tasks.canbedone("kamru","kruty"));//43 task
        int[] intarr ={16,28,32};
        System.out.println("44. Число, возвращаемое функцией сложения и умножения чисел - "+ Tasks.summult(intarr));//44 task
        String[] strings = {"ty","boy","cow","bat", "sony","ponyyyy"};
        System.out.println("45. Слова, имеющие те же гласные, что и первое слово - "+ Arrays.toString(Tasks.vowels(strings)));//45 task
        System.out.println("46. Введённое число является банковской картой - "+ Tasks.cardvalid("1234567890123456"));//46 task
        System.out.println("47. Введённое число по-английски - "+ Tasks.numtoword(9438));//47 task
        System.out.println("47. Введённое число по-русски - "+ Tasks.numtowordr(9438));//47 task
        //System.out.println("48.  "+ ());//48 task
        System.out.println("49. Исправленная строка будет иметь вид "+ Tasks.correcttitle("it IS weDnEsDaY, my dudES!"));//49 task
        System.out.println("50. Многоcтрочная прямоугольная строка для заданного \"шестиугольного\" числа - "+ Tasks.hexnums(37+24));//50 task
        //System.out.println("51. Число Белла для введённого массива - "+ Tasks.bell());//51 task
        System.out.println("52. Слово на свинском латинском - "+ Tasks.pigword("weather"));//52 task
        System.out.println("52. Предложение на свинском латинском - "+ Tasks.pigoffer("it is wednesday, my dudes!"));//52 task
        System.out.println("53. Введённая строка является допустимым RGB значением - "+ Tasks.rgb(("rgba(0,6,253, 0)")));//53 task
        System.out.println("54. Возвращённый URL - "+ Tasks.url("https://edabit.com?a=1&b=4&a=2&a=2&b=2&af=24"));//54 task
        System.out.println("55. Газетный заголовок в виде хештегов - "+ Arrays.toString(Tasks.tags("Hi, my name is Eminem!")));//55 task
        System.out.println("56. Следующее число Улама - "+ Tasks.ulam(206));//56 task
        System.out.println("57. Самая длинная уникальная подстрока в строке - "+ Tasks.unicstr("afafabcabcabdr"));//57 task
        System.out.println("58. Арабские в римские числа - "+ Tasks.toroma(3559));//58 task
        System.out.println("59. Введённая формула является правильной - "+ Tasks.formula("16+13=29"));//59 task
        System.out.println("60. Введённое число является палиндромом или его потомком - "+ Tasks.ispalindrome(11211230));//60 task
    }
}
