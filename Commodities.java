public class Commodities{

    public static void main(String[] args) {
        
        String commodities [] = new String [5];
        commodities[0] = "Arroz (60 kg)";
        commodities[1] = "Café (60 kg)";
        commodities[2] = "Carne (Boi Gordo) (15 kg)";
        commodities[3] = "Milho (50 kg)"; 
        commodities[4] = "Soja (60 kg)"; 

        double valores [] = new double [5];
        valores[0] = 89.00;
        valores[1] = 1236.00;
        valores[2] = 321.00;
        valores[3] = 110.00;
        valores[4] = 191.00;

        for (int index = 0; index < commodities.length; index++) {
            System.out.print("Commoditie: ");
            System.out.println(commodities[index] + ": " + valores[index] + " reais");
            
        }
    }
}