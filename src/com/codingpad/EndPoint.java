package com.codingpad;

public class EndPoint {

    int count = 0;
    static int capacity = 3;
    static String[] endPoint = new String[capacity];

    public boolean isEmpty() {
        if (endPoint[0] == null) {
            return true;
        }
        return false;
    }

    public void addEndPoint(String str){
        if (count < capacity) {
            endPoint[count] = str;
            count++;
        } else {
            endPoint = EndPoint.enLarge();
            endPoint[count] = str;
            count++;
        }
    }

    public int size() {
        return count;
    }

    public boolean contains(String str){
        for (int i = 0; i < endPoint.length; i++) {
            if (endPoint[i] == str) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDuplicate() {
        for (int i = 0; i < endPoint.length; i++) {
            for (int j = i + 1; j < endPoint.length ; j++) {
                if (endPoint[i].equals(endPoint[j]) && (i != j)){
                    return true;
                }
            }
        }
        return false;
    }

    public String[] removeURL(String str) {
        for (int i = 0; i < endPoint.length; i++) {
            if (endPoint[i] == str) {
                endPoint[i] = null;
                count--;
            }
            break;
        }
        String[] result = EndPoint.copyOnly(endPoint);
        return result;
    }


    public static String[] enLarge() {
        String[] result = new String[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            result[i] = endPoint[i];
        }
        return result;
    }

    public static String[] copyOnly(String[] strArr) {
         int size = strArr.length;
         String[] result = new String[size];
         int j = 0;

         for(int i = 0; i < strArr.length; i++) {
             if (strArr[i] == null) {
                 continue;
             } else {
                 result[j] = strArr[i];
                 j++;
             }
         }
         return result;
    }


    public static void main(String[] args) {
        String[] strArr = new String[]{"a", null, "c", null, null};
        String[] result = EndPoint.copyOnly(strArr);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(result[i]);
        }
    }



}
