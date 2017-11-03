
/**
 * Write a description of class sdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sdf
{
    public static void main(String ags[])
    {
       double phLevels[] = { 5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 2.1, 6.9 };

double max = Integer.MIN_VALUE;
double min = Integer.MAX_VALUE;

for(int i=0; i<phLevels.length; i++)
{
    if(phLevels[i]>max)
    {
        max = phLevels[i];
    }
    else if(phLevels[i]<min)
    {
        min = phLevels[i];
    }
}

double average = 0.0;

for(int j=0; j<phLevels.length; j++)
{
    if(!(phLevels[j]==max || phLevels[j]==min))
    {
        average+=phLevels[j];
    }
}
average/=(phLevels.length-2);

for(double n : phLevels)
{
    if(!(n==max || n==min))
    {
        System.out.println(n);
    }
}
System.out.printf("Average =  %.3s", average);
}
}
