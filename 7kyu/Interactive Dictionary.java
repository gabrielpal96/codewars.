/*
https://www.codewars.com/kata/57a93f93bb9944516d0000c1
In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:

Dictionary d = new Dictionary();

d.newEntry("Apple", "A fruit that grows on trees");

System.out.println(d.look("Apple"));
>>> A fruit that grows on trees

System.out.println(d.look("Banana"));
>>> Cant find entry for Banana
Good luck and happy coding!
*/
public class Dictionary
{
    private String s;
    private String s1;
    public Dictionary() {
    }
    public void newEntry(String Fruit,String Description){
        s=Fruit;
        s1=Description;
    }
    public String look(String Fruit){
        return ((Fruit==s)?s1:"Cant find entry for "+Fruit);
    }
}