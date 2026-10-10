Scanner scanner = new Scanner(System.in);
void main() {
    TinhSoLuyThua();
}

void TinhGiaTriTuyetDoi() {
    System.out.print("Nhập một số thực tìm giá trị tuyệt đối: ");
    double number = scanner.nextDouble();

    double result = Math.abs(number);
    System.out.printf("Giá trị tuyệt đối của %f là: %f ", number, result);

}

void TimSoLonNhat(){
    int number1, number2, number3;
    System.out.print("Nhap so 1: ");
    number1 = scanner.nextInt();
    System.out.print("Nhap so 2: ");
    number2 = scanner.nextInt();

    int min = Math.min(number1, number2);
    int max = Math.max(number1, number2);
    System.out.println("So lon nhat: " + max);
    System.out.println("So nho nhat: " + min);

}

void TinhSoCanBac2() {
    System.out.print("Nhập số nguyên dương để tính căn bậc 2: ");
    int number =  scanner.nextInt();
    if(number < 0) {
        System.out.println("Dữ liệu không hợp lệ!");
    }
    double result = Math.sqrt(number);
    System.out.printf("Căn bậc 2 của %.0f là %.2f", (number * 1f), result);
}

void TinhSoLuyThua() {
    int number1, numberHat;
    System.out.print("Nhập số để tính căn bậc: ");
    number1 = scanner.nextInt();
    System.out.print("Nhập lũy thừa (số mũ): ");
    numberHat = scanner.nextInt();

    double result = Math.pow(number1, numberHat);
    System.out.printf("%.0f lũy thừa %.0f = %.0f", (number1*1f), (numberHat*1f), result);
}