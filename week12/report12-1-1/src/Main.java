public class Main {
    public static void main(String[] args) {
        int a, b, c, d, result;

        a = Input.readData("첫번째 숫자 입력 : ");
        b = Input.readData("두번째 숫자 입력 : ");
        c = Input.readData("세번째 숫자 입력 : ");
        d = Input.readData("네번째 숫자 입력 : ");

        result = Compute.max4(a, b, c, d);

        Output.display(a, b, c, d, result);
    }
}
