import javax.sql.rowset.serial.SQLOutputImpl;
import java.awt.*;
import java.util.Random;
import java.util.Arrays;

public class Cursor2 {


    public static void main(String[] args) {
        System.out.println("1.Заповнити масив тільки парними числами:");


        int[] arr = new int[20];


        for (var i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----------------------------------------" + "\n2.Заповнити масив рандомними числами:");

        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int n = rand.nextInt(50);
            arr[i] = n;
            System.out.println(n);
        }
        System.out.println("-----------------------------------------" + "\n3. Вивести середнє значення масиву");
        double sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            //avg = sum/arr.length;
        }
        avg = sum / arr.length;
        System.out.println("Сума всіх елементів масиву:" + sum);
        System.out.println("Середнє арифметичне значення:" + avg);

        System.out.println("-----------------------------------------" + "\n4. Вивести суму всіх значень кратних 3");

        int sum2=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]%3==0)
            {
                sum2=sum2+arr[i];
            }

        }
        System.out.println("Сума елементів масиву кратних 3:"+sum2);
        System.out.println("-----------------------------------------" + "\n5. Вивести значення всіх парних індексів масиву");
        int [] arrFive = (new int[] {1,2,3,4,5,6,7,8,9,10});
        int i=1;
        while (i <= arrFive.length - 1) {
            System.out.print(arrFive[i] + " ");
            i = i + 2;
        }
        System.out.println(" ");

        System.out.println("-----------------------------------------" + "\n6. Просортувати масив в порядку зростання");
        //НАЖАЛЬ НЕ ВСТИГАЮ ЗРОБИТИ ДАНЕ ЗАВДАННЯ=(

        // int a = 0;
       // for (i = arr.length - 1; i>0; i++)
        //    for (int j = 0; j < arr.length; j++) {
       //         if (arr[j] > arr[j + 1])
        //            a = arr[i];
         //       arr[i] = arr[j];
        //        arr[j] = a;
         //   }

        System.out.println("-----------------------------------------" + "\n7. Вивести найменше число масиву");

        int min = 1;
        for (i=0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println(min);

        System.out.println("-----------------------------------------" + "\n8. Вивести найбільше число масиву");

        int max = 1;
        for (i=0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.println("-----------------------------------------" + "\n9. Вивести суму всіх парних значень");
        int sumpara=0;
        for (i=0; i < arr.length; i+=2)
        {
                sumpara+=arr[i];
            }
            System.out.println(sumpara);
            System.out.println();

        System.out.println("-----------------------------------------" + "\n10. Вивести перші 20 символів з таблиці ASCII");
        int cAsci = 88;
        int[] asci=new int[20];
        for(i=0; i<= asci.length; i++)
                {
                    asci[i]=cAsci;
                    char r=(char)cAsci;
                    System.out.println(r);
                    cAsci++;
                    if (i%10==0)
                    {
                    System.out.println("\n");
                    }
                    }
        System.out.println(Arrays.toString(asci));
    }
    // НАЖАЛЬ НЕ ВСТИГАЮ ЗРОБИТИ ЗАВДАННЯ З ЗІРОЧКОЮ В ТЕРМІН=(
    }
