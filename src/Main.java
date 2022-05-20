public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float smmaryWeight = boxer1 + boxer2;
        float weightDiffer = Math.abs(boxer1 - boxer2);
        System.out.println("общий вес двух бойцов" + smmaryWeight + "кг");
        System.out.println("Разница в весе бойцов" + weightDiffer + "кг");
    }
}
