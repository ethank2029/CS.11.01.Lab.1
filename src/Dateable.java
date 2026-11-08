void main() {

    Scanner ageScanner = new Scanner(System.in);

    System.out.print("Enter your age : ");
    int userAge = ageScanner.nextInt();

    while (userAge < 0) {
        System.out.print("Enter your age : ");
        try {
            userAge = Integer.parseInt(ageScanner.nextLine());
            if (userAge < 0) {
                System.out.println("Invalid input: Age cannot be negative.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number.");
        }
    }

    int minimumAge = 7 + (userAge / 2);

    System.out.print(userAge + " year olds should date someone who is at least " + minimumAge);





}
