import java.util.Random;
public class lab1
{
    public static void main(String[] args)
    {
        // ввод 1
        short num = 20;
        short[] a = new short[17];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = num;
            num--;
        }
        // ввод 2
        float min =-4.0f, max = 13.0f;
        Random rand = new Random();
        float[] x = new float[10];
        for (int i = 0; i < x.length; i++)
        {
            x[i] = rand.nextFloat() * (max - min) + min;
        }

        // ввод 3
        double[][] b = new double[17][10];
        // обработка
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < x.length; j++){
                if(a[i] == 17){
                    b[i][j] = Math.cos(Math.pow((3/4) / Math.atan((x[j]+4.5)/17), Math.pow(0.25/(x[j] - Math.PI), 2)));
                }
                else if(a[i] == 7 || a[i] >= 11 && a[i] <= 13 || a[i] == 15 || a[i] >= 18 && a[i] <= 20){
                    b[i][j] = Math.pow(Math.pow(Math.cos(x[j])/(0.25 - Math.pow(2 * x[j], x[j])), 2), (Math.pow(2-(Math.log(Math.abs(x[j]))), Math.atan((x[j] + 4.5) / 17)+3))/(Math.log(Math.pow(Math.E, x[j]))));
                }
                else{
                    b[i][j] = Math.sin(Math.cos(Math.asin(Math.cos(x[j]))));
                }
            }
        }

        // вывод
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < x.length; j++){
                System.out.printf("%.5f ", b[i][j]);
            }
            System.out.println();
        }
    }
}
