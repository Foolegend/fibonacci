package com.zte.lgf;

public class Num {
    private String num = "";
    public Num(String num){
        this.num = num;
    }

    public Num add(Num other){
        if(num.length() == 0 ){
            return other;
        }

        if(other.getNum().length() == 0){
            return this;
        }

        StringBuilder sb = new StringBuilder();
        int carray = 0;
        int leftLength = num.length();
        int rightLength = other.getNum().length();

        String residual;
        int length;
        if(leftLength > rightLength){
            residual = num.substring(0, leftLength - rightLength);
            length  = rightLength;
        }else {
            residual = other.getNum().substring(0, rightLength - leftLength);
            length = leftLength;
        }

        int left;
        int right;
        int sum;
        for(int i = 1; i <= length; i++){
            left = Integer.valueOf(num.substring(leftLength - i, leftLength - i + 1));
            right = Integer.valueOf(other.getNum().substring(rightLength-i, rightLength - i + 1));
            sum = left + right + carray;
            carray = sum / 10;
            sb.insert(0, sum % 10);
        }
        int residulLength = residual.length();
        for(int i = 1; i <= residulLength; i++){
            left = Integer.valueOf(residual.substring(residulLength - i, residulLength - i + 1));
            sum = left + carray;
            carray = sum / 10;
            sb.insert(0, sum % 10);
        }
        if(carray != 0){
            sb.insert(0, carray);
        }
        return new Num(sb.toString());
    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num.toString();
    }
}
