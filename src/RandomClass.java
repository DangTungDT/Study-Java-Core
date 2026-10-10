Scanner scanner = new  Scanner(System.in);
void main() {
    ChoiNemDongSu();
    scanner.close();
}

void ChoiDoanSo() {
    Random rand = new Random();
    int result = 0;
    int min, max;
    boolean isWin = false;
    System.out.print("Nhập giá trị nhỏ nhất: ");
    min = Integer.parseInt(scanner.nextLine());

    System.out.print("Nhập giá trị lớn nhất: ");
    max = Integer.parseInt(scanner.nextLine());

    result = rand.nextInt(min, max+1);

    System.out.println("Bạn có 5 lần đoán!");
    for(int i =0; i<5; i++){
        System.out.print("Đoán lần thứ " + (i+1) +": ");
        int number = Integer.parseInt(scanner.nextLine());
        if(number == result) {
            System.out.println("Chính xác đáp án đúng là " + result);
            isWin = true;
            break;
        }else if(number < result) {
            System.out.println("Kết quả lớn hơn "+ number);
        }else{
            System.out.println("Kết quả nhỏ hơn " + number);
        }
    }
    if(!isWin){
        System.out.println("Bạn đã thua, và đáp án đúng là: " + result);
    }
}

void ChoiNemDongSu() {
    Random rand = new Random();
    boolean isWin = false;

    System.out.print("Bạn chọn ngữa hay sấp (n/s): ");
    char choice = scanner.nextLine().charAt(0);

    //0 = sắp / 1 = ngửa
    System.out.println("Bắt đầu tung đồng xu!");
    int result = rand.nextInt(2);
    try{
        Thread.sleep(1000);
    }catch(InterruptedException e){}

    if(choice == 's' && result == 0){
        System.out.println("Kết quả là SẤP, bạn đã đoóa chính xác");
        isWin = true;
    } else if(choice == 'n' && result == 1){
        System.out.println("Kết quả là NGỬA, bạn đã đoóa chính xác");
        isWin = true;
    }
    if(!isWin){
        System.out.println("kết quả là mặt: " + ((result == 0) ? "SẮP" : "NGỬA") + " bạn đã đoán sai!");
    }
}