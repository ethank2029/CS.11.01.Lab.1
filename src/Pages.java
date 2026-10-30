void main() {

        Scanner ageScanner2 = new Scanner(System.in);

        System.out.print("Enter your age : ");

        int userAge1 = ageScanner2.nextInt();

        int minimumPages = (100 - userAge1);

        System.out.print(userAge1 + " year olds should read at least " + minimumPages + " pages before giving up on a book");








}
