public class Cachorro{

    public void emitirSom(){
        System.out.println("Auauau");
    }
    public void reagir(String frase){
        if (frase=="Comida"||frase=="Ola"||frase=="Passear"){//frase.equals("comida")||frase.equals("ola")
            System.out.println("abanar e latir");
        }else{
            System.out.println("rosnar");
        }
    }
    public void reagir(int hora, int min){
        if (hora<12){
            System.out.println("abanar");
        } else if (hora>=18) {
            System.out.println("Ignorar");
        }else{
            System.out.println("abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if (dono==true){
            System.out.println("abanar");
        }else{
            System.out.println("rosnar e latir");
        }
    }
    public void reagir(int idade, float peso){
        if (idade<5){
            if (peso<10){
                System.out.println("abanar");
            }else{
                System.out.println("latir");
            }
        }else{
            if (peso<10){
                System.out.println("rosnar");
            }else{
                System.out.println("ignorar");
            }
        }
    }
}

