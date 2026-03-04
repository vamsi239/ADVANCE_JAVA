class Notebook {

    // Non-static variables
    int noOfPages;
    double price;


    void setData(int pages, double cost) {
        noOfPages = pages;
        price = cost;
    }


    void display() {
        System.out.println("Number of Pages: " + noOfPages);
        System.out.println("Price: " + price);
        System.out.println();
    }

  
    public static void main(String[] args) {

        
        Notebook nb1 = new Notebook();
        nb1.setData(200, 75.50);
        nb1.display();

        Notebook nb2 = new Notebook();
        nb2.setData(300, 120.00);
        nb2.display();
    }
}