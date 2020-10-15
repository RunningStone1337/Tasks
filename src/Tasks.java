import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Vector;

public class Tasks {
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
    public static boolean ishex(String str)//25 task////////ПРОВЕРИТЬ
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
    public static int   summult(int[] arr)//44 task/////////ПРОЕВЕРИТЬ
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
    public static boolean rgb(String str)//53 task/////ПРОВЕРИТЬ
    {
        String temp = "";
        int i = 0;
        for (; i < 4; i++) {
            temp+=str.charAt(i);
        }
        if (temp.equals("rgb(")||temp.equals("RGB("))
        {
            temp="";
            while (str.charAt(i)!=')')
            {
                temp+=str.charAt(i);
                i++;
            }
            if (i!=str.length()-1) return false;
            i=0;
            for (int j = 0; j < 2; j++) {
                String temp_val ="";
                while (temp.charAt(i)!=',')
                {
                    temp_val+=temp.charAt(i);
                    i++;
                }
                i++;
                double val = Double.parseDouble(temp_val);
                if (val<0||val>255)
                    return false;
            }
            return true;
        }
        temp+=str.charAt(i);
        i++;
        if (temp.equals("rgba(")||temp.equals("RGBA("))
        {
            temp="";
            while (str.charAt(i)!=')')
            {
                temp+=str.charAt(i);
                i++;
            }
            if (i!=str.length()-1) return false;
            i=0;
            for (int j = 0; j < 3; j++) {
                String temp_val ="";
                while (temp.charAt(i)!=',')
                {
                    temp_val+=temp.charAt(i);
                    i++;
                }
                i++;
                double val = Double.parseDouble(temp_val);
                if (val<0||val>255)
                    return false;
            }
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String url(String str, String[] ... params)//54 task
    {
        String temp ="", res="";
        int i = 0;
        for (; i < 8; i++) {
            temp+=str.charAt(i);
            res+=str.charAt(i);
        }
        if (!temp.equals("https://"))
        {
            return "не является URL";
        }
        else
        {
            while (str.charAt(i)!='.')
            {
                res+=str.charAt(i);
                i++;
            }
            temp ="";
            res+=str.charAt(i);
            i++;
            for (int j = 0; j < 3; j++, i++) {
                temp+=str.charAt(i);
                res+=str.charAt(i);
            }
            if (temp.equals("com")&&i==str.length())//если параметров нет
            {
                return res;
            }
            temp+=str.charAt(i);
            res+=str.charAt(i);
            ++i;
            if (temp.equals("com?")&&i!=str.length()-1)//если должны быть параметры и они есть
            {
                int ques =0, equs=0;
                for (int j=i; j < str.length(); j++) {
                    //if (Character.isAlphabetic(str.charAt(j))) chars++;
                    if (str.charAt(j)=='='&&Character.isDigit(str.charAt(j+1))) equs++;
                    if (str.charAt(j)=='&') ques++;
                }
                if (ques+1==equs)//если введено корректно
                {
                    String part = str.substring(i);
                    String[] words = part.split("&");//массив переменных со значениями
                    String[] names = new String[words.length];//массив имён переменных
                    String[] vals_str = new String[words.length];//массив значений переменных
                    for (int j = 0, k=0; j < words.length; j++) {
                        names[j]="";
                        vals_str[j]="";
                        while (words[j].charAt(k)!='=')//запись названий переменных
                        {
                            names[j]+=words[j].charAt(k);
                            k++;
                        }
                        k++;
                        while (k!=words[j].length())//запись значений переменных
                        {
                            vals_str[j]+=words[j].charAt(k);
                            k++;
                        }
                        k=0;
                    }////////////нужно определить, какие переменные повторяются и оставить только плсденее повторение если оно есть
                    boolean[] repeat = new boolean[words.length];
                    for (int word1 = words.length-1; word1 > 0; word1--) {//сравнение всех переменных по имени
                        for (int word2 = word1-1; word2 >= 0; word2--) {
                            if (names[word1].equals(names[word2]))
                            {
                                repeat[word2]= true;
                            }
                        }
                    }
                    for (int j = 0; j < words.length; j++) {
                        if (repeat[j]==false){
                            res+=words[j]+ "&";
                        }
                    }
                    res+="\b";
                }
            }
            else//если должны быть параметры и их нет
            {
                return "не является URL";
            }
        }
        return res;
    }
    public static String[] tags(String str)//55 task
    {
        int[] ints = new int[3];
        String lower_case = str.toLowerCase();
        lower_case = lower_case.trim();
        lower_case = lower_case.replaceAll("\\p{Punct}","");
        String[] mas = lower_case.split(" ");
        boolean[] bools = new boolean[mas.length];
        for (int j = 0; j < 3; j++) {
        for (int i = 0; i < mas.length; i++) {
            if (bools[i]){
                continue;
            }
            if (mas[i].length()>ints[j]){
                ints[j]=i;
            }
        }
            bools[ints[j]]=true;
        }
        if (mas.length>2) {
            String[] res = new String[3];
            for (int i = 0; i < 3; i++) {
                res[i]= "#"+mas[ints[i]];
            }
            return res;
        }
        else {
            String[] res = new String[mas.length];
            for (int i = 0; i < mas.length; i++) {
                res[i]= "#"+mas[ints[i]];
            }
            return res;
        }
    }
    public static int ulam(int val){//56 task
        Vector<Integer> vec = new Vector<>(2);
        int count =0;
        vec.add(1);
        vec.add(2);
        int max =999999999;
        for (int i = 3; i < max; i++) {//искать в числах до мах
            for (int j = 0; j < vec.size()-1; j++) {//
                for (int k = j+1; k < vec.size(); k++) {
                    if (vec.get(j)+vec.get(k)==i)
                    {
                        count++;
                    }
                    if (count>1)
                        break;
                }
                if (count>1)
                    break;
            }
            if (count==1) {
                vec.add(i);
            }
            count=0;
            if (vec.size()==val) return vec.get(val-1);
        }
        return 1;
    }
    public static String unicstr(String str) {//57 task
        int mas[][] = new int[str.length() + 1][str.length() + 1];
        String res = "";
        int res_length = 0;
        int i, index = 0;
        for (i = 1; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1)&& mas[i - 1][j - 1] < (j - i)) {
                    mas[i][j] = mas[i - 1][j - 1] + 1;
                    if (mas[i][j] > res_length) {
                        res_length = mas[i][j];
                        index = Math.max(i, index);
                    }
                } else {
                    mas[i][j] = 0;
                }
            }
        }
        if (res_length > 0) {
            for (i = index - res_length + 1; i <= index; i++) {
                res += str.charAt(i - 1);
            }
        }
        return res;
    }
    public static String toroma(int val) {//58 task
        String res="";
        if (val<4000){
            int thousands = val/1000, hundreds=(val/100)%10, teens=(val/10)%10, simples=val%10;
            for (int i = 0; i < thousands; i++) {
                res+="M";
            }
            if (hundreds>0&&hundreds<4) {
                for (int i = 0; i < hundreds; i++) {
                    res+="C";
                }
            }
            if (hundreds==4){
                res+="CD";
            }
            if (hundreds>4&&hundreds<9){
                res+="D";
                for (int i = 0; i < hundreds-5; i++) {
                    res+="C";
                }
            }
            if (hundreds==9){
                res+="CM";
            }
            if (teens>0&&teens<4) {
                for (int i = 0; i < teens; i++) {
                    res+="X";
                }
            }
            if (teens==4){
                res+="XL";
            }
            if (teens>4&&teens<9){
                res+="L";
                for (int i = 0; i < teens-5; i++) {
                    res+="X";
                }
            }
            if (teens==9){
                res+="XC";
            }
            if (simples>0&&simples<4) {
                for (int i = 0; i < simples; i++) {
                    res+="I";
                }
            }
            if (simples==4){
                res+="IV";
            }
            if (simples>4&&simples<9){
                res+="V";
                for (int i = 0; i < simples-5; i++) {
                    res+="I";
                }
            }
            if (simples==9){
                res+="IX";
            }
            return res;
        }
        else return "Введите число меньше 4000";
    }
    public static boolean formula(String str) {//59 task
        String temp = str.replace(" ", "");
        for (int i = 0; i < temp.length(); i++) {
            if (!Character.isDigit(temp.charAt(i))&&temp.charAt(i)!='+'&&temp.charAt(i)!='-'&&temp.charAt(i)!='*'&&temp.charAt(i)!='/'&&temp.charAt(i)!='>'&&temp.charAt(i)!='<'&&temp.charAt(i)!='='&&temp.charAt(i)!='%')
            {
                return false;
            }
        }
        String first = "", second = "", res = "", operand1 = "", operand2 = "";
        double first_val = 0, second_val = 0, res_val = 0;
        char operand1_char, operand2_char,operand12_char=0, operand22_char = 0;
        int i = 0;
        while (str.charAt(i) != '+' && str.charAt(i) != '-' && str.charAt(i) != '*' && str.charAt(i) != '/' && str.charAt(i) != '%') {
            first += str.charAt(i);
            i++;
        }
        operand1 += str.charAt(i);
        i++;
        while (str.charAt(i) != '=') {
            second += str.charAt(i);
            i++;
        }
        operand2 += str.charAt(i);
        i++;
        while (i != str.length()) {
            res += str.charAt(i);
            i++;
        }
        first_val = Double.parseDouble(first);
        second_val = Double.parseDouble(second);
        res_val = Double.parseDouble(res);
        operand1_char=operand1.charAt(0);
        if (operand1.length()>1)
        {
            operand12_char=operand1.charAt(1);
        }
        operand2_char=operand2.charAt(0);
        if (operand2.length()>1)
        {
            operand22_char=operand2.charAt(1);
        }
        if (operand1_char == '+') {
            if (operand2_char == '=') {
                if (first_val + second_val == res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '>'&& operand22_char == '=') {
                if (first_val + second_val >= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<'&& operand22_char == '=') {
                if (first_val + second_val <= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<') {
                if (first_val + second_val < res_val) {
                    return true;
                } else return false;
            }
        }
        if (operand1_char == '-') {
            if (operand2_char == '=') {
                if (first_val - second_val == res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '>'&& operand22_char == '=') {
                if (first_val - second_val >= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<'&& operand22_char == '=') {
                if (first_val - second_val <= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<') {
                if (first_val - second_val < res_val) {
                    return true;
                } else return false;
            }
        }
        if (operand2_char == '*') {
            if (operand2_char == '=') {
                if (first_val * second_val == res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '>'&& operand22_char == '=') {
                if (first_val * second_val >= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<'&& operand22_char == '=') {
                if (first_val * second_val <= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<') {
                if (first_val * second_val < res_val) {
                    return true;
                } else return false;
            }
        }
        if (operand1_char == '/') {
            if (operand2_char == '=') {
                if (first_val / second_val == res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '>'&& operand22_char == '=') {
                if (first_val / second_val >= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<'&& operand22_char == '=') {
                if (first_val / second_val <= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<') {
                if (first_val / second_val < res_val) {
                    return true;
                } else return false;
            }
        }
        if (operand1_char == '%') {
            if (operand2_char == '=') {
                if (first_val % second_val == res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '>'&& operand22_char == '=') {
                if (first_val % second_val >= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<'&& operand22_char == '=') {
                if (first_val % second_val <= res_val) {
                    return true;
                } else return false;
            }
            if (operand2_char == '<') {
                if (first_val % second_val < res_val) {
                    return true;
                } else return false;
            }
        }
        return false;
    }
    public  static boolean ispalindrome(int val){//ПРОВЕРИТЬ
        int counter =0, temp=val;
        while (temp!=0){
            temp/=10;
            counter++;
        }
        if (counter%2 ==1){
            return false;
        }
        String str = Integer.toString(val);
        while (str.length()!=2||(Integer.parseInt(String.valueOf(str.charAt(0)))+Integer.parseInt(String.valueOf(str.charAt(1))))>9){
            String str2 = "";
        for ( int i = 1, j=str.length();i <= j/2; i++,j--) {
            if (str.charAt(i-1)!=str.charAt(j-1)){//если исходное значение не палиндром
                for (int k = 0; k < str.length()-1; k+=2) {
                    str2+=Integer.toString(Integer.parseInt(String.valueOf(str.charAt(k)))+Integer.parseInt(String.valueOf(str.charAt(k+1))));
                }
                str = str2;
                break;
            }
        }
        }
        if(str.charAt(0)==str.charAt(1))return true;
        else return false;
    }
}



