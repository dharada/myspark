package mypackage;

class Car{
    int year;
    String make;
    int speed;

    public Car(int y,String m,int s){
        this.year = y;
        this.make = m;
        this.speed = s;
    }

    public int getSpeed(){
        return this.speed;
    }
    public String getMake(){
        return this.make;
    }
    public int getYear(){
        return this.year;
    }

    public void accelerate(){
        this.speed+=1;
    }
}