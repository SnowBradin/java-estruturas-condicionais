public class Planotel {
    public static void main(String[] args) {
        String plano = "100 minutos" + "whats e insta free";

        switch (plano) {
            case "100 minutos": {
                System.out.println("BASIC");
            break;
            }
            case "100 minutos" + "whats e insta free": {
                System.out.println("MIDIA");
                break;
            }
            case "100 minutos" + "whats e insta free" + "5GB Youtube": {
                System.out.println("TURBO");
                break;
            }
            default:
                System.out.println("No Plan");
            
        }
    }
}