
import java.util.Scanner;

public class App {

     private final static  Scanner scanner = new Scanner(System.in);

    private static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) throws Exception {
        scanner.useDelimiter("\\n");
        var option =-1;

        do{
            System.out.println("Welcome to the Pet Machine!");
            System.out.println("1 -- da banho no pet ");
            System.out.println("2 -- abastercer a maquina com agua");
            System.out.println("3 -- abastercer a maquina com shampoo");
            System.out.println("4 -- verifica agua da maquina");
            System.out.println("5 -- verifica shampoo da maquina");
            System.out.println("6 -- verifciar se tem pet no banho");
            System.out.println("7 -- colocar pet na maquina");
            System.out.println("8 -- remover pet da maquina");
            System.out.println("9 -- limpar a maquina");
            System.out.println("0 -- sair");
            option = scanner.nextInt();

            switch(option){
                case 1 -> petMachine.takeshawer();
                case 2 -> setWater();
                case 3-> setShampoo();
                case 4->veryfiyWater();
                case 5->veryfiyShampoo() ;
                
                case 6->petMachine.haspet();
                case 7->setPetInpeMachine();
                case 8->petMachine.removePet();
                case 9->petMachine.wash();
                case 0 -> System.exit(0);
                default-> System.out.println("Opção inválida, tente novamente.");
            }
        }
        while(option != 0);

    }


    private static void setWater(){
        System.out.println("Adicionando agua na maquina...");
        petMachine.addWatter();
    }
     private static void setShampoo(){
        System.out.println("Adicionando agua na Shampoo...");
        petMachine.addShampoo();
    }


    public static void setPetInpeMachine(){

        var name="";
        while(name==null || name.isEmpty()){
            System.out.println("informe o nome do o pet ");
            name = scanner.next();

        }
       
        var pet = new Pet(name);
        petMachine.sertPet(pet);
        System.out.println("o pet  " + pet.getName() + " nao esta na maquina.");

    }
    public static void checkIfhasPet(){
        var hasPet = petMachine.haspet();
        System.out.println(hasPet ? "There is a pet in the machine." : "There is no pet in the machine.");
    }
    public static void veryfiyShampoo(){
        var amount = petMachine.getShampoo();
        System.out.println(" a maquina tem de shaamppo " + amount);
    }
    public static void veryfiyWater(){
        var amount = petMachine.getWater();
        System.out.println(" a maquina tem de agua " + amount);
    }

}
