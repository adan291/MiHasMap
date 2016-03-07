import java.util.Arrays;
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    // instance variables - replace the example below with your own
    private String key[];
    private int valores[];
    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        valores = new int[0];
        key = new String [0];
    }
/**
     * Asocia el valor especificado con la clave especificada. 
     * Si la clave existía, entonces sobreescribe su valor y devuelve 
     * el valor antiguo. Si no existía devuelve -1.
     */
    public int put(String clave, int valor)
    {
        int devuelve = -1;
        int indexKey = 0; //Indice para las key
        int indexValue = 0; // Indice para los valores
        if(key.length == 0 && valores.length== 0)//Si el map esta vacío
        {
            valores = new int[valores.length+1];
            key = new String [key.length+1];
            key[indexKey] = clave;
            valores[indexValue] = valor;
        }
        else // Si ya tiene algún elemento
        {
            for(int i=0; i<key.length;i++)//Se mira si está repetido
            {
                String temp = key[i];
                if(temp == clave)//Si esta repetido
                {
                    devuelve = i;//Se devuelve su posicion
                    valores[i] = valor; //Se sobreescribe su valor
                    break;
                }
                else
                {

                    String tempKey[] = new String[key.length + 1];
                    int tempValores[] = new int[valores.length +1];
                    for(int x = 0; x < key.length; x++)
                    {
                        tempKey[x] = key[x];
                        tempValores[x] = valores[x];
                        tempKey[tempKey.length-1] = clave;
                        tempValores[tempValores.length-1] = valor;
                    }
                    key = tempKey;
                    valores = tempValores;
                    break;
                }
            }
        }
        return devuelve;
    }


}