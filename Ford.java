class Ford extends Car {
    int year;
    int manufacturerDiscount;

   
    double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}
