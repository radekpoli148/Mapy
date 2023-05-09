package mapy;

import java.awt.Event;
import java.util.*;
import java.util.Map.Entry;
/*
klucz - wartość 

tab[klucz] = wartosc; 
*/
public class Mapy 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer, Pracownik> mapa = new TreeMap(); //TreeMap
        
        Pracownik[] pracownicy = 
        {
            new Pracownik("Agnieszka"),
            new Pracownik("Bartłomiej"),
            new Pracownik("Celina"),
            new Pracownik("Dariusz"),
            new Pracownik("Agnieszka"),
            new Pracownik("Bartłomiej"),
            new Pracownik("Celina"),
            new Pracownik("Dariusz"),
            new Pracownik("Agnieszka"),
            new Pracownik("Bartłomiej"),
            new Pracownik("Celina"),
            new Pracownik("Dariusz"),
        };
        for (Pracownik pracownik : pracownicy)
            mapa.put(pracownik.getID(), pracownik);
        
        System.out.println(mapa);
        
        mapa.remove(3);
        
        System.out.println(mapa);
        
        mapa.put(4, new Pracownik("Dagmara"));
        mapa.put(3, new Pracownik("Cyryl"));
        
        System.out.println(mapa);
        
        for(Entry<Integer, Pracownik> wpis : mapa.entrySet())
        {
            System.out.println("ID pracownika: "+wpis.getKey());
            System.out.println("Imię pracownika: "+wpis.getValue().getImie());
            
        }
        
        //Sub mapy - podzbiory
        
        Map<Integer, Pracownik> subMapa = mapa.subMap(0, 7);
        
        if(subMapa.isEmpty())
            System.out.println("pusto");
        else
        {
            for(Entry<Integer, Pracownik> wpis : subMapa.entrySet())
            {
                System.out.println("ID pracownika: "+wpis.getKey());
                System.out.println("Imię pracownika: "+wpis.getValue().getImie());

            }
        }
        
        Map<Date, Event> przykładowa;
    }
    
}
class Pracownik
{
    public Pracownik()
    {
        i++;
        ID = i;
    }
    public Pracownik(String Imie)
    {
        this();
        this.Imie = Imie;
    }
    public int getID()
    {
        return ID;
    }
    public String getImie()
    {
        return Imie;
    }
    @Override
    public String toString()
    {
        return Imie;
    }
    
    String Imie;
    private int ID;
    public static int i = 0;
}