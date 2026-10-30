void main() {

    Scanner ageScanner = new Scanner(System.in);

    System.out.print("Enter your age : ");

    int userAge = ageScanner.nextInt();

    int minimumAge = 7 + (userAge / 2);

    System.out.print(userAge + " year olds should date someone who is at least " + minimumAge);


}