void main() {

        Scanner ageScanner2 = new Scanner(System.in);

        System.out.print("Enter your age : ");

        int userAge1 = ageScanner2.nextInt();

        while (userAge1 < 0) {
                System.out.print("Enter your age : ");
                try {
                        userAge1 = Integer.parseInt(ageScanner2.nextLine());
                        if (userAge1 < 0) {
                                System.out.println("Invalid input: Age cannot be negative.");
                        }
                } catch (NumberFormatException e) {
                        System.out.println("Invalid input: Please enter a valid number.");
                }
        }

        int minimumPages = (100 - userAge1);

        System.out.print(userAge1 + " year olds should read at least " + minimumPages + " pages before giving up on a book");








}
