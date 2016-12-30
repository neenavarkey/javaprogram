/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */ /**
     * @param args the command line arguments
     */
    class divisible
    {

        int num1;

        public int getnum1() {
            return num1;
        }

        public void setnum1(int num1) {
            this.num1 = num1;
        }
        int num2;

        public int getnum2() {
            return num2;
        }

        public void setnum2(int num2) {
            this.num2 = num2;
        }
        public void divfun()
        {
        
          int r =num1%num2;
               if (r=0)
            {
                System.out.println("divisible");
            } else {
                System.out.println("not valid");
            }
        }

  public static void main(String[] args) 
// TODO code application logic here//
        {
            divisible d = new divisible();
            
             d.divfun();
             d.setnum1(24);
             System.out.println("no:" + d.getnum1());
             d.setnum2(12);
            System.out.println("no:" + d.getnum2());
        }
  }
    
    
