public class Planotelswitch {
    public static void main(String[] args) {
        String plano = "M"; //M / T

        switch (plano) { //ordem decrescente de grandeza, sem break, para adicionar tudo o que o plano inclui
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e insta");
            }
            case "B": {
                System.out.println("100 minutos");
            }
        }
    }
}