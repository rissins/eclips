package Example;


import java.util.*;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char op;
        System.out.print("µÎ Á¤¼ö¿Í ¿¬»êÀÚ¸¦ ÀÔ·ÂÇÏ½Ã¿À>> ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        op = scanner.next().charAt(0);

        switch (op) {
        case '+':
            Add add = new Add();
            add.setValue(num1, num2);
            System.out.println(add.calculate());
            break;
        case '-':
            Sub sub = new Sub();
            sub.setValue(num1, num2);
            System.out.println(sub.calculate());
            break;
        case '*':
            Mul mul = new Mul();
            mul.setValue(num1, num2);
            System.out.println(mul.calculate());
            break;
        case '/':
            Div div = new Div();
            div.setValue(num1, num2);
            System.out.println(div.calculate());
            break;
        }
    }
}

// µ¡¼À 
class Add {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a + b;
    }
}

// –E¼À
class Sub {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a - b;
    }
}

// °ö¼À
class Mul {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a * b;
    }
}

// ³ª´°¼À
class Div {
    private int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a / b;
    }
}
