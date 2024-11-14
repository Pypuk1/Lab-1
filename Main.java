public class Main {
    public static void main(String[] args) {
        // Вывод четных чисел от 1 до 100
        System.out.println("Четные числа от 1 до 100:"); 
        for (int i = 2; i <= 100; i += 2) { //Начинаем цикл, который будет выполняться, пока переменная i меньше или равна 100
            System.out.print(i + " "); //выводит текущее значение i
        }
        System.out.println(); // Переход на новую строку

        // Вывод нечетных чисел от 1 до 100
        System.out.println("Нечетные числа от 1 до 100:");
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}