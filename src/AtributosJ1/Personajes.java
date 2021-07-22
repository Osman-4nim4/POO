
package AtributosJ1;


public class Personajes {
    //Atributos
    String Nombre;
    int Vida;
    String Tipo;
    String Accion;
    
    //genere un metodo "main"
    public static void main (String[] args){
        //crear personaje
        Personajes J1 = new Personajes();
        
        //y coloque atributos
        J1.Nombre= "Osman";
        //Nombre de preferencia
        J1.Vida=100;
        //Los personajes Elfo y Heroe tienen HP de 100 maximo
        //Los personajes Humano tienen HP de 20 maximo
        J1.Tipo= "Heroe";
        //se puede poner tanto: aldeano,Heroe,Elfo
        J1.Accion= "Ataca";
        //se puede atacar o no atacar 
        
        //luego lo imprimi
        System.out.println("El nombre del personaje es: "+J1.Nombre);
        System.out.println("La vida de este personaje es: "+J1.Vida);
        System.out.println("EL tipo de personaje es: "+J1.Tipo);
        System.out.println("Este personaje: "+J1.Accion);
        
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        
        System.out.println("SIGUIENTE PERSONAJE");
        
        
         Personajes J2 = new Personajes();
        
        
        J2.Nombre= "Mayby";
        //Nombre de preferencia
        J2.Vida=100;
        //Los personajes Elfo y Heroe tienen HP de 100 maximo
        //Los personajes Humano tienen HP de 20 maximo
        J2.Tipo= "Elfo";
        //se puede poner tanto: aldeano,Heroe,Elfo
        J2.Accion= "Ataca";
        //se puede atacar o no atacar 
        
        System.out.println("El nombre del personaje es: "+J2.Nombre);
        System.out.println("La vida de este personaje es: "+J2.Vida);
        System.out.println("EL tipo de personaje es: "+J2.Tipo);
        System.out.println("Este personaje: "+J2.Accion);
        
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        
        System.out.println("SIGUIENTE PERSONAJE");
        
        Personajes J3 = new Personajes();
        
        
        J3.Nombre= "Carlos";
        //Nombre de preferencia
        J3.Vida=20;
        //Los personajes Elfo y Heroe tienen HP de 100 maximo
        //Los personajes Humano tienen HP de 20 maximo
        J3.Tipo= "Humano";
        //se puede poner tanto: aldeano,Heroe,Elfo
        J3.Accion= " No Ataca";
        //se puede atacar o no atacar 
        
        System.out.println("El nombre del personaje es: "+J3.Nombre);
        System.out.println("La vida de este personaje es: "+J3.Vida);
        System.out.println("EL tipo de personaje es: "+J3.Tipo);
        System.out.println("Este personaje: "+J3.Accion);
        
 
        
    } 
}
