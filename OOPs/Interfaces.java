
interface Animal{
    int eye = 2;
    void walk(); //by default abstract and public
}


interface Herbivore {

}

class Horse implements Animal,Herbivore { // use implements for interface to be used , can not use multiple inheritance like this in class of java but possible in interface of java 
    public void walk(){
        System.out.println("walks on four legs");
    }
}




public class Interfaces {
    public static void main(String[] args){

    }
    
}
