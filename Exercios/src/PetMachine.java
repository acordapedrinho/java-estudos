

public class PetMachine {

   private boolean clean=true;
   private int water=10;


   private int shampoo=10;

   private Pet pet= null;


   





   public void takeshawer(){
        if(this.pet==null){
            System.out.println("Please, add a pet first.");
            return;
        }
        this.water-=10;
        this.shampoo-=2;


        pet.setClean(true);
        System.out.println("the pet"+ pet.getName()+" is now clean.");

   }


   public void addWatter(){
    if (water==30){
        System.out.println("" + "Water tank is full.");
        return;
    }
    water += 3;
   }

   public void addShampoo(){
    if (shampoo==10){
        System.out.println("" + "shampoo tank is full.");
        return;
    }
    shampoo += 3;
}


   public int getWater() {
    return water;
   }


   public int getShampoo() {
    return shampoo;
   }
   public boolean haspet() {
    return pet != null;
   }

   public void sertPet(Pet pet) {

    if(!this.clean){
        System.out.println("a maquina nao esta limpa, por favor limpe a maquina primeiro");
        return;
    }
    if( haspet()){
        System.out.println("o pet"+this.pet.getName()+" ja esta na maquina ");

        return;
    }
   
   this.pet = pet;

    }

    public void removePet() {
        this.clean=this.pet.isClean();
        System.out.println("the pet "+this.pet.getName()+" is clean."  );
        this.pet = null;
    }


public void wash(){
     this.water-=10;
    this.shampoo-=2;
    this.clean = true;
    System.out.println(" machine is clean.");
}


}