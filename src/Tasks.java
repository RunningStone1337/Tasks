import java.text.DecimalFormat;
import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("1. Остаток от деления равен " + remainder(141, 9));//1 task
        System.out.println("2. Площадь заданного треугольника равна  " +area(2, 9));//2 task
        System.out.println("3. Общее число ног в хозяйстве фермера равно " + legs(5, 1, 4));//3 task
        System.out.println("4. Ставка может быть прибыльной - " + profit(0.9, 5, 1));//4 task
        System.out.println("5. Требуемая операция для получения числа - " + operations(60, 5, 12));//5 task
        System.out.println("6. Код введённого символа в таблице - " + asci('*'));//6 task
        System.out.println("7. Сумма чисел заданного ряда - " + summary(7));//7 task
        System.out.println("8. Максимальная длина третьей стороны треугольника - " + maxthird(17, 8));//8 task
        int[] Arr = {1, 2, 7};
        System.out.println("9. Сумма кубов чисел массива - " + sumofcubes(Arr));//9 task
        System.out.println("10. Сумма a по b раз + a делится без остатка на c - " + abcmath(3, 3, 5));//10 task
        String str = "MILF-man I love frogs";
        System.out.println("11. Преобразованная строка '"+str+"' будет иметь вид " + multychars(str, 3));//11 task
        int[] NewArr = {12, 51, 8, 44};
        System.out.println("12. Разница между наибольшим и наименьшим числами массива будет равна " + massdiff(NewArr));//12 task
        int[] DivArr = {12, 5, 8, 48, 7};
        System.out.println("13. Среднее значение элементов массива является целым числом - " + massdiv(DivArr));//13 task
        int[] CumArr = {12, -3, 4, 8};
        System.out.println("14. Кумулятивный массив из заданного массива - " + Arrays.toString(cumsum(CumArr)));//14 task
        System.out.println("15. Количество десятичных значащих цифр в числе - " + decnum("535.0001"));//15 task
        System.out.println("16. Число Фибоначчи для заданного числа - " + fibonacci(7));//16 task
        System.out.println("17. Введённая строка является почтовым индексом - " + post("13123"));//17 task
        System.out.println("18. Введённые строки являются странными - " + isstrange("sdbdff", "f33bsc"));//18 task
        System.out.println("19. Суффиксная функция возвращает " + suffix("kitvxtycat", "-cawt") + ", а префиксная - " + prefix("supercar", "super-"));//19 task
        System.out.println("20. Функция подсчёта полей при заданном ходе вернёт " + box(6));//20 task
        System.out.println("21. Квадратное уравнение с заданными коэффициентами имеет " + squaresolution(1, 2, -52) + " действительных решений");//21 task
        System.out.println("22. Позиция второго вхождения zip в строку - " + zippo("zippo? your father zipper looking for you "));//22 task
        System.out.println("23. Число является совершенным - " + isperfect(496));//23 task
        System.out.println("24. Возвращённая строка после преобразования - " + strmaker("Каждый охотник желает знать"));//24 task
        System.out.println("25. Введённая строка является допустимым шестнадцатиричным кодом - " + ishex("#19Fc46A"));//25 task
        int[] mas1 ={1,5,8,8,6};
        int[] mas2 ={5,9,84,3};
        System.out.println("26. Введённые массивы содержат одинаковое число уникальных элементов - " + samemas(mas1,mas2));//26 task
        System.out.println("27. Введённое число является числом Капрекара - " + kaprekara(9));//27 task
        System.out.println("28. Самая длинная последовательность нулей - " + zeros("001000"));//28 task
        System.out.println("29. Следующее простое число после заданного - " + issimple(32));//29 task
        System.out.println("30. Это прямоугольный треугольник - " + istriangle(5, 4, 3));//30 task
        System.out.println("31. Преобразованный текст будет иметь вид - " + textmaker(11,"Hi my name is Van and Im an artist Im performance artist"));//31 task
        System.out.println("32. Кластеры будут иметь вид " + Arrays.toString(brakets("((())))((()()())")));//32 task
        System.out.println("33. Строка после преобразования в \"змею\" будет иметь вид "+ snake("getToTheChoppa")+", а в \"верблюда\" - "+camel("if_it_bleeds_we_can_kill_it"));//33 task
        double[] work= {9, 19, 155.8, 1.26};
        System.out.println("34. Оплата за этот день составит "+ payment(work));//34 task
        System.out.println("35. Ваш индекс массы тела составлет "+ imt(64, 182));//35 task
        System.out.println("36. Мультипликативное постоянство введённого числа - "+ multiplicate(3999989));//36 task
        System.out.println("37. Звёздная стенография введённой строки - "+ starmult("333rrrrffffwf222222"));//37 task
        String punch1="never gonna give you up", punch2="never gonna let you down";
        System.out.println("38. Введённые строки рифмуются - "+ ispunch(punch1,punch2));//38 task
        System.out.println("39. Цифра повторяется в первом числе трижды, а во втором дважды - "+ repeater(123335, 5483378));//39 task
        System.out.println("40. Число книг в строке - "+ books("acaafffcaacaca",'a'));//40 task
        int[] arr = {105, 8112, -8109, 0, -76, 72, -7, 21, -17, -69, 84, 3, -8, -79, 78, 7, -8, -11, 3, 13, -82, 25, 58, -71, -12, 65, -65, 78, 7, -8, -11, 3, 13, -82, 25, -25, 76, -11, 17, -11, -2, -57, -12, 65, -65, 78, 7, -8, -11, 3, 13, -82, 22, -22, 87, -14, 11, -12, -72, 69, 19, -4, -2, -17, -65, 68, 5, 7, -68, -12, 65, -65, 78, 7, -8, -11, 3, 13, -82, 23, -11, -12, 84, 3, -8, -79, 78, 7, -8, -11, 3, 13, -82, 20, 1, 62, -71, -12, 79, -1, -9, -69, 87, -14, 11, -12, -72, 67, 5, -3, 0, 14, -14, -57, -12, 65, 13, -10, -68, 65, -65, 76, -11, -52, 52, -52, 52, -52, 69, -11, -2, -69, 83, -4, -11, -3, -51};
        System.out.println("41. Зашифрованное послание будет иметь вид - "+ Arrays.toString(encrypt("i’ll have two number 9s, a number 9 large, a number 6 with extra dip, a number 7, two number 45s, one with cheese, and a la-a-a-rge soda."))+", а расшифрованное - "+ decrypt(arr));//41 task
        System.out.println("42. Выбранная фигура может двигаться в указанный квадрат - "+ chessmats("король", "f6","g6"));//42 task
        System.out.println("43. Введённое слово может быть завершено - "+ canbedone("kamru","karakum"));//43 task
        int[] intarr ={36, 5, 71, 7438, 1, 9};
        System.out.println("44. Число, возвращаемое функцией сложения и умножения чисел - "+ summult(intarr));//44 task
        String[] strings = {"toy","boy","cow","bat", "sony","ponyyyy"};
        System.out.println("45. Слова, имеющие те же гласные, что и первое слово - "+ Arrays.toString(vowels(strings)));//45 task
        System.out.println("46. Введённое число является банковской картой - "+ cardvalid("1234567890123452"));//46 task
        System.out.println("47. Введённое число по-английски - "+ numtoword(666));//47 task
        System.out.println("47. Введённое число по-русски - "+ numtowordr(666));//47 task
        //System.out.println("48.  "+ ());//48 task
        System.out.println("49. Исправленная строка будет иметь вид "+ correcttitle("it IS weDnEsDaY, my dudES!"));//49 task
        System.out.println("50. Многоcтрочная прямоугольная строка для заданного \"шестиугольного\" числа - "+ hexnums(37+24+30));//50 task
        //System.out.println("51. Число Белла для введённого массива - "+ bell());//51 task
        System.out.println("52. Слово на свинском латинском - "+ pigword("weather"));//52 task
        System.out.println("52. Предложение на свинском латинском - "+ pigoffer("it is wednesday, my dudes!"));//52 task
        System.out.println("53. Введённая строка является допустимым RGB значением"+ rgb(("rgb(0,0,0)"));//53 task
        //System.out.println("54. "+ ());//54 task
        //System.out.println("55. "+ ());//55 task
        //System.out.println("56. "+ ());//56 task
        //System.out.println("57. "+ ());//57 task
        //System.out.println("58. "+ ());//58 task
        //System.out.println("59. "+ ());//59 task
        //System.out.println("60. "+ ());//60 task
    }
    public static double remainder(double a, double b) //1 task
    {
            return a % b;
    }
    public static double area(double a, double b) //2 task
    {
        return a * b/2;
    }
    public static int legs(int a, int b, int c) //3 task
    {
        return a *2+b*4+c*4;
    }
    public static boolean profit(double prob, int prize, int pay) //4 task
    {
        return prob * prize > pay;
    }
    public static String operations(int N, int a, int b)//5 task
    {
        if (a * b == N)
            return "умножение";
        else if (a + b == N)
            return "сложение";
        else if (a - b == N)
            return "вычитание";
        else if (a / b == N)
            return "деление";
        return "отсутствует";
    }
    public static int asci(char a)//6 task
    {
        return a;
    }
    public static int summary(int a)//7 task
    {
        int sum =0;
        for (int i = 0; i<=a; i++)
        {
            sum = sum+i;
        }
        return sum;
    }
    public static int maxthird(int a, int b)//8 task
    {
       return a+b-1;
    }
    public static int sumofcubes(int[] Arr)//9 task
    {
        int sum =0;
        for (int j : Arr) {
            sum = sum + j * j * j;
        }
        return sum;
    }
    public static boolean abcmath(int a, int b, int c)//10 task
    {
        return ((a * b + a) % c) == 0;
    }
    public static String multychars(String strsource, int reps)//11 task
    {
        char[] temp = strsource.toCharArray();
        char[] ret = new char[strsource.length() * reps];
        int n = 0;
        for (int i = 0; i < strsource.length(); i++) {
            for (int k = 0; k < reps; k++) {
                ret[n] = temp[i];
                n++;
            }
        }
        return new String(ret);
    }
    public static int massdiff(int[] arr)//12 task
    {
        int max = -1999999999;
        int min = 1665466399;
        int res;
        for (int j : arr) {
            if (j >= max) max = j;
            if (j <= min) min = j;
        }
        res=max-min;
        return res;
        }
    public static boolean massdiv(int[] arr)//13 task
    {
        int sum =0;
        for (int j : arr) {
            sum += j;
        }
        return sum % arr.length == 0;
    }
    public static int[] cumsum(int[] arr)//14 task
    {
        int[] cumarr = new int[arr.length];
        int sum =0;
        for (int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
            cumarr[i] = sum;
        }
        return cumarr;
    }
    public static int decnum(String str)//15 task
    {
       int num =0;
       char[] arr = new char[str.length()];
       for (int i =0; i<arr.length; i++){
           arr[i] = str.charAt(i);
       }
       for (int i=0; i<arr.length; i++)
       {
            if (arr[i]=='.')
            {
                int k =arr.length-1;
                while (arr[k]=='0')
                {
                    num++;
                    k--;
                }
                return (arr.length-num-i-1);
            }
       }
       return 0;
    }
    public static int fibonacci(int val)//16 task
    {
        if (val > 1)
    {
        int[] arr = new int[val];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < val; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[val - 1];
    }
        return 0;
    }
    public static boolean post(String str)//17 task
    {
        char[] arr = new char[str.length()];
        for (int i =0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }
        if (arr.length!=5) return false;
        for (int i = 0; i < 5; i++)
        {
            if (!Character.isDigit(arr[i])) return false;
        }
        return  true;
    }
    public static boolean isstrange(String str1, String str2)//18 task
    {
        char[] arr1 = new char[str1.length()];
        for (int i =0; i<arr1.length; i++){
            arr1[i] = str1.charAt(i);
        }
        char[] arr2 = new char[str2.length()];
        for (int i =0; i<arr2.length; i++){
            arr2[i] = str2.charAt(i);
        }
        if (arr1.length==0&&arr2.length==0) return  true;
        if (arr1.length==0&&arr2.length!=0) return  false;
        if (arr1.length!=0&&arr2.length==0) return  false;
        return arr1[0] == arr2[arr2.length - 1] && arr1[arr1.length - 1] == arr2[0];
    }
    public static boolean prefix(String str1, String str2)//19 task
    {
        char[] arr1 = new char[str1.length()];
        for (int i =0; i<arr1.length; i++){
            arr1[i] = str1.charAt(i);
        }
        char[] arr2 = new char[str2.length()];
        for (int i =0; i<arr2.length; i++){
            arr2[i] = str2.charAt(i);
        }
        for (int i =0; i<arr2.length-1; i++)
        {
            if (arr1[i]!=arr2[i]) return false;
        }
        return arr2[arr2.length - 1] == '-';
    }
    public static boolean suffix(String str1, String str2)//19 task
    {
        char[] arr1 = new char[str1.length()];
        int i =0;
        for (; i<arr1.length; i++){
            arr1[i] = str1.charAt(i);
        }
        char[] arr2 = new char[str2.length()];
        int k =0;
        for (; k<arr2.length; k++){
            arr2[k] = str2.charAt(k);
        }
        for (k -=1, i-=1; k>0;i--, k--)
        {
            if (arr1[i]!=arr2[k]) return false;
        }
        return arr2[0] == '-';
    }
    public static int box(int val)//20 task
    {
        int ret =0;
        for (int i =0; i<val; i++){
            if (i%2==0) ret+=3;
            else ret-=1;
        }
        return ret;
    }
    public static int squaresolution(int a, int b, int c)//21 task
    {
        double D =Math.pow(b,2)-4*a*c;
        if (D<0) return 0;
        else if (D==0) return 1;
        else if (D>0) return 2;
        return 0;
    }
    public static int zippo(String str)//22 task
    {
        int num_of_zip =0;
        char[] arr = new char[str.length()];
        for (int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }
        for (int i=0; i<arr.length-2; i++){
            if (arr[i]=='z'&&arr[i+1]=='i'&&arr[i+2]=='p') num_of_zip++;
            if (num_of_zip==2&&arr[i]=='z') return i+1;
        }
        return -1;
    }
    public static boolean isperfect(int val)//23 task
    {
        int sum=0;
        for (int i=1; i<val; i++){
            if (val%i==0) sum+=i;
        }
        return sum == val;
    }
    public static String strmaker(String str)//24 task
    {
        char temp;
        char[] arr = new char[str.length()];
        if (str.length()<2) return "несовместимо";
        for (int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }
        if (arr[0]==arr[arr.length-1])return "два - это пара";
        temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1]= temp;
        return new String(arr);
    }
    public static boolean ishex(String str)//25 task
    {
        char[] arr = new char[str.length()];
        if (arr.length!=7&&arr[0]!='#') return false;
        for (int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }
        for (int i=1; i< arr.length; i++)
        {
            if (!Character.isDigit(arr[i])&&(arr[i]!='\u0041')&&(arr[i]!='\u0042')&&(arr[i]!='\u0043')&&(arr[i]!='\u0044')&&(arr[i]!='\u0045')&&(arr[i]!='\u0046'))return false;
        }
        return true;
    }
    public static boolean samemas(int[] mas1, int[] mas2)//26 task
    {
        int m1unic=0, m2unic=0;
        for (int i =0; i<mas1.length-1; i++)
        {
            for (int k =i+1; k<mas1.length; k++) {
                if (mas1[i]==mas1[k])m1unic++;
            }
        }
        for (int i =0; i<mas2.length-1; i++)
        {
            for (int k =i+1; k<mas2.length; k++) {
                if (mas2[i]==mas2[k])m2unic++;
            }
        }
        return ((mas1.length-m1unic)==(mas2.length-m2unic));
    }
    public static boolean kaprekara(int val)//27 task
    {
        String strsqr;
        int sqr = (int)Math.pow(val, 2);
        if (sqr<10)
        {
            if (sqr==0) return true;
            strsqr = "0"+ sqr;
        }
        else {
            strsqr = Integer.toString(sqr);
        }
        if (strsqr.length()%2==0)//если чётное число цифр
        {
            char[] mas1 = new char[strsqr.length()/2];
            char[] mas2 = new char[strsqr.length()/2];
            int i=0;
            for (; i<strsqr.length()/2; i++)
            {
                mas1[i]=strsqr.charAt(i);
            }
            for (int k=0; k<strsqr.length()/2; k++, i++)
            {
                mas2[k]=strsqr.charAt(i);
            }
            String val1 = new String(mas1);
            String val2 = new String(mas2);
            return ((Integer.parseInt(val1)+Integer.parseInt(val2))==val);
        }
        else // если нечётное
        {
            char[] mas1 = new char[strsqr.length()/2];
            char[] mas2 = new char[strsqr.length()/2+1];
            int i=0;
            for (; i<strsqr.length()/2; i++)
            {
                mas1[i]=strsqr.charAt(i);
            }
            for (int k=0; k<strsqr.length()/2+1; k++, i++)
            {
                mas2[k]=strsqr.charAt(i);
            }
            String val1 = new String(mas1);
            String val2 = new String(mas2);
            return ((Integer.parseInt(val1)+Integer.parseInt(val2))==val);
        }
    }
    public static String zeros(String str)//28 task //string to char arr
    {
        int max=0, temp=0;
        StringBuilder ret = new StringBuilder();
        char[] mas= str.toCharArray();
        for (char ma : mas) {
            if (ma == '1') temp = 0;
            if (ma == '0') temp++;
            if (temp > max) max = temp;
        }
        for (int i=0; i<max;i++)
        {
            ret.append("0");
        }
        return ret.toString();
    }
    public static int issimple(int val)//29 task
    {
        int seps = 0, next;
        for (int i = 1; i <= val; i++) {
            if (val % i == 0) ++seps;
            if (seps > 2) break;
        }
        if (seps == 2) return val;
        for (next = ++val;  ; next++) {
            seps = 0;
            for (int i = 1; i <= next; i++) {
                if (next % i == 0) ++seps;
                if (seps > 2) break;
            }
            if (seps == 2) return next;
        }
    }
    public static boolean istriangle(int x, int y, int z)//30 task
    {
        int max, min, mid;
        max = mid = min = 0;
        if ((x>y)&&(x>z))
        {
            max=x;
            if (y>z)
            {
                mid=y;
                min=z;
            }
            else
            {
                mid=z;
                min=y;
            }
        }
        if ((y>x)&&(y>z))
        {
            max=y;
            if (x>z)
            {
                mid=x;
                min=z;
            }
            else
            {
                mid=z;
                min=x;
            }
        }
        if ((z>y)&&(z>x))
        {
            max=z;
            if (y>x)
            {
                mid=y;
                min=x;
            }
            else
            {
                mid=x;
                min=y;
            }
        }
        if ((Math.pow(max, 2))==((Math.pow(min, 2))+(Math.pow(mid, 2))))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String  textmaker(int n, String source)//31 task
    {
        String strres ="", temp_word_str="";
        int temp_word=0;
        int temp_str=0;
        char[] arr = source.toCharArray();
        for (int i=0; i<arr.length;i++)
        {
            if (arr[i] != ' ')
            {
                temp_word_str += arr[i];
                temp_word++;
            }
            else
            {
                if (temp_str+temp_word<=n)
                {
                    temp_str+=temp_word;
                    strres +=temp_word_str + " ";
                    temp_word=0;
                    temp_word_str="";

                }
                else
                {
                    strres +="\n" + temp_word_str + " ";
                    temp_str=temp_word;
                    temp_word=0;
                    temp_word_str="";
                }
            }
        }
        if (temp_str+temp_word<=n)
        {
            temp_str+=temp_word;
            strres +=temp_word_str + " ";
            temp_word=0;
            temp_word_str="";

        }
        else
        {
            strres +="\n" + temp_word_str + " ";
            temp_str=temp_word;
            temp_word=0;
            temp_word_str="";
        }
        return strres;
    }
    public static String[]  brakets(String source)//32 task
    {
        String temp ="";
        int left=0, right=0, k=0, groups=0;
        char[] arr = source.toCharArray();
        for (int i=0; i< arr.length; i++)
        {
            if (arr[i]=='(')
            {
                left++;
            }
            if (arr[i]==')')
            {
                right++;
            }
            if (left==right)
            {
                groups++;
                left=right=0;
            }
        }
        int iter = arr.length-left-right;
        left=right=0;
        String[] res = new String[groups];
        for (int i=0; i< iter; i++)
    {
        if (arr[i]=='(')
        {
            left++;
            temp+="(";
        }
        if (arr[i]==')')
        {
            right++;
            temp+=")";
        }
        if (left==right)
        {
            res[k]=temp;
            temp="";
            k++;
        }
    }
        return res;
    }
    public static String  snake(String source)//33 task
    {
        char[] arr = source.toCharArray();
        String str ="";
        for (int i=0; i<arr.length;i++)
        {
            if (Character.isUpperCase(arr[i]))
            {
                str+="_"+Character.toLowerCase(arr[i]);
            }
            else
            {
                str+=arr[i];
            }
        }
        return str;
    }
    public static String  camel(String source)//33 task
    {
        char[] arr = source.toCharArray();
        String str ="";
        for (int i=0; i<arr.length;i++)
        {
            if (arr[i]=='_')
            {
                str+=Character.toUpperCase(arr[i+1]);
                i++;
            }
            else
            {
                str+=arr[i];
            }
        }
        return str;
    }
    public static String  payment(double[] arr)//34 task
    {
        String str="$";
        double pay=0;
        if (arr[1]>17)
        {
            pay= (arr[1]-arr[0])*arr[2]+(arr[1]-18)*arr[2]*arr[3];
            DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
            str+= decimalFormat.format(pay);
        }
        else
        {
            pay= (arr[1]-arr[0])*arr[2];
            DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
            str+= decimalFormat.format(pay);
        }
        return str;
    }
    public static String  imt(double weight, double height)//35 task
    {
        if (height>100)
        {
            height= height/100;
        }
        String res="";
        double pow =weight/(Math.pow(height, 2));
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        if (pow<18.5)
        {
            res= decimalFormat.format(pow)+", у вас недовес";
        }
        if (pow>18.5&pow<25)
        {
            res= decimalFormat.format(pow)+", у вас нормальный вес";
        }
        if (pow>25)
        {
            res= decimalFormat.format(pow)+", вы - жиробас";
        }
        return res;
    }
    public static int  multiplicate(int val)//36 task
    {
        int res=0, temp=11;
        String str = Integer.toString(val);
        String temp_str;
        char[] arr = str.toCharArray();
        int arri;
        while (temp>10){
            temp=1;
        for (int i = 0; i < arr.length; i++)
        {
            arri = Character.getNumericValue(arr[i]);
            temp*=arri;
        }
            temp_str= Integer.toString(temp);
            arr = temp_str.toCharArray();
            res++;
        }
        return res;
    }
    public static String  starmult(String str)//37 task
    {
        if (str.length()==0) return "";
        String res="";
        int mult=1, i = 0;
        char[] arr = str.toCharArray();
        for (; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1])
            {
                mult++;
                continue;
            }
            if (mult==1)
            {
                res+=arr[i];
            }
            else
            {
                res += arr[i] + "*" + mult;
                mult = 1;
            }
        }
        if (mult==1)
        {
            res+=arr[i];
        }
        else
        {
            res += arr[i] + "*" + mult;
            mult = 1;
        }
        return res;
    }
    public static boolean  ispunch(String str1, String str2)//38 task
    {
        int first=0, second =0;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (int i = arr1.length-1; i >0 ; i--) {
            if (arr1[i]==' '&&0!=first) break;
            if ((arr1[i]=='a')||(arr1[i]=='A')||(arr1[i]=='e')||(arr1[i]=='E')||(arr1[i]=='o')||(arr1[i]=='O')||(arr1[i]=='i')||(arr1[i]=='I')||(arr1[i]=='u')||(arr1[i]=='U')||(arr1[i]=='y')||(arr1[i]=='Y')) first++;
        }
        for (int i = arr2.length-1; i >0 ; i--) {
            if (arr2[i]==' '&&0!=second) break;
            if ((arr2[i]=='a')||(arr2[i]=='A')||(arr2[i]=='e')||(arr2[i]=='E')||(arr2[i]=='o')||(arr2[i]=='O')||(arr2[i]=='i')||(arr2[i]=='I')||(arr2[i]=='u')||(arr2[i]=='U')||(arr2[i]=='y')||(arr2[i]=='Y')) second++;
        }
        if (first==second) return true;
        else return false;
    }
    public static boolean  repeater(int val1, int val2)//39 task
    {
        char first = '.';
        char[] arr1= (""+val1).toCharArray();
        char[] arr2= (""+val2).toCharArray();
        for (int i = 0; i < arr1.length-2; i++) {
            if ((arr1[i]==arr1[i+1])&&(arr1[i+2]==arr1[i]))
            {
                first =arr1[i];
                break;
            }
        }
        for (int i = 0; i < arr2.length-1; i++) {
            if ((arr2[i]==first)&&(arr2[i+1]==first)) return true;
        }
      return false;
    }
    public static int  books(String str, char ch)//40 task
    {
        int unic = 0, res = 0, chars = 0;
        char[] arr = str.toCharArray();
        char temp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == ch) {
                chars = 0;
                int k = i + 1;
                while (arr[k] != ch) {
                    chars++;
                    k++;
                }
                k = i + 1;
                for (int j = 0; j < chars; j++)
                {
                    k = i + 1+ j;
                    temp = arr[k];
                    while (arr[k] != ch)
                    {
                        if (temp == arr[k + 1])
                        {
                            unic++;
                        }
                        k++;
                    }
                    if (unic == 0) res++;
                    unic=0;
                }
                i+=chars+1;
            }
        }
        return res;
    }
    public static int[] encrypt(String str)//41 task
    {
        char[] chars = str.toCharArray();
        int[] ints = new int[chars.length];
        ints[0]=chars[0];
        for (int i = 1; i < ints.length; i++) {
                ints[i]=chars[i]-chars[i-1];
        }
        return ints;
    }
    public static String   decrypt(int[] arr)//41 task
    {
        char[] chars = new char[arr.length];
        int temp=(char)arr[0];
        chars[0]=(char)arr[0];
        for (int i = 1; i < arr.length; i++) {
            temp+=arr[i];
            chars[i]=(char)temp;
        }
        String str = new String(chars);
        return str;
    }
    public static boolean   chessmats(String name, String start, String end)//42 task
    {
        char[] startch = start.toCharArray();
        char[] endch = end.toCharArray();
        int ischar=0, isdigit=0;
        for (char i = 'A'; i <='H' ; i++) {
            if (i==startch[0])
            {
                ischar++;
            }
        }
        for (char i = 'a'; i <='h' ; i++) {
            if (i==startch[0])
            {
                ischar++;
            }
        }
        for (char i = 'A'; i <='H' ; i++) {
            if (i==endch[0])
            {
                ischar++;
            }
        }
        for (char i = 'a'; i <='h' ; i++) {
            if (i==endch[0])
            {
                ischar++;
            }
        }
        for (char i = '1'; i <='9' ; i++) {
            if (i==endch[1])
            {
                isdigit++;
            }
        }
        for (char i = '1'; i <='9' ; i++) {
            if (i==startch[1])
            {
                isdigit++;
            }
        }
        if (ischar!=2||isdigit!=2) return false;
        switch (name)
        {
            case "пешка":
            {
                if (ischar!=2) return false;
                if ((startch.length==2)&&(endch.length==2))
                {
                    int a=(int)startch[1]-(int)endch[1];
                    if ((startch[0]==endch[0])&&Math.abs(a)<=2)
                    {
                        return true;
                    }
                    else return false;
                }
                else return false;
            }
            case "конь":
            {
                if ((startch.length==2)&&(endch.length==2))
                {
                    int path=0;
                    path=Math.abs((startch[1])-(endch[1]))+Math.abs((startch[0])-Math.abs(endch[0]));
                    if (path==3&&startch[0]!=endch[0]&&endch[1]!=startch[1])
                    {
                        return true;
                    }
                    else return false;
                }
                else return false;
            }
            case "слон":
            {
                if (ischar!=2) return false;
                int path=0;
                path=Math.abs((startch[1])-(endch[1]))-Math.abs((startch[0])-(endch[0]));
                if (path==0)
                {
                    return true;
                }
                else return false;
            }
            case "ладья":
            {
                if (ischar!=2) return false;
                if (startch[0]==endch[0]||startch[1]==endch[1])
                {
                    return true;
                }
                else return false;
            }
            case "ферзь":
            {
                if (ischar!=2) return false;
                int path=0;
                path= Math.abs((startch[1])-(endch[1]))-Math.abs((startch[0])-(endch[0]));
                if (path==0||(startch[0]==endch[0]||startch[1]==endch[1]))
                {
                    return true;
                }
                else return false;
            }
            case "король":
            {
                if (ischar!=2) return false;
                if (Math.abs(startch[0]-endch[0])<2)
                {
                    if (Math.abs(startch[1]-endch[1])<2)
                    {
                        return true;
                    }
                }
                else return false;
                break;
            }
        }
        return true;
    }
    public static boolean   canbedone(String str1, String str2)//43 task
    {
        char[] parts =str1.toCharArray();
        char[] word =str2.toCharArray();
        char temp;
        int num= parts.length;
        if (word.length<parts.length)
        {
            return false;
        }
        for (int i = 0; i < parts.length; i++) {
            for (int j = i; j < word.length; j++) {
                if (parts[i]==word[j])
                {
                   num--;
                   if (j<i)
                   {
                       return false;
                   }
                   break;
                }
            }
        }
        if (num==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int   summult(int[] arr)//44 task
    {
        int sum =0,mult=1;
        String str ="";
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        str = Integer.toString(sum);
        while (str.length()!=1)
        {
            for (int i = 0; i < str.length(); i++) {
                mult*=Character.getNumericValue(str.charAt(i));
            }
            str = Integer.toString(mult);
        }
        return sum;

    }
    public static String[] vowels(String[] arr)//45 task
    {
        int reser = 0;
        boolean[] bools = {false, false, false, false, false, false, false, false, false, false, false, false};
        boolean[] boolstemp = {false, false, false, false, false, false, false, false, false, false, false, false};
        char[] dict = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y',};
        char[][] arrch = new char[arr.length][];
        String[] temp = new String[arr.length];
        {
            for (int i = 0; i < arr.length; i++) {//для каждого слова в исходном массиве строк
                arrch[i] = arr[i].toCharArray();
            }
            for (int k = 0; k < arrch[0].length; k++) {
                switch (arrch[0][k]) {
                    case 'a': {
                        bools[0] = true;
                        break;
                    }
                    case 'A': {
                        bools[1] = true;
                        break;
                    }
                    case 'e': {
                        bools[2] = true;
                        break;
                    }
                    case 'E': {
                        bools[3] = true;
                        break;
                    }
                    case 'i': {
                        bools[4] = true;
                        break;
                    }
                    case 'I': {
                        bools[5] = true;
                        break;
                    }
                    case 'o': {
                        bools[6] = true;
                        break;
                    }
                    case 'O': {
                        bools[7] = true;
                        break;
                    }
                    case 'u': {
                        bools[8] = true;
                        break;
                    }
                    case 'U': {
                        bools[9] = true;
                        break;
                    }
                    case 'y': {
                        bools[10] = true;
                        break;
                    }
                    case 'Y': {
                        bools[11] = true;
                        break;
                    }
                }
            }
            for (int i = 0; i < arrch.length; i++) {//слова
                for (int j = 0; j < arrch[i].length; j++)//буквы
                {
                    for (int k = 0; k < bools.length; k++) {//проверенные буквы словаря
                        if (arrch[i][j] == dict[k]) {
                            boolstemp[k]=true;
                            break;
                        }
                    }
                }
                for (int j = 0; j < bools.length; j++) {
                    if (bools[j] != boolstemp[j]) {
                        break;
                    }
                    if (j==bools.length-1)
                    {
                        temp[reser] = arr[i];
                        reser++;
                    }
                }
                for (int j = 0; j < 12; j++) {
                    boolstemp[j] = false;
                }
            }
        }
        String[] res = new String[reser];
        for (int i = 0; i < reser; i++) {
            res[i]=temp[i];
        }
        return res;
    }
    public static boolean cardvalid(String val)//46 task
    {
        char[] charsval = val.toCharArray();
        int temp=0;
        if (charsval.length<14 ||charsval.length>19)
        {
            return false;
        }
        for (int i = 0; i < charsval.length; i++) {
            if (!Character.isDigit(charsval[i]))
            {
                return false;
            }
        }
        char[] inverse = new char[charsval.length-1];
        for (int i = inverse.length-1, k=0; i >=0 ; i--,k++) {
            inverse[k]=charsval[i];
        }
        for (int i = 0; i < inverse.length; i+=2) {
            temp=Character.getNumericValue(inverse[i]);
            temp*=2;
            if (temp%100>9)
            {
                temp=temp%10+1;
            }
            inverse[i]=Character.forDigit(temp, 10);
        }
        int sum =0;
        for (int i = 0; i < inverse.length; i++) {
            sum+=Character.getNumericValue(inverse[i]);
        }
        return (10-(sum%10)==Character.getNumericValue(charsval[charsval.length-1]));
    }
    public static String numtoword(int val)//47 task
    {
        if (val>999||val<0) {
            return "incorrect value";
        }
        int first=val/100, second=(val/10)%10, third=val%10;
        String str = Integer.toString(val), res ="";
        int len = str.length();
        switch (len) {
            case 1:
                switch (val){
                    case 0: return "zero";
                    case 1: return "one";
                    case 2: return "two";
                    case 3: return "three";
                    case 4: return "four";
                    case 5: return "five";
                    case 6: return "six";
                    case 7: return "seven";
                    case 8: return "eight";
                    case 9: return "nine";
                }
            case 2:
                switch (val){
                    case 10: return "ten";
                    case 11: return "eleven";
                    case 12: return "twelve";
                    case 13: return "thirteen";
                    case 14: return "fourteen";
                    case 15: return "fifteen";
                    case 16: return "sixteen";
                    case 17: return "seventeen";
                    case 18: return "eighteen";
                    case 19: return "nineteen";
                    case 20: return "twenty";
                }
                switch (second) {
                    case 2: res+="twenty ";
                    break;
                    case 3: res+="thirty ";
                        break;
                    case 4: res+="forty ";
                        break;
                    case 5: res+="fifty ";
                        break;
                    case 6: res+="sixty ";
                        break;
                    case 7: res+="seventy ";
                    break;
                    case 8: res+="eighty ";
                        break;
                    case 9: res+="ninety ";
                        break;
                }
                switch (third){
                    case 1: res+="one";
                    break;
                    case 2: res+="two";
                    break;
                    case 3: res+="three";
                    break;
                    case 4: res+="four";
                    break;
                    case 5: res+="five";
                    break;
                    case 6: res+="six";
                    break;
                    case 7: res+="seven";
                    break;
                    case 8: res+="eight";
                    break;
                    case 9: res+="nine";
                    break;
            }
            break;
            case 3:
                switch (first){
                    case 1: res+= "one hundred ";
                    break;
                    case 2: res+= "two hundred ";
                        break;
                    case 3: res+= "three hundred ";
                        break;
                    case 4: res+= "four hundred ";
                        break;
                    case 5: res+= "five hundred ";
                        break;
                    case 6: res+= "six hundred ";
                        break;
                    case 7: res+= "seven hundred ";
                        break;
                    case 8: res+= "eight hundred ";
                        break;
                    case 9: res+= "nine hundred ";
                        break;
                }
                switch (second) {
                    case 1: switch (val%100){
                            case 10: res+="ten";
                                break;
                            case 11: res+="eleven";
                                break;
                            case 12: res+="twelve";
                                break;
                            case 13: res+="thirteen";
                                break;
                            case 14: res+="fourteen";
                                break;
                            case 15: res+="fifteen";
                                break;
                            case 16: res+="sixteen";
                                break;
                            case 17: res+="seventeen";
                                break;
                            case 18: res+="eighteen";
                                break;
                            case 19: res+="nineteen";
                                break;
                            case 20: res+="twenty";
                                break;
                    }
                    break;
                    case 2: res+="twenty ";
                        break;
                    case 3: res+="thirty ";
                        break;
                    case 4: res+="forty ";
                        break;
                    case 5: res+="fifty ";
                        break;
                    case 6: res+="sixty ";
                        break;
                    case 7: res+="seventy ";
                        break;
                    case 8: res+="eighty ";
                        break;
                    case 9: res+="ninety ";
                        break;
                }
                if (second!=1) {
                    switch (third) {
                        case 1:
                            res += "one";
                            break;
                        case 2:
                            res += "two";
                            break;
                        case 3:
                            res += "three";
                            break;
                        case 4:
                            res += "four";
                            break;
                        case 5:
                            res += "five";
                            break;
                        case 6:
                            res += "six";
                            break;
                        case 7:
                            res += "seven";
                            break;
                        case 8:
                            res += "eight";
                            break;
                        case 9:
                            res += "nine";
                            break;
                    }
                }
        }
        return res;
    }
    public static String numtowordr(int val)//47 task
    {
        if (val>999||val<0) {
            return "неверное значение";
        }
        int first=val/100, second=(val/10)%10, third=val%10;
        String str = Integer.toString(val), res ="";
        int len = str.length();
        switch (len) {
            case 1:
                switch (val){
                    case 0: return "ноль";
                    case 1: return "один";
                    case 2: return "два";
                    case 3: return "три";
                    case 4: return "четыре";
                    case 5: return "пять";
                    case 6: return "шесть";
                    case 7: return "семь";
                    case 8: return "восемь";
                    case 9: return "девять";
                }
            case 2:
                switch (val){
                    case 10: return "десять";
                    case 11: return "одиннадцать";
                    case 12: return "двенадцать";
                    case 13: return "тринадцать";
                    case 14: return "четырнадцать";
                    case 15: return "пятнадцать";
                    case 16: return "шестнадцать";
                    case 17: return "семнадцать";
                    case 18: return "восемнадцать";
                    case 19: return "девятнадцать";
                    case 20: return "двадцать";
                }
                switch (second) {
                    case 2: res+="двадцать ";
                        break;
                    case 3: res+="тридцать ";
                        break;
                    case 4: res+="сорок ";
                        break;
                    case 5: res+="пятьдесят ";
                        break;
                    case 6: res+="шестьдесят ";
                        break;
                    case 7: res+="семьдесят ";
                        break;
                    case 8: res+="восемьдесят ";
                        break;
                    case 9: res+="девяносто ";
                        break;
                }
                switch (third){
                    case 1: res+="один";
                        break;
                    case 2: res+="два";
                        break;
                    case 3: res+="три";
                        break;
                    case 4: res+="четыре";
                        break;
                    case 5: res+="пять";
                        break;
                    case 6: res+="шесть";
                        break;
                    case 7: res+="семь";
                        break;
                    case 8: res+="восемь";
                        break;
                    case 9: res+="девять";
                        break;
                }
                break;
            case 3:
                switch (first){
                    case 1: res+= "сто ";
                        break;
                    case 2: res+= "двести ";
                        break;
                    case 3: res+= "триста ";
                        break;
                    case 4: res+= "четыреста ";
                        break;
                    case 5: res+= "пятсот ";
                        break;
                    case 6: res+= "шестьсот ";
                        break;
                    case 7: res+= "семьсот ";
                        break;
                    case 8: res+= "восемьсот ";
                        break;
                    case 9: res+= "девятьсот ";
                        break;
                }
                switch (second) {
                    case 1: switch (val%100){
                        case 10: res+="десять";
                            break;
                        case 11: res+="одиннадцать";
                            break;
                        case 12: res+="двенадцать";
                            break;
                        case 13: res+="тринадцать";
                            break;
                        case 14: res+="четырнадцать";
                            break;
                        case 15: res+="пятнадцать";
                            break;
                        case 16: res+="шестнадцать";
                            break;
                        case 17: res+="семнадцать";
                            break;
                        case 18: res+="восемнадцать";
                            break;
                        case 19: res+="девятнадцать";
                            break;
                        case 20: res+="двадцать";
                            break;
                    }
                        break;
                    case 2: res+="двадцать ";
                        break;
                    case 3: res+="тридцать ";
                        break;
                    case 4: res+="сорок ";
                        break;
                    case 5: res+="пятьдесят ";
                        break;
                    case 6: res+="шестьдесят ";
                        break;
                    case 7: res+="семьдесят ";
                        break;
                    case 8: res+="восемьдесят ";
                        break;
                    case 9: res+="девяносто ";
                        break;
                }
                if (second!=1) {
                    switch (third) {
                        case 1:
                            res += "один";
                            break;
                        case 2:
                            res += "два";
                            break;
                        case 3:
                            res += "три";
                            break;
                        case 4:
                            res += "четыре";
                            break;
                        case 5:
                            res += "пять";
                            break;
                        case 6:
                            res += "шесть";
                            break;
                        case 7:
                            res += "семь";
                            break;
                        case 8:
                            res += "восемь";
                            break;
                        case 9:
                            res += "девять";
                            break;
                    }
                }
        }
        return res;
    }
    //48 task
    public static String correcttitle(String str)//49 task
    {
        char[] arr =str.toCharArray();
        String temp_str ="", res="";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i]))
            {
                temp_str+=arr[i];
            }
            else
            {
                char[] temp_arr = temp_str.toCharArray();
                for (int j = 0; j < temp_arr.length; j++) {
                    temp_arr[j] = Character.toLowerCase(temp_arr[j]);
                }
                temp_str = String.valueOf(temp_arr);
                if (temp_str.equals("and")||temp_str.equals("the")||temp_str.equals("of")||temp_str.equals("in"))
                {
                    res+=temp_str+arr[i];
                }
                else
                {
                    if (temp_str.length()!=0) {
                        temp_arr[0] = Character.toUpperCase(temp_arr[0]);
                        temp_str = String.valueOf(temp_arr);
                        res += temp_str + arr[i];
                    }
                    else
                    {
                        res += temp_str + arr[i];
                    }
                }
                temp_str="";
            }
        }
        return res;
    }
    public static String hexnums(int val)//50 task
    {
        String res= "недопустимое число";
        int start =1, mult=1, r=1, os=0, probs=0;
        while (start<=val)
        {
            if (start==val)
            {
                res="\n";
                for (int i = 0; i < r; i++) {
                    probs=r-i;
                    os=r+i;
                    for (int j = 0; j < probs; j++) {
                        res+=" ";
                    }
                    for (int j = 0; j < os; j++) {
                        res+="o ";
                    }
                    res+="\n";
                }
                for (int i = 0; i < r-1; i++) {
                    probs++;
                    os--;
                    for (int j = 0; j < probs; j++) {
                        res+=" ";
                    }
                    for (int j = 0; j < os; j++) {
                        res+="o ";
                    }
                    res+="\n";
                }
                return res;
            }
            start+=6*mult;
            mult++;
            r++;
        }
        return res;
    }
    //51 task
    public static String pigword(String str)//52 task
    {
        char[] arr = str.toCharArray();
            if (str.matches("^(?i:[aeiouy]).*"))//если буква гласная
            {
                return str+ "yay";
            }
            else
            {
                StringBuilder temp = new StringBuilder(str);
                while ((temp.charAt(0)!='a')&(temp.charAt(0)!='A')&(temp.charAt(0)!='e')&(temp.charAt(0)!='E')&(temp.charAt(0)!='i')&(temp.charAt(0)!='I')&(temp.charAt(0)!='o')&(temp.charAt(0)!='O')&(temp.charAt(0)!='u')&(temp.charAt(0)!='U')&(temp.charAt(0)!='y')&(temp.charAt(0)!='Y'))
                {
                    temp = temp.insert(arr.length, temp.charAt(0));
                    temp= temp.deleteCharAt(0);
                }
                return temp +"ay";
            }
    }
    public static String pigoffer(String str)//52 task
    {
        String temp ="", res="";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))
            {
                temp+=str.charAt(i);
            }
            else
            {
                if (temp.length()!=0) {
                    res += pigword(temp) + str.charAt(i);
                    temp = "";
                }
                else
                {
                    res += str.charAt(i);
                    temp = "";
                }
            }
        }
        return  res;
    }
    public static boolean rgb(String str)//53 task
    {
        StringBuilder strb = new StringBuilder(str);
        if (str.equals())
    }
}

