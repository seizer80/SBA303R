
class Truck extends Car {
    int weight;


    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; // 10% discount
        } else {
            return regularPrice * 0.8; // 20% discount
        }
    }
}