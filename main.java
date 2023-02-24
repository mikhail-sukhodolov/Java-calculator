import java.util.Scanner;

public class Main {
  //создаем сканер для чтения ввода
  static Scanner scanner = new Scanner(System.in);  

  public static void main(String[] args) {

    System.out.println("\nТестовое задание КАЛЬКУЛЯТОР\n\nДопустимо введение двух значений от 1 до 10, операции + - / *. Все символы должны быть разделены пробелом");
    
    // передаем введенную строку в метод Calc (прописан далее) и печатаем результат
    System.out.println(calc(scanner.nextLine())); 
  }

  // метод Calc
  public static String calc(String input) {
    //создаем переменные
    int firstNumber, secondNumber;
    // разделяем введенную строку по символу пробела
    String[] parse = input.split(" ");
    // проверяем количество введенных значений (по условию три значения - два числа  и символ операции)
    if (parse.length != 3) {
      System.out.println("invalid input");
      System.exit (1);
    }
    // присваиваем числовые значения ранее созданным переменным
    firstNumber = Integer.parseInt(parse[0]);
    secondNumber = Integer.parseInt(parse[2]);
    // проверяем на включение чисел в диапазон от 1 до 10, иначе выводим ошибку
    if (firstNumber < 1 || firstNumber > 10 || secondNumber < 1 || secondNumber > 10){
      System.out.println("invalid input");
      System.exit (1);
    }
    // присваиваем переменной значение введенного символа операции
    char symbol = parse[1].charAt(0);
    // выполняем математическую операцию и возвращаем результат, конвертируя число в строку(по условию задания). Если введенный символ не равен +-/*, выводим ошибку
    switch (symbol){
      case '+':
         return String.valueOf(firstNumber + secondNumber);
      case '-':
         return  String.valueOf(firstNumber - secondNumber);
      case '/':
          return String.valueOf(firstNumber / secondNumber);
      case '*':
          return String.valueOf(firstNumber * secondNumber);
      default:
          System.out.println("invalid input");
          System.exit (1);
          return "";
    }
  }
}
