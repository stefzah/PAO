package lab2;


public class Wolf{
    private int speed=0, power=0;
    public Wolf(int speed,int power)
        {this.speed=speed;
         this.power=power;
        }
    public void setSpeed(int speed)
        {this.speed = speed;
        }
    public void setPower(int power)
        {this.power = power;
        }
    public int getSpeed(int speed)
        {return this.speed;
        }
    public int getPower(int power)
        {return this.power;
        }
    public void showStats()
        {System.out.println("Viteza lupului este: "+this.speed);
         System.out.println("Puterea lupului este: "+this.power);
        }
  }