package com.epam.mjc.stage0;

public class Animal {

  private String color;
   private int numberOfPaws;
   private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String s = "This animal is mostly " + color +
                ". It has " + numberOfPaws + paws(numberOfPaws) + "and" + furs(hasFur) + "fur.";
        return s;
    }
    public String paws(int paw) {
        String paws;
        if (paw == 1) {
            paws = " paw ";
        } else {
            paws = " paws ";
        }
        return paws;
    }
  
   public String furs(boolean furs) {
        String fur;
        if (furs == true) {
            fur = " a ";
        } else {
            fur = " no ";
        }
        return fur;
    }
}
