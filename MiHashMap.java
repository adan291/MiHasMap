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

    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de 
     * que la clave no exista.
     */
    public int get(String clave)
    {
        int devolver = -1;
        for(int i=0; i<valores.length; i++)
        {
            String temp = key[i]; 
            if(temp == clave)
            {
                devolver = valores[i];
            }
        }

        return devolver;
    }

    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de 
     * que la clave no exista.
     */
    public int get(String clave)
   {
        int devolver = -1;
        for(int i=0; i<valores.length; i++)
        {
            String temp = key[i]; 
            if(temp == clave)
            {
                devolver = valores[i];
            }
        }

        return devolver;
    }

    /**
     * Metodo que devuelve true si el mapa no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean b = true;
        if(key.length >= 0 && valores.length >=0)//si
        {
            b = false;
        }
        return b;
    }

    /**
     * devuelve el número de elementos del mapa.
     */
    public int size()
    {
        int numeroDeElementos = 0;
        for(int i =0; i < valores.length; i++)
        {
            numeroDeElementos++;
        }
        return numeroDeElementos;
    }

    /**
     *  Metodo que vacía el mapa.
     */
    public void clear()
    {
        String key[] = new String[0];
        int valores[] = new int[0];
    }

    
    /**
     * Metodo que devuelve true si el mapa contiene la clave dada
     */
    public boolean containsKey(String clave)
    {
        boolean exist = false;
        for(int i = 0; i<key.length; i++)
        {
            String var = key[i];
            if(var == clave)
            {
                exist = true;
                break;
            }       
        }
        return exist;
    }

    

    
}