package it.accentur.algorithms;
public class BinarySearch
{
    public static void main(String[] args)
    {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i]=i*2.5;
        }
        double target = 12.5;
        int posizione = binarysearch(target, array);
        System.out.println("La posizione e': " + posizione);
    }
    //trova l'elemento target nell'array con complessità logaritmica
    public static int binarysearch (double target, double[] array)
    {
        int startArray = 0;
        int endArray = array.length;
        boolean searching = true;
        //supponendo l'array ordinato
        while (searching)
        {
            int position = (startArray + endArray)/2;
            if ((startArray==array.length || endArray<=0) ||
                    ((position == endArray && array[position]!=target)))
            {
                searching = false;
                break;
            }
            if (array[position] == target)
            {
                searching = false;
                return position;
            }
            if (array[position] < target)
            {
                startArray = position+1;
            }
            else
            {
                endArray = position-1;
            }

        }
        return -1;
    }
}
