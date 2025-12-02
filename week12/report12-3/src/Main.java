public class Main {
    public static void main(String[] args) {
        long money = Input.readMoney("금액 입력(16자리 이하) : ");
        String result = Compute.convertHangul(money);
        Output.display(money, result);
    }
}
