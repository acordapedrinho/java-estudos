public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTV smartTV =new SmartTV();
       System.out.println("TV ligada? "   +smartTV.ligada);
       System.out.println("Canal atual? " +smartTV.canal);
       System.out.println("volume atual? "   +smartTV.volume);
        


       smartTV.diminuirVolume();
       smartTV.diminuirVolume();
       smartTV.diminuirVolume();
       smartTV.aumentarVolume();
       System.out.println("volume atual" + smartTV.volume);

       smartTV.ligar();
       System.out.println("Novo status -> TV ligada" +smartTV.ligada);
        




    }
}
