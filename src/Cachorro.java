public class Cachorro extends Lobo{


    public void reagir(String frase){
        if(frase.equalsIgnoreCase("toma comida") || frase.equalsIgnoreCase("Ola")){
            System.out.println("Abana e latir");
        }
        else
            System.out.println("Rosnar");
    }

    public void reagir(int hora, int min){
        if(hora<12)
            System.out.println("Abanar");
        else if (hora >= 18)
            System.out.println("Ignorar");
        else
            System.out.println("Abanar e latir");
    }

    public void reagir(boolean dono){
        if(dono == true)
            System.out.println("Abana e latir");
        else
            System.out.println("Rosnar e morde");
    }

    public void reagir(int idade, float peso){
        if(idade<5){
            if (peso<10)
                System.out.println("Abanar");
            else
                System.out.println("Latir");
        }
        else{
            if (peso<10)
                System.out.println("rosnar");
            else
                System.out.println("Latir");

        }
    }








    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
