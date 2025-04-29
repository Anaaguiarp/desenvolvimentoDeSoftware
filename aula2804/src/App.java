import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Animal("Gato", 0.2, 0);
        System.out.println(animal1.toString());
        animal1.mover();
        System.out.println(animal1.toString());

        System.out.println("\n\n ------ PEIXE ------ \n\n");
        Peixe peixe1 = new Peixe("Nemo", 0.1, 5, false);
        System.out.println(peixe1.toString());
        //peixe1.nadar();
        peixe1.mover();
        System.out.println(peixe1.toString() + "\n");

        System.out.println("\n\n ------ PASSARO ------- \n\n");
        Passaro passaro1 = new Passaro("Pica-Pau", 2.1, 7);
        System.out.println(passaro1.toString() + "\n");
        //passaro1.voar();
        passaro1.mover();
        System.out.println(passaro1.toString() + "\n");

        System.out.println("\n\n");
        System.out.println("------------------ LISTA DE ANIMAIS ----------------------");
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(animal1);
        listaAnimais.add(peixe1);
        listaAnimais.add(passaro1);
        /* 
        for(Animal a : listaAnimais){
            if(a instanceof Peixe){
                ((Peixe)a).nadar();
            }else if(a instanceof Passaro){
                ((Passaro)a).voar();
            }else{
                a.mover();
            }
        }*/

        //------------------ POLIMORFISMO ------------------
        for(Animal a : listaAnimais){
            a.mover();
        }
    }
}