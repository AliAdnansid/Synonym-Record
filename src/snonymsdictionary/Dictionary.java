/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snonymsdictionary;

import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Ali
 */
public class Dictionary {
    private HashMap<String, List> words = new HashMap();
    Scanner scanner = new Scanner(System.in);
    
    public HashMap<String, List> getWords() {
        return words;
    }

    public void setWords(HashMap<String, List> words) {
        this.words = words;
    }

    public Dictionary(HashMap<String, List> words) {
        this.words = words;
    }
    
    public Dictionary() {
       
    }
    
    public void addWord(){
        //Scanner scanner = new Scanner(System.in);
        String word;
        System.out.println("Enter word whose synonyms you want to enter in Dictionary : ");
        word = scanner.nextLine();
        List <String> synonyms = new ArrayList();
        String choice;
        do{
            System.out.println("Now Enter synonyms : ");
            String syn;
            syn = scanner.nextLine();
            synonyms.add(syn);
            System.out.println("Do you want to enter a new synonym? if yes then enter Y or else anything  : ");
            choice = scanner.nextLine();
        }while(choice.equalsIgnoreCase("Y"));
        
        words.put(word, synonyms);
        System.out.println("Your word and synonyms has entered successfully! ");
    }
    
    public void removeWord(){
        
        String key;
        System.out.println("Enter the word to whome you want to remove : ");
        key = scanner.next();
        Set<String> keySet = words.keySet();
        if(keySet.equals(key)){
            words.remove(key);
            System.out.println("Your has been removed :( ");
        }
        else{
            System.out.println("WORD DONT EXIST SORRY :)");
        }
    }
    
    public void printAll(){
        
        System.out.println("[ WORD = [ SYNONYMS OF THE WORD ]]");
        System.out.println(words);
        
    }
    
    public void UpdateWord(){
        
        String key;
        System.out.println("Enter the word to whome you want to Upadte : ");
        key = scanner.next();
        Set<String> keySet = words.keySet();
        if(keySet.equals(key)){
            ArrayList oldsyns = new ArrayList();
            oldsyns.addAll(words.get(key));
            System.out.println("OLD SYNONYMS : "+oldsyns);
            words.remove(key);
            System.out.println("--------------------------------------------- Now enter again the WORD AND ITS SYNONYMS --------------------------------------");
            addWord();
            System.out.println("UPDATED DATA <3");
        }
        else{
            System.out.println("WORD DONT EXIST SORRY :)");
        }
    }
    
}
