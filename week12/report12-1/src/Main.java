public class Main {
    public static void main(String[] args) {
        int first, second, result;

        first = Input.readData("첫번째 숫자 입력 : ");
        second = Input.readData("두번째 숫자 입력 : ");

        result = Compute.max(first, second);

        Output.display(first, second, result);
    }
}
